
class DBConnection {
    try {
        mysql = new MysqlDriverManager().getConnection("jdbc:mysql://localhost:3306/test", "root", "");
    } catch (Exception e) {
        e.printStackTrace();
    }
}
class  ObjectPool {
    List<DBConnection> available = new ArrayList<DBConnection>();
    List<DBConnection> inUse = new ArrayList<DBConnection>();
    static final int MAX_POOL_SIZE = 10;
    static final int INITIAL_POOL_SIZE = 5;
    private static ObjectPool completed = null;

    private ObjectPool() {
        for (int i = 0; i < INITIAL_POOL_SIZE; i++) {
            available.add(new DBConnection());
        }
    }
    public static ObjectPool getInstance() {
        if(completed == null) {
            synchronized (ObjectPool.class) {
                if(completed == null) {
                    completed = new ObjectPool();
                }
            }
        }
        return completed;
    }
    public synchronized DBConnection getConnection() {
        if(available.isEmpty()) {
            if (inUse.size() < MAX_POOL_SIZE) {
                available.add(new DBConnection());
            } else {
                throw new RuntimeException("Maximum pool size reached, no available connections!");
            }
        }

        DBConnection connection = available.get(available.size() - 1);
        available.remove(available.size() - 1);
        inUse.add(connection);
        return connection;
    }
    public synchronized void releaseConnection(DBConnection connection) {
        if(completed == null) {
            throw new RuntimeException("No such connection in use!");
        }
        inUse.remove(connection);
        available.add(connection);
    }
}
public class Main {
    public static void main(String[] args) {
        ObjectPool pool = ObjectPool.getInstance();
        DBConnection connection = pool.getConnection();
        DBConnection connection2 = pool.getConnection();
        pool.releaseConnection(connection);
    }
}
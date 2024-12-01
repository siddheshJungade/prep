public interface EmployeeDao {
    public Employee getEmployee(string client ,int id);
    public void deleteEmployee(Employee employee);
    public void create();
}

public class EmployeeDaoImpl implements EmployeeDao {

    public void create(string client, Employee employee) {
        // create employee in database
        System.out.println("Employee created by " + client);
    }
    public Employee getEmployee(string client,Employee id) {
        // get employee from database
        System.out.println("Employee fetched by " + client);
        ruturn employee;
    }

    public void deleteEmployee(string client,Employee employee) {
        // delete employee from database
        System.out.println("Employee deleted");
        return employee;
    }
}



public EpmployeeProxy implements EmployeeDao {
    private EmployeeDaoImpl employeeDaoImpl;

    @Override
    public Employee getEmployee(string clinet , Employee id) {
        if(client == "ADMIN " || clinet == "USER") {
            return employeeDaoImpl.getEmployee(id);
        }
        throw new Exception("You are not authorized to access this data");
    }

    @Override 
    public void create(string client, Employee employee) {
        if(client == "ADMIN") {
            employeeDaoImpl.create(employee);
        }
        throw new Exception("You are not authorized to access this data");
    }

    @Override
    public void deleteEmployee(string client,Employee employee) {
        
        if(client == "ADMIN") {
            employeeDaoImpl.deleteEmployee(employee);
        }
        throw new Exception("You are not authorized to access this data");
    }

}
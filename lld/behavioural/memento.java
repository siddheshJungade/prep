
// This is the Originator class
public class ConfigurationOriginator {
    int hight;
    int width;

    ConfigurationOriginator(int hight, int width) {
        this.hight = hight;
        this.width = width;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public ConfigurationMemento createMemento() {
        return new Memento(this.hight, this.width);
    }

    public void restore(ConfigurationMemento memento) {
        this.hight = memento.getHight();
        this.width = memento.getWidth();
    }
}


// This is the memento class
public class ConfigurationMemento {
    int hight;
    int width;

    ConfigurationMemento(int hight, int width) {
        this.hight = hight;
        this.width = width;
    }

    public int getHight() {
        return hight;
    }

    public int getWidth() {
        return width;
    }
}

// This is the Caretaker class to maintain the history of the memento
public class ConfigurationCaretaker {
    List<ConfigurationMemento> mementoList = new ArrayList<ConfigurationMemento>();

    public void add(ConfigurationMemento memento) {
        mementoList.add(memento);
    }

    public ConfigurationMemento undo() {
        if (mementoList.size() > 0) {
            ConfigurationMemento memento = mementoList.get(mementoList.size() - 1);
            mementoList.remove(mementoList.size() - 1);
            return memento;
        }
        return null;
    }
}


public class Client {
    public static void main(String[] args) {
        ConfigurationCaretaker caretaker = new ConfigurationCaretaker();
        ConfigurationOriginator originator = new ConfigurationOriginator(100, 100);

        caretaker.add(originator.createMemento());
        originator.setHight(200);
        originator.setWidth(200);
        caretaker.add(originator.createMemento());
        originator.setHight(300);
        originator.setWidth(300);
        caretaker.add(originator.createMemento());

        System.out.println("Current Configuration: " + originator.hight + " " + originator.width);

        ConfigurationMemento memento = caretaker.undo();
        originator.restore(memento);
        System.out.println("After undo Configuration: " + originator.hight + " " + originator.width);

        memento = caretaker.undo();
        originator.restore(memento);
        System.out.println("After undo Configuration: " + originator.hight + " " + originator.width);
    }
}
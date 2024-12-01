public interface IRobot {
    public void display(int x, int y);
}

public class HumanRobot implements IRobot {
    private String robotType;
    private Sprites robotSprites;
    public HumanRobot(String robotType, Sprites robotSprites) {
        this.robotType = robotType;
        this.robotSprites = robotSprites;
    }

    public String getRobotType() {
        return robotType;
    }

    public Sprites getRobotSprites() {
        return robotSprites;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Displaying " + robotType + " at " + x + ", " + y);
    }
}

public class AnimalRobot implements IRobot {
    private String robotType;
    private Sprites robotSprites;
    public AnimalRobot(String robotType, Sprites robotSprites) {
        this.robotType = robotType;
        this.robotSprites = robotSprites;
    }

    public String getRobotType() {
        return robotType;
    }

    public Sprites getRobotSprites() {
        return robotSprites;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Displaying " + robotType + " at " + x + ", " + y);
    }
}


public class Sprites {
    private String spriteName;
    private String spriteImage;
    public Sprites(String spriteName, String spriteImage) {
        this.spriteName = spriteName;
        this.spriteImage = spriteImage;
    }

    public String getSpriteName() {
        return spriteName;
    }

    public String getSpriteImage() {
        return spriteImage;
    }
}


public class RobotFactory {
    private static Map<String, IRobot> robotMap = new HashMap<>();
    private static Sprites humanRobotSprites = new Sprites("HumanRobot", "human.jpg");
    private static Sprites animalRobotSprites = new Sprites("AnimalRobot", "animal.jpg");

    public static IRobot getRobot(String robotType) {
        IRobot robotCategory = null;
        if (robotMap.containsKey(robotType)) {
            robotCategory = robotMap.get(robotType);
        } else {
            switch (robotType) {
                case "HumanRobot":
                    robotCategory = new HumanRobot(robotType, humanRobotSprites);
                    robotMap.put(robotType, robotCategory);
                    break;
                case "AnimalRobot":
                    robotCategory = new AnimalRobot(robotType, animalRobotSprites);
                    robotMap.put(robotType, robotCategory);
                    break;
                default:
                    System.out.println("Invalid Robot Type");
            }
        }
        return robotCategory;
    }
}


public class FlyweightPattern {
    public static void main(String[] args) {
        IRobot humanRobot1 = RobotFactory.getRobot("HumanRobot");
        humanRobot1.display(10, 20);

        IRobot humanRobot2 = RobotFactory.getRobot("HumanRobot");
        humanRobot2.display(30, 40);

        IRobot animalRobot1 = RobotFactory.getRobot("AnimalRobot");
        animalRobot1.display(50, 60);

        IRobot animalRobot2 = RobotFactory.getRobot("AnimalRobot");
        animalRobot2.display(70, 80);
    }
}
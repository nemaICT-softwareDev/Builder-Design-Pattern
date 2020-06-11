package builder;

import model.Robot;
import model.Robotlike;

public class CleaningRobot implements Robotbuilder {
    //Variables
    private final String name = "Cleaning robot";
    private Robotlike robot;

    //Constructor
    public CleaningRobot() {
        this.robot = new Robot();
    }

    //Getters
    @Override
    public  String getName() {
        return name;
    }

    //Methods
    @Override
    public void addHead() {
        robot.setHead("Head");
    }

    @Override
    public void addArms() {
       robot.setLegs("this feature yet to be included in this robot");
    }

    @Override
    public void addLegs() {
        robot.setLegs("this feature yet to be included in this robot");
    }

    @Override
    public void addBody() {
        robot.setBody("cleaning uniform");
    }

    @Override
    public Robotlike getRobot() {
        return this.robot;
    }
}

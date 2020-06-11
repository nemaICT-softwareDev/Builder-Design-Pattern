package builder;

import model.Robot;
import model.Robotlike;

public class CookingRobot implements Robotbuilder {

    //Variables
    private final String name = "Cooking robot";
    private Robotlike robot;

    //Constructor
    public CookingRobot() {
        this.robot = new Robot();
    }

    //Getters
    @Override
    public String getName() {
        return name;
    }

    //Setters
    @Override
    public void addHead() {
        robot.setHead("Cooking hat");
    }

    @Override
    public void addArms() {
        robot.setArms("Pan");
    }

    @Override
    public void addLegs() {
        robot.setLegs("Legs");
    }

    @Override
    public void addBody() {
        robot.setBody("Apron");
    }

    @Override
    public Robotlike getRobot() {
        return this.robot;
    }
}

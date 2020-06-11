package builder;

import model.Robot;
import model.Robotlike;

public class GardenerRobot implements Robotbuilder {

    //Variables
    private final String name = "Gardener robot";
    private Robotlike robot;

    //Constructor
    public GardenerRobot() {
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
        robot.setHead("Hat for the sun");
    }

    @Override
    public void addArms() {
        robot.setArms("this feature yet to be included in this robot");
    }

    @Override
    public void addLegs() {

        robot.setLegs("shorts");
    }

    @Override
    public void addBody() {
        robot.setBody("shirt");
    }

    @Override
    public Robotlike getRobot() {
        return this.robot;
    }

}

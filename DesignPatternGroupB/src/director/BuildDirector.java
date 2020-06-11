package director;

import builder.CookingRobot;
import builder.GardenerRobot;
import builder.Robotbuilder;
import model.Robotlike;

public class BuildDirector {
    //Variables
    private Robotbuilder builder;

    //Constructor
    public BuildDirector(Robotbuilder builder) {
        this.builder = builder;
    }

    //Methods
    public String buildRobot() {

        if(builder instanceof GardenerRobot)
        {
            this.builder.addHead();
            this.builder.addBody();
            this.builder.addLegs();
        }
        else if(builder instanceof CookingRobot)
        {
            this.builder.addHead();
            this.builder.addArms();
            this.builder.addLegs();
            this.builder.addBody();
        }
        else {
            this.builder.addHead();
            this.builder.addBody();
        }

       return  this.builder.getName()+ " has been made";
    }

    public Robotlike getRobot() {

        return this.builder.getRobot();
    }
}

package builder;

import model.Robotlike;

public interface Robotbuilder {

   String getName();

    void addHead();
    void addArms();
    void addLegs();
    void addBody();

    Robotlike getRobot();

}

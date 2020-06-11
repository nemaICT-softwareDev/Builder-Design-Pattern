package main;

import builder.CleaningRobot;
import builder.CookingRobot;
import builder.GardenerRobot;
import builder.Robotbuilder;
import director.BuildDirector;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        int choiceOfRobot;
        boolean menuOnOff = false;
        Scanner userInput = new Scanner(System.in);
        BuildDirector manager = null;
        Robotbuilder robot = null;

        do {
            System.out.println("Which robot do you want to create:\n" +
                    "1. Cleaning robot\n" +
                    "2. Cooking robot\n" +
                    "3. Gardener robot\n" +
                    "4. Enough robots in my life\n" +
                    "Type the number of your choice:");

            choiceOfRobot = userInput.nextInt();

            switch(choiceOfRobot){
                case 1:
                    robot = new CleaningRobot();
                    break;
                case 2:
                    robot = new CookingRobot();
                    break;
                case 3:
                    robot = new GardenerRobot();
                    break;
                case 4:
                    menuOnOff = true;
                    break;
                default:
                    System.out.print("Verkeerde invoer, probeer het opnieuw");
                    break;
            }

            if(choiceOfRobot > 0 && choiceOfRobot < 4) {
                manager = new BuildDirector(robot);
                System.out.println(manager.buildRobot());
                System.out.println(manager.getRobot());
            }

        } while (!menuOnOff);
    }
}

package model;

public class Robot implements Robotlike {

    //Variables
    private String head;
    private String arms;
    private String legs;
    private String body;

    //Setters
    @Override
    public void setHead(String head) {
        this.head = head;
    }

    @Override
    public void setArms(String arms) {
        this.arms = arms;
    }

    @Override
    public void setLegs(String legs) {
        this.legs = legs;
    }

    @Override
    public void setBody(String body) {
        this.body = body;
    }


    @Override
    public String toString() {
                return "\nThose are the features of your robot{" +
                "head='" + head + '\'' +
                ", arms='" + arms + '\'' +
                ", legs='" + legs + '\'' +
                ", body='" + body + '\'' +
                '}';
        //return "Enjoy your new robot!!";
    }
}

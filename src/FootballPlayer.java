public class FootballPlayer extends Athlete{
    private String position;
    private int passingRating;
    private int shootingRating;
    public FootballPlayer(String name, int age, int jerseyNumber, int overallRating, String position, int passingRating, int shootingRating) {
        super(name, age, jerseyNumber, overallRating);
        this.position = position;
        this.passingRating = passingRating;
        this.shootingRating = shootingRating;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public int getPassingRating() {
        return passingRating;
    }
    public void setPassingRating(int passingRating) {
        this.passingRating = passingRating;
    }
    public int getShootingRating() {
        return shootingRating;
    }
    public void setShootingRating(int shootingRating) {
        this.shootingRating = shootingRating;
    }
    public void passing(int meter){
        if(meter > 0 && meter <= 30){
            if(passingRating >= 0){
            System.out.println(getName() + " is able to pass the ball!");
        }
    }
        else if(meter > 30 && meter <= 50){
            if(passingRating >= 50){
            System.out.println(getName() + " is able to pass the ball!");
        }
            else{
                System.out.println(getName() + " is not able to pass the ball!");
            }
        }
        else if(meter > 50 && meter <= 70){
            if(passingRating >= 70){
                System.out.println(getName() + " is able to pass the ball!");
            }
            else{
                System.out.println(getName() + " is not able to pass the ball!");
            }
        }
        else if(meter > 70 && meter <= 100){
            if(passingRating >= 90){
                System.out.println(getName() + " is able to pass the ball!");
            }
            else{
                System.out.println(getName() + " is not able to pass the ball!");
            }
        }
        else {
            System.out.println("Invalid pass distance: " + meter + "m");
        }
    }
    @Override
    public void play() {
        System.out.println(getName() + " (" + position + ") is running, passing the ball, and creating chances!");
    }
}

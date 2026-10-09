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
    @Override
    public void play() {
        System.out.println(getName() + " (" + position + ") is running, passing the ball, and creating chances!");
    }
}

public class GoalKeeper extends Athlete{
    private int reflexRating;
    private int handlingRating;
    private int cleanSheets;
    public GoalKeeper(String name, int age, int jerseyNumber, int overallRating, int reflexRating, int handlingRating, int cleanSheets){
        super(name, age, jerseyNumber, overallRating);
        this.reflexRating = reflexRating;
        this.handlingRating = handlingRating;
        this.cleanSheets = cleanSheets;
    }
    public int getReflexRating() {
        return reflexRating;
    }
    public void setReflexRating(int reflexRating) {
        this.reflexRating = reflexRating;
    }
    public int getHandlingRating() {
        return handlingRating;
    }
    public void setHandlingRating(int handlingRating) {
        this.handlingRating = handlingRating;
    }
    public int getCleanSheets() {
        return cleanSheets;
    }
    public void setCleanSheets(int cleanSheets) {
        this.cleanSheets = cleanSheets;
    }
    @Override
    public void play() {
        System.out.println(getName() + " is on the pitch as a goalkeeper!");
    }

}

public class Athlete {
    private String name;
    private String teamName;
    private int age;
    private int jerseyNumber;
    private int overallRating;
    public Athlete(String name, String teamName, int age, int jerseyNumber, int overallRating) {
        this.name = name;
        this.teamName = teamName;
        this.age = age;
        this.jerseyNumber = jerseyNumber;
        this.overallRating = overallRating;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getJerseyNumber() {
        return jerseyNumber;
    }
    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }
    public int getOverallRating() {
        return overallRating;
    }
    public void setOverallRating(int overallRating) {
        this.overallRating = overallRating;
    }
    public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    public void printAthlete() {
        System.out.println("Name: " + name);
        System.out.println("Team Name: " + teamName);
        System.out.println("Age: " + age);
        System.out.println("Jersey Number: " + jerseyNumber);
        System.out.println("Overall Rating: " + overallRating);
    }
    public void play() {
        System.out.println(name + " is on the pitch and playing!");
    }
}

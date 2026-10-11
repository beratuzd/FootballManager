import java.util.ArrayList;
public class Team {
    private String teamName;
    private ArrayList<Athlete> players;
    public Team(String teamName) {
        this.teamName = teamName;
        this.players = new ArrayList<>();
    }
    public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    public ArrayList<Athlete> getPlayers() {
        return players;
    }
    public void setPlayers(ArrayList<Athlete> players) {
        this.players = players;
    }
    public void addPlayer(Athlete player) {
        player.setTeamName(this.teamName);
        players.add(player);
        if (player instanceof GoalKeeper) {
            System.out.println("Goalkeeper has signed: " + player.getName());
        } else if (player instanceof FootballPlayer) {
            System.out.println("Football Player has signed: " + player.getName());
        } else {
            System.out.println("Athlete has signed: " + player.getName());
        }
    }
    public void removePlayer(Athlete player) {
        players.remove(player);
        System.out.println(player.getName() + " has been removed from the team!");
    }
    public void playMatch() {
        System.out.println("=== Match Started: " + teamName + " ===");
        for (Athlete player : players) {
            player.play();
        }
    }
    public void printTeamInfo() {
        System.out.println("Team Name: " + teamName);
        System.out.println("Players:");
        for (Athlete player : players) {
            System.out.println("- " + player.getName());
        }
    }
}

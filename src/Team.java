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
        players.add(player);
        if (player instanceof GoalKeeper) {
            System.out.println("Kaleci transfer edildi: " + player.getName());
        } else if (player instanceof FootballPlayer) {
            System.out.println("Saha oyuncusu transfer edildi: " + player.getName());
        } else {
            System.out.println("Sporcu transfer edildi: " + player.getName());
        }
    }
    public void removePlayer(Athlete player) {
        players.remove(player);
        System.out.println(player.getName() + " takımdan çıkarıldı!");
    }
    public void playMatch() {
        System.out.println("=== Match Started: " + teamName + " ===");
        for (Athlete player : players) {
            player.play();
        }
    }
}

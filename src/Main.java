import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the football manager mini game!");
        System.out.println("Please enter a home team name:");
        String homeTeamName = sc.nextLine();
        Team homeTeam = new Team(homeTeamName);
        System.out.println("Please enter an away team name:");
        String awayTeamName = sc.nextLine();
        Team awayTeam = new Team(awayTeamName);
        System.out.println("Home team name: " + homeTeamName);
        System.out.println("Away team name: " + awayTeamName);
        System.out.println("Please enter 3 player and 1 goalkeeper for home and away team!");
        String position="3 player position u have to select:\n"+
                "1-Write St for striker\n"+
                "2-Write Cm for midfielder \n"+
                "3-Write Cb for defender \n";
        System.out.println(position);
        boolean StrikerH=true;
        boolean MidfielderH=true;
        boolean DefenderH=true;
        boolean StrikerA=true;
        boolean MidfielderA=true;
        boolean DefenderA=true;
        for (int i = 0; i < 3; i++) {
            System.out.println("All this information is for the home team.");
            System.out.println("Please enter a player name:");
            String playerName = sc.nextLine();
            String playerPosition="";
            while(true) {
                System.out.println("Please enter a player position:");
                playerPosition = sc.nextLine();
                if (playerPosition.equals("St")) {
                    if (StrikerH) {
                        StrikerH = false;
                        break;
                    } else {
                        System.out.println("Striker is not empty choose different position for your player!");
                    }
                } else if (playerPosition.equals("Cm")) {
                    if (MidfielderH) {
                        MidfielderH = false;
                        break;
                    } else {
                        System.out.println("Midfielder is not empty choose different position for your player!");
                    }
                } else if (playerPosition.equals("Cb")) {
                    if (DefenderH) {
                        DefenderH = false;
                        break;
                    } else {
                        System.out.println("Defender is not empty choose different position for your player!");
                    }
                } else {
                    System.out.println("Please enter a valid position!");
                }
            }
            int age= 0;
            while(true){
            System.out.println("Please enter a age for player(16-42):");
            int playerAge = sc.nextInt();
            sc.nextLine();
            if(playerAge<16 || playerAge>42){
                System.out.println("Please enter a valid age!");
            }
            else{
                age=playerAge;
                break;
            }
            }
            int jerseyNumber= 0;
            while(true){
            System.out.println("Please enter a jersey number(1-99):");
            int playerJerseyNumber = sc.nextInt();
            sc.nextLine();
            if(playerJerseyNumber<1 || playerJerseyNumber>99){
                System.out.println("Please enter a valid jersey number(1-99)!");
            }
            else{
                jerseyNumber=playerJerseyNumber;
                break;
            }
            }
            int playerOverallRating= 0;
            while(true) {
                System.out.println("Please enter a overall rating(1-99):");
                int overall = sc.nextInt();
                sc.nextLine();
                if(overall<1 || overall>99){
                    System.out.println("Please enter a valid overall rating (1-99)!");
                }
                else{
                    playerOverallRating=overall;
                    break;
                }
            }
            int playerPassRating=0;
            while(true){
            System.out.println("Please enter a pass rating(1-99):");
            int passRating = sc.nextInt();
            sc.nextLine();
            if(passRating <1 || passRating >99){
                System.out.println("Please enter a valid pass rating (1-99)!");
            }
            else{
                playerPassRating=passRating;
                break;
            }
            }
            int playerShootRating=0;
            while(true){
            System.out.println("Please enter a shoot rating(1-99):");
            int shootRating = sc.nextInt();
            sc.nextLine();
            if(shootRating <1 || shootRating >99){
                System.out.println("Please enter a valid shoot rating (1-99)!");
            }
            else{
                playerShootRating=shootRating;
                break;
            }
            }
            FootballPlayer player = new FootballPlayer(playerName, age, jerseyNumber, playerOverallRating, playerPosition, playerPassRating, playerShootRating);
            homeTeam.addPlayer(player);
            if (i == 2) {
                System.out.println("Please enter a goalkeeper name:");
                String goalkeeperName = sc.nextLine();
                int goalAge=0;
                while(true){
                System.out.println("Please enter a age for goalkeeper:");
                int goalkeeperAge = sc.nextInt();
                sc.nextLine();
                if(goalkeeperAge<16 || goalkeeperAge>42){
                    System.out.println("Please enter a valid age!");
                }
                else{
                    goalAge=goalkeeperAge;
                    break;
                }
                }
                int goalkeeperJerseyNumber= 0;
                while(true){
                    System.out.println("Please enter a jersey number(1-99):");
                    int keeperJerseyNumber   = sc.nextInt();
                    sc.nextLine();
                    if(keeperJerseyNumber <1 || keeperJerseyNumber >99){
                        System.out.println("Please enter a valid jersey number(1-99)!");
                    }
                    else{
                        goalkeeperJerseyNumber= keeperJerseyNumber;
                        break;
                    }
                }
                int goalkeeperOverallRating= 0;
                while(true) {
                    System.out.println("Please enter a overall rating(1-99):");
                    int keeperOverall = sc.nextInt();
                    sc.nextLine();
                    if(keeperOverall<1 || keeperOverall>99){
                        System.out.println("Please enter a valid overall rating (1-99)!");
                    }
                    else{
                        goalkeeperOverallRating=keeperOverall;
                        break;
                    }
                }
                int goalkeeperReflexRating=0;
                while(true){
                    System.out.println("Please enter a reflex rating(1-99):");
                    int keeperReflexRating = sc.nextInt();
                    sc.nextLine();
                    if(keeperReflexRating <1 || keeperReflexRating >99){
                        System.out.println("Please enter a valid reflex rating (1-99)!");
                    }
                    else{
                        goalkeeperReflexRating=keeperReflexRating;
                        break;
                    }
                }
                int goalkeeperHandlingRating=0;
                while(true){
                    System.out.println("Please enter a handling rating(1-99):");
                    int keeperHandlingRating = sc.nextInt();
                    sc.nextLine();
                    if(keeperHandlingRating <1 || keeperHandlingRating >99){
                        System.out.println("Please enter a valid handling rating (1-99)!");
                    }
                    else{
                        goalkeeperHandlingRating=keeperHandlingRating;
                        break;
                    }
                }
                GoalKeeper goalkeeper = new GoalKeeper(goalkeeperName, goalAge, goalkeeperJerseyNumber, goalkeeperOverallRating, goalkeeperReflexRating, goalkeeperHandlingRating);
                homeTeam.addPlayer(goalkeeper);
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("All this information is for the away team.");
            System.out.println("Please enter a player name:");
            String playerName = sc.nextLine();
            String playerPosition="";
            while(true) {
                System.out.println("Please enter a player position:");
                playerPosition = sc.nextLine();
                if (playerPosition.equals("St")) {
                    if (StrikerA) {
                        StrikerA = false;
                        break;
                    } else {
                        System.out.println("Striker is not empty choose different position for your player!");
                    }
                } else if (playerPosition.equals("Cm")) {
                    if (MidfielderA) {
                        MidfielderA = false;
                        break;
                    } else {
                        System.out.println("Midfielder is not empty choose different position for your player!");
                    }
                } else if (playerPosition.equals("Cb")) {
                    if (DefenderA) {
                        DefenderA = false;
                        break;
                    } else {
                        System.out.println("Defender is not empty choose different position for your player!");
                    }
                } else {
                    System.out.println("Please enter a valid position!");
                }
            }
            int age=0;
            while(true){
                System.out.println("Please enter a age for player(16-42):");
                int playerAge = sc.nextInt();
                sc.nextLine();
                if(playerAge<16 || playerAge>42){
                    System.out.println("Please enter a valid age(16-42)!");
                }
                else{
                    age=playerAge;
                    break;
                }
            }
            int jerseyNumber= 0;
            while(true){
                System.out.println("Please enter a jersey number(1-99):");
                int playerJerseyNumber = sc.nextInt();
                sc.nextLine();
                if(playerJerseyNumber<1 || playerJerseyNumber>99){
                    System.out.println("Please enter a valid jersey number(1-99)!");
                }
                else{
                    jerseyNumber=playerJerseyNumber;
                    break;
                }
            }
            int playerOverallRating= 0;
            while(true) {
                System.out.println("Please enter a overall rating(1-99):");
                int overall = sc.nextInt();
                sc.nextLine();
                if(overall<1 || overall>99){
                    System.out.println("Please enter a valid overall rating(1-99)!");
                }
                else{
                    playerOverallRating=overall;
                    break;
                }
            }
            int playerPassRating=0;
            while(true){
                System.out.println("Please enter a pass rating(1-99):");
                int passRating = sc.nextInt();
                sc.nextLine();
                if(passRating <1 || passRating >99){
                    System.out.println("Please enter a valid pass rating(1-99)!");
                }
                else{
                    playerPassRating=passRating;
                    break;
                }
            }
            int playerShootRating=0;
            while(true){
                System.out.println("Please enter a shoot rating(1-99):");
                int shootRating = sc.nextInt();
                sc.nextLine();
                if(shootRating <1 || shootRating >99){
                    System.out.println("Please enter a valid shoot rating(1-99)!");
                }
                else{
                    playerShootRating=shootRating;
                    break;
                }
            }
            FootballPlayer player1 = new FootballPlayer(playerName, age, jerseyNumber, playerOverallRating, playerPosition, playerPassRating, playerShootRating);
            awayTeam.addPlayer(player1);
            if (i == 2) {
                System.out.println("Please enter a goalkeeper name:");
                String goalkeeperName = sc.nextLine();
                int goalAge=0;
                while(true){
                System.out.println("Please enter a age for goalkeeper(16-42):");
                int goalkeeperAge = sc.nextInt();
                sc.nextLine();
                if(goalkeeperAge<16 || goalkeeperAge>42){
                    System.out.println("Please enter a valid age!");
                }
                else{
                    goalAge=goalkeeperAge;
                    break;
                }
                }
                int goalkeeperJerseyNumber= 0;
                while(true){
                    System.out.println("Please enter a jersey number(1-99):");
                    int keeperJerseyNumber   = sc.nextInt();
                    sc.nextLine();
                    if(keeperJerseyNumber <1 || keeperJerseyNumber >99){
                        System.out.println("Please enter a valid jersey number(1-99)!");
                    }
                    else{
                        goalkeeperJerseyNumber= keeperJerseyNumber;
                        break;
                    }
                }
                int goalkeeperOverallRating= 0;
                while(true) {
                    System.out.println("Please enter a overall rating(1-99):");
                    int keeperOverall = sc.nextInt();
                    sc.nextLine();
                    if(keeperOverall<1 || keeperOverall>99){
                        System.out.println("Please enter a valid overall rating(1-99)!");
                    }
                    else{
                        goalkeeperOverallRating=keeperOverall;
                        break;
                    }
                }
                int goalkeeperReflexRating=0;
                while(true){
                    System.out.println("Please enter a reflex rating(1-99):");
                    int keeperReflexRating = sc.nextInt();
                    sc.nextLine();
                    if(keeperReflexRating <1 || keeperReflexRating >99){
                        System.out.println("Please enter a valid reflex rating(1-99)!");
                    }
                    else{
                        goalkeeperReflexRating=keeperReflexRating;
                        break;
                    }
                }
                int goalkeeperHandlingRating=0;
                while(true){
                    System.out.println("Please enter a handling rating(1-99):");
                    int keeperHandlingRating = sc.nextInt();
                    sc.nextLine();
                    if(keeperHandlingRating <1 || keeperHandlingRating >99){
                        System.out.println("Please enter a valid handling rating(1-99)!");
                    }
                    else{
                        goalkeeperHandlingRating=keeperHandlingRating;
                        break;
                    }
                }
                GoalKeeper goalkeeper1 = new GoalKeeper(goalkeeperName, goalAge, goalkeeperJerseyNumber, goalkeeperOverallRating, goalkeeperReflexRating, goalkeeperHandlingRating);
                awayTeam.addPlayer(goalkeeper1);
            }
        }
        while(true) {
            System.out.println("Do u want to play a match?");
            String answer = sc.nextLine();
            if(answer.equalsIgnoreCase("yes")){
        System.out.println("\n========================================");
        System.out.println("MATCH IS STARTING: " + homeTeamName + " VS " + awayTeamName + " ⚽");
        System.out.println("========================================");

        System.out.println("\n--- " + homeTeamName + " SQUAD ON THE PITCH ---");
        homeTeam.playMatch();

        System.out.println("\n--- " + awayTeamName + " SQUAD ON THE PITCH ---");
        awayTeam.playMatch();
        break;
            }
            else if(answer.equalsIgnoreCase("no")){
                System.out.println("Goodbye!");
                break;
            }
            else{
                System.out.println("Please enter a valid answer!");
            }
        }
    }
}
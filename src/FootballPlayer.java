import java.util.Scanner;

public class FootballPlayer extends Athlete {
    Scanner sc = new Scanner(System.in);
    private String position;
    private int passingRating;
    private int shootingRating;

    public FootballPlayer(String name, String teamName, int age, int jerseyNumber, int overallRating, String position, int passingRating, int shootingRating) {
        super(name, teamName, age, jerseyNumber, overallRating);
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

    public void passing(int meter) {
        if (meter > 0 && meter <= 30) {
            if (passingRating >= 0) {
                while (true) {
                    System.out.println(getName() + " (" + getTeamName() + ") is able to pass the ball!");
                    System.out.println("however, the pass accuracy rate is 70 percent! Do u want to try? ");
                    String answer = sc.nextLine();
                    if (answer.equalsIgnoreCase("yes")) {
                        double luck = (double) Math.random();
                        if (luck < 0.7) {
                            System.out.println(getName() + " (" + getTeamName() + ") successfully passed!");
                            break;
                        } else {
                            System.out.println(getName() + " (" + getTeamName() + ") missed the passed!");
                            break;
                        }
                    } else if (answer.equalsIgnoreCase("no")) {
                        System.out.println(getName() + " wont try to pass!");
                        break;
                    } else {
                        System.out.println("Invalid input!");
                    }
                }
            } else System.out.println(getName() + " (" + getTeamName() + ") is not able to pass the ball!");
        } else if (meter > 30 && meter <= 50) {
            if (passingRating >= 50) {
                while (true) {
                    System.out.println(getName() + " (" + getTeamName() + ") is able to pass the ball!");
                    System.out.println("however, the pass accuracy rate is 70 percent! Do u want to try? ");
                    String answer = sc.nextLine();
                    if (answer.equalsIgnoreCase("yes")) {
                        double luck = (double) Math.random();
                        if (luck < 0.7) {
                            System.out.println(getName() + " (" + getTeamName() + ") successfully passed!");
                            break;
                        } else {
                            System.out.println(getName() + " (" + getTeamName() + ") missed the passed!");
                            break;
                        }
                    } else if (answer.equalsIgnoreCase("no")) {
                        System.out.println(getName() + " (" + getTeamName() + ") wont try to pass!");
                        break;
                    } else {
                        System.out.println("Invalid input!");
                    }
                }
            } else {
                System.out.println(getName() + " (" + getTeamName() + ") is not able to pass the ball!");
            }
        } else if (meter > 50 && meter <= 70) {
            if (passingRating >= 70) {
                while (true) {
                    System.out.println(getName() + " (" + getTeamName() + ") is able to pass the ball!");
                    System.out.println("however, the pass accuracy rate is 70 percent! Do u want to try? ");
                    String answer = sc.nextLine();
                    if (answer.equalsIgnoreCase("yes")) {
                        double luck = (double) Math.random();
                        if (luck < 0.7) {
                            System.out.println(getName() + " (" + getTeamName() + ") successfully passed!");
                            break;
                        } else {
                            System.out.println(getName() + " (" + getTeamName() + ") missed the passed!");
                            break;
                        }
                    } else if (answer.equalsIgnoreCase("no")) {
                        System.out.println(getName() + " (" + getTeamName() + ") wont try to pass!");
                        break;
                    } else {
                        System.out.println("Invalid input!");
                    }
                }
            } else {
                System.out.println(getName() + " (" + getTeamName() + ") is not able to pass the ball!");
            }
        } else if (meter > 70 && meter <= 100) {
            if (passingRating >= 90) {
                while (true) {
                    System.out.println(getName() + " (" + getTeamName() + ") is able to pass the ball!");
                    System.out.println("however, the pass accuracy rate is 90 percent! Do u want to try? ");
                    String answer = sc.nextLine();
                    if (answer.equalsIgnoreCase("yes")) {
                        double luck = (double) Math.random();
                        if (luck < 0.9) {
                            System.out.println(getName() + " (" + getTeamName() + ") successfully passed!");
                            break;
                        } else {
                            System.out.println(getName() + " (" + getTeamName() + ") missed the passed!");
                            break;
                        }
                    } else if (answer.equalsIgnoreCase("no")) {
                        System.out.println(getName() + " (" + getTeamName() + ") wont try to pass!");
                        break;
                    } else {
                        System.out.println("Invalid input!");
                    }
                }
            } else {
                System.out.println(getName() + " (" + getTeamName() + ") is not able to pass the ball!");
            }
        } else {
            System.out.println("Invalid pass distance: " + meter + "m");
        }
    }

    public boolean shooting(int meter, GoalKeeper gk) {
            if (meter > 0 && meter <= 30) {
                if (shootingRating >= 30) {
                    System.out.println(getName() + " (" + getTeamName() + ") is able to shoot the ball!");
                    if (shootingRating < gk.getReflexRating()) {
                        while (true) {
                            System.out.println("however, the shot accuracy rate is 26 percent! Do u want to try? ");
                            String answer = sc.nextLine();
                            if (answer.equalsIgnoreCase("yes")) {
                                double luck = (double) Math.random();
                                if (luck < 0.26) {
                                    System.out.println(getName() + " (" + getTeamName() + ") have successfully scored!");
                                    return true;
                                } else {
                                    System.out.println(getName() + " (" + getTeamName() + ") have missed the shot!");
                                    if(gk.getHandlingRating()>=78) {
                                        System.out.println("Goalkeeper took the ball into his hands.");
                                    }
                                    else{
                                        System.out.println("Goalkeeper failed to catch the ball.The ball went out for a corner");
                                    }
                                    return false;
                                }
                            } else if (answer.equalsIgnoreCase("no")) {
                                System.out.println(getName() + " (" + getTeamName() + ") wont try to shoot!");
                                return false;
                            } else {
                                System.out.println("Invalid input!");
                            }
                        }
                    } else if (shootingRating == gk.getReflexRating()) {
                        while (true) {
                            System.out.println("however, the shot accuracy rate is 47 percent! Do u want to try? ");
                            String answer = sc.nextLine();
                            if (answer.equalsIgnoreCase("yes")) {
                                double luck = (double) Math.random();
                                if (luck < 0.47) {
                                    System.out.println(getName() + " (" + getTeamName() + ") have successfully scored!");
                                    return true;
                                } else {
                                    System.out.println(getName() + " (" + getTeamName() + ") have missed the shot!");
                                    if(gk.getHandlingRating()>=87) {
                                        System.out.println("Goalkeeper took the ball into his hands.");
                                    }
                                    else{
                                        System.out.println("Goalkeeper failed to catch the ball.The ball went out for a corner");
                                    }
                                    return false;
                                }
                            } else if (answer.equalsIgnoreCase("no")) {
                                System.out.println(getName() + " (" + getTeamName() + ") wont try to shoot!");
                                return false;
                            } else {
                                System.out.println("Invalid input!");
                            }
                        }
                    } else if (shootingRating > gk.getReflexRating()) {
                        while (true) {
                            System.out.println("however, the shot accuracy rate is 65 percent! Do u want to try? ");
                            String answer = sc.nextLine();
                            if (answer.equalsIgnoreCase("yes")) {
                                double luck = (double) Math.random();
                                if (luck < 0.65) {
                                    System.out.println(getName() + " (" + getTeamName() + ") have successfully scored!");
                                    return true;
                                } else {
                                    System.out.println(getName() + " (" + getTeamName() + ") have missed the shot!");
                                    if(gk.getHandlingRating()>=95) {
                                        System.out.println("Goalkeeper took the ball into his hands.");
                                    }
                                    else{
                                        System.out.println("Goalkeeper failed to catch the ball.The ball went out for a corner");
                                    }
                                    return false;
                                }
                            } else if (answer.equalsIgnoreCase("no")) {
                                System.out.println(getName() + " (" + getTeamName() + ") wont try to shoot!");
                                return false;
                            } else {
                                System.out.println("Invalid input!");
                            }
                        }
                    } else {
                        System.out.println(getName() + " (" + getTeamName() + ") is not able to shoot the ball!");
                    }
                }
            } else if (meter > 30 && meter <= 50) {
                if (shootingRating >= 50) {
                    System.out.println(getName() + " (" + getTeamName() + ") is able to shoot the ball!");
                    if (shootingRating < gk.getReflexRating()) {
                        while (true) {
                            System.out.println("however, the shot accuracy rate is 30 percent! Do u want to try? ");
                            String answer = sc.nextLine();
                            if (answer.equalsIgnoreCase("yes")) {
                                double luck = (double) Math.random();
                                if (luck < 0.3) {
                                    System.out.println(getName() + " (" + getTeamName() + ") have successfully scored!");
                                    return true;
                                } else {
                                    System.out.println(getName() + " (" + getTeamName() + ") have missed the shot!");
                                    if(gk.getHandlingRating()>=70) {
                                        System.out.println("Goalkeeper took the ball into his hands.");
                                    }
                                    else{
                                        System.out.println("Goalkeeper failed to catch the ball.The ball went out for a corner");
                                    }
                                    return false;
                                }
                            } else if (answer.equalsIgnoreCase("no")) {
                                System.out.println(getName() + " (" + getTeamName() + ") wont try to shoot!");
                                return false;
                            } else {
                                System.out.println("Invalid input!");
                            }
                        }
                    } else if (shootingRating == gk.getReflexRating()) {
                        while (true) {
                            System.out.println("however, the shot accuracy rate is 50 percent! Do u want to try? ");
                            String answer = sc.nextLine();
                            if (answer.equalsIgnoreCase("yes")) {
                                double luck = (double) Math.random();
                                if (luck < 0.5) {
                                    System.out.println(getName() + " (" + getTeamName() + ") have successfully scored!");
                                    return true;
                                } else {
                                    System.out.println(getName() + " (" + getTeamName() + ") have missed the shot!");
                                    if(gk.getHandlingRating()>=82) {
                                        System.out.println("Goalkeeper took the ball into his hands.");
                                    }
                                    else{
                                        System.out.println("Goalkeeper failed to catch the ball.The ball went out for a corner");
                                    }
                                    return false;
                                }
                            } else if (answer.equalsIgnoreCase("no")) {
                                System.out.println(getName() + " (" + getTeamName() + ") wont try to shoot!");
                                return false;
                            } else {
                                System.out.println("Invalid input!");
                            }
                        }
                    } else if (shootingRating > gk.getReflexRating()) {
                        while (true) {
                            System.out.println("however, the shot accuracy rate is 70 percent! Do u want to try? ");
                            String answer = sc.nextLine();
                            if (answer.equalsIgnoreCase("yes")) {
                                double luck = (double) Math.random();
                                if (luck < 0.7) {
                                    System.out.println(getName() + " (" + getTeamName() + ") have successfully scored!");
                                    return true;
                                } else {
                                    System.out.println(getName() + " (" + getTeamName() + ") have missed the shot!");
                                    if(gk.getHandlingRating()>=90) {
                                        System.out.println("Goalkeeper took the ball into his hands.");
                                    }
                                    else{
                                        System.out.println("Goalkeeper failed to catch the ball.The ball went out for a corner");
                                    }
                                    return false;
                                }
                            } else if (answer.equalsIgnoreCase("no")) {
                                System.out.println(getName() + " (" + getTeamName() + ") wont try to shoot!");
                                return false;
                            } else {
                                System.out.println("Invalid input!");
                            }
                        }
                    } else {
                        System.out.println(getName() + " (" + getTeamName() + ") is not able to shoot the ball!");
                    }
                }
            } else if (meter > 50 && meter <= 70) {
                if (shootingRating >= 70) {
                    System.out.println(getName() + " (" + getTeamName() + ") is able to shoot the ball!");
                    if (shootingRating < gk.getReflexRating()) {
                        while (true) {
                            System.out.println("however, the shot accuracy rate is 30 percent! Do u want to try? ");
                            String answer = sc.nextLine();
                            if (answer.equalsIgnoreCase("yes")) {
                                double luck = (double) Math.random();
                                if (luck < 0.30) {
                                    System.out.println(getName() + " (" + getTeamName() + ") have successfully scored!");
                                    return true;
                                } else {
                                    System.out.println(getName() + " (" + getTeamName() + ") have missed the shot!");
                                    if(gk.getHandlingRating()>=60) {
                                        System.out.println("Goalkeeper took the ball into his hands.");
                                    }
                                    else{
                                        System.out.println("Goalkeeper failed to catch the ball.The ball went out for a corner");
                                    }
                                    return false;
                                }
                            } else if (answer.equalsIgnoreCase("no")) {
                                System.out.println(getName() + " (" + getTeamName() + ") wont try to shoot!");
                                return false;
                            } else {
                                System.out.println("Invalid input!");
                            }
                        }
                    } else if (shootingRating == gk.getReflexRating()) {
                        while (true) {
                            System.out.println("however, the shot accuracy rate is 38 percent! Do u want to try? ");
                            String answer = sc.nextLine();
                            if (answer.equalsIgnoreCase("yes")) {
                                double luck = (double) Math.random();
                                if (luck < 0.38) {
                                    System.out.println(getName() + " (" + getTeamName() + ") have successfully scored!");
                                    return true;
                                } else {
                                    System.out.println(getName() + " (" + getTeamName() + ") have missed the shot!");
                                    if(gk.getHandlingRating()>=70) {
                                        System.out.println("Goalkeeper took the ball into his hands.");
                                    }
                                    else{
                                        System.out.println("Goalkeeper failed to catch the ball.The ball went out for a corner");
                                    }
                                    return false;
                                }
                            } else if (answer.equalsIgnoreCase("no")) {
                                System.out.println(getName() + " (" + getTeamName() + ") wont try to shoot!");
                                return false;
                            } else {
                                System.out.println("Invalid input!");
                            }
                        }
                    } else if (shootingRating > gk.getReflexRating()) {
                        while (true) {
                            System.out.println("however, the shot accuracy rate is 45 percent! Do u want to try? ");
                            String answer = sc.nextLine();
                            if (answer.equalsIgnoreCase("yes")) {
                                double luck = (double) Math.random();
                                if (luck < 0.45) {
                                    System.out.println(getName() + " (" + getTeamName() + ") have successfully scored!");
                                    return true;
                                } else {
                                    System.out.println(getName() + " (" + getTeamName() + ") have missed the shot!");
                                    if(gk.getHandlingRating()>=80) {
                                        System.out.println("Goalkeeper took the ball into his hands.");
                                    }
                                    else{
                                        System.out.println("Goalkeeper failed to catch the ball.The ball went out for a corner");
                                    }
                                    return false;
                                }
                            } else if (answer.equalsIgnoreCase("no")) {
                                System.out.println(getName() + " (" + getTeamName() + ") wont try to shoot!");
                                return false;
                            } else {
                                System.out.println("Invalid input!");
                            }
                        }
                    } else {
                        System.out.println(getName() + " (" + getTeamName() + ") is not able to shoot the ball!");
                    }
                }
            } else if (meter > 70 && meter <= 100) {
                if (shootingRating >= 90) {
                    System.out.println(getName() + " (" + getTeamName() + ") is able to shoot the ball!");
                    if (shootingRating < gk.getReflexRating()) {
                        while (true) {
                            System.out.println("however, the shot accuracy rate is 37 percent! Do u want to try? ");
                            String answer = sc.nextLine();
                            if (answer.equalsIgnoreCase("yes")) {
                                double luck = (double) Math.random();
                                if (luck < 0.37) {
                                    System.out.println(getName() + " (" + getTeamName() + ") have successfully scored!");
                                    return true;
                                } else {
                                    System.out.println(getName() + " (" + getTeamName() + ") have missed the shot!");
                                    if(gk.getHandlingRating()>=55) {
                                        System.out.println("Goalkeeper took the ball into his hands.");
                                    }
                                    else{
                                        System.out.println("Goalkeeper failed to catch the ball.The ball went out for a corner");
                                    }
                                    return false;
                                }
                            } else if (answer.equalsIgnoreCase("no")) {
                                System.out.println(getName() + " (" + getTeamName() + ") wont try to shoot!");
                                return false;
                            } else {
                                System.out.println("Invalid input!");
                            }
                        }
                    } else if (shootingRating == gk.getReflexRating()) {
                        while (true) {
                            System.out.println("however, the shot accuracy rate is 40 percent! Do u want to try? ");
                            String answer = sc.nextLine();
                            if (answer.equalsIgnoreCase("yes")) {
                                double luck = (double) Math.random();
                                if (luck < 0.40) {
                                    System.out.println(getName() + " (" + getTeamName() + ") have successfully scored!");
                                    return true;
                                } else {
                                    System.out.println(getName() + " (" + getTeamName() + ") have missed the shot!");
                                    if(gk.getHandlingRating()>=60) {
                                        System.out.println("Goalkeeper took the ball into his hands.");
                                    }
                                    else{
                                        System.out.println("Goalkeeper failed to catch the ball.The ball went out for a corner");
                                    }
                                    return false;
                                }
                            } else if (answer.equalsIgnoreCase("no")) {
                                System.out.println(getName() + " (" + getTeamName() + ") wont try to shoot!");
                                return false;
                            } else {
                                System.out.println("Invalid input!");
                            }
                        }
                    } else if (shootingRating > gk.getReflexRating()) {
                        while (true) {
                            System.out.println("however, the shot accuracy rate is 47 percent! Do u want to try? ");
                            String answer = sc.nextLine();
                            if (answer.equalsIgnoreCase("yes")) {
                                double luck = (double) Math.random();
                                if (luck < 0.47) {
                                    System.out.println(getName() + " (" + getTeamName() + ") have successfully scored!");
                                    return true;
                                } else {
                                    System.out.println(getName() + " (" + getTeamName() + ") have missed the shot!");
                                    if(gk.getHandlingRating()>=65) {
                                        System.out.println("Goalkeeper took the ball into his hands.");
                                    }
                                    else{
                                        System.out.println("Goalkeeper failed to catch the ball.The ball went out for a corner");
                                    }
                                    return false;
                                }
                            } else if (answer.equalsIgnoreCase("no")) {
                                System.out.println(getName() + " (" + getTeamName() + ") wont try to shoot!");
                                return false;
                            } else {
                                System.out.println("Invalid input!");
                            }
                        }
                    } else {
                        System.out.println(getName() + " (" + getTeamName() + ") is not able to shoot the ball!");
                    }
                }
            } else {
                System.out.println("Invalid shoot distance: " + meter + "m");
            }
            return false;
        }
        @Override
        public void play () {
            System.out.println(getName() + " (" + position + ") is running, passing the ball, and creating chances!");
        }
}

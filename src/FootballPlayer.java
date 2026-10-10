import java.util.Scanner;

public class FootballPlayer extends Athlete{
    Scanner sc=new Scanner(System.in);
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
                System.out.println("however, the pass accuracy rate is 70 percent! Do u want to try? ");
                String answer=sc.nextLine();
                if(answer.equals("yes")){
                    double luck = (double) Math.random();
                    if(luck <0.7){
                        System.out.println(getName() + " successfully passed!");
                    }
                    else{
                        System.out.println(getName() + " missed the passed!");
                    }
                }
                else if(answer.equals("no")){
                    System.out.println(getName() +  " wont try to pass!");
                }
                else{
                    System.out.println("Invalid input!");
                }
        }
            else System.out.println(getName() + " is not able to pass the ball!");
    }
        else if(meter > 30 && meter <= 50){
            if(passingRating >= 50){
                System.out.println(getName() + " is able to pass the ball!");
                System.out.println("however, the pass accuracy rate is 70 percent! Do u want to try? ");
                String answer=sc.nextLine();
                if(answer.equals("yes")){
                    double luck = (double) Math.random();
                    if(luck <0.7){
                        System.out.println(getName() + " successfully passed!");
                    }
                    else{
                        System.out.println(getName() + " missed the passed!");
                    }
                }
                else if(answer.equals("no")){
                    System.out.println(getName() +  " wont try to pass!");
                }
                else{
                    System.out.println("Invalid input!");
                }
        }
            else{
                System.out.println(getName() + " is not able to pass the ball!");
            }
        }
        else if(meter > 50 && meter <= 70){
            if(passingRating >= 70){
                System.out.println(getName() + " is able to pass the ball!");
                System.out.println("however, the pass accuracy rate is 70 percent! Do u want to try? ");
                String answer=sc.nextLine();
                if(answer.equals("yes")){
                    double luck = (double) Math.random();
                    if(luck <0.7){
                        System.out.println(getName() + " successfully passed!");
                    }
                    else{
                        System.out.println(getName() + " missed the passed!");
                    }
                }
                else if(answer.equals("no")){
                    System.out.println(getName() +  " wont try to pass!");
                }
                else{
                    System.out.println("Invalid input!");
                }
            }
            else{
                System.out.println(getName() + " is not able to pass the ball!");
            }
        }
        else if(meter > 70 && meter <= 100){
            if(passingRating >= 90){
                System.out.println(getName() + " is able to pass the ball!");
                System.out.println("however, the pass accuracy rate is 90 percent! Do u want to try? ");
                String answer=sc.nextLine();
                if(answer.equals("yes")){
                    double luck = (double) Math.random();
                    if(luck <0.9){
                        System.out.println(getName() + " successfully passed!");
                    }
                    else{
                        System.out.println(getName() + " missed the passed!");
                    }
                }
                else if(answer.equals("no")){
                    System.out.println(getName() +  " wont try to pass!");
                }
                else{
                    System.out.println("Invalid input!");
                }
            }
            else{
                System.out.println(getName() + " is not able to pass the ball!");
            }
        }
        else {
            System.out.println("Invalid pass distance: " + meter + "m");
        }
    }
    public void shooting(int meter) {
        if (meter > 0 && meter <= 30) {
            if (shootingRating >= 30) {
                System.out.println(getName() + " is able to shoot the ball!");
                System.out.println("however, the shot accuracy rate is 50 percent! Do u want to try? ");
                String answer=sc.nextLine();
                if(answer.equals("yes")){
                    double luck = (double) Math.random();
                    if(luck <0.5){
                        System.out.println(getName() + " have successfully scored!");
                    }
                    else{
                        System.out.println(getName() + " have missed the shot!");
                    }
                }
                else if(answer.equals("no")){
                    System.out.println(getName() +  " wont try to shoot!");
                }
                else{
                    System.out.println("Invalid input!");
                }
            } else {
                System.out.println(getName() + " is not able to shoot the ball!");
            }
        }
        else if(meter > 30 && meter <= 50){
            if(shootingRating >= 50){
                System.out.println(getName() + " is able to shoot the ball!");
                System.out.println("however, the shot accuracy rate is 50 percent! Do u want to try? ");
                String answer=sc.nextLine();
                if(answer.equals("yes")){
                    double luck  = (double) (Math.random());
                    if(luck <0.5){
                        System.out.println(getName() + " have successfully scored!");
                    }
                    else{
                        System.out.println(getName() + " have missed the shot!");
                    }
                }
                else if(answer.equals("no")){
                    System.out.println(getName() +  " wont try to shoot!");
                }
                else{
                    System.out.println("Invalid input!");
                }
            }
            else{
                System.out.println(getName() + " is not able to shoot the ball!");
            }
        }
        else if(meter>50 && meter<=70){
            if(shootingRating >= 70){
                System.out.println(getName() + " is able to shoot the ball!");
                System.out.println("however, the shot accuracy rate is 50 percent! Do u want to try? ");
                String answer=sc.nextLine();
                if(answer.equals("yes")){
                    double luck = (double) Math.random();
                    if(luck <0.5){
                        System.out.println(getName() + " have successfully scored!");
                    }
                    else{
                        System.out.println(getName() + " have missed the shot!");
                    }
                }
                else if(answer.equals("no")){
                    System.out.println(getName() +  " wont try to shoot!");
                }
                else{
                    System.out.println("Invalid input!");
                }
            }
            else{
                System.out.println(getName() + " is not able to shoot the ball!");
            }
        }
        else if(meter>70){
            if(shootingRating>=90){
                System.out.println(getName() + " is able to shoot the ball everywhere on the pitch!");
            }
            else{
                System.out.println(getName() + " is not able to shoot the ball!");
            }
        }
        else {
            System.out.println("Invalid shoot distance: " + meter + "m");
        }
    }
    @Override
    public void play() {
        System.out.println(getName() + " (" + position + ") is running, passing the ball, and creating chances!");
    }
}

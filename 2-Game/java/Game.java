import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Game {
    private int maxnumber;
    private int randomnumber;
    private boolean win = false;
    public LinkedList <Integer> log =
            new LinkedList<>();
   public int lower = 0;
    public int upper = 100;


    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    public void setMaxnumber(int maxnumber) {
        this.maxnumber = maxnumber;
    }


    public int random(){
        int a = this.maxnumber;
        int random_number = (int) (Math.random() * a);
        return random_number;
    }


    public void inputCheck(){



        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number between 0-100:");

        if (sc.hasNextInt()) {
            this.randomnumber = sc.nextInt();

        } else {
            System.out.println("Not a number");
        }
    }

    public int getRandomnumber() {
        return randomnumber;
    }




    public void findRandom(int randomNumber, int enteredNumber){

log.add(enteredNumber);


        if(randomNumber==enteredNumber) {
            System.out.println("you win");
            this.win=true;
        }
       else if (randomNumber>enteredNumber) {
           lower = enteredNumber;
            System.out.println("the number is bigger and between " + lower + " and " + upper);
        }else{
           upper = enteredNumber;
            System.out.println("the number is lower and between "+ lower + " and " + upper);
        }


        System.out.println(log);
    }


    public static void main(String[] args) {



        Game game = new Game();
        game.setMaxnumber(100);
        int randomNumber = game.random();
        System.out.println(randomNumber);

        while(!game.isWin()) {


            game.inputCheck();
            int enteredNumber = game.getRandomnumber();
            System.out.println(enteredNumber);
            game.findRandom(randomNumber, enteredNumber);

        }

    }
}

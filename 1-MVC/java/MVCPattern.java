import controller.SentenceController;
import model.Sentence;

import view.SentenceView;

import java.util.Scanner;

public class MVCPattern{
    public static void main(String[] args) {


       Sentence model  = retriveSentenceFromDatabase();


        SentenceView view = new SentenceView();

        SentenceController controller = new SentenceController(model, view);



        Scanner scanner = new Scanner(System.in);

        System.out.println("firstWord:");
        if(scanner.hasNextLine()) {

                String firstword = scanner.nextLine();

                controller.setHello(firstword);

        }
        System.out.println("secondWord:");
        if(scanner.hasNextLine()) {

                String secondword = scanner.nextLine();

                controller.setWorld(secondword);

        }
        scanner.close();



        controller.updateView();
    }

    private static Sentence retriveSentenceFromDatabase(){
        Sentence sentence = new Sentence();
        return sentence;
    }
}
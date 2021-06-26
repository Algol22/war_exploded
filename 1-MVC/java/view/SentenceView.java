package view;

import java.io.IOException;
import java.util.Scanner;

public class SentenceView {
    public void printSentence(String firstword, String secondword){



if(firstword!=null && secondword!=null) {
    System.out.println("Sentence: ");
    System.out.println(firstword + " " + secondword);
}else {
    System.out.println("no valid data entered");
}


    }
}
package controller;

import model.Sentence;
import view.SentenceView;

public class SentenceController {
    private Sentence model;
    private SentenceView view;

    public SentenceController(Sentence model, SentenceView view){
        this.model = model;
        this.view = view;
    }

    public void setHello(String hello){
        if(hello.equals("hello")) {
            model.setHello(hello);
        }else{
            System.out.println("only 'hello' can be entered");
        }
    }

    public String getHello(){
        return model.getHello();
    }

    public void setWorld(String world){
        if(world.equals("world")) {

        model.setWorld(world);
        }else{
            System.out.println("only 'world' can be entered");
        }
    }

    public String getWorld(){
        return model.getWorld();
    }

    public void updateView(){
        view.printSentence(model.getHello(), model.getWorld());
    }
}
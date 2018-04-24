package com.example.aileenlaverty.rockpaperscissors;


import java.util.ArrayList;
import java.util.Collections;

public class RPSComputerSelection {

    ArrayList<String> options;

    public RPSComputerSelection() {
        createOptions();
    }

    public void createOptions(){
        this.options = new ArrayList<>();
        options.add("Rock");
        options.add("Paper");
        options.add("Scissors");
    }

    public ArrayList<String> getOptions(){
        return new ArrayList<>(this.options);
    }

    public String getRandomOption(){
        Collections.shuffle(this.options);
        return  this.options.get(0);
    }

}

package org.coms;

public class SimProvider {
    public Sim getSim(String name){
        if (name == "Vodafone"){
            return new Vodafone();
        }
        else if (name == "Jio"){
            return new Jio();
        }
        return null;
    }
}

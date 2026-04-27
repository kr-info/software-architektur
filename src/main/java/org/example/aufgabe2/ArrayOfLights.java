package org.example.aufgabe2;

import java.sql.Array;

public class ArrayOfLights {

    private boolean[][] lights;
    private double initialProbability;
    private IPolicy policy;

    public ArrayOfLights(double initialProbability, int x_dim, int y_dim) {
        this.initialProbability = initialProbability;
    }

    public void  doStep(){

    }

    public void setPolicy(IPolicy policy){

    }
}

package org.example.aufgabe2;

public class ChristophersPolicy implements IPolicy{

    @Override
    public boolean nextState(boolean[][] lights, int x_coordinate, int y_coordiante) {
        for (int i = 0; i < lights.length; i++) {
            for (int j = 0; j < lights[i].length; j++) {

                if(lights[i][j]){
                    return Math.round(Math.random()) == 1;
                }
                else {
                    //wenn mind 1 Nachbar an ist, dann %0:50 Wahrscheinlichkeit,dass an
                    if()
                }
            }



        }
    }

    public boolean checkAlleNachbarn(boolean[][] lights){
        for (int i = 0; i < lights.length; i++) {
            for (int j = 0; j < lights[i].length; j++) {

            if (i == 0 && j == 0)  {



            } else if (i == 0 && j == lights[i].length) {

            }

            else if (i == lights.length  && j == lights[i].length-1) {

            }

            else if (i == 0) {

            }

            else if (j == ) {

            }
            }
    }

}

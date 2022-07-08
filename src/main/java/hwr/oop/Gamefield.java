package hwr.oop;

import java.util.Arrays;

public class Gamefield{
    Node[] nodeArray = new Node[24];

    public Gamefield(){
        int counter = 0;
        for (int x = 1; x <= 3; x ++) {

            for (int y = 1; y <= 3; y++) {

                for (int z = 1; z <= 3; z++) {


                    if (!((x == 2 && y == 2 && z == 1) || (x == 2 && y == 2 && z == 2) || (x == 2 && y == 2 && z == 3))) {
                        nodeArray[counter] = new Node(x, y, z);
                        counter ++;

                    }
                }
            }


        }
        System.out.println(nodeArray.length);

        for (int i = 0; i < nodeArray.length; i ++){
            System.out.print(nodeArray[i].x);
            System.out.print(nodeArray[i].y);
            System.out.print(nodeArray[i].z);
            System.out.println("");

        }

    }









}

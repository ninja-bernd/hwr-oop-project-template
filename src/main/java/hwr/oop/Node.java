package hwr.oop;

public class Node {
    /*private int xknoten;
    private int yknoten;
    private int zknoten;
    int x = xknoten;
    int y = yknoten;
    int z = zknoten;

     */
    int x;
    int y;
    int z;
    boolean value;

    public Node(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
        //value = false;

    public void setValue(boolean value){
        this.value = value;
    }
    //public void get_coodinates(int x, int y, int z){
        //System.out.println("x:" + Integer.toString(x) + "y:" + Integer.toString(y) + "z:" + Integer.toString(z));
    public boolean hasPosition(int x, int y, int z) {//x ist dasselbe wie attribut x -> eingabeparameter die gleichen wie attribute: true
        return (this.x == x) && (this.y == y) && (this.z == z);
    }



}


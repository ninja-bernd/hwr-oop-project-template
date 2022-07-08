public class node {
    int x = xknoten;
    int y = yknoten;
    int z = zknoten;

    public void set(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public string get_coordinates(){
        return("x:" + Integer.toString(x) + "y:" + Integer.toString(y) + "z:" + Integer.toString(z));
    }
}

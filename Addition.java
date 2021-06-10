/**
 * Created by Rakesh on 04/08/20.
 */
public class Addition {
    private int i;
    private int j;
    private int sum;

    public Addition(int x,int y){
        i =x;
        j= y;
        sum = i+j;
    }

    public int getSum(){
        System.out.println("INSIDE Addition......");
        return sum;
    }

    public int getAdded(int j,int k){
        return j+k;
    }


}

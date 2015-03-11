package nyc.c4q.fattyduck;

/**
 * Created by fattyduck on 3/10/15.
 */
import java.util.Scanner;
public class countMachineR {
    public static void main(String[] args) {
        int from, to, by;
        Scanner cow = new Scanner(System.in);
        System.out.println("Counting from:");
        from = cow.nextInt();
        System.out.println("Counting to:");
        to = cow.nextInt();
        System.out.println("Counting by:");
        by = cow.nextInt();
        System.out.println("Here we go =P");
    if(from<to) {
        for (int i = from; i <= to; i += by) {

            System.out.print(i + " ");
        }
    }else if(from>to){
        for (int i = from; i>=to; i-=by){

            System.out.print(i + " ");
        }
    }
    }
}

package nyc.c4q.fattyduck;

/**
 * Created by fattyduck on 3/10/15.
 */
import java.util.Scanner;

public class countMachine {
    public static void main(String[] args){
        int input;
        Scanner cow=new Scanner(System.in);
        System.out.println("Counting to 19:");
        for ( int i =0; i<=19;i+=1){
            System.out.print(i+" ");
        }
        System.out.println("\nCounting to 8:");
        for (int i =0;i<=8;i+=1){
            System.out.print(i + " ");
        }
        System.out.println("\nCounting to 25:");
        for(int i=0;i<=25;i+=1){
            System.out.print(i+" ");
        }
        System.out.println("you get to choose where we are counting to now =P");
        System.out.println("Counting to ");
        input=cow.nextInt();
        for(int i=0;i<=input;i+=1)
            System.out.print(i+ " ");
    }
}

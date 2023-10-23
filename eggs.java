/**
 *
 * @author user
 */
import java.util.Scanner;
public class Eggs {
public static void main (String[] args)
    {
        int numberOfEggs;
        System.out.println("number of Eggs:");
   Scanner Eggs = new Scanner(System.in);     
        numberOfEggs = Eggs.nextInt();
        
        TotalandRemainingEggs(numberOfEggs);
    }
    public static void TotalandRemainingEggs(int numberOfEggs)
    {
        int remainingeggs,dozeneggs;
        dozeneggs = numberOfEggs/12;
        remainingeggs = numberOfEggs - (dozeneggs*12);
        
        System.out.print("Total Number of Eggs: " + numberOfEggs +
                "\nTotal Eggs in Dozens : " + dozeneggs + "\nThe remaining eggs: " +
                remainingeggs);
    }
}

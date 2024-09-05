import java.util.*;

public class Practice_Question_5Loops {
    
    //Q1:print the sum of n natural number
    public static void main (String args[]) {
        // System.out.println("enter the natural number:  ");
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int sum = 0 ;
        // for(int i=0 ; i<=n; i++ )
        //     {
        //         sum = sum + i ;
        //     }

        // System.out.println(sum);
        
        //Q2 Print the table of a number input by the user 
        System.out.println("Which table you want to learn? ");
        Scanner sc= new Scanner(System.in);
        int table_no= sc.nextInt();
        System.out.println("So here are your table for: "+table_no); 
        int i =0;
        int result = 0;
        
        for(i=1;i<=10; i++){
            result = table_no * i;
            System.out.println( table_no + "x" +i + "=" +result);

        }

        }

    }

    

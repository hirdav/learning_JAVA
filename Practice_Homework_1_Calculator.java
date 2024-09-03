import java.util.Scanner;

//build a calculator

public class Practice_Homework_1_Calculator {
    public static void main(String[] args) {
       
       
        char operator;
        float n1,n2;
        System.out.println("operators : +  - * / ");
        System.out.println("Choose operator  :  ");
        Scanner Sc = new Scanner(System.in);    
        operator = Sc.next().charAt(0) ;


        System.out.println(" Enter first number");
        n1= Sc.nextFloat();
        System.out.println(" Enter second number");
        n2= Sc.nextFloat();
    
        float result = 0 ;       
        switch (operator) {
            case '+' :
                result = n1 + n2;
                break;
            case '-' :
                result = n1-n2;
                break;    
            case '*' :
                result = n1*n2;
                break;
            case '/' :
               
                result = n1 / n2;
                break;
            default: 
                System.out.println("Invalid entry");
        
            }
            System.out.println("Result is : "+ result);
              

    }
}



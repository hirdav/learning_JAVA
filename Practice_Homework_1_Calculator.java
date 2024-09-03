import java.util.*;

//build a calculator

public class Practice_Homework_1_Calculator {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Choose two number");    
        int number1 = Sc.nextInt();
        int number2 = Sc.nextInt();
        System.out.println("chose and operator [+  - * / ]");
        char operator = Sc.nextChar().charAt(0);
        switch(operator)
            case '+':
                result = number1+number2;
                break;
            case '-':
                result = number1-number2;
                break;    
            case '*':
                result = number1*number2;
                break;
            case '/':
                if (num2 != 0) {
                result = number1 / number2;
                } else {
                System.out.println("Error: Division by zero is not allowed.");
                return;
            }
            break;
            System.out.println("the result is :" + result);
    
}

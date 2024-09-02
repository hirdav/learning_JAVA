import java.util.* ;

public class Practice_Question_3 {

    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a==b) {
            System.out.println("Equal");
        } else {
            if (a>b) {
                System.out.println("a is greater");
            } else {
                System.out.println("b is greater");
        }
        }


    }
    
}
//there is no need for curly brackets if the first condition is true or a single statement is true .


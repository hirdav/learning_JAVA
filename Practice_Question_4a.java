import java.util.*;


//Q. Print the griting after pressing the button  a)hello b) namste c) bonjour [switch case]

public class Practice_Question_4a {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();{
    
        // if (button == 1) {
        //     System.out.println("Hello");
        // }else if (button == 2) {
        //     System.out.println("Nameste");
        // }else if (button == 3) {
        //     System.out.println("bonjour");
        // }else {
        //     System.out.println("invalid selectio");

        switch(button) {
            case 1 : System.out.println("HEloow");
            break;
            case 2 : System.out.println("Nameste");
            break;
            case 3 : System.out.println("Bonjour");
            break;
            default : System.out.println("invalid press");
        }


        
    
        }
        

    }
    
    
}


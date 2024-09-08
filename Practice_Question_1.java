public class Practice_Question_1 { 
    public static void main(String[] args) {
    //to calculate a*b/a-b option a)int ans = a*b / a-b b) int ans = (a*b)/(a-b) [ans should be 10]
    // priority left to right :  *,/,%,>,+,-
        int a = 10 ;
        int b = 5 ;
        int ans = (a*b)/(a-b) ;
        //a*b=50  and a-b =5 , (50/10-5) -> 50/5 -> 10 ( always start with parenthesis ) 
        System.out.println(ans);
        
        // to test the true or false of a statement and it cannt be chain statement like x<y<z
        int x = 5;
        int y = 10;
        int z = 15;
        System.out.println("ans : " + (x < y && y < z));
        System.out.println("ans : " + (x < y || y < z));
    }
    
}

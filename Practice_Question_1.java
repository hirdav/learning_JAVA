public class Practice_Question_1 { 
    public static void main(String[] args) {
    //to calculate a*b/a-b option a)int ans = a*b / a-b b) int ans = (a*b)/(a-b) [ans should be 10]
    // priority left to right :  *,/,%,>,+,-
        int a = 10 ;
        int b = 5 ;
        int ans = (a*b)/(a-b) ;
        //a*b=50  and a-b =5 , (50/10-5) -> 50/5 -> 10 ( always start with parenthesis ) 
        System.out.println(ans);
        
    }
    
}

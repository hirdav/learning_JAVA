public class Star_Design {
    public static void main(String[] args) {
        System.out.println("making a star rectangle ");
        
       // Q1 : print the rectangle-star pattern 
    //    int n = 4; // Number of rows
    //     int m = 5; // Number of stars per row
        
    //     // Outer loop for rows
    //     for (int i = 1; i <= n; i++) {
    //         // Inner loop for stars in each row
    //         for (int j = 1; j <= m; j++) {
    //             System.out.print(" * ");
    //         }
    //         // Move to the next line after each row
    //         System.out.println();
                 
        //Q2 : print the start patern 

        
        int m = 5;
        int n = 4;
        

        //outer loop
        for (int i=1;i<=n;i++){
            for(int j=1 ; j<=m; j++) {
                System.out.print(" * ");
            }
        
              System.out.println();



        }


    }
}


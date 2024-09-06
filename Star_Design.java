public class Star_Design {
    public static void main(String[] args) {
        
        
       // Q1 : print the rectangle-star pattern 
       //System.out.println("making a star rectangle ");
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
        System.out.println("making a holo star rectangle ");
        
        int n = 4;
        int m = 5;
        

        //outer loop
        for (int i=1; i<=n; i++){
            //inner loop
            for(int j=1 ; j<=m; j++) {

                //cell ->(i,j)
                 if (i == 1 || j == 1 || i == n || j == m){
                    System.out.print(" * ");
                 }  else  {
                        System.out.print(" 0 ");
                 }

                
            }
        
              System.out.println();



        }


    }
}


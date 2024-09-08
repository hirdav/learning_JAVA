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
        // System.out.println("making a holo star rectangle ");
        
        // int n = 4;
        // int m = 5;
        

        // //outer loop
        // for (int i=1; i<=n; i++){
        //     //inner loop
        //     for(int j=1 ; j<=m; j++) {

        //         //cell ->(i,j)
        //          if (i == 1 || j == 1 || i == n || j == m){
        //             System.out.print(" * ");
        //          }  else  {
        //                 System.out.print(" 0 ");
        //          }

                
        //     }
        
        //       System.out.println();

        // //Q : Half pyramid
        //       int n = 4;
        
        // //outer loop
        // for (int i=1; i<=n; i++) {
        //     //inner loop
        //     for(int j=1 ; j<=i; j++) {
        //             System.out.print("*");        
        //          }   
        //          System.out.println();
        //     }
                
        // Q . ****
        //     ***
        //     **
        //     *
        // int n = 4;
        // outer loop to handle number of rows
        // for (int i=n ; i>=1 ; i--){
        //     //inner loop to handle number of columns (stars)
        //     for (int j=1 ; j<=i ; j++){
        //         System.out.print("*");
        // }
        //         System.out.println();     
            
        // }
         //Q:       *
        //         **
        //        ***
        //       **** 
        // int n=4;
        // // outer loop to handle number of rows
        // for (int i=1 ; i<=n ; i++){
        //     //inner loop to handle the spaces in columns (stars)
        //     for (int j=1 ; j<=n-i ; j++){
        //         System.out.print(" ");
        //     }//for inner loop to print the star
        //     for(int j=1 ; j<=i ; j++){
        //         System.out.print("*");
        // }
        //     System.out.println();
        // //
        // // //Q: print 1
        // //            1 2
        // //            1 2 3
        // //            1 2 3 4
        // //            1 2 3 4 5
        // int n=5;
        // // outer loop to handle number of rows
        // for (int i=1 ; i<=n ; i++){
        //     //inner loop to print columns (stars)
        //     for (int j=1 ; j<=i ; j++){
        //         System.out.print(j+ " ");
        //     }
        //         System.out.println();
        // }
        // //Q: print    1 2 3 4 5
                    //   1 2 3 4
                    //   1 2 3
                    //   1 2
                    //   1

                    
        // int n=5;
        // // outer loop to handle number of rows
        // for (int i=n ; i>=1 ; i--){
        //     //inner loop to print columns (stars)
        //     for (int j=1 ; j<=i ; j++){
        //         System.out.print(j);
        //     }
        //         System.out.println();
        // }
        // //
        // //Q :floyd triangle -1
        //                      2  3 
        //                      4  5  6
        //                      7  8  9  10
        //                      11 12 13 14 15

        // int n=5;
        // int number = 1;
        // // outer loop to handle number of rows
        // for (int i=1 ; i<=n ; i++){
        //    // inner loop to print columns (triangle)
        //     for (int j=1; j<=i; j++){
        //         System.out.print(number + " ");
        //         number++;
        //     }
        //     System.out.println();  
            
        //     }
                
        // Q: 0-1 triangle  trying in metrics 
        //                 1
        //                 0 1
        //                 1 0 1
        //                 0 1 0 1
        //                 1 0 1 0 1

            int n =5;

            for (int i=1 ; i <=n ; i++){
                for (int j=1 ; j<=i ; j++){
                    int sum = i+j;
                    if (sum %2 ==0) //even 
                    {
                        System.out.print("1");
                    } else //odd
                    {
                        System.out.print("0");
                    }
                }System.out.println();
            }
        }

        
    }
 
    



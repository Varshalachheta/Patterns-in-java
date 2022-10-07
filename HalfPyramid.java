public class HalfPyramid {
    public static void main(String [] args){
        int n = 6;
        for(int i=1;i<=n;i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

      //////INVERTED HALF PYRAMID////////

         for(int i=n; i>=1; i--){
             for(int j=1; j<=i; j++){
                 System.out.print("*");
             }
              System.out.println("");
         }


    /////// INVERTED HALF PYRAMID (roated by 180 degree) //////
     
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
         

         
    }
}

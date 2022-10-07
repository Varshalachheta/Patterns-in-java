import java.util.*;

public class ThirdClass{
    public static void main(String [] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a==b){
            System.out.println("equal");

        }else{
            if(a>b){
                System.out.println("a is greater");
            }else{
                System.out.println("a is lesser");
            }

        }

        // if(age>18){
        //     System.out.println("Adult");
        // } else{
        //     System.out.println("not an Adult");
        // }
        // if(age%2==0){
        //     System.out.println("Even");
        // }else{
        //     System.out.println("odd");
        // }

        
    }
}
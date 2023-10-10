import java.util.Scanner;
public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        int num = 0;

        System.out.print("Enter the number: ");
        num = keyboard.nextInt();

        System.out.print("Number is prime: " + isPrime(num));
        
        keyboard.close();
    }//main

    public static boolean isPrime(int x){
        boolean ans = true;
        
        for(int i = 2; i < x; i++){
            if(x % i == 0)
                ans = false;
        }
        
        if (x == 0)
            ans = true;

        return ans;
    }//isPrime
}

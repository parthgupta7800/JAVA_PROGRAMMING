
//PARTH GUPTA
//2215001214
import java.util.*;

class palin {
    public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);
        int n, rev = 0, d, temp;
        System.out.println("Enter the number");
        n = ob.nextInt();
        temp = n;
        while (n > 0) {
            d = n % 10;
            rev = rev * 10 + d;
            n = n / 10;
        }
        if (rev == temp)
            System.out.println("It is a palindrome number");
        else
            System.out.println("Not a palindrome number");
    }
}
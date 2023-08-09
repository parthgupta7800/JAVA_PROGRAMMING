
//PARTH GUPTA
//2215001214
import java.util.*;

class table {
    public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);
        int n, i;
        System.out.println("Enter the number to be print the table");
        n = ob.nextInt();
        for (i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }
}
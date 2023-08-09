
//PARTH GUPTA
//2215001214
import java.util.*;

class SI {
    public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the principle");
        int p = ob.nextInt();
        System.out.println("Enter the rate");
        int r = ob.nextInt();
        System.out.println("Enter the time");
        int t = ob.nextInt();
        double s = (p * r * t) / 100;
        System.out.println(s);
    }
}
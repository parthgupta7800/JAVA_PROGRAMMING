
//PARTH GUPTA
//2215001214
import java.util.*;

class cal {
    public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);
        int c;
        System.out.println("Enter the first number");
        int a = ob.nextInt();
        System.out.println("Enter the Second number");
        int b = ob.nextInt();
        System.out.println(
                "Enter 1 for addition\nEnter 2 for substraction\nEnter 3 for division\nEnter 4 for multiplication");
        int s = ob.nextInt();
        switch (s) {
            case 1:
                int x = a + b;
                System.out.println(x);
                break;
            case 2:
                int y = a - b;
                System.out.println(y);
                break;
            case 3:
                int z = a / b;
                System.out.println(z);
                break;
            case 4:
                int g = a * b;
                System.out.println(g);
                break;
            default:
                System.out.println("Enter the correct choice number");
                break;
        }
    }
}
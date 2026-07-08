import java.util.*;
class Ternary {
    public static void main(String[] args) //member method
     {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the a, b, and c values");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("The largest number is: " + largest);
     }
}
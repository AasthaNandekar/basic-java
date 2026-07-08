import java.util.*;
class Swapping {
    public static void main(String[] args) //member method
     {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the a and b values");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a= a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping: a = " + a + ", b = " + b);
     }
}
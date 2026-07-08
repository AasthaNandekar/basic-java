import java.util.*;
class Largest {
    public static void main(String[] args) //member method
     {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the a, b, and c values");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        while (a > b && a > c)
        {
            System.out.println("a is the largest number");
        }
        while (b > a && b > c)
        {
            System.out.println("b is the largest number");
        }
        while (c > a && c > b)
        {
            System.out.println("c is the largest number");
        }
     }
}
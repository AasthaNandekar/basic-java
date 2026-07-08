import java.util.*;
class Arithemetic {
    public static void main(String[] args) //member method
     {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the a and b values");
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + sub);
        System.out.println("Product: " + mul);
        System.out.println("Quotient: " + div);
        System.out.println("Remainder: " + mod);
     }
}
        
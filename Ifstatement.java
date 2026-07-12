import java.util.*;
class Ifstatement {
    public static void main(String[] args) //member method
     {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the a and b values");
        int a = in.nextInt();
        int b = in.nextInt();
        if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("b is greater than or equal to a");
        }
    }
}
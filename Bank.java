class Bank
{
    int ano;
    String ahnam;
    double bal;
    public void accept(int a, String an, double b)
    {
        ano = a;
        ahnam = an;
        bal = b;
    }
    public void deposit(int b)
    {
        bal = bal + b;
    }
    public void withdraw(int b)
    {
        if(bal >= b)
        {
            bal = bal - b;
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
    }
    public void display()
    {
        System.out.println("Account Number: " + ano);
        System.out.println("Account Holder Name: " + ahnam);
        System.out.println("Balance: " + bal);
    }
    public static void main(String[] args) 
    {
       Bank obj1 = new Bank(); 
       obj1.accept(12345, "John Doe", 1000.0);
       obj1.deposit(500);
       obj1.display();
       obj1.withdraw(200);
       obj1.display();
       Bank obj2 = new Bank(); 
       obj2.accept(12345, "Sanket", 10000.0);
       obj2.deposit(5000);
       obj2.display();
       obj2.withdraw(2200);
       obj2.display();
    }
}
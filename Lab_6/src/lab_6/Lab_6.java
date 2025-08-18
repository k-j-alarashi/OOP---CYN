package lab_6;

public class Lab_6 {
    public static void main(String[] args) {
//        BankAccouunt b = new BankAccouunt(1, "Khaled");
//        System.out.println("Amount      : "+b.getAmount());
//        b.deposit(10000);
//        b.deposit(2000);
//        b.withdraw(800000);
          Product p = new Product(1, "chocolate", 1000, 100);
          p.display();
          p.discount(20);
          p.display();
    }
}

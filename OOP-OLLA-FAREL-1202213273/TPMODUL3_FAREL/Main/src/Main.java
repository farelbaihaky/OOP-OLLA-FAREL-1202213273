import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Restaurant ab = new Restaurant();
        int customerID, orderQty;
        try {
            System.out.println("Masukkan ID pelanggan : "); 
            customerID = input.nextInt();

            System.out.println("Masukkan berapa makanan yang akan dibuat :  ");
            orderQty = input.nextInt();

            Thread t1 = new Thread(ab);
            Waiters Waiters = new Waiters(customerID, orderQty);
            Thread t2 = new Thread(Waiters);

            t1.start();
            t2.start();
            t1.join();
            t2.join();

        } catch (Exception z) {
            System.out.println("INPUT HARUS INTEGER");
        }
    }
}

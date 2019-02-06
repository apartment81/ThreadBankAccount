package ro.mirodone;

public class Main {

    public static void main(String[] args) {


        BankAccount account = new BankAccount(1000, "2222");

        //option 1
       /* Thread th1 = new Thread() {

            public void run() {
                account.deposit(300);
                account.withdraw(50);

            }
        };

        Thread th2 = new Thread() {
            public void run() {
                account.deposit(200);
                account.withdraw(100);
                System.out.println("sold final " + account.getBalance());
            }
        };*/

       Thread th1 = new Thread(new Runnable() {
           @Override
           public void run() {
               account.deposit(300);
               account.withdraw(50);
           }
       });

        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {
                account.deposit(200);
                account.withdraw(100);
                System.out.println("sold final " + account.getBalance());
            }
        });


        th1.start();
        th2.start();


    }
}

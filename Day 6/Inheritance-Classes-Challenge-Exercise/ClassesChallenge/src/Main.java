public class Main {

    public static void main(String[] args) {

        Account bobsAccount = new Account();

        //Account bobsAccount = new Account("12345", 500.00, "Bob",
                //"bob@bob.com", "01917102206");
        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());
        //bobsAccount.setNumber("12345");
        //bobsAccount.setBalance(1000.00);
       // bobsAccount.setCustomerName("Bob Brown");
        //bobsAccount.setCustomerEmail("myemail@bob.com");
        //bobsAccount.setCustomerPhone("(087) 123-4567");

        bobsAccount.withdrawFunds(100.0);
        bobsAccount.depositFunds(250);
        bobsAccount.withdrawFunds(50);

        bobsAccount.withdrawFunds(200);

        bobsAccount.depositFunds(100);
        bobsAccount.withdrawFunds(45.55);
        bobsAccount.withdrawFunds(54.46);

        bobsAccount.withdrawFunds(54.45);

        Account timsAccoount = new Account("Tim", "tim@tim.com","23242");
        System.out.println("AccountNo: " + timsAccoount.getNumber()+"\nname: " + timsAccoount.getCustomerName() + " \nEmail: " + timsAccoount.getCustomerEmail());
    }
}

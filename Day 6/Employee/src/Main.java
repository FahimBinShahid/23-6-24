public class Main {
    public static void main(String[] args) {

        Employee tim = new Employee("Tim", "10/5/2000","9/6/2024");
        System.out.println(tim);
        System.out.println(("Age =" + tim.getAge()));
        System.out.println("Pay=" + tim.collectPay());

        Employee joe = new Employee("Joe","12/5/2001","20/5/23");
    }
}
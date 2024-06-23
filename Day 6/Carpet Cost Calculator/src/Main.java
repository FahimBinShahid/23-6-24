public class Main {
    public static void main(String[] args) {
        Floor floor1 = new Floor(5,7);
        Carpet carpet1 = new Carpet(5.4);
        Calculator calculator = new Calculator(floor1,carpet1);

        System.out.println("Total Cost:"+ calculator.getTotalCost());
        Carpet carpet2 = new Carpet(1.5);
        Floor floor2 = new Floor(3.4,5.1);
        calculator = new Calculator(floor2,carpet2);
        System.out.println("Total Cost =" + calculator.getTotalCost());
    }
}
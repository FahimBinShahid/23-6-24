public class Main {
    public static void main(String[] args) {
        SimpleCalculator simpleCalculator = new SimpleCalculator();

        simpleCalculator.setFirstNumber(5.0);
        simpleCalculator.setSecondNumber(3.1);
        System.out.println("add = " + simpleCalculator.getAdditionResult());
        System.out.println("Sub + " + simpleCalculator.getSubtractionResult());
        System.out.println("Mul = " + simpleCalculator.getMultiPlicationResult());
        System.out.println("Div = " + simpleCalculator.getDivisionResult());
    }
}
public class GenericsExample {
    public static void main(String[] args) {

        Printer<Integer> intPrinter = new Printer<>(23);
        intPrinter.print();

        Printer<Double> doublePrinter = new Printer<>(39.55);
        doublePrinter.print();
    }
}

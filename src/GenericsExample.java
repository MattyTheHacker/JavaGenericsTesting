public class GenericsExample {
    public static void main(String[] args) {

        Printer<Integer> intPrinter = new Printer<>(23);
        intPrinter.print();

        Printer<Double> doublePrinter = new Printer<>(39.55);
        doublePrinter.print();

        shout("John", 77);
        shout(55, "Hey there");
        shout(new Cat(), new Dog());
    }

    public static <T, V> void shout(T thingToShout, V otherThingToShout) {
        System.out.println(thingToShout + "!!!!!!");
        System.out.println(otherThingToShout + "!!!!!!");
    }
}

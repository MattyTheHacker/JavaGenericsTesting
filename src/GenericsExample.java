import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {

        Printer<Integer> intPrinter = new Printer<>(23);
        intPrinter.print();

        Printer<Double> doublePrinter = new Printer<>(39.55);
        doublePrinter.print();

        shout("John", 77);
        shout(55, "Hey there");
        shout(new Cat(), new Dog());

        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        printList(intList);

        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat());
        printList(catList);
    }

    public static <T, V> void shout(T thingToShout, V otherThingToShout) {
        System.out.println(thingToShout + "!!!!!!");
        System.out.println(otherThingToShout + "!!!!!!");
    }

    private static void printList(List<?> myList) {
        System.out.println();
    }
}

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Car object = new Car();
        System.out.println(object.start() + "\n" + object.stop());
        Motorcycle newObject = new Motorcycle();
        System.out.println(newObject.start() + "\n" + newObject.stop());
    }
}
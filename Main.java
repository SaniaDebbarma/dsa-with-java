// Generic Box class
class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

public class Main {
    public static void main(String[] args) {
        // Box that stores an Integer
        Box<Integer> intBox = new Box<>();
        intBox.set(10);
        System.out.println(intBox.get());  // Output: 10

        // Box that stores a String
        Box<String> strBox = new Box<>();
        strBox.set("Sania");
        System.out.println(strBox.get());  // Output: Sania

        // Box that stores a Double
        Box<Double> dblBox = new Box<>();
        dblBox.set(3.14);
        System.out.println(dblBox.get());  // Output: 3.14
    }
}
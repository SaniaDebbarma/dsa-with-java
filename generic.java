public class generic {
    public static void main(String[] args) {

        Integer[] intArr = {1, 2, 3};
        String[] strArr = {"Sania", "Queen", "Python"};
        Double[] dblArr = {2.5, 3.14};

        ArrayBox<Integer> intBox = new ArrayBox<>(intArr);
        ArrayBox<String> strBox = new ArrayBox<>(strArr);
        ArrayBox<Double> dblBox = new ArrayBox<>(dblArr);

        intBox.display();
        strBox.display();
        dblBox.display();
    }
}
class ArrayBox<T> {
    private T[] arr;

    public ArrayBox(T[] arr) {
        this.arr = arr;
    }

    public void display() {
        for (T item : arr) {
            System.out.println(item);
        }
    }
}
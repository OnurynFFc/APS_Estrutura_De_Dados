public class App {
    public static void main(String[] args) throws Exception {
        InsertionSort sorter = new InsertionSort();
        int[] array = { 5, 2, 9, 1, 5, 6 };
        sorter.insertionSort(array);
        System.out.println("Sorted array: " + java.util.Arrays.toString(array));
    }
}

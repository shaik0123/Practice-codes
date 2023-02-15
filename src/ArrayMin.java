public class ArrayMin {
    public static void main(String args[]) {

        int array[] = {14, 16, 3, 12, 37, 12};

        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.print(min);
    }
}
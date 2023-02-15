public class ArrayMax {
    public static void main(String args[])
    {
        int[] array = {14, 16, 3, 12, 37, 12};

        int max = array[0];

        for(int i=0; i<array.length; i++)
        {
            if(max < array[i])
            {
                max = array[i];
            }
        }
        System.out.print(max);
    }
}

import java.util.Arrays;

public class AscendingOrder {
    public static void main(String[] args) {

        //defining an array of ascending order
        int[] array = new int[] {21,6,82,25,51,75,11,5};

        Arrays.sort(array);

        System.out.println("Elements of array sorted in ascending order: ");

        //print array using the for loop
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
}

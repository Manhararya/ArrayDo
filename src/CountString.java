import java.util.Arrays;
import java.util.Collections;

public class CountString {
    public static void main(String[] args) {
        String str = "My name is Manhar Arya";
        char c = 'a';

        // Count returns number of occurrences of a between two given positions provided as two iterators.
        System.out.println(Collections.frequency(
                Arrays.asList(str.split("")),
                String.valueOf(c)));
    }
    //To enter any String and count total number of 'a' in that String
}

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListHandler {
    public static <T extends Comparable<T>> void ArrayListSort(ArrayList<T> arrayData) {
        int size = arrayData.size(); // holds the size of the array list
        for (int i = 0; i < size; i++) {
            while (i > 0 && (arrayData.get(i - 1).compareTo(arrayData.get(i))) > 0) {
                Collections.swap(arrayData, i, i - 1);
                i--;

            }
        }
    }

    static <T extends Comparable<T>> boolean searchTheArray(ArrayList<T> arrayData, int startingIndex, int endpoint, T elementToSearchFor) {
        int midpoint = (startingIndex + endpoint / 2);
        if (midpoint < endpoint) { // if the list is greater than 1
            if (arrayData.get(midpoint) == elementToSearchFor) { // the midpoint equals the element we were looking for
                return true;
            }  if ((arrayData.get(midpoint).compareTo(elementToSearchFor)) < 0) { // the midpoint is greater than the element to search for
                // search the 1st half
                searchTheArray(arrayData, midpoint + 1, arrayData.size() - 1, elementToSearchFor); // search the 2nd half of the list
            }  if (arrayData.get(midpoint).compareTo(elementToSearchFor) > 0) { // the element is before the midpoint
                //search the 2nd half of the array
                searchTheArray(arrayData, 0, midpoint - 1, elementToSearchFor); // search the 1st half of the list
            }
        }
        return false;
    }
}

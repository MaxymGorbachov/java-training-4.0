/**
 * ArrayUtil exercises.
 */

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayUtil {

    /**
     * Finds the common elements between two arrays (String values).
     *
     * @param array1 first array
     * @param array2 second array
     * @return String array with common elements
     */
    public static String[] findCommon(String[] array1, String[] array2) {

        Set<String> set1 = new LinkedHashSet<>();
        Set<String> set2 = new HashSet<>();

        Collections.addAll(set1, array1);

        Collections.addAll(set2, array2);

        set1.retainAll(set2);

        return set1.toArray(new String[0]);
    }
}
import java.util.HashSet;

/**
 * ArrayUtil exercises.
 */
public class ArrayUtil {

    /**
     * Finds the common elements between two arrays (String values).
     *
     * @param array1 first array
     * @param array2 second array
     * @return String array with common elements
     */
    public static String[] findCommon(String[] array1, String[] array2) {
        HashSet<String> out = new HashSet<>();
        for (String s1 : array1) {
            for (String s2 : array2) {
                if (s1.contains(s2)) {
                    out.add(s1);
                }
            }
        }
        return out.toArray(new String[out.size()]);
    }
}
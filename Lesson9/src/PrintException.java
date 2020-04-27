import java.util.Arrays;
import java.util.List;

/**
 * @author mariia.lavrova
 */
public class PrintException {

    /**
     * Print String s to console
     * @param s
     * @throws Exception
     */
    public static void print(String s) throws Exception {
        if (s == null) {
            throw new NullPointerException("s cannot be null");
        } else if (s.equals("")) {
            throw new IllegalArgumentException("s cannot be empty");
        } else if (s.contains("Exception")) {
            throw new Exception("s cannot contain 'Exception'");
        } else {
            System.out.println(s);
        }
    }

    public static void callPrint(String s) throws Exception {
        print(s);
    }

    public static void main(String[] args) {

        List<String> strings = Arrays.asList(null, "", "String contains Exception!!!111", "Normal string");

        for (String string : strings) {
            try {
                print(string);
            } catch (NullPointerException | IllegalArgumentException e) {
                System.out.println(e);
            } catch (Exception e) {
                System.out.println("Exception! " + e);
            }
        }

        String s = "Hello";
        System.out.println(s.concat(", ").concat("world").concat("!"));
    }
}
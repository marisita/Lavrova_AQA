/**
 * @author mariia.lavrova
 */

public class ExceptionExample {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        try {
            System.out.println(array[5]); //Будет выброшено ArrayIndexOutOfBoundsException
            System.out.println(array[2]); //Код выполнится без исключений
            throw new NoSuchFieldException(); //Будет выброшено NoSuchFieldException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException! " + e);
        } catch (Exception e) {
            System.out.println("Exception! " + e);
        } finally {
            System.out.println("Code in finally");
        }

        System.out.println("Code after exception");
    }
}

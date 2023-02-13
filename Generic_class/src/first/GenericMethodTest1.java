package first;

public class GenericMethodTest1 {
    static class Prints{
        public static <T> void printArray(T[] arr){
            for(T a:arr){
                System.out.println(a);
            }
        }

        public static <T> T getFirst(T[] arr){
            return arr[0];
        }
    }

    public static void main(String[] args) {
        Double[] d1 = {3.14, 2.71, 9.9};
        Prints.printArray(d1);
        Integer[] i1 = {10, 8, 9};
        Prints.printArray(i1);
        String[] s1 = {"Hi", "Hello"};
        Prints.printArray(s1);

        System.out.println(Prints.getFirst(d1));
    }
}

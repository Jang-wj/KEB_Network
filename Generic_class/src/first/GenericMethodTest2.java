package first;

public class GenericMethodTest2 {
    static class Prints{
        public static <T extends Number> void printArray(T[] arr){
            for(T a:arr){
                System.out.println(a);
            }
        }
    }

    public static void main(String[] args) {
        Double[] d1 = {3.14, 2.71, 9.9};
        Prints.printArray(d1);
        Integer[] i1 = {10, 8, 9};
        Prints.printArray(i1);
//        String[] s1 = {"Hi", "Hello"};
//        Prints.printArray(s1);
    }
}

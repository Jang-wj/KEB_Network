package second;

interface  Positive {
    int pos(int x);
}
interface Prints{
    void print();
}

public class LambdaTest1 {
    public static void main(String[] args) {
        Positive po;
        Prints pr;

        po = (int n) -> {return n+1;};
        po = (n) -> {return n+1;};
        po = n -> {return n+1;};
        po = (int n) -> n+1;  // 리턴 한줄만 있을 때는 리턴 생략 가능
        po = (n) -> n+1;
        po = n -> n+1;

        pr = () -> {
            System.out.println("Hi");
        };
        pr = () -> System.out.println("Hi");
        pr.print();
    }
}

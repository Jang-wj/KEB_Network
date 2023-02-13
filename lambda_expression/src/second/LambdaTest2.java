package second;

interface Calc{
    double calculate(double d);
}

public class LambdaTest2 {
    public static void main(String[] args) {
        Calc c;

//        c = (d) -> Math.abs(d);
        c = Math::abs;
        System.out.println(c.calculate(-9.9));
    }
}

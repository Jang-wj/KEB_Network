//import java.util.ArrayList;
//import java.util.List;
//
//class Shape {
//    private String type, color;
//    private double area;
//    public Shape(String type, String color, double area) {
//        this.type = type;
//        this.color = color;
//        this.area = area;
//    }
//    public double getArea() {
//        return area;
//    }
//    public String getColor() {
//        return color;
//    }
//    public String getType() {
//        return type;
//    }
//    public String toString() {
//        return type+"("+color+", "+area+")";
//    }
//}
//
//class ShapeTest{
//    static ArrayList<Shape> shapes = new ArrayList<>();
//
//    static List<Shape> findShapes(List<Shape> shapes, String type, String color, Double area){
//        List r = new ArrayList();
//        if(type != null) {
//            for (Shape shape : shapes) {
//                if (shape.getType().equals(type)) {
//                    r.add(shape);
//                }
//            }
//            return r;
//        }
//        else {
//            for (Shape shape : shapes) {
//                if (shape.getColor().equals(color) && shape.getArea() <= area) {
//                    r.add(shape);
//                }
//            }
//            return r;
//        }
//    }
//}
//
//public class Day21_lambdaProblems2 {
//
//
//
//    public static void main(String[] args) {
//        Shape[] arr = {
//                new Shape("삼각형","빨간색", 10.5),
//                new Shape("사각형","파란색", 11.2),
//                new Shape("원","파란색", 16.5),
//                new Shape("원","빨간색", 5.3),
//                new Shape("원","노란색", 8.1),
//                new Shape("사각형","파란색", 20.7),
//                new Shape("삼각형","파란색", 3.4),
//                new Shape("사각형","빨간색", 12.6)
//        };
//        for (int i=0; i<arr.length; i++) {
//            ShapeTest.shapes.add(arr[i]);
//        }
//        System.out.println("사각형 : "+ShapeTest.findShapes(ShapeTest.shapes, "사각형", null, null));
//        System.out.println("빨간 도형(면적<=12.0) : "+ ShapeTest.findShapes(ShapeTest.shapes, null,  "빨간색", 12.0));
//    }
//}

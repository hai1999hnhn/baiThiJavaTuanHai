package baiThiJavaTuanHai.bai1;

public class MainThread {
    public static void main(String[] args) {
        Circle circle = new Circle(5.5);
        System.out.println("ket qua dien tich : " + Method.getArea(circle.getRadius()));
        System.out.println("ket qua chu vi " + Method.getPerimeter(circle.getRadius()));
    }
}

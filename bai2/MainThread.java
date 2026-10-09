package baiThiJavaTuanHai.bai2;

public class MainThread {
    public static void main(String[] args) {
        StudentMark studentMark1 = new StudentMark("hai", 50, 50, 50);
        StudentMark studentMark2 = new StudentMark("huy", 30, 30, 30);
        Method method = new Method();
        method.displayResult(studentMark1);
        method.displayResult(studentMark2);
    }
}

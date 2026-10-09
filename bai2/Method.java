package baiThiJavaTuanHai.bai2;

public class Method {
    public static boolean checkPass(StudentMark studentMark) {
        if (studentMark.getTheoryMark() >= 40 && studentMark.getPratiacalMark() >= 40
                && studentMark.getAssignmentMark() >= 40) {
            return true;
        } else {
            return false;
        }
    }

    public void displayResult(StudentMark studentMark) {
        System.out.println("Ho va ten: " + studentMark.getFullName());
        System.out.println("Diem ly thuyet : " + studentMark.getTheoryMark());
        System.out.println("Diem bai tap lon : " + studentMark.getAssignmentMark());
        System.out.println("Diem thuc hanh : " + studentMark.getPratiacalMark());
        if (checkPass(studentMark)) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
    }
}

package baiThiJavaTuanHai.bai2;

public class StudentMark {
    private String fullName;
    private double theoryMark;
    private double pratiacalMark;
    private double assignmentMark;

    public StudentMark(String fullName, double theoryMark, double pratiacalMark, double assignmentMark) {
        this.fullName = fullName;
        this.theoryMark = theoryMark;
        this.pratiacalMark = pratiacalMark;
        this.assignmentMark = assignmentMark;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getTheoryMark() {
        return theoryMark;
    }

    public void setTheoryMark(double theoryMark) {
        this.theoryMark = theoryMark;
    }

    public double getPratiacalMark() {
        return pratiacalMark;
    }

    public void setPratiacalMark(double pratiacalMark) {
        this.pratiacalMark = pratiacalMark;
    }

    public double getAssignmentMark() {
        return assignmentMark;
    }

    public void setAssignmentMark(double assignmentMark) {
        this.assignmentMark = assignmentMark;
    }
}

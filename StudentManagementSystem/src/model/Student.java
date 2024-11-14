package model;

public class Student {
    private String name;
    private int studentNumber;
    private double midtermGrade;
    private double finalGrade;

    public Student(String name, int studentNumber, double midtermGrade, double finalGrade) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.midtermGrade = midtermGrade;
        this.finalGrade = finalGrade;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getStudentNumber() {
        return studentNumber;
    }
    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public double getMidtermGrade() {
        return midtermGrade;
    }
    public void setMidtermGrade(double midtermGrade) {
        this.midtermGrade = midtermGrade;
    }

    public double getFinalGrade() {
        return finalGrade;
    }

    public  double calculateAverage() {
        return (this.midtermGrade * 0.4) + (this.finalGrade * 0.6);
    }

}

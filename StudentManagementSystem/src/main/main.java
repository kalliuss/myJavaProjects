package main;
import java.util.Scanner;
import model.Student;

public class main {
    public static void main(String[] args) {
        Student ogrenci1 = new Student("Kaan", 240103408, 60, 60);
        System.out.println(ogrenci1.calculateAverage());

        Scanner scanner = new Scanner(System.in);

        //kullanıcıdan bilgi al
        System.out.print("Öğrenci ismini giriniz: ");
        String name = scanner.nextLine();

        System.out.print("Öğrenci numarasını giriniz: ");
        int studentNumber = scanner.nextInt();

        System.out.print("Vize notunuzu giriniz: ");
        String midtermGradeStr = scanner.next();

        System.out.print("Final notunu giriniz: ");
        String finalGradeStr = scanner.next();

        // vize ve fina notlarını double türüne dönüştürür.
        double midtermGrade = Double.parseDouble(midtermGradeStr);
        double finalGrade = Double.parseDouble(finalGradeStr);

        Student student = new Student(name, studentNumber, midtermGrade, finalGrade);

        System.out.println("\n Girilen Bilgiler:");
        System.out.println("İsim: " + student.getName());
        System.out.println("Öğrenci numarası: " + student.getStudentNumber() );
        System.out.println("Vize notunuz (string):  " + student.getMidtermGrade() );
        System.out.println("Final notunuz (string): " + student.getFinalGrade() );

        double average = student.calculateAverage();
        System.out.println(" ");
        System.out.println("Geçme Kalma Durumu:");
        System.out.println("Ortalama: " + average);
        if (average >= 60){
            System.out.println("Durum: Geçti");
        }
        else{
            System.out.println("Durum: Kaldı");
        }
    }
}

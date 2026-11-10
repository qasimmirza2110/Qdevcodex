package OOPS;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Qasim";
        student1.age= 21;
        student1.course="BCA";

        Student student2 = new Student();
        student2.name = "Muqtada";
        student2.age= 21;
        student2.course="BCA";
        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.course);

        System.out.println("----------------");

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.course);
    }
}

import java.util.*;

class Student {
    int id;
    String name;
    String course;
    double marks;

    void inputDetails() {
        Scanner sc = new Scanner(System.in);

        id = sc.nextInt();
        name = sc.next();
        course = sc.next();
        marks = sc.nextDouble();
    }

    void displayDetails() {
        System.out.println("ID = " + id);
        System.out.println("Name = " + name);
        System.out.println("Course = " + course);
        System.out.println("Marks = " + marks);
    }

    void calculateGrade() {
        if (marks >= 90)
            System.out.println("Grade = A+");
        else if (marks >= 80)
            System.out.println("Grade = A");
        else if (marks >= 70)
            System.out.println("Grade = B");
        else if (marks >= 60)
            System.out.println("Grade = C");
        else
            System.out.println("Grade = Fail");
    }
}

class Main {
    public static void main(String[] args) {
        Student s = new Student();

        s.inputDetails();
        s.displayDetails();
        s.calculateGrade();
    }
}
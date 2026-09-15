class Employee {
    int id;
    String name;
    double basicSalary;

    double calculateHRA() {
        return basicSalary * 0.20;
    }

    double calculateDA() {
        return basicSalary * 0.10;
    }

    double calculateGrossSalary() {
        return basicSalary + calculateHRA() + calculateDA();
    }
}

class Main {
    public static void main(String[] args) {

        Employee e = new Employee();

        e.id = 101;
        e.name = "Khushi";
        e.basicSalary = 30000;

        System.out.println("HRA = " + e.calculateHRA());
        System.out.println("DA = " + e.calculateDA());
        System.out.println("Gross Salary = " + e.calculateGrossSalary());
    }
}
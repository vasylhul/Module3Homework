package task3;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Tom", "Sawyer");
        emp1.print();
        emp1.setName("Tomas");
        emp1.setSurname("Saw");
        emp1.setId(1111);
        emp1.print();

        Employee emp2 = new Employee();
        emp2.print();
    }
}

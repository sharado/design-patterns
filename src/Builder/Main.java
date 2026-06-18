package Builder;

public class Main {
    public static void main(String[] args) {
        Employee emp = Employee.builder()
                                .name("ABC")
                                .salary(3000)
                                .build();

        System.out.println("Name:" + emp.getName());
        System.out.print("Salary:" + emp.getSalary());
    }
}

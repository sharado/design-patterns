package Builder;

public class Employee {
    String name;
    int salary;

    public Employee(BuilderEmployee builderEmployee) {
        this.name = builderEmployee.name;
        this.salary = builderEmployee.salary;
    }

    public static BuilderEmployee builder(){
        return new BuilderEmployee();
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    static class BuilderEmployee{
        String name;
        int salary;

        public Employee build(){
            return new Employee(this);
        }

        public BuilderEmployee name(String name) {
            this.name = name;
            return this;
        }

        public BuilderEmployee salary(int salary) {
            this.salary = salary;
            return this;
        }
    }
}

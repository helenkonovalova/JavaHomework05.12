package lesson14;

import java.util.Arrays;

public class Department {
        private int id;
        private String name;
        private int countEmp;
        private Company[] employees;
    public Department() {
    }

    public Department(int id, String name, int countEmp, Company[] employees) {
        this.id = id;
        this.name = name;
        this.countEmp = countEmp;
        this.employees = employees;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountEmp() {
        return countEmp;
    }

    public void setCountEmp(int countEmp) {
        this.countEmp = countEmp;
    }

    public Company[] getEmployees() {
        return employees;
    }

    public void setEmployees(Company[] employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", countEmp=" + countEmp +
                ", employees=" + Arrays.toString(employees) +
                '}';
    }
}


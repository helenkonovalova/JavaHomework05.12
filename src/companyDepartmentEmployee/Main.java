package lesson14;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    Company company1 = new Company();

        company1.setId(1);
        company1.setName("Google");
        company1.setAddress("NY");

        Company company2 = new Company();

        company2.setId(2);
        company2.setName("Netflix");
        company2.setAddress("LA");

        Company company3 = new Company();

        company3.setId(3);
        company3.setName("BMW");
        company3.setAddress("Munich");

        Company company4 = new Company();

        company4.setId(4);
        company4.setName("Audi");
        company4.setAddress("Shtuttgart");

        Department department1 = new Department();
        department1.setId(25);
        department1.setName("IT");
        department1.setCountEmp(132);

        Department department2 = new Department();
        department2.setId(26);
        department2.setName("Finance");
        department2.setCountEmp(45);

        Department department3 = new Department();
        department3.setId(27);
        department3.setName("Production");
        department3.setCountEmp(100);

        Employee employee1 = new Employee();
        employee1.setId(111);
        employee1.setName("Mike");
        employee1.setGender(true);
        employee1.setSalary(5000);

        Employee employee2 = new Employee();
        employee2.setId(112);
        employee2.setName("Klara");
        employee2.setGender(false);
        employee2.setSalary(3500);

        Employee employee3 = new Employee();
        employee3.setId(113);
        employee3.setName("Nik");
        employee3.setGender(true);
        employee3.setSalary(6500);

        Employee employee4 = new Employee();
        employee4.setId(114);
        employee4.setName("Rupert");
        employee4.setGender(true);
        employee4.setSalary(2800);

        Employee employee5 = new Employee();
        employee5.setId(115);
        employee5.setName("Nora");
        employee5.setGender(false);
        employee5.setSalary(3900);

        Company[] companies = {company1, company2, company3, company4};
        Department[] departments = {department1, department2, department3};
        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};

        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getSalary() > 3000 ) {
                System.out.println(employees[i]);
            }
        }






        System.out.println(Arrays.toString(companies));

    }
}

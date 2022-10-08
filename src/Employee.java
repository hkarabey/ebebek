import java.util.Scanner;

public class Employee {

    private String name;
    private double salary;
    private double workHours;
    private int hireYear;

    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setWorkHours(double workHours) {
        this.workHours = workHours;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double getWorkHours() {
        return workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public Employee(String name, double salary, double workHours, int hireYear) {
        setName(name);
        setSalary(salary);
        setWorkHours(workHours);
        setHireYear(hireYear);
    }

    public double tax(double salary) {
        double calculateTax = 0;
        if (salary < 1000) {
            calculateTax = 0;
        } else {
            calculateTax = salary * (0.03);
        }
        return calculateTax;
    }

    public double bonus(double salary) {
        double bonusPay = 0;
        if (workHours > 40) {
            bonusPay = (workHours - 40) * 30;
        }
        return bonusPay;
    }

    public double raiseSalary() {
        double taxForRaiseSalary= tax(salary);
        double bonusForRaiseSalary=bonus(salary);
        int workYear = 2021 - hireYear;
        int raiseSalary=0;
        if (workYear < 10) {
            raiseSalary+= salary * (1.05);
        } else if (workYear < 20) {
            raiseSalary+= salary * (1.1);
        } else {
           raiseSalary+= salary * (1.15);
        }

        return raiseSalary-taxForRaiseSalary+bonusForRaiseSalary;
    }

    @Override
    public String toString() {
        return "Employee"+"\n" +
                "name='" + name + '\'' + "\n" +
                "salary=" + salary + "\n" +
                "workHours=" + workHours + "\n" +
                "hireYear=" + hireYear + "\n" +
                "tax=" + tax(salary) + "\n" +
                "bonus=" + bonus(salary) + "\n" +
                "raiseSalary=" + raiseSalary() + "\n" +
                "Toplam Maaş=" + (raiseSalary() + tax(salary)) +
                "";
    }

}





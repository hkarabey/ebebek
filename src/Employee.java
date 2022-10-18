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
        int workYear = 2021 - hireYear;
        int raiseSalary=0;
        if (workYear < 10) {
            raiseSalary+= salary * (1.05);
        } else if (workYear < 20) {
            raiseSalary+= salary * (1.1);
        } else {
           raiseSalary+= salary * (1.15);
        }

        return raiseSalary-salary;
    }

    @Override
    public String toString() {
        return "Employee"+"\n" +
                "Adı : " + name  + "\n" +
                "Maaşı : " + salary + "\n" +
                "Çalışma Saati : " + workHours + "\n" +
                "Başlangıç Yılı : " + hireYear + "\n" +
                "Vergi : " + tax(salary) + "\n" +
                "Bonus : " + bonus(salary) + "\n" +
                "Maaş Artışı : " + raiseSalary() + "\n" +
                "Vergi ve Bonuslar ile birlikte maaş : " + (salary+bonus(salary) - tax(salary)) + "\n" +
                "Toplam Maaş : " + (salary+bonus(salary)+raiseSalary() - tax(salary)) +
                "";
    }

}





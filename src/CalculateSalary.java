import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculateSalary{

    public static void main(String[] args) {
        List<Object> arg = getArg();
        Employee employee=new Employee((String) arg.get(0),(double)arg.get(1),(double)arg.get(2),(int)arg.get(3));
        System.out.println(employee);
    }
    public static List<Object> getArg(){
        List<Object> listEmployee=new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println(" Çalışan ismi giriniz");
        String name = scan.nextLine();
        listEmployee.add(name);
        System.out.println("Çalışanın maaşını giriniz");
        double salary = scan.nextDouble();
        listEmployee.add(salary);
        System.out.println("Çalışanın haftalık çalışma saatini giriniz");
        double workHours = scan.nextDouble();
        listEmployee.add(workHours);
        System.out.println("Çalışanın işe giriş yılını giriniz");
        int hireYear = scan.nextInt();
        listEmployee.add(hireYear);
        return listEmployee;

    }

}


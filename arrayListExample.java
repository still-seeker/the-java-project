import java.time.LocalDate;
import java.util.*;

/**
 * This class demonstrates the arraylist class.
 */

public class arrayListExample {
    public static void main(String... args){
        //fill the array list with three employee objects
        ArrayList<Employee> staff = new ArrayList<>(); 
        staff.add(new Employee("Carl Stunner", 75000, 1987, 12, 4));
        staff.add(new Employee("Still Seeker", 500000, 2010, 4, 21));
        staff.add(new Employee("Sarmah Samuel", 1000000, 2025, 1, 12));

        //raise everyone's salary by 5%
        for (Employee e : staff){
            e.raiseSalary(5);
        }

        //print out information about all employees
        for (Employee e: staff)
            System.out.println(e.toString());
    }

}

class Employee {
    private final String name;
    private double salary;
    private final LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day){
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);

    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public LocalDate getHireDay(){
        return hireDay;
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    @Override
    public String toString(){
        return   "NAME: " + this.getName() + ", SALARY: " +this.getSalary() +
                ", HIREDAY: " + this.getHireDay();
    }
}

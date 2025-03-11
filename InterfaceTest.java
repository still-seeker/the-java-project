import java.util.*;

/**A program that demonstrates the use of the 
 * comparable interface.
 */

public class InterfaceTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Alice Kagezi", 40000);
        staff[1] = new Employee("Shawn David", 49000);
        staff[2] = new Employee("Sarmah Samuel", 100000);

        Arrays.sort(staff);

        //print out the information about all Employee objects
        for (Employee e : staff)
            System.out.println("Name = " + e.getName() +
            ", Salary = " + e.getSalary());

    }
}


class Employee implements Comparable<Employee> {
    private final String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    /**
     * compares employees by salary
     * @param other another Employee object
     * @return a negative value if this Employee has a lower salary than otherObject
     * 0 if the salaries are the same, a positive otherwise
     */
    @Override
    public int compareTo(Employee other){
        return Double.compare(salary, other.salary);
    }
}
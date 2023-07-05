package comparators;
//comparators
import java.util.*;

class Employee {
    int age;
    String name;

    public Employee(int age, String name) {
        this.age = age;
        this.name = name;
    }

    static class AgeComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee e1, Employee e2) {
            if (e1.age == e2.age) {
                return 0;
            } else if (e1.age > e2.age) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    static class NameComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.name.compareTo(e2.name);
        }
    }
}

public class comparators2 {
    public static void main(String[] args) {
        Employee e1 = new Employee(24, "Tom");
        Employee e2 = new Employee(25, "reka");
        Employee e3 = new Employee(23, "Tia");
        Employee e4 = new Employee(22, "Ria");

        ArrayList<Employee> al = new ArrayList<>();
        al.add(e1);
        al.add(e2);
        al.add(e3);
        al.add(e4);

        Collections.sort(al, new Employee.AgeComparator());
        for (Employee em : al) {
            System.out.println(em.age + " " + em.name);
        }
    }
}


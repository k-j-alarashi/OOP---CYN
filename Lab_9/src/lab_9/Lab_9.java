package lab_9;

import java.util.ArrayList;

public class Lab_9 {
    public static void main(String[] args) {
        ArrayList<Employee> alist = new ArrayList<>();
        
        
        SalariedEmployee se = new SalariedEmployee(100, 20, 312, "Ahmed", "Manager", 20000);
        alist.add(se);
        HourlyEmployee he = new HourlyEmployee(10, 213, "Mohammed", "Engineer", 80);
        alist.add(he);
        
        for (Employee e : alist) {
            System.out.println(e);
            System.out.println("====================");
        }
    }
}

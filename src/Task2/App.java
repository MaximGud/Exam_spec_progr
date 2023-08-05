package Task2;

 import java.util.Comparator;
import java.util.PriorityQueue;

public class App {
    public static void main(String[] args) throws Exception {
       

        Toy doll = new Toy(1, "Кукла", 3);
        Toy car  = new Toy(2, "Машинка", 6);
        Toy constructor  = new Toy(3, "Конструктор", 1);
        

View.run();

        // PriorityQueue<Employee> queue = new PriorityQueue<>(new EmployeeComparator());

        // queue.add(tom);
        // queue.add(jerry);
        // queue.add(donald);
        // queue.add(mickey);
        // queue.add(daffy);

        // Employee currentEmployee = null;

        // while ((currentEmployee = queue.poll()) != null) { // Retrieves and removes
        //     System.out.println("--- Serving employee: " + currentEmployee.getFullName() + " ---");
        //     System.out.println("   >> Salary: " + currentEmployee.getSalary());
        //     System.out.println();
        // }
    }
}
   
package MangementEmployee;

import java.time.MonthDay;
import java.util.Date;

public class Main {
    public static void main (String[] args) {

        Employee e1 = new Employee(1,"Mohamed");
        Employee e2 = new Employee(1,"Zakaria");
        Employee e3 = new Employee(1,"Fadwa");
        Employee e4 = new Employee(1,"Fatima");

        Project p1 = new Project(1);
        Project p2 = new Project(2);

        Task t1 = new Task("task one","task to project one");
        Task t2 = new Task("task two","task to project two");
        Task t3 = new Task("task three","task to project one");
        Task t4 = new Task("task four","task to project one");
        Task t5 = new Task("task five","for any project");
        Date d = new Date();

        e1.addProject(p1);
        e1.addProject(p2);
        e2.addProject(p2);
        e3.addProject(p1);
        e4.addProject(p2);

        p1.addEmployee(e1);
        p2.addEmployee(e2);
        p1.addEmployee(e3);
        p2.addEmployee(e4);

        p1.addTask(t1);
        p1.addTask(t3);
        p1.addTask(t4);
        p2.addTask(t2);
         t1.setProject(p1);
        p1.setEndingDate(MonthDay.of(6,23));
        p2.setEndingDate(MonthDay.of(7,15));


        System.out.println(e1);
        System.out.println("=============================");
        System.out.println(p1);
        System.out.println("=============================");
        System.out.println(t1);




    }
}

import java.util.ArrayList;


public class Main {
    public static void main(String[] test) {
        /*
         * basics
         *
         * */

        //        float[] notes1 = {12,14,14};
        //        float[] notes2 = {18,15,11};
        //
        //        Library.Student s1 = new Library.Student("Mohamed","RHZIZA",notes1);
        //        Library.Student s2 = new Library.Student("Zakaria","Mohamed",notes2);
        //
        //        System.out.println(s1.getNotes());
        //        System.out.println(s1.toString());
        //        System.out.println("=======================");
        //        System.out.println(s2.getNotes());
        //        System.out.println(s2.toString());
        //        JOptionPane.showMessageDialog(null,"hello");
        //        JOptionPane.showMessageDialog(null,"hello 2","my messag",JOptionPane.ERROR_MESSAGE);
        //
        //        int value = Integer.parseInt(JOptionPane.showInputDialog("Please enter grade"));
        //        JOptionPane.showMessageDialog(null,value>=60 ?"success":"your field");

        /*
         *  Example
         *
         * */

        //        Author a = new Author("tawfeek", "elhakim", 728632);
        //        Author b = new Author("nagueeb", "Mahfooz", 763212);
        //
        //        Category c1 = new Category("novel", "Arabic novel", 1);
        //
        //        Book b1 = new Book("sookareya", 10, c1, b);
        //        Book b2 = new Book("Asfoor Men Elshark", 11, c1, a);
        //
        //        b1.printInfo();
        //        b2.printInfo();

        ArrayList<Integer> notes = new ArrayList<>();
        notes.add(12);
        notes.add(13);
        notes.add(13);
        notes.add(16);

        for (Integer i : notes) {
            System.out.println(i);
        }


        //        ArrayList<Employee> employees = new ArrayList<>(); // declare array of employees

        // create objects of employees
        //
        //        Employee e1 = new Employee(1, "Mohamed", 5000);
        //        Employee e2 = new Employee(2, "Zakaria", 6000);
        //        Employee e3 = new Employee(3, "Fadwa", 8000);
        //        Employee e4 = new Employee(4, "Fatima", 9000);
        //
        //        employees.add(e1);
        //        employees.add(e2);
        //        employees.add(e3);
        //        employees.add(e4);
        //
        //        for (int i = 0; i < employees.size(); i++) {
        //            System.out.println(employees.get(i));
        //        }
        //
        //        for (Employee e : employees) {
        //            System.out.println(e);
        //        }


    }
}
package Inheritance;

public class MyMain {
    public static void main (String[] args) {
        Person person;

        person = new Person();

        Student student = new Student();
        student.setName("Mohamed");
        student.setId(101);

        Person person1 = new Student();
         person1.setName("ayoub");

        Student student1 = (Student) person1;
        student1.setId(100);


        Student student2 = (Student) person;
        student2.setId(13);
        System.out.println();

    }
}

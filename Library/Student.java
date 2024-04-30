package Library;

import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    private float[] notes;
    private  float avg;


    public Student(String firstName, String lastName, float[] notes){
        this.firstName = firstName;
        this.lastName = lastName;
        this.notes = notes;
    }

    public void setNote(float[] notes) {
            this.notes = notes;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNotes() {
        return Arrays.toString(notes);
    }
    public float calcAverage(){
        float somme = 0;
          for (float note:this.notes){
              somme += note;
          }
          avg = somme/this.notes.length;
          return avg;
    }

    @Override
    public String toString() {
        return "Library.Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", notes=" + Arrays.toString(notes) +
                ", avg=" + String.format("%.2f",calcAverage()) +
                '}';
    }
}

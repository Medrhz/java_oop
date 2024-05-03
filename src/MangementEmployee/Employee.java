package MangementEmployee;

import java.util.ArrayList;

public class Employee {
    private  int number;
    private  String name;
    private ArrayList<Project> projects;

    Employee(){
        this.projects = new ArrayList<>();
    }
    Employee(int number,String name){
        this();
        this.number = number;
        this.name = name;
    }

    public int getNumber () {
        return number;
    }

    public void setNumber (int number) {
        this.number = number;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public ArrayList<Project> getProjects () {
        return projects;
    }


    public void addProject(Project project){
        this.projects.add(project);
    }
    public int numberOfProjects(){
        return  projects.size();
    }

    @Override
    public String toString () {
        String result =  "- number=" + number + "\n- name='" + name + '\''
                + "\n- projects= "+(projects.isEmpty() ? "does not engage to any project yet" : "engage in "+this.numberOfProjects()+"\n- projects is :");
        for (Project project:projects) {
            result = result + " | "+project.getCodeProject();
        }

        return  result;
    }
}

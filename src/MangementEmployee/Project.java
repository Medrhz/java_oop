package MangementEmployee;

import java.time.MonthDay;
import java.util.ArrayList;

public class Project {
    private  int codeProject;
    private MonthDay startingDate;
    private MonthDay endingDate;

    private ArrayList<Employee> employees;
    private ArrayList<Task> tasks;


    public Project (int codeProject) {
        this.employees = new ArrayList<>();
        this.tasks = new ArrayList<>();
        this.startingDate = MonthDay.now();
        this.endingDate = MonthDay.now();
        this.codeProject = codeProject;
        }

    public int getCodeProject () {
        return codeProject;
    }

    public void setCodeProject (int codeProject) {
        this.codeProject = codeProject;
    }

    public MonthDay getStartingDate () {
        return startingDate;
    }

    public void setStartingDate (MonthDay startingDate) {
        this.startingDate = startingDate;
    }

    public MonthDay getEndingDate () {
        return endingDate;
    }

    public void setEndingDate (MonthDay endingDate) {
        this.endingDate = endingDate;
    }

    public ArrayList<Employee> getEmployees () {
        return employees;
    }

    public void setEmployees (ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public ArrayList<Task> getTasks () {
        return tasks;
    }

    public void setTasks (ArrayList<Task> tasks) {
        this.tasks = tasks;
    }
    public void addEmployee(Employee employee){
        this.employees.add(employee);
    }

    public void addTask(Task task){
        this.tasks.add(task);
    }

    @Override
    public String toString () {
        String result =  "Project{" + "codeProject=" + codeProject
                          + "\n- startingDate=" + startingDate.getMonth()+"\\"+ startingDate.getDayOfMonth() + "\n- endingDate="
                          +  startingDate.getMonth()+"\\"+ startingDate.getDayOfMonth() ;
        for (Employee employee: employees) {
               result = result + "\n- "+employee.getName();
        }
        return  result;
    }
}





package MangementEmployee;

public class Task {
    private String taskCode;
    private String taskDescription;
    private Project project;

    public Task (String taskCode, String taskDescription) {
        this.taskCode = taskCode;
        this.taskDescription = taskDescription;
    }

    public String getTaskCode () {
        return taskCode;
    }

    public void setTaskCode (String taskCode) {
        this.taskCode = taskCode;
    }

    public String getTaskDescription () {
        return taskDescription;
    }

    public void setTaskDescription (String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public Project getProject () {
        return project;
    }

    public void setProject (Project project) {
        this.project = project;
    }

    @Override
    public String toString () {
        return "Task{" + "taskCode='" +
                taskCode + '\'' + ", taskDescription='" + taskDescription + '\'' + ", project=" +
                (project== null ? "don't refer to any project" : project.getCodeProject() ) + '}';
    }
}

package Inheritance;

public class Professor extends Person{
    protected String jobTtile;

    @Override
    public String getName () {
        return super.getName();
    }

    @Override
    public void setName (String name) {
        super.setName(name);
    }
}

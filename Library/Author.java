package Library;

public class Author {

    private int nid;
    private String firstName;
    private String familyName;

    public Author(String firstName, String familyName, int nid) {
        this.nid = nid;
        this.firstName = firstName;
        this.familyName = familyName;
    }

    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", familyName='" + familyName + '\'' +
                ", familyName='" + nid + '\'' +
                '}';
    }
}

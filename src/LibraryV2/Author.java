package LibraryV2;

import java.util.ArrayList;

public class Author {

    private int nid;
    private String firstName;
    private String familyName;
    private ArrayList<Book> books;
    public Author(){
        this.books = new ArrayList<>();
    }
    public Author(String firstName, String familyName, int nid) {
//        this.books = new ArrayList<>();
       this();
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

    public ArrayList<Book> getBooks(){
        return  books;
    }

    void  setBooks(ArrayList<Book> books){
        this.books = books;
    }


    void addBook(Book book){
        this.books.add(book);
    }

    private String bookLists(){
        String afficher = "";
         for (Book book : this.getBooks()){
          afficher += book.getTitle()+"\n";
        }
         return  afficher;
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", familyName='" + familyName + '\'' +
                ", familyName='" + nid + '\'' +
                "\nhe wrote : \n"+bookLists()+
                '}';
    }
}

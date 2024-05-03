package LibraryV2;

import java.util.ArrayList;

public class Category {

    private int id;
    private String name;
    private String description;
    private ArrayList<Book> books;
    public Category(){
        this.books = new ArrayList<>();
    }

    public Category(String name, String description, int id) {
        this();
//        this.books = new ArrayList<>();
        this.id = id;
        this.name = name;
        this.description = description;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

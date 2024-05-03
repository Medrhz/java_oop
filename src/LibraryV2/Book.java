package LibraryV2;

public class Book {

    private int id;
    private String title;
    private Category category;
    private Author author;

    public Book(String title, int id) {
        this.id = id;
        this.title = title;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String toString() {
        return  "id : " + id + " title "
                + title + "Category : "
                + this.category.getName() + " Author : "
                + this.author.getFirstName()+" "+this.author.getFamilyName();
    }


}

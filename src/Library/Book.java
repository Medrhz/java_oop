package Library;

public class Book {

    private int id;
    private String title;
    private Category category;
    private Author author;

    public Book(String title, int id, Category category, Author author) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.author = author;
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

    public void printInfo() {
        System.out.println("id : " + id + " title "
                + title + "Category : "
                + category + " Author : "
                + author);

    }


}

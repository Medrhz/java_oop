package LibraryV2;

public class Main {


    public static void main (String[] args) {
        Author a1 = new Author("mohamed","rhziza",1);
        Author a2 = new Author("yassine","alaami",1);

        Book b1 = new Book("title one",1);
        Book b2 = new Book("title two",2);
        Book b3 = new Book("title three",3);
        Book b4 = new Book("title four",4);

        Category c1 = new Category("cate one","cate for arab",1);
        Category c2 = new Category("cate Two","cate for arab",2);

        b1.setAuthor(a1);
        b2.setAuthor(a2);
        b3.setAuthor(a2);
        b4.setAuthor(a1);


        b1.setCategory(c1);
        b2.setCategory(c2);
        b3.setCategory(c2);
        b4.setCategory(c2);

        a1.addBook(b1);
        a1.addBook(b4);
        a2.addBook(b2);
        a2.addBook(b3);

        c1.addBook(b1);
        c2.addBook(b2);
        c2.addBook(b3);
        c2.addBook(b4);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(a1.toString());





    }

}

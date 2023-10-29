package moocfihelsinki.bookcollection.book;


public class Book {
    private String title;
    private int pages;
    private int publicationYear;  
    
    public Book(String title, int pages, int pubYear){
        this.title = title;
        this.pages = pages;
        this.publicationYear = pubYear;
    }

    public int getPages() {
        return pages;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    public String getTitle() {
        return title;
    }
}

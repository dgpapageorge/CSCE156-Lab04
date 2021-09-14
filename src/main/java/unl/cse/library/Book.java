package unl.cse.library;

import java.time.LocalDate;
import java.time.Period;

/**
 * This class models an individual book.
 *
 */
public class Book {

    private String title;
    private String isbn;
    private Author author;
    private LocalDate publishDate;

    
    public Book(String t, Author a, String i, String p)
    {
    	title = t;
    	isbn = i;
    	author = a;
    	publishDate = LocalDate.parse(p);;
    }
    
    public int getAge()
    {
    	return Period.between(this.publishDate, LocalDate.now()).getYears();
    }
    
    
    /**
     * Getter method for author
     * @return
     */
    public Author getAuthor() {
        return author;
    }

    /**
     * Setter method for authors
     * @param author
     */
    public void setAuthor(Author author) {
        this.author = author;
    }

    /**
     * Getter method for call number.
     * @return
     */
    public String getISBN() {
        return isbn;
    }

    /**
     * Setter method for call number.
     * @param callNumber
     */
    public void setISBN(String isbn) {
        this.isbn = isbn;
    }

    /**
     * Getter method for title
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     * Setter method for title
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter method for the publish date
     * @return publishDate
     */
    public String getPublishDate() {
    	return this.publishDate.toString();
    }
    
    /**
     * Setter method for the publish date
     * @param date
     */
    public void setPublishDate(String date) {
    	this.publishDate = LocalDate.parse(date);
    }
    
}

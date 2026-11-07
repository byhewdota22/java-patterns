package module2;

import java.util.Objects;

public final class Book {
    private final String title;
    private final String author;
    private final int pages;
    private final int year;
    public Book(String title,String author,int pages,int year) {
    	this.title = title;
    	this.author = author;
    	this.pages = pages;
    	this.year = year;
    }
    public String getTitle() {
    	return this.title;
    }
    public String getAuthor() {
    	return this.author;
    }
    public int getPages() {
    	return this.pages;
    }
    
    public int getYear() {
    	return this.year;
    }
    @Override
	public int hashCode() {
		return Objects.hash(author, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(title, other.title);
	}
	@Override
    public String toString() {
    	return this.title + " ("+this.author + ", " + this.pages + " стр., " + this.year +")";
    			
    }

}


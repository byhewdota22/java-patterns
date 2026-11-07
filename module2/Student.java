package module2;
import java.util.ArrayList;
import java.util.List;

public final class Student {
	private final String name;
	private final List<Book> books;
	public Student(String name, List<Book> books) {
	    if (books == null) {
	        throw new IllegalArgumentException("Список книг не может быть null");
	    }
	    if (books.size() < 5) {
	        throw new IllegalArgumentException("У студента менее 5 книг");
	    }
	    this.name = name;
	    this.books = new ArrayList<>(books);
	}
public String getName() {
	return this.name;
}
public List<Book> getBooks() {
	return new ArrayList<>(this.books);
}
@Override
public String toString() {
	return "Имя студента - " + this.name + "; Список книг :" + this.books;
}
	
}

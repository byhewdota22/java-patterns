package module2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {
		
		List<Student> loadedStudents = StudentLoader.loadStudents("books.txt");
		loadedStudents.stream()
	    .peek(System.out::println)
	    .flatMap(s -> s.getBooks().stream())
	    .distinct()
	    .sorted(Comparator.comparingInt(Book::getPages))
	    .filter(book -> book.getYear() > 2000)
	    .limit(3)
	    .map(Book::getYear)
	    .findFirst()
	    .ifPresentOrElse(
	        year -> System.out.println("Год выпуска книги: " + year),
	        () -> System.out.println("Книга не найдена")
	    );

	}

}

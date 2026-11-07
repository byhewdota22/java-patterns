package module2;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class StudentLoader {
	public static List<Student> loadStudents(String path) throws IOException{
		Map<String, List<Book>> byName = new HashMap<>();
		Files.lines(Path.of(path)).forEach(line -> {
			String[] parts = line.split(";");
			if (parts.length !=5 ) {
				return;
			}
			Book book = new Book(parts[1],parts[2],Integer.parseInt(parts[3]),Integer.parseInt(parts[4]));
			String studentName = parts[0];
			if (!byName.containsKey(studentName)) {
			    byName.put(studentName, new ArrayList<>());
			}
			byName.get(studentName).add(book);
		});
		List<Student> students = new ArrayList<>();
		for (Map.Entry<String, List<Book>> entry : byName.entrySet()) {
	        students.add(new Student(entry.getKey(), entry.getValue()));
	    }
	    return students;
	}
}

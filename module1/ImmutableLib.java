package module1;
import java.util.ArrayList;
import java.util.List;


public final class ImmutableLib {
    private final String name;
    private final String surname;
    private final List<String> books;

    public ImmutableLib(String name, String surname, List<String> books) {
        this.name = name;
        this.surname = surname;
        this.books = new ArrayList<>(books);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public List<String> getBooks() {
        return new ArrayList<>(books);
    }

    @Override
    public String toString() {
        return "Имя='" + name + "', Фамилия='" + surname +
               "', Прочитанные книги=" + books + "";
    }
}
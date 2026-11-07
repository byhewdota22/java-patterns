package module1;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
        list.add("Процесс");
        list.add("1984");
        ImmutableLib obj = new ImmutableLib("Никита", "Воробьев", list);
        System.out.println("До изменений: " + obj);
        list.add("Мы");
        System.out.println("После изменений: " + obj);

	}

}

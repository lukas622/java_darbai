import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private List<Student> students = new ArrayList<>();

    public University(String name) {
        this.name = name;
    }
}

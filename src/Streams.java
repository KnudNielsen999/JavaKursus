import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<String> b =new ArrayList<>();
        List<String> a = List.of("hest", "hund", "kat");
                 a.stream()
                .filter(c -> c.contains("kat"))
                .map(s -> {
                 b.add(s);
                 return s.substring(0,1 ).toUpperCase()+s.substring(1);
                 })
                .forEach(System.out::println);
        System.out.println("elementer der er tilføjet b "+b);
    }
}

import java.util.stream.*;
class TaskMT12 {
    public static void main(String[] args) {
        Stream<String> stream
                = Stream.of("Heelo", "My",
                "name", "is",
                "Prasunamba",
                ".MK");

        stream.forEach(System.out::println);
    }
}


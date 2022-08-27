import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import stream.ProfileEntity;

public class App {

    static List<ProfileEntity> profiles = new ArrayList<>();
    static {
        profiles.add(new ProfileEntity("Juna", "Djoh", "juna@gmail.com", List.of("Java", "Spring", "Spring Boot")));

        profiles.add(new ProfileEntity("Dave", "Djoh", "dave@gmail.com", List.of("Java", "Spring", "Spring Boot")));
    }

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        // GenericCounter<Integer> counter = new GenericCounter<Integer>(1);
        // counter.print();

        // GenericCounter<String> counter2 = new GenericCounter<String>("Hello,
        // World!");
        // counter2.print();

        // GenericCounter<Double> counter3 = new GenericCounter<Double>(3.14);
        // counter3.print();

        /**
         * Streams
         * how the streams work:
         */

        // for each
        // profiles.stream().forEach(profile -> {
        // System.out.println(profile.getEmail());
        // });

        // map + collect method
        // List
        // List<ProfileEntity> data = profiles.stream()
        // .map(p -> (new ProfileEntity(
        // p.getFirstName(),
        // p.getLastName(),
        // p.getEmail(),
        // p.getSkills())))
        // .collect(Collectors.toList());
        // System.out.println(data);

        // Set
        Set<ProfileEntity> data2 = profiles.stream()
                .map(p -> (new ProfileEntity(
                        p.getFirstName(),
                        p.getLastName(),
                        p.getEmail(),
                        p.getSkills())))
                .collect(Collectors.toSet());
        System.out.println(data2);
    }
}

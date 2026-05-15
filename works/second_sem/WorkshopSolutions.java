import java.util.*;

public class WorkshopSolutions {
    public static void main(String[] args) {
        part1PlaylistManager();
        System.out.println();
        part2StudentGradeTracker();
        System.out.println();
        part3DuplicateDetector();
    }

    public static void part1PlaylistManager() {
        LinkedList<String> playlist = new LinkedList<>();

        playlist.add("Bohemian Rhapsody");
        playlist.add("Blinding Lights");
        playlist.add("Imagine");

        playlist.addFirst("Billie Jean");
        playlist.addLast("Rolling in the Deep");

        playlist.remove(1);

        System.out.print("Final playlist: ");
        for (String song : playlist) {
            System.out.print(song + " -> ");
        }
        System.out.println("none");
    }

    public static void part2StudentGradeTracker() {
        HashMap<Integer, Integer> grades = new HashMap<>();

        grades.put(101, 85);
        grades.put(102, 92);
        grades.put(103, 78);

        grades.put(102, 95);
        grades.remove(101);

        if (grades.containsKey(103)) {
            System.out.println("ID 103 score: " + grades.get(103));
        }

        System.out.println("All students: " + grades.keySet() + " -> " + grades.values());
    }

    public static void part3DuplicateDetector() {
        String[] emails = {"alice@email.com", "bob@email.com", "alice@email.com", "charlie@email.com"};
        String result = findFirstDuplicateEmail(emails);
        System.out.println("First duplicate: " + result);
    }

    public static String findFirstDuplicateEmail(String[] emails) {
        HashSet<String> seen = new HashSet<>();

        for (String email : emails) {
            if (seen.contains(email)) {
                return email;
            }
            seen.add(email);
        }
        return null;
    }
}
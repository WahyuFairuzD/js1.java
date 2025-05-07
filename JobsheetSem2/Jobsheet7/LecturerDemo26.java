public class LecturerDemo26 {
    public static void main(String[] args) {
        LecturerData26 lecturers = new LecturerData26(5);
        
        lecturers.add(new Lecturer26("2201", "Alice", false, 23));
        lecturers.add(new Lecturer26("2202", "Bob", true, 29));
        lecturers.add(new Lecturer26("2203", "Charlie", true, 35));
        lecturers.add(new Lecturer26("2204", "David", true, 49));
        lecturers.add(new Lecturer26("2205", "Eve", false, 27));

        
        System.out.println("\n--- Sequential Search ---");
        lecturers.showSearchResults("bob");
        lecturers.showSearchResults("Unknown");

        System.out.println("\n--- Binary Search ---");
        System.out.println("Searching age 35:");
        lecturers.showAllMatches(35);
        
        System.out.println("\nSearching age 30:");
        lecturers.showAllMatches(30);
    }
}
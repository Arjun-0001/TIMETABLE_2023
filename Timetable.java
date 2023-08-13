import java.util.Scanner;

class TimetableApp {
    static String[][] timetable = new String[5][7]; // 5 days x 7 slots

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

             while (true) {
            System.out.println("Timetable Setting App");
            System.out.println("1. Add Event");
            System.out.println("2. View Timetable");
            System.out.println("3. Exit");
            System.out.println("Select an option: ");
            System.out.println("MADE BY:Arjun Pandey");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addEvent(scanner);
                    break;
                case 2:
                    viewTimetable();
                    break;
                case 3:
                    System.out.println("Exiting the app.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    static void addEvent(Scanner scanner) {
        System.out.print("Enter day (1-5): ");
        int day = scanner.nextInt() - 1;

        System.out.print("Enter slot (1-7): ");
        int slot = scanner.nextInt() - 1;

        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter event name: ");
        String eventName = scanner.nextLine();

        timetable[day][slot] = eventName;
        System.out.println("Event added successfully!");
    }

    static void viewTimetable() {
        System.out.println("Day\tSlot\tEvent");
        for (int day = 0; day < 5; day++) {
            for (int slot = 0; slot < 7; slot++) {
                System.out.println((day + 1) + "\t" + (slot + 1) + "\t" + timetable[day][slot]);
            }
        }
    }
}

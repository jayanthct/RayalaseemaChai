package main.java.com.teashop.userInterfaceUI;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import main.java.com.teashop.utils.ANSIColors;


public class WelcomeScreen {

    public void logo(){
        System.out.println(ANSIColors.BRIGHT_YELLOW +
                "──────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("─████████████████───██████████████─████████──████████─██████████████─██████─────────██████████████─██████████████─██████████████─██████████████─██████──────────██████─██████████████─");
        System.out.println("─██░░░░░░░░░░░░██───██░░░░░░░░░░██─██░░░░██──██░░░░██─██░░░░░░░░░░██─██░░██─────────██░░░░░░░░░░██─██░░░░░░░░░░██─██░░░░░░░░░░██─██░░░░░░░░░░██─██░░██████████████░░██─██░░░░░░░░░░██─");
        System.out.println("─██░░████████░░██───██░░██████░░██─████░░██──██░░████─██░░██████░░██─██░░██─────────██░░██████░░██─██░░██████████─██░░██████████─██░░██████████─██░░░░░░░░░░░░░░░░░░██─██░░██████░░██─");
        System.out.println("─██░░██────██░░██───██░░██──██░░██───██░░░░██░░░░██───██░░██──██░░██─██░░██─────────██░░██──██░░██─██░░██─────────██░░██─────────██░░██─────────██░░██████░░██████░░██─██░░██──██░░██─");
        System.out.println("─██░░████████░░██───██░░██████░░██───████░░░░░░████───██░░██████░░██─██░░██─────────██░░██████░░██─██░░██████████─██░░██████████─██░░██████████─██░░██──██░░██──██░░██─██░░██████░░██─");
        System.out.println("─██░░░░░░░░░░░░██───██░░░░░░░░░░██─────████░░████─────██░░░░░░░░░░██─██░░██─────────██░░░░░░░░░░██─██░░░░░░░░░░██─██░░░░░░░░░░██─██░░░░░░░░░░██─██░░██──██░░██──██░░██─██░░░░░░░░░░██─");
        System.out.println("─██░░██████░░████───██░░██████░░██───────██░░██───────██░░██████░░██─██░░██─────────██░░██████░░██─██████████░░██─██░░██████████─██░░██████████─██░░██──██████──██░░██─██░░██████░░██─");
        System.out.println("─██░░██──██░░██─────██░░██──██░░██───────██░░██───────██░░██──██░░██─██░░██─────────██░░██──██░░██─────────██░░██─██░░██─────────██░░██─────────██░░██──────────██░░██─██░░██──██░░██─");
        System.out.println("─██░░██──██░░██████─██░░██──██░░██───────██░░██───────██░░██──██░░██─██░░██████████─██░░██──██░░██─██████████░░██─██░░██████████─██░░██████████─██░░██──────────██░░██─██░░██──██░░██─");
        System.out.println("─██░░██──██░░░░░░██─██░░██──██░░██───────██░░██───────██░░██──██░░██─██░░░░░░░░░░██─██░░██──██░░██─██░░░░░░░░░░██─██░░░░░░░░░░██─██░░░░░░░░░░██─██░░██──────────██░░██─██░░██──██░░██─");
        System.out.println("─██████──██████████─██████──██████───────██████───────██████──██████─██████████████─██████──██████─██████████████─██████████████─██████████████─██████──────────██████─██████──██████─");
        System.out.println("──────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("─────────────────────────────────────────────────────────");
        System.out.println("─██████████████─██████──██████─██████████████─██████████─");
        System.out.println("─██░░░░░░░░░░██─██░░██──██░░██─██░░░░░░░░░░██─██░░░░░░██─");
        System.out.println("─██░░██████████─██░░██──██░░██─██░░██████░░██─████░░████─");
        System.out.println("─██░░██─────────██░░██──██░░██─██░░██──██░░██───██░░██───");
        System.out.println("─██░░██─────────██░░██████░░██─██░░██████░░██───██░░██───");
        System.out.println("─██░░██─────────██░░░░░░░░░░██─██░░░░░░░░░░██───██░░██───");
        System.out.println("─██░░██─────────██░░██████░░██─██░░██████░░██───██░░██───");
        System.out.println("─██░░██─────────██░░██──██░░██─██░░██──██░░██───██░░██───");
        System.out.println("─██░░██████████─██░░██──██░░██─██░░██──██░░██─████░░████─");
        System.out.println("─██░░░░░░░░░░██─██░░██──██░░██─██░░██──██░░██─██░░░░░░██─");
        System.out.println("─██████████████─██████──██████─██████──██████─██████████─");
        System.out.println("─────────────────────────────────────────────────────────" + ANSIColors.RESET);

    }

    public void start() {
        // Get current date and time
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = now.format(formatter);

        // Setup Color Aliases
        String border = ANSIColors.BRIGHT_CYAN;
        String title = ANSIColors.BRIGHT_YELLOW;
        String subtext = ANSIColors.BRIGHT_GREEN;
        String optionText = ANSIColors.BRIGHT_MAGENTA;
        String reset = ANSIColors.RESET;
        String background = ANSIColors.BACKGROUND_BLACK;

        logo();
        System.out.println(title+ "                🌶 RAYALASEEMA CHAI 🔥 – One Sip, Full Trip ☕                     " + ANSIColors.RESET);
        System.out.println(title + "                     ☕ రాయలసీమ టీ | ఊపు‌తో ఊరే లెవల్! 🔥                     " + ANSIColors.RESET);

        // Print the Fancy UI Header
        System.out.println(border + "╔══════════════════════════════════════════════════════════════════════╗");
        System.out.println("║" + reset + background + title + "                     Welcome to Rayalaseema Chai                      " + reset + border + "║");
        System.out.println("╠══════════════════════════════════════════════════════════════════════╣");
        System.out.println("║" + reset + subtext + "                      Date & Time: " + formattedDateTime + "                " + reset + border + "║");
        System.out.println("╠══════════════════════════════════════════════════════════════════════╣");
        System.out.println("║" + reset + optionText + "                         [1] Customer Billing                         " + reset + border + "║");
        System.out.println("║" + reset + optionText + "                         [2] Admin Dashboard                          " + reset + border + "║");
        System.out.println("║" + reset + ANSIColors.BRIGHT_RED + "                         [3] Exit                                     " + reset + border + "║");
        System.out.println("╚══════════════════════════════════════════════════════════════════════╝" + reset);

        // Get User Input
        Scanner scanner = new Scanner(System.in);
        System.out.print(ANSIColors.BRIGHT_WHITE + "\nEnter your choice (1/2/3): " + reset);
        String choice = scanner.nextLine();

        // Act based on input
        switch (choice) {
            case "1":
                System.out.println(ANSIColors.BRIGHT_GREEN + "→ Redirecting to Customer Billing..." + reset);
                break;
            case "2":
                System.out.println(ANSIColors.BRIGHT_BLUE + "→ Redirecting to Admin Dashboard..." + reset);
                break;
            case "3":
                System.out.println(ANSIColors.BRIGHT_RED + "→ Exiting... Have a kadak day! ☕" + reset);
                break;
            default:
                System.out.println(ANSIColors.BRIGHT_RED + "⚠ Invalid choice. Please select 1, 2, or 3." + reset);
        }

        scanner.close();
    }
}

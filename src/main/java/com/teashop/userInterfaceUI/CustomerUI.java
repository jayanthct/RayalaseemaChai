package main.java.com.teashop.userInterfaceUI;

import main.java.com.teashop.model.Item;
import main.java.com.teashop.model.Menu;
import main.java.com.teashop.user.Customer;
import main.java.com.teashop.utils.ANSIColors;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerUI {

    public static void start(){

       printDashboard();

        // Get User Input
        Scanner scanner = new Scanner(System.in);
        System.out.print(ANSIColors.BRIGHT_WHITE + "\nEnter your choice (1/2/3): " + ANSIColors.RESET);
        String choice = scanner.nextLine();

        // Act based on input
        switch (choice) {
            case "1":
                System.out.println(ANSIColors.BRIGHT_GREEN + "→ Redirecting to Customer Ordering..." + ANSIColors.RESET);
            {
                System.out.println("Enter Customer Name: ");
                String name = scanner.nextLine();
                System.out.println("Enter Customer Phone Number: ");
                String phone = scanner.nextLine();

                Customer customer = new Customer(name, phone);
                customer.orderItems(customer);


            }
                break;
            case "2":
                System.out.println(ANSIColors.BRIGHT_BLUE + "→ Redirecting to Cancel Order Dashboard..." + ANSIColors.RESET);
                break;
            case "3":
                System.out.println(ANSIColors.BRIGHT_RED + "→ Exiting... Have a kadak day! ☕" + ANSIColors.RESET);
                break;
            default:
                System.out.println(ANSIColors.BRIGHT_RED + "⚠ Invalid choice. Please select 1, 2, or 3." + ANSIColors.RESET);
        }

        scanner.close();

    }

    public static void printDashboard(){

        // Setup Color Aliases
        String border = ANSIColors.BRIGHT_CYAN;
        String title = ANSIColors.BRIGHT_YELLOW;
        String subtext = ANSIColors.BRIGHT_GREEN;
        String optionText = ANSIColors.BRIGHT_MAGENTA;
        String reset = ANSIColors.RESET;
        String background = ANSIColors.BACKGROUND_BLACK;

        System.out.println(title+ "                🌶 RAYALASEEMA CHAI 🔥 – One Sip, Full Trip ☕                     " + ANSIColors.RESET);
        System.out.println(title + "                     ☕ రాయలసీమ టీ | ఊపు‌తో ఊరే లెవల్! 🔥                     " + ANSIColors.RESET);

        // Print the Fancy UI Header
        System.out.println(border + "╔══════════════════════════════════════════════════════════════════════╗");
        System.out.println("║" + reset + background + title + "                     Customer Billing Counter                         " + reset + border + "║");
        System.out.println("╠══════════════════════════════════════════════════════════════════════╣");
        System.out.println("║" + reset + optionText + "                         [1] Order Items                              " + reset + border + "║");
        System.out.println("║" + reset + optionText + "                         [2] Cancel Order                             " + reset + border + "║");
        System.out.println("║" + reset + ANSIColors.BRIGHT_RED + "                         [3] Back to Main Menu                        " + reset + border + "║");
        System.out.println("╚══════════════════════════════════════════════════════════════════════╝" + reset);

    }

    public static void main(String[] args) {
        printDashboard();
    }

}

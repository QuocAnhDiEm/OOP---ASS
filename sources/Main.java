import Operation.UserOperation;
import Operation.AdminOperation;
import interfacecli.IOInterface;
import src.model.User;

public class Main {
    public static void main(String[] args) {
        // Ensure default admin is registered
        AdminOperation.getInstance().registerAdmin();

        IOInterface io = IOInterface.getInstance();

        while (true) {
            io.mainMenu();
            String[] input = io.getUserInput("Enter your choice:", 1);
            String choice = input[0];

            switch (choice) {
                case "1": // Login
                    String[] loginInput = io.getUserInput("Enter username and password:", 2);
                    String username = loginInput[0];
                    String password = loginInput[1];
                    User loggedInUser = UserOperation.getInstance().login(username, password);

                    if (loggedInUser != null) {
                        if (loggedInUser.getUserRole().equals("admin")) {
                            io.printMessage("Login successful. Welcome, admin!");
                            io.adminMenu();
                        } else {
                            io.printMessage("Login successful. Welcome, " + loggedInUser.getUserName() + "!");
                            io.customerMenu();
                        }
                    } else {
                        io.printErrorMessage("Login", "Invalid credentials. Please try again.");
                    }
                    break;

                case "2": // Register (Customer only)
                    String[] regInput = io.getUserInput("Enter username, password, email, mobile:", 4);
                    boolean success = Operation.CustomerOperation.getInstance().registerCustomer(
                        regInput[0], regInput[1], regInput[2], regInput[3]);
                    if (success) {
                        io.printMessage("Registration successful. You can now log in.");
                    } else {
                        io.printErrorMessage("Registration", "Failed to register. Check input or try another username.");
                    }
                    break;

                case "3": // Quit
                    io.printMessage("Exiting system. Goodbye!");
                    return;

                default:
                    io.printErrorMessage("Main Menu", "Invalid choice. Try 1, 2, or 3.");
            }
        }
    }
}

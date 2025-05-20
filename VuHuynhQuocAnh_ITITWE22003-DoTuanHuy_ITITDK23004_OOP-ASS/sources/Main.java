import interfacecli.IOInterface;
import model.User;
import operation.AdminOperation;
import operation.CustomerOperation;
import operation.UserOperation;

public class Main {
    public static void main(String[] args) {
        // Ensure default admin is registered
        AdminOperation.getInstance().registerAdmin();

        IOInterface io = IOInterface.getInstance();
        User loggedInUser = null; // Biến để lưu trạng thái người dùng đã đăng nhập

        while (true) {
            // Nếu chưa đăng nhập, hiển thị Main Menu
            if (loggedInUser == null) {
                io.mainMenu();
                String[] input = io.getUserInput("Enter your choice:", 1);
                String choice = input[0];

                switch (choice) {
                    case "1": // Login
                        String[] loginInput = io.getUserInput("Enter username and password:", 2);
                        String username = loginInput[0];
                        String password = loginInput[1];
                        loggedInUser = UserOperation.getInstance().login(username, password);

                        if (loggedInUser != null) {
                            if (loggedInUser.getUserRole().equals("admin")) {
                                io.printMessage("Login successful. Welcome, admin!");
                                adminMenuLoop(io); // Chuyển sang vòng lặp Admin Menu
                            } else {
                                io.printMessage("Login successful. Welcome, " + loggedInUser.getUserName() + "!");
                                customerMenuLoop(io); // Chuyển sang vòng lặp Customer Menu
                            }
                        } else {
                            io.printErrorMessage("Login", "Invalid credentials. Please try again.");
                        }
                        break;

                    case "2": // Register (Customer only)
                        String[] regInput = io.getUserInput("Enter username, password, email, mobile:", 4);
                        boolean success = CustomerOperation.getInstance().registerCustomer(
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

    // Vòng lặp cho Admin Menu
    private static void adminMenuLoop(IOInterface io) {
        while (true) {
            io.adminMenu();
            String[] input = io.getUserInput("Enter your choice:", 1);
            String choice = input[0];

            // Giả sử lựa chọn cuối cùng trong adminMenu là "Logout"
            if (choice.equals("logout_option")) { // Thay "logout_option" bằng giá trị thực tế trong adminMenu
                io.printMessage("Logging out...");
                break; // Thoát khỏi vòng lặp Admin Menu, quay lại Main Menu
            }
            // Xử lý các lựa chọn khác trong adminMenu ở đây
        }
    }

    // Vòng lặp cho Customer Menu
    private static void customerMenuLoop(IOInterface io) {
        while (true) {
            io.customerMenu();
            String[] input = io.getUserInput("Enter your choice:", 1);
            String choice = input[0];

            // Giả sử lựa chọn "6" là "Logout" trong Customer Menu (dựa trên ảnh bạn cung cấp)
            if (choice.equals("6")) {
                io.printMessage("Logging out...");
                break; // Thoát khỏi vòng lặp Customer Menu, quay lại Main Menu
            }

            // Xử lý các lựa chọn khác trong Customer Menu
            switch (choice) {
                case "1":
                    io.printMessage("Showing profile...");
                    break;
                case "2":
                    io.printMessage("Updating profile...");
                    break;
                case "3":
                    io.printMessage("Showing products...");
                    break;
                case "4":
                    io.printMessage("Showing history orders...");
                    break;
                case "5":
                    io.printMessage("Generating all consumption figures...");
                    break;
                default:
                    io.printErrorMessage("Customer Menu", "Invalid choice. Try 1 to 6.");
            }
        }
    }
}
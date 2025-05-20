package model;

public class Customer extends User {
    private String userEmail;
    private String userMobile;

    /**
     * Constructs a customer object.
     * @param userId Must be unique, format: u_10 digits, such as u_1234567890
     * @param userName The user's name
     * @param userPassword The user's password
     * @param userRegisterTime Format: "DD-MM-YYYY_HH:MM:SS"
     * @param userRole Default value: "customer"
     * @param userEmail The customer's email address
     * @param userMobile The customer's mobile number
     */
    public Customer(String userId, String userName, String userPassword,
                    String userRegisterTime, String userRole,
                    String userEmail, String userMobile) {
        super(userId, userName, userPassword, userRegisterTime, userRole);
        this.userEmail = userEmail;
        this.userMobile = userMobile;
    }

    /**
     * Default constructor
     */
    public Customer() {
        super("u_0000000000", "default_user", "^^default123$$", "01-01-2024_00:00:00", "customer");
        this.userEmail = "default@example.com";
        this.userMobile = "0400000000";
    }

    /**
     * Returns the customer information as a formatted string.
     * @return String in JSON-like format
     */
    @Override
    public String toString() {
        return String.format(
            "{\"user_id\":\"%s\", \"user_name\":\"%s\", \"user_password\":\"%s\", " +
            "\"user_register_time\":\"%s\", \"user_role\":\"%s\", " +
            "\"user_email\":\"%s\", \"user_mobile\":\"%s\"}",
            userId, userName, userPassword, userRegisterTime, userRole, userEmail, userMobile
        );
    }

    // Optional: Getters and Setters

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }
}

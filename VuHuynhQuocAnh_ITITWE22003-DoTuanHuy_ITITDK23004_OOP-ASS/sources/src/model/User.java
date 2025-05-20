package model;

public abstract class User {
    protected String userId;
    protected String userName;
    protected String userPassword;
    protected String userRegisterTime;
    protected String userRole;

    /**
     * Constructs a user object.
     * @param userId Must be unique, format: u_10 digits, such as u_1234567890
     * @param userName The user's name
     * @param userPassword The user's password
     * @param userRegisterTime Format: "DD-MM-YYYY_HH:MM:SS"
     * @param userRole Default value: "customer"
     */
    public User(String userId, String userName, String userPassword,
                String userRegisterTime, String userRole) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userRegisterTime = userRegisterTime;
        this.userRole = userRole;
    }

    //Default 
     
    public User() {
        this.userId = "u_0000000000";
        this.userName = "default_user";
        this.userPassword = "^^default123$$";
        this.userRegisterTime = "01-01-2024_00:00:00";
        this.userRole = "customer";
    }

    /**
     * Returns the user information. 
     * @return String in JSON-like format
     */
    @Override
    public String toString() {
        return String.format("{\"user_id\":\"%s\", \"user_name\":\"%s\", " +
                             "\"user_password\":\"%s\", \"user_register_time\":\"%s\", " +
                             "\"user_role\":\"%s\"}",
                             userId, userName, userPassword, userRegisterTime, userRole);
    }

    // Getters and Setters 

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserRegisterTime() {
        return userRegisterTime;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void setUserRegisterTime(String userRegisterTime) {
        this.userRegisterTime = userRegisterTime;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }
}

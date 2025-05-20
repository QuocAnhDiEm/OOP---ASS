package model;
//Order.class
 
public class Order {

    // Instance variables for storing order details
    private String orderId;     // Order’s unique identifier (format: o_5 digits)
    private String userId;      //  ID of the user who placed the order
    private String proId;       // ID of the product ordered
    private String orderTime;   //  Time when the order was placed (format: “DD-MM-YYYY_HH:MM:SS”)
    private double orderPrice;
    
    /**
     *  Constructs an order object.
     * @param orderId  Must be a unique string, format is o_5 digits such as o_12345
     * @param userId ID of the user who placed the order
     * @param proId  ID of the product ordered
     * @param orderTime Format: "DD-MM-YYYY_HH:MM:SS"
     */
    public Order(String orderId, String userId, String proId, String orderTime, double orderPrice) {
        this.orderId = orderId;
        this.userId = userId;
        this.proId = proId;
        this.orderTime = orderTime;
        this.orderPrice = orderPrice;
    }

    /**
     * Default constructor
     */
    public Order() {
        this.orderId = "o_00000";
        this.userId = "u_0000000000";
        this.proId = "p_000";
        this.orderTime = "01-01-2024_00:00:00";
    }

    /**
     *  Returns the order information as a formatted string.
     * @return String in JSON-like format
     */
    @Override
    public String toString() {
        return "{\"order_id\":\"" + orderId + "\", \"user_id\":\"" + userId + 
               "\", \"pro_id\":\"" + proId + "\", \"order_time\":\"" + orderTime + "\"}";
    }

    // Getter and Setter methods for each instance variable
    public double getOrderPrice() {
        return orderPrice;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }
}

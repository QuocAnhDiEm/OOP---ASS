/*class product*/
public class Product {

    // Thuộc tính của sản phẩm
    private String proId;          // ID duy nhất của sản phẩm
    private String proModel;       // Mẫu sản phẩm
    private String proCategory;    // Danh mục sản phẩm
    private String proName;        // Tên sản phẩm
    private double proCurrentPrice; // Giá hiện tại của sản phẩm
    private double proRawPrice;    // Giá gốc của sản phẩm
    private double proDiscount;    // Phần trăm giảm giá của sản phẩm
    private int proLikesCount;     // Số lượng thích (like) của sản phẩm

    /**
     * Constructor : 
     * Constructs a product object.
     * @param proId ID sản phẩm (Phải duy nhất).
     * @param proModel Mẫu sản phẩm.
     * @param proCategory Danh mục sản phẩm.
     * @param proName Tên sản phẩm.
     * @param proCurrentPrice Giá hiện tại của sản phẩm.
     * @param proRawPrice Giá gốc của sản phẩm.
     * @param proDiscount Phần trăm giảm giá của sản phẩm.
     * @param proLikesCount Số lượng likes của sản phẩm.
     */
    public Product(String proId, String proModel, String proCategory,
                   String proName, double proCurrentPrice, double proRawPrice,
                   double proDiscount, int proLikesCount) {
        this.proId = proId;
        this.proModel = proModel;
        this.proCategory = proCategory;
        this.proName = proName;
        this.proCurrentPrice = proCurrentPrice;
        this.proRawPrice = proRawPrice;
        this.proDiscount = proDiscount;
        this.proLikesCount = proLikesCount;
    }

     //Default constructor 
    
    public Product() {
        this.proId = "default_id";
        this.proModel = "default_model";
        this.proCategory = "default_category";
        this.proName = "default_name";
        this.proCurrentPrice = 0.0;
        this.proRawPrice = 0.0;
        this.proDiscount = 0.0;
        this.proLikesCount = 0;
    }

    /** Returns the product information as a formatted string
     * @return  String in JSON-like format
     */
    @Override
    public String toString() {
        return "{\"pro_id\":\"" + proId + "\", \"pro_model\":\"" + proModel + 
               "\", \"pro_category\":\"" + proCategory + "\", \"pro_name\":\"" + proName + 
               "\", \"pro_current_price\":\"" + proCurrentPrice + "\", \"pro_raw_price\":\"" + 
               proRawPrice + "\", \"pro_discount\":\"" + proDiscount + "\", \"pro_likes_count\":\"" + proLikesCount + "\"}";
    }

    // Getter và Setter cho các thuộc tính
    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getProModel() {
        return proModel;
    }

    public void setProModel(String proModel) {
        this.proModel = proModel;
    }

    public String getProCategory() {
        return proCategory;
    }

    public void setProCategory(String proCategory) {
        this.proCategory = proCategory;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public double getProCurrentPrice() {
        return proCurrentPrice;
    }

    public void setProCurrentPrice(double proCurrentPrice) {
        this.proCurrentPrice = proCurrentPrice;
    }

    public double getProRawPrice() {
        return proRawPrice;
    }

    public void setProRawPrice(double proRawPrice) {
        this.proRawPrice = proRawPrice;
    }

    public double getProDiscount() {
        return proDiscount;
    }

    public void setProDiscount(double proDiscount) {
        this.proDiscount = proDiscount;
    }

    public int getProLikesCount() {
        return proLikesCount;
    }

    public void setProLikesCount(int proLikesCount) {
        this.proLikesCount = proLikesCount;
    }
}

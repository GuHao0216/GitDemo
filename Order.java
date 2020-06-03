import java.time.LocalDateTime;

public class Order {

    private String orderId;

    private String note;

    private LocalDateTime createTime;

    private LocalDateTime payTime;

    private Double price;

    private Double payPrice;

    private String addressId;

    private String userId;

    private String storeId;

    public Order() {
    }
    public String getOrderID() {
        return this.orderId;
    }

    public Integer getPayType() {
        return this.payType;
    }

    public String getNote() {
        return this.note;
    }

    public LocalDateTime getCreateTime() {
        return this.createTime;
    }

    public LocalDateTime getPayTime() {
        return this.payTime;
    }

    public Double getPrice() {
        return this.price;
    }

    public Double getPayPrice() {
        return this.payPrice;
    }


    public String getAddressId() {
        return this.addressId;
    }

    public String getUserId() {
        return this.userId;
    }

    public String getStoreId() {
        return this.storeId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public void setPayTime(LocalDateTime payTime) {
        this.payTime = payTime;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    public void setPayPrice(Double payPrice) {
        this.payPrice = payPrice;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

}
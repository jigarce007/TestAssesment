package push.fire.com.demoassesment.model;

import com.google.gson.annotations.SerializedName;

public class Variant {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @SerializedName("id")
    private String id;
    @SerializedName("color")
    private String color;
    @SerializedName("size")
    private String size;

    public Variant(String id, String color, String size, String price) {
        this.id = id;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    @SerializedName("price")
    private String price;



}

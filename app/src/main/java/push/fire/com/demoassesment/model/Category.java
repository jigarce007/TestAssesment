package push.fire.com.demoassesment.model;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Category {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Products> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Products> productList) {
        this.productList = productList;
    }

    @SerializedName("id")
    private String id;

    public Category(String id, String name, ArrayList<Products> productList) {
        this.id = id;
        this.name = name;
        this.productList = productList;
    }

    @SerializedName("name")
    private String name;

    private ArrayList<Products> productList = new ArrayList<>();

}

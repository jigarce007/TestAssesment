package push.fire.com.demoassesment.Response;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

import push.fire.com.demoassesment.model.Category;
import push.fire.com.demoassesment.model.Products;

public class ProductResponse {

    public ArrayList<Category> getResults() {
        return results;
    }

    public void setResults(ArrayList<Category> results) {
        this.results = results;
    }

    @SerializedName("categories")
    private ArrayList<Category> results;


}

package push.fire.com.demoassesment.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Products {
    @SerializedName("id")
    private String id;
    @SerializedName("name")
    private String name;

    public Products(String id, String name, String date, ArrayList<Variant> variantList, ArrayList<Tax> taxList) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.variantList = variantList;
        this.taxList = taxList;
    }

    @SerializedName("date_added")
    private String date;

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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ArrayList<Variant> getVariantList() {
        return variantList;
    }

    public void setVariantList(ArrayList<Variant> variantList) {
        this.variantList = variantList;
    }

    public ArrayList<Tax> getTaxList() {
        return taxList;
    }

    public void setTaxList(ArrayList<Tax> taxList) {
        this.taxList = taxList;
    }

    private ArrayList<Variant> variantList = new ArrayList<>();
    private ArrayList<Tax> taxList = new ArrayList<>();


}

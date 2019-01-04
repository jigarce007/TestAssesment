package push.fire.com.demoassesment.model;

import com.google.gson.annotations.SerializedName;

public class Tax {
    @SerializedName("name")
    private String name;

    public Tax(String name, String value) {
        this.name = name;
        this.value = value;
    }

    @SerializedName("value")
    private String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

package push.fire.com.demoassesment.Network;

import push.fire.com.demoassesment.Response.ProductResponse;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("/json")
    Call<ProductResponse> getProducts();

}

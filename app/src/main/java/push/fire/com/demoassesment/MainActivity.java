package push.fire.com.demoassesment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

import push.fire.com.demoassesment.Network.ApiClient;
import push.fire.com.demoassesment.Network.ApiInterface;
import push.fire.com.demoassesment.Response.ProductResponse;
import push.fire.com.demoassesment.model.Category;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ApiInterface apiService =
                ApiClient.getClient().create(ApiInterface.class);

        Call<ProductResponse> call = apiService.getProducts();
        call.enqueue(new Callback<ProductResponse>() {
            @Override
            public void onResponse(Call<ProductResponse> call, Response<ProductResponse> response) {
                List<Category> categories = response.body().getResults();
                Log.d("cat", "Number of categories received: " + categories.size());
            }

            @Override
            public void onFailure(Call<ProductResponse> call, Throwable t) {
                // Log error here since request failed
                Log.e("cat", t.toString());
            }
        });

    }
}

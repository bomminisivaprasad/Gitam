package aliet.ece.co.retrofit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
RecyclerView rc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rc=findViewById(R.id.recyclerview);
        Retrofit retrofit=new Retrofit.
                Builder().baseUrl(API.Base_URL)
                .addConverterFactory(GsonConverterFactory
                        .create()).build();
        API api=retrofit.create(API.class);
        Call<List<Modelclass_Data>> call=api.getModelclass();
        call.enqueue(new Callback<List<Modelclass_Data>>() {
            @Override
            public void onResponse(Call<List<Modelclass_Data>> call, Response<List<Modelclass_Data>> response) {
                List<Modelclass_Data> list=response.body();
                MyAdapter myAdapter=new MyAdapter
                        (MainActivity.this,list);
                rc.setLayoutManager(new
                        LinearLayoutManager(MainActivity.this));
                rc.setAdapter(myAdapter);
            }

            @Override
            public void onFailure(Call<List<Modelclass_Data>> call, Throwable t) {

            }
        });
    }
}

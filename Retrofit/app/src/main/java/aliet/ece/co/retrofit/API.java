package aliet.ece.co.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface API {
    String Base_URL="https://simplifiedcoding.net/demos/";
    @GET("marvel")
   Call <List<Modelclass_Data>>getModelclass();
}

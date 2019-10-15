package com.hihasandesignpatterns.views;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.hihasandesignpatterns.R;
import com.hihasandesignpatterns.api.BaseApi;
import com.hihasandesignpatterns.api.RetrofitService;
import com.hihasandesignpatterns.model.MainModel;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.List;

public class RestView extends AppCompatActivity
{
    private static String LOG="Design Patterns";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rest);

        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(BaseApi.BaseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        BaseApi api= retrofit.create(BaseApi.class);
        Call<List<MainModel>> call = api.getHeros();

        call.enqueue(new Callback<List<MainModel>>() {
            @Override
            public void onResponse(Call<List<MainModel>> call, Response<List<MainModel>> response) {
                List<MainModel> models= response.body();

                for (MainModel m: models){
                    Log.d(LOG,m.name);
                    Log.d(LOG,m.realname);
                    Log.d(LOG,m.createdby);
                    Log.d(LOG,m.img);
                    //Log.d(LOG,"\n");
                }
            }

            @Override
            public void onFailure(Call<List<MainModel>> call, Throwable t) {
                Toast.makeText(getApplicationContext(),t.getMessage(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}

package com.test.ln.getapitask.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.gson.Gson;
import com.test.ln.getapitask.R;
import com.test.ln.getapitask.api.response.GetApiRes1;
import com.test.ln.getapitask.api.service.ApiFactory;
import com.test.ln.getapitask.api.service.ServiceForApi;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtnGet1,mBtnGet2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        initViews();

    }

    private void initViews(){
        mBtnGet1=(Button)findViewById(R.id.btn_api1);
        mBtnGet2=(Button)findViewById(R.id.btn_api2);
        mBtnGet1.setOnClickListener(this);
        mBtnGet2.setOnClickListener(this);
    }




    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_api1:
                ServiceForApi dataService= ApiFactory.createService(ServiceForApi.class);
                Call<GetApiRes1> callRequest=dataService.getResponse();
                Log.i("request",callRequest.toString());
                callRequest.enqueue(new Callback<GetApiRes1>() {
                    @Override
                    public void onResponse(Call<GetApiRes1> call, Response<GetApiRes1> response) {
                        Log.i("response",response.body().getResults().get(0).getFormattedAddress());
                        Log.i("response",response.body().getResults().get(1).getFormattedAddress());
                        String lat= String.valueOf(response.body().getResults().get(0).getGeometry().getLocation().getLat());
                        String lng=String .valueOf(response.body().getResults().get(0).getGeometry().getLocation().getLng());

                        String lat2= String.valueOf(response.body().getResults().get(1).getGeometry().getLocation().getLat());
                        String lng2=String .valueOf(response.body().getResults().get(1).getGeometry().getLocation().getLng());

                        Log.i("response",String.valueOf(response.body().getResults().get(0).getGeometry().getLocation().getLat()));
                        Intent intent=new Intent(MainActivity.this,PlaceListActivity.class);
                        intent.putExtra("lat",lat);
                        intent.putExtra("lng",lng);
                        intent.putExtra("lat2",lat2);
                        intent.putExtra("lng2",lng2);
                        startActivity(intent);
                    }

                    @Override
                    public void onFailure(Call<GetApiRes1> call, Throwable t) {
                        Log.i("response","Failure Occured");
                    }
                });
                break;
            case R.id.btn_api2:

                break;
        }
    }


    private void showToast(String message)
    {
        Toast.makeText(MainActivity.this,message,Toast.LENGTH_SHORT).show();
    }
}

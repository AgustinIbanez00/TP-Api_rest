package com.agustin.prcticointegrador_apirest.Vista;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.agustin.prcticointegrador_apirest.Model.Museo;
import com.agustin.prcticointegrador_apirest.Model.ResultadosMuseos;
import com.agustin.prcticointegrador_apirest.Request.ApiClient;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainViewModel extends ViewModel {

    private MutableLiveData<ArrayList<Museo>> listaMuseo;



    public LiveData<ArrayList<Museo>> getListaMuseo(){
        if(listaMuseo == null){
            listaMuseo= new MutableLiveData<>();

        }
        return listaMuseo;
    }

    public void cargarMuseo(){

        Call<ResultadosMuseos>  info= ApiClient.getMyApiInterface().leer();
         info.enqueue(new Callback<ResultadosMuseos>() {
             @Override
             public void onResponse(Call<ResultadosMuseos> call, Response<ResultadosMuseos> response) {
                 if(response.isSuccessful()){
                     ResultadosMuseos result=response.body();
                     listaMuseo.postValue(response.body().getResults());

                 }
             }

             @Override
             public void onFailure(Call<ResultadosMuseos> call, Throwable t) {
                 Log.d("mensaje_error", t.getMessage());
             }
         });


    }
}





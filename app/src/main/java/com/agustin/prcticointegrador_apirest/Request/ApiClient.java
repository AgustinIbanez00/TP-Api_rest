package com.agustin.prcticointegrador_apirest.Request;

import android.util.Log;

import com.agustin.prcticointegrador_apirest.Model.ListaMuseos;
import com.agustin.prcticointegrador_apirest.Model.ResultadosMuseos;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    private static final String PATH = "https://www.cultura.gob.ar/api/v2.0/museos/";
    private static MyApiInterface myApiInterface;

    public static MyApiInterface getMyApiInterface()
    {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(PATH)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Log.d("mensaje", retrofit.baseUrl().toString());
        myApiInterface = retrofit.create(MyApiInterface.class);
        return myApiInterface;
    }

    public interface MyApiInterface
    {
        Call<ResultadosMuseos> leer();
    }


}

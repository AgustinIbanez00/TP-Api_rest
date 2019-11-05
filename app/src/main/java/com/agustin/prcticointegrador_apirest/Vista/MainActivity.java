package com.agustin.prcticointegrador_apirest.Vista;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.agustin.prcticointegrador_apirest.Model.Museo;
import com.agustin.prcticointegrador_apirest.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tvBuscar;
    ListView lvResultado;
    MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        configView();

    }

    void configView()
    {
        tvBuscar = findViewById(R.id.tvBuscar);
        lvResultado = findViewById(R.id.lvResultado);

        mainViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        mainViewModel.getListaMuseo().observe(this, new Observer<ArrayList<Museo>>() {
            @Override
            public void onChanged(ArrayList<Museo> museos) {
                ArrayList<String> lista_nombres = new ArrayList<>();

                for(Museo m: museos)
                {
                    if(tvBuscar.getText().toString().contains(m.getNombre()))
                    {
                        lista_nombres.add(m.getNombre());
                    }
                }
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.activity_main, lista_nombres);
                lvResultado.setAdapter(adapter);
            }
        });

    }

    void buscar(View view)
    {
        mainViewModel.cargarMuseo();
    }

}

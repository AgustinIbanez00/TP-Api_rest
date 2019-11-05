package com.agustin.prcticointegrador_apirest.Vista;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.agustin.prcticointegrador_apirest.Model.Museo;
import com.agustin.prcticointegrador_apirest.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btnBuscar;
    TextView etBuscarMuseo;
    ListView lvResultado;
    MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        configView();

    }

    public void configView()
    {
        etBuscarMuseo = findViewById(R.id.etBuscarMuseo);
        lvResultado = findViewById(R.id.lvResultado);
        btnBuscar = findViewById(R.id.btnBuscar);

        mainViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        mainViewModel.getListaMuseo().observe(this, new Observer<ArrayList<Museo>>() {
            @Override
            public void onChanged(ArrayList<Museo> museos) {
                if(museos != null)
                {

                   // Toast.makeText(getApplicationContext(), "Los museos han cambiado. C: " + museos.size(), Toast.LENGTH_LONG).show();
                    ArrayList<String> lista_nombres = new ArrayList<>();

                    for(Museo m: museos)
                    {
                        Log.d("Nombre",m.getNombre());
                        if(m.getNombre().contains(etBuscarMuseo.getText().toString()))
                        {
                            lista_nombres.add(m.getNombre());
                        }
                    }
                    //Toast.makeText(getApplicationContext(), "Museos encontrados: " + lista_nombres.size()+ etBuscarMuseo.getText().toString(), Toast.LENGTH_LONG).show();
                    ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), R.layout.list_item, R.id.tvItem, lista_nombres);
                    lvResultado.setAdapter(adapter);
                }
            }
        });

        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainViewModel.cargarMuseo();
            }
        });


    }

}

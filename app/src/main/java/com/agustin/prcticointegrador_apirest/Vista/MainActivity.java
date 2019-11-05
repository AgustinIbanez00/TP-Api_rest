package com.agustin.prcticointegrador_apirest.Vista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.agustin.prcticointegrador_apirest.R;

public class MainActivity extends AppCompatActivity {

    TextView tvBuscar;
    ListView lvResultado;

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
    }

    void buscar(View view)
    {


    }

}

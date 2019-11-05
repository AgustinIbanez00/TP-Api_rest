package com.agustin.prcticointegrador_apirest.Model;

import java.util.ArrayList;

public class ResultadosMuseos {

    private int count;
    private ArrayList<Museo> museos;

    public ResultadosMuseos(int count, ArrayList<Museo> museos) {
        this.count = count;
        this.museos = museos;
    }
    public ResultadosMuseos(){}

    public ArrayList<Museo> devolverResultado(String parametro){
        ArrayList<Museo> resultado= new ArrayList<Museo>();

        for (Museo it: museos ){

            if (it.getNombre().indexOf(parametro)!=-1){
                resultado.add(it);

            }

        }
        return resultado;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public ArrayList<Museo> getMuseos() {
        return museos;
    }

    public void setMuseos(ArrayList<Museo> museos) {
        this.museos = museos;
    }
}

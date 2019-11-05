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

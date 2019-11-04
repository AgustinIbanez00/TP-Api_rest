package com.agustin.prcticointegrador_apirest.Model;

import java.util.ArrayList;

public class ListaMuseos {

    private int count;
    private ArrayList<Museo> museos;

    public ListaMuseos(int count, ArrayList<Museo> museos) {
        this.count = count;
        this.museos = museos;
    }
    public ListaMuseos(){}

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

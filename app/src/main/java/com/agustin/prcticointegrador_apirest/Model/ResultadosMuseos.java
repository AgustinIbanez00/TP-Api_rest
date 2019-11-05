package com.agustin.prcticointegrador_apirest.Model;

import java.util.ArrayList;

public class ResultadosMuseos {

    private int count;
    private ArrayList<Museo> results;
    private String next;
    private String previous;

    public ResultadosMuseos(int count, ArrayList<Museo> results, String next, String previous) {
        this.count = count;
        this.results = results;
        this.next = next;
        this.previous = previous;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public ArrayList<Museo> getResults() {
        return results;
    }

    public void setResults(ArrayList<Museo> results) {
        this.results = results;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }
}

package com.company;

import org.apache.commons.lang3.Range;

import java.util.List;

public class DataType {
    private int id;
    private List<Integer[]> connectedId;
    private List<Range<Integer>> connectedIdRange;

//    public DataType(int id, List<Integer[]> connectedId) {
//        this.id = id;
//        this.connectedId = connectedId;
//    }

    public DataType(int id) {
        this.id = id;
    }

    public DataType(int id, List<Range<Integer>> connectedIdRange) {
        this.id = id;
        this.connectedIdRange = connectedIdRange;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Integer[]> getConnectedId() {
        return connectedId;
    }

    public void setConnectedId(List<Integer[]> connectedId) {
        this.connectedId = connectedId;
    }

    public List<Range<Integer>> getConnectedIdRange() {
        return connectedIdRange;
    }

    public void setConnectedIdRange(List<Range<Integer>> connectedIdRange) {
        this.connectedIdRange = connectedIdRange;
    }
}


package Exam1;

import java.util.ArrayList;
import java.util.List;

public class Cluster {
    //-	id – a string that describes the name of the cluster, unique property;
    //-	rows – a positive integer that describes how many rows the cluster has;
    //-	cols – a positive integer that describes how many columns the cluster has;
    //-	cells – a collection of objects of type Cell;
    private String id;
    private int rolws;
    private int cols;
    private List<Cell> cells;

    public Cluster(String id, int rolws, int cols) {
        this.id = id;
        this.rolws = rolws;
        this.cols = cols;
        this.cells = new ArrayList<>();
    }

    public String getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public List<Cell> getCells() {
        return this.cells;
    }

    public void addCells(Cell cell) {
        this.cells.add(cell);
    }
}

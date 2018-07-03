package Exam1;

public abstract class Cell {
    //-	id – a String, nonunique property;
    //-	health – a positive integer;
    //-	positionRow – a positive integer;
    //-	positionCol – a positive integer;
    private String id;
    private int health;
    private int positionRow;
    private int positionCol;

    public Cell(String id, int health, int positionRow, int positionCol) {
        this.id = id;
        this.health = health;
        this.positionRow = positionRow;
        this.positionCol = positionCol;
    }

    @Override
    public String toString() {
        return "Organism %s: Created cell %s in cluster %s";
    }
}

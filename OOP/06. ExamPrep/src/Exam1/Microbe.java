package Exam1;

public abstract class Microbe extends Cell {

    //-	virulence  – a positive integer that describes the ability of a microbe to infect other cells
    private int virulence;

    public Microbe(String id, int health, int positionRow, int positionCol, int virulence) {
        super(id, health, positionRow, positionCol);
        this.virulence = virulence;
    }
}

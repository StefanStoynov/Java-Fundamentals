package Exam1;

public class RedBloodCell extends BloodCell{

    //-	velocity – a positive integer that describes the speed of the cell.
    private int velocity;


    public RedBloodCell(String id, int health, int positionRow, int positionCol, int velocity) {
        super(id, health, positionRow, positionCol);
        this.velocity = velocity;
    }
}

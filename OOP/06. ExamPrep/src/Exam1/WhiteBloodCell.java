package Exam1;

public class WhiteBloodCell extends BloodCell {
    //-	size – a positive integer that describes the size of the cell.
    private int size;


    public WhiteBloodCell(String id, int health, int positionRow, int positionCol, int size) {
        super(id, health, positionRow, positionCol);
        this.size = size;
    }
}

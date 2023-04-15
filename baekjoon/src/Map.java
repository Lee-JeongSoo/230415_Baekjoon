public class Map {
    private int column;
    private int row;
    private int gapHorizontal;
    private int gapVertical;

    Map(int inputColumn, int inputRow, int inputGapHorizontal, int inputGApVertical){
        this.column= inputColumn;
        this.row= inputRow;
        this.gapVertical= inputGApVertical;
        this.gapHorizontal= inputGapHorizontal;
    }

    // get methods
    public int getColumn(){
        return column;
    }

    public int getRow() {
        return row;
    }

    public int getGapVertical() {
        return gapVertical;
    }

    public int getGapHorizontal() {
        return gapHorizontal;
    }

    //set methods
    public void setColumn(int column) {
        this.column = column;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setGapHorizontal(int gapHorizontal) {
        this.gapHorizontal = gapHorizontal;
    }

    public void setGapVertical(int gapVertical) {
        this.gapVertical = gapVertical;
    }

    public int calculateMaxCapacity(){
        int map[]= new int[2];
        map[0] = getColumn();
        map[1]= getRow();

        int capacityVertical;
        int capacityHorizontal;
        int capacityTotal;
        capacityVertical = (int)((map[1] - 1)/ (getGapVertical()+1))+1;
        capacityHorizontal= (int)((map[0]-1)/ (getGapHorizontal()+1))+1;
        capacityTotal = capacityHorizontal*capacityVertical;

        return capacityTotal;
    }
}

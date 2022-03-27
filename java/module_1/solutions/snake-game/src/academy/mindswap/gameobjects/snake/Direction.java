package academy.mindswap.gameobjects.snake;

public enum Direction {
    UP(-1, 0),
    DOWN(1, 0),
    LEFT(0, -1),
    RIGHT(0, 1);
    int rowAdd;
    int colAdd;

    Direction( int rowAdd, int colAdd ) {
        this.rowAdd = rowAdd;
        this.colAdd = colAdd;
    }

    public int getRowAdd() {
        return rowAdd;
    }

    public int getColAdd() {
        return colAdd;
    }
}

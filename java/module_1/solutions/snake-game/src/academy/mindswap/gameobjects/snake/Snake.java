package academy.mindswap.gameobjects.snake;

import academy.mindswap.field.Field;
import academy.mindswap.field.Position;
import academy.mindswap.utils.RandomNumbers;

import java.util.LinkedList;
import java.util.Random;
import java.util.stream.IntStream;

public class Snake {

    private final static int SNAKE_INITIAL_SIZE = 3;
    private Direction direction;
    private boolean alive;
    private int bodyLength;
    private final static Position INITIAL_POSITION= new Position(25,10);
    LinkedList<Position>  snakePositions= new LinkedList<>();
    public Snake(){
        alive=true;
        bodyLength=SNAKE_INITIAL_SIZE;
        direction=Direction.values()[RandomNumbers.generateRandom(0,Direction.values().length-1)];
    }

    public void increaseSize() {
        bodyLength++;
        Position position= new Position(getTail().getCol(),getTail().getRow());
        snakePositions.add(position);
    }

    public void move(Direction direction) {
        if(!alive){return;}
        this.direction=direction;
        snakePositions.addFirst(new Position(getHead().getCol() + direction.getColAdd(), getHead().getRow() + direction.getRowAdd()));
        snakePositions.removeLast();
        /*Position previous=null;
        for (Position pos : snakePositions) {
            Position previousTemp=new Position(pos.getCol(),pos.getRow());
            if(previous==null){//head
                previous=new Position(pos.getCol() + direction.getColAdd(),pos.getRow() + direction.getRowAdd());
            }
            pos.setCol(previous.getCol());
            pos.setRow(previous.getRow());
            previous=previousTemp;
        }*/
    }

    public void move(){
        move(direction);
    }

    public void die() {
        alive = false;
    }

    public boolean isAlive() {
        return alive;
    }

    public Position getHead() {
        if(snakePositions.size()==0){
            return INITIAL_POSITION;
        }
        return snakePositions.getFirst();
    }

    public Position getTail() {
        return getFullSnake().getLast();
    }

    public LinkedList<Position> getFullSnake(){
        if(snakePositions.size()>0){
            return snakePositions;
        }
        IntStream.range(0,SNAKE_INITIAL_SIZE)
                .forEach(i -> {

                    snakePositions.
                        add(new Position(
                                INITIAL_POSITION.getCol() + i * (- direction.getColAdd()),
                                INITIAL_POSITION.getRow() + i * (- direction.getRowAdd()))
                        );
                }
                );

        return snakePositions;
    }

    public int getSnakeSize() {
        return bodyLength;
    }

    public boolean isTouchingTail() {
        return getFullSnake().stream()
                .skip(1)
                .anyMatch(p -> p.equals(getHead()));
    }
}


package models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int size;
    private List<List<Cell>> board;

    public Board(int size) {
        this.size = size;
        board = new ArrayList<>();    // [] :- Outer Arraylist

        for (int i = 0; i < size; ++i) {
            board.add(new ArrayList<>());    // [[], [], []] :- Inner Arraylist

            for (int j = 0; j < size; ++j) {
                board.get(i).add(new Cell(i, j));   // [[0 0 0], [0 0 0], [0 0 0]]
            }
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }

    public void printBoard() {
        for (List<Cell> row : board) {
            for (Cell cell : row) {
                cell.display();
            }
            System.out.println();
        }
    }
}

package boardgame;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int columns, int rows) {
        this.columns = columns;
        this.rows = rows;
        pieces = new Piece[rows][columns];
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public Piece piece(int row, int columns) {

    }

    public Piece piece(Position position) {

    }

    public void placePiece(Piece piece, Position position) {

    }

    public removePiece(Position position) {

    }

    public boolean positionExists(Position position) {

    }

    public boolean thereIsAPiece(Position position) {

    }
}

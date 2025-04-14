package com.galactichess;

public abstract class Piece {
    private final boolean white;

    public Piece(boolean white){
        this.white = white;
    }

    public abstract boolean isValidMove(Board board, int startX, int startY, int endX, int endY);
}

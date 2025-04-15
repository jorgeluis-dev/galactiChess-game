package com.galactichess.pieces;

import com.galactichess.Piece;
import com.galactichess.Board;

public class Torre extends Piece {
    public Torre(boolean white) {
        super(white);
    }

    @Override
    public boolean isValidMove(Board board, int startX, int startY, int endX, int endY) {
        // Movimento em linha reta (horizontal ou vertical)
        return (startX == endX || startY == endY) && !board.isPathBlocked(startX, startY, endX, endY);
    }

    @Override
    public String toString() {
        return isWhite() ? "♖" : "♜";
    }
}
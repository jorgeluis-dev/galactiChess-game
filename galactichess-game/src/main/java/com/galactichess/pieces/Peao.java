package com.galactichess.pieces;

import com.galactichess.Piece;
import com.galactichess.Board;

public class Peao extends Piece {
    public Peao(boolean white) {
        super(white);
    }

    @Override
    public boolean isValidMove(Board board, int startX, int startY, int endX, int endY) {
        // Lógica básica do peão (movimento inicial de 2 casas)
        int direction = this.isWhite() ? 1 : -1;
        int deltaY = endY - startY;

        // Movimento simples para frente
        if (endX == startX && deltaY == direction) {
            return board.getPiece(endX, endY) == null;
        }

        // Movimento inicial de 2 casas
        if (endX == startX && deltaY == 2 * direction && (startY == 1 || startY == 6)) {
            return board.getPiece(endX, endY) == null && board.getPiece(endX, endY - direction) == null;
        }

        return false;
    }

    @Override
    public String toString() {
        return isWhite() ? "♙" : "♟";
    }
}


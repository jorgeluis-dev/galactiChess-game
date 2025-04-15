package com.galactichess;

import com.galactichess.pieces.*;

public class Board {
    private Piece[][] squares = new Piece[8][8];

    public Board() {
        initializeBoard();
    }

    private void initializeBoard() {
        // Peões
        for (int i = 0; i < 8; i++) {
            squares[i][1] = new Peao(true);    // Brancos
            squares[i][6] = new Peao(false);   // Pretos
        }

        // Peças brancas
        squares[0][0] = new Torre(true);
        squares[1][0] = new Cavalo(true);
        // ... completar para todas as peças

        // Peças pretas
        squares[0][7] = new Torre(false);
        // ... completar
    }

    public Piece getPiece(int x, int y) {
        return squares[x][y];
    }
}
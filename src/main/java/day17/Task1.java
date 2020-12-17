package day17;

import java.util.Arrays;
import java.util.StringJoiner;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] array = {ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE,
                                ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK};

        for (ChessPiece item : array) {
            System.out.print(item + " ");
        }
    }
}

//содержащий 4 белых пешки и 4 черных ладьи
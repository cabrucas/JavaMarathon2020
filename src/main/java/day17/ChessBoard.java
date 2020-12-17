package day17;

public class ChessBoard {
    private ChessPiece[][] matrix;

    public ChessBoard(ChessPiece[][] matrix) {
        this.matrix = matrix;
    }

    public void print() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}

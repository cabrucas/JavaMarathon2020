package day17;

public enum ChessPiece {
    KING_WHITE(100, "♔"), KING_BLACK(100, "♚"),
    QUEEN_WHITE(9, "♕"), QUEEN_BLACK(9, "♛"),
    ROOK_WHITE(5, "♖"), ROOK_BLACK(5, "♜"),
    BISHOP_WHITE(3, "♗"), BISHOP_BLACK(3, "♝"),
    KNIGHT_WHITE(2, "♘"), KNIGHT_BLACK(2, "♞"),
    PAWN_WHITE(1, "♙"), PAWN_BLACK(1,"♟"),
    EMPTY(-1, "_");

    private int value;
    private String consoleCode;

    ChessPiece(int value, String consoleCode) {
        this.value = value;
        this.consoleCode = consoleCode;
    }

    public int getValue() {
        return value;
    }

    public String getConsoleCode() {
        return consoleCode;
    }

    @Override
    public String toString() {
        return consoleCode;
    }
}

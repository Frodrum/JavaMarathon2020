package day17;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] array = new ChessPiece[8];
        array[0] = ChessPiece.PAWN_WHITE;
        array[1] = ChessPiece.PAWN_WHITE;
        array[2] = ChessPiece.PAWN_WHITE;
        array[3] = ChessPiece.PAWN_WHITE;
        array[4] = ChessPiece.ROOK_BLACK;
        array[5] = ChessPiece.ROOK_BLACK;
        array[6] = ChessPiece.ROOK_BLACK;
        array[7] = ChessPiece.ROOK_BLACK;

        for (ChessPiece chessPiece : array) {
            System.out.print(chessPiece.getImage() + " ");
        }
    }
}
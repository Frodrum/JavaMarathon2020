package day17;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ChessBoard {
    private ChessPiece[][] chessPieces;

    public void print() {
        for (int i = 0; i < chessPieces.length; i++) {
            for (int j = 0; j < chessPieces[i].length; j++) {
                System.out.print(chessPieces[i][j].getImage());
            }
            System.out.println();
        }
    }
}

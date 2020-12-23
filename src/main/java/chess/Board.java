package chess;

public class Board {
    private Pawn[][] pieces;

    public Board() {
        pieces = new Pawn[8][8];
        for (int col = 0; col < 8; col++) {
            for (int row = 0; row < 2; row++) {
                pieces[row][col] = new Pawn(Player.White);
            }

            for (int row = 6; row < 8; row++) {
                pieces[row][col] = new Pawn(Player.Black);
            }
        }
    }


    public Pawn getPiece(Coordinate c) {
        return pieces[c.getRow()][c.getCol()];
    }

    public void setPiece(Coordinate c, Pawn p) {
        pieces[c.getRow()][c.getCol()] = p;
    }

    public void clearCase(Coordinate c) {
        pieces[c.getRow()][c.getCol()] = null;
    }

    /**
     * TODO Change me!
     */
    public Boolean move(Coordinate origin, Coordinate destination) {
        /**
         * To start, you can assume that each piece can only move from lower to higher rows/cols
         * i.e. from row 0 to row 2 but not from row 2 to row 0
         */
        Pawn originPiece = pieces[origin.getRow()][origin.getCol()];

        for (int row = 0; row <= destination.getRow(); row++) {
            for (int col = 0; col < destination.getCol(); col++) {
                // todo: check if there are pieces blocking the path from origin to destination
            }
        }

        setPiece(destination, originPiece);
        clearCase(origin);
        return true;
    }
}

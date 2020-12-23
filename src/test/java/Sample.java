import chess.Board;
import chess.Coordinate;
import org.junit.Assert;
import org.junit.Test;


public class Sample {
    @Test
    public void testMove() {
        Board board = new Board();
        Coordinate origin = new Coordinate(1, 0);
        Coordinate destination = new Coordinate(2, 0);

        Assert.assertNotEquals(board.getPiece(origin), null);
        Assert.assertEquals(board.getPiece(destination), null);

        board.move(origin, destination);
        Assert.assertEquals(board.getPiece(origin), null);
        Assert.assertNotEquals(board.getPiece(destination), null);
    }

    @Test
    public void testInvalidMove() {
        Board board = new Board();
        Coordinate origin = new Coordinate(0, 0);
        Coordinate destination = new Coordinate(2, 0);

        Assert.assertNotEquals(board.getPiece(origin), null);
        Assert.assertEquals(board.getPiece(destination), null);

        board.move(origin, destination); // should return false because the move is invalid
        // TODO: make the following test pass
        // NB: do not change the following lines
        Assert.assertNotEquals(board.getPiece(origin), null);
        Assert.assertEquals(board.getPiece(destination), null);
    }

}

public class Tictactoe {
    private Board board;
    private Player[] players;
    private Turn turn;

    public Tictactoe(){
        board=new Board();
        players=new Player[2];
        players[0]=new Player("x");
        players[1]=new Player("o");
        turn=new Turn();
    }

    void play() {
        while(!board.theresAWin());{


            board.show();
            if(!board.isFull(players[turn.theirTurn()])){
                players[turn.theirTurn()].doTurn(board);
            }
            else {
                players[turn.theirTurn()].moveTurn(board);
            }
        }
        players[turn.notTheirTurn()].celebrate();

    }

}

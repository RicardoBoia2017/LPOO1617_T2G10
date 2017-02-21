
public class Board {
	private char squares[][];
	
	public int CheckNextPosition(int x, int y)
	{
		if(squares[y][x]=='X')
			return 0;
		else if(squares[y][x]==' ')
			return 1;
		else if(squares[y][x]=='k')
			return 2;
		else if (squares[y][x]=='G'||squares[y][x]=='O')
			return -1;
		else if(squares[y][x]=='I')
			return 4;
		else 
			return 3;
	}
	public static Board GenericBoard()
	{
		Board board = new Board(); 
		board.squares = new char[10][10];
		for (int i = 0; i < board.squares.length; i++) {
			for(int j = 0; j < board.squares.length; j++){
					board.squares[i][j]=' ';
				}
		}
		for (int i = 0; i < board.squares.length; i++) {
			if (i==0 || i ==9)
				for(int j = 0; j < board.squares.length; j++){
					board.squares[i][j]='X';
				}
			else{
				board.squares[i][0]='X';
				board.squares[i][9]='X';
			}
		}
		return board;
	}
	
	
	public static Board GuardBoard()
	{
		Board board = GenericBoard();
		board.squares[2][1]='X';
		board.squares[2][2]='X';
		board.squares[4][1]='X';
		board.squares[4][2]='X';
		board.squares[7][1]='X';
		board.squares[7][2]='X';
		board.squares[2][4]='X';
		board.squares[2][5]='X';
		board.squares[2][6]='X';
		board.squares[4][4]='X';
		board.squares[4][5]='X';
		board.squares[4][6]='X';
		board.squares[1][6]='X';
		board.squares[3][6]='X';
		board.squares[7][4]='X';
		board.squares[7][5]='X';
		board.squares[7][6]='X';
		board.squares[7][7]='X';
		board.squares[8][6]='X';
		board.squares[5][0] = 'I';
		board.squares[6][0] = 'I';
		board.squares[1][4] = 'I';
		board.squares[3][2] = 'I';
		board.squares[3][4] = 'I';
		board.squares[8][2] = 'I';
		board.squares[8][4] = 'I';
		board.squares[8][7] = 'k';
		return board;
	}
	
	public static Board OgreBoard()
	{
		Board board = GenericBoard();
		board.squares[1][8] = 'k';
		board.squares[1][0] = 'I';
		return board;
	}
	public int getLength() {
		return squares.length;
	}
	public char getSquare(int i, int j) {
		return squares[i][j];
	}
	public void openDoor(int level) {
		if(level == 1){
			squares[5][0] = 'S';
			squares[6][0] = 'S';
		}
		else
			squares[1][0] = 'S';
	}
}

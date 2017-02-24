
public class Board {
	private char squares[][];
	private static int keyX, keyY ;

	public int checkNextPosition(int x, int y)
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
	public static Board genericBoard()
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
	
	
	public static Board guardBoard()
	{
		Board board = genericBoard();
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
		board.squares[1][4] = 'I';
		board.squares[3][2] = 'I';
		board.squares[3][4] = 'I';
		board.squares[8][2] = 'I';
		board.squares[8][4] = 'I';
		board.squares[8][7] = 'k';
		board.squares[5][0] = 'I';
		board.squares[6][0] = 'I';
		board.keyX = 7;
		board.keyY = 8;
			
		return board;
	}
	
	public static Board ogreBoard()
	{
		Board board = genericBoard();
		board.squares[1][8] = 'k';
		board.squares[1][0] = 'I';
		board.keyX = 8;
		board.keyY = 1;

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
	public void printBoard(Board board, Hero hero, Guard guard, Ogre ogre) {
		if(hero.chekHeroAsKey())
			board.squares[board.getKeyY()][board.getKeyX()] = ' ';

		board.squares[hero.getPositionY()][hero.getPositionX()] = hero.getSymbol();
		if(guard != null){
			board.squares[guard.getPositionY()][guard.getPositionX()] = guard.getSymbol();
		}
		if(ogre != null){
			board.squares[ogre.getPositionY()][ogre.getPositionX()] = ogre.getSymbol();
			board.squares[ogre.getWeaponPositionY()][ogre.getWeaponPositionX()] = ogre.getWeaponSymbol();
		}
		
		for (int i = 0; i < board.getLength(); i++) {
			for (int j = 0; j < board.getLength(); j++) {
				System.out.print(board.getSquare(i, j));

			}
			System.out.println();
		}

	}
	private int getKeyY() {
		return keyY;
	}
	private int getKeyX() {
		return keyX;
	}

}

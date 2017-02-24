import java.util.Scanner;

public class Game {
	private static Board board;	
	private static Hero hero;	
	private static Guard guard;
	private static Ogre ogre;
	
	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		board = Board.guardBoard();
		hero = new Hero(1,1);
		guard = new Guard(8,1);
		board.printBoard(board,hero,guard,null);
		do {
			board = Board.guardBoard();

			char pos = p.next().charAt(0);
			switch (pos) {
			case 'w':
				hero.move(0, -1, board, 1);
				break;
			case 's':
				hero.move(0, 1, board, 1);
				break;
			case 'd':
				hero.move(1, 0, board, 1);
				break;
			case 'a':
				hero.move(-1, 0, board, 1);
				break;
			}
			guard.move();
			board.printBoard(board,hero,guard,null);
		} while (board.getSquare(5, 0) != 'H' && board.getSquare(6, 0) != 'H' && board.getSquare(hero.getPositionY(), hero.getPositionX()+1) != 'G' && board.getSquare(hero.getPositionY()-1, hero.getPositionX()) != 'G'
				&& board.getSquare(hero.getPositionY(), hero.getPositionX()-1) != 'G' && board.getSquare(hero.getPositionY()+1, hero.getPositionX()) != 'G' && (hero.getPositionX()!=guard.getPositionX() || hero.getPositionY()!=guard.getPositionY()));
		if (board.getSquare(5, 0)== 'H' || board.getSquare(6, 0) == 'H')
			OgreLevel(p);

		else
			System.out.println("Game Over");
		p.close();
	}

	public static void OgreLevel(Scanner p) {
		hero = new Hero(1,8);
		ogre = new Ogre(5,1);
		board = Board.ogreBoard(); 
		board.printBoard(board,hero,null,ogre);
		do {

			board = Board.ogreBoard();

			char pos = p.next().charAt(0);

			switch (pos) {
			case 'w':
				hero.move(0, -1, board, 1);
				break;
			case 's':
				hero.move(0, 1, board, 1);
				break;
			case 'd':
				hero.move(1, 0, board, 1);
				break;
			case 'a':
				hero.move(-1, 0, board, 1);
				break;
			}

			ogre.move(board);
			ogre.attack(board);
			board.printBoard(board,hero,null,ogre);
		}while (board.getSquare(1, 0) != 'H' && board.getSquare(hero.getPositionY(), hero.getPositionX()+1) != 'O' && board.getSquare(hero.getPositionY()-1, hero.getPositionX()) != 'O'
				&& board.getSquare(hero.getPositionY(), hero.getPositionX()-1) != 'O' && board.getSquare(hero.getPositionY()+1, hero.getPositionX()) != 'O' && (hero.getPositionX()!=ogre.getPositionX() || hero.getPositionY()!=ogre.getPositionY()));
		if (board.getSquare(1, 0)== 'H')
			System.out.println("Victory");
		else
			System.out.println("Game Over");

	}
}

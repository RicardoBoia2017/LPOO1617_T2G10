import java.util.Scanner;

public class Game {
	private static Board board;	
	private static Hero hero;	
	private static Guard guard;
	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		board = Board.GuardBoard();
		hero = new Hero(1,1);
		guard = new Guard(8,1);
		do {
			for (int i = 0; i < board.getLength(); i++) {
				for (int j = 0; j < board.getLength(); j++) {
					System.out.print(board.getSquare(i, j));

				}
				System.out.println();
			}
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
		} while (board.getSquare(5, 0) != 'H' && board.getSquare(6, 0) != 'H' && board.getSquare(hero.GetPositionY(), hero.GetPositionX()+1) != 'G' && board.getSquare(hero.GetPositionY()-1, hero.GetPositionX()) != 'G'
				&& board.getSquare(hero.GetPositionY(), hero.GetPositionX()-1) != 'G' && board.getSquare(hero.GetPositionY()+1, hero.GetPositionX()) != 'G' && (hero.GetPositionX()!=guard.GetPositionX()&&hero.GetPositionY()!=guard.GetPositionY()));
		if (board.getSquare(5, 0)== 'H' || board.getSquare(6, 0) == 'H')
//			OgreLevel(p);
			System.out.println("Game V");

		else
			System.out.println("Game Over");
		p.close();
	}

//	public static void OgreLevel(Scanner p) {
//		int y = 8, x = 1, ox = 4, oy = 1;
//		char board[][] = OgreBoard();
//		Ogre 
//		do {
//			for (int i = 0; i < board.length; i++) {
//				for (int j = 0; j < board[i].length; j++) {
//					System.out.print(board[i][j]);
//
//				}
//				System.out.println();
//			}
//			char pos = p.next().charAt(0);
//			switch (pos) {
//			case 'w':
//				if (CheckNextPosition(x,y-1,board) == 1) {
//					if(board[y][x]=='K'){
//						board[y][x] = ' ';
//						y = y - 1;
//						board[y][x] = 'K';
//					}
//					else {
//						board[y][x] = ' ';
//						y = y - 1;
//						board[y][x] = 'H';
//					}
//				} else if (CheckNextPosition(x,y-1,board) == 2) {
//					board[y][x] = ' ';
//					y = y - 1;
//					board[y][x] = 'K';
//				}
//				break;
//			case 's':
//				if (CheckNextPosition(x,y+1,board) == 1) {
//					if(board[y][x]=='K'){
//						board[y][x] = ' ';
//						y = y + 1;
//						board[y][x] = 'K';
//					}
//					else {
//						board[y][x] = ' ';
//						y = y + 1;
//						board[y][x] = 'H';
//					}
//				}
//				break;
//			case 'd':
//				if (CheckNextPosition(x+1,y,board) == 1) {
//					if(board[y][x]=='K'){
//						board[y][x] = ' ';
//						x = x + 1;
//						board[y][x] = 'K';
//					}
//					else {
//						board[y][x] = ' ';
//						x = x + 1;
//						board[y][x] = 'H';
//					}
//				} else if (CheckNextPosition(x+1,y,board) == 2) {
//					board[y][x] = ' ';
//					x = x + 1;
//					board[y][x] = 'K';
//				}
//				break;
//			case 'a':
//				if (CheckNextPosition(x-1,y,board) == 1) {
//					if(board[y][x]=='K'){
//						board[y][x] = ' ';
//						x = x - 1;
//						board[y][x] = 'K';
//					}
//					else {
//						board[y][x] = ' ';
//						x = x - 1;
//						board[y][x] = 'H';
//					}
//				} else if (CheckNextPosition(x-1,y,board) == 4 && board[y][x] == 'K') {
//					board[y][x - 1] = 'S';
//				} else if (CheckNextPosition(x-1,y,board) == 3) {
//					board[y][x] = ' ';
//					x = x - 1;
//					board[y][x] = 'K';
//				}break;
//			}
//			int tmpox = ox, tmpoy = oy;
//			do {
//				int Ogrepos = 0 + (int) (Math.random() * 3);
//				switch (Ogrepos) {
//				case 0:// w
//					if (CheckNextPosition(x,y-1,board) == 1) {
//						board[oy][ox] = ' ';
//						oy = oy - 1;
//						board[oy][ox] = 'O';
//					} else if (CheckNextPosition(x,y-1,board) == 2) {
//						board[oy][ox] = ' ';
//						oy = oy - 1;
//						board[oy][ox] = '$';
//					}
//					break;
//				case 1:// s
//					if (CheckNextPosition(x,y+1,board) == 1) {
//						board[oy][ox] = ' ';
//						oy = oy + 1;
//						board[oy][ox] = 'O';
//					}
//					if (oy == 2 && ox == 8) {
//						if (board[y][x] != 'K')
//							board[oy - 1][ox] = 'k';
//					}
//					break;
//				case 2:// d
//					if (CheckNextPosition(x+1,y,board) == 1) {
//						board[oy][ox] = ' ';
//						ox = ox + 1;
//						board[oy][ox] = 'O';
//					} else if (CheckNextPosition(x+1,y,board) == 2) {
//						board[oy][ox] = ' ';
//						ox = ox + 1;
//						board[oy][ox] = '$';
//					}
//					break;
//				case 3:// a
//					if (CheckNextPosition(x-1,y,board) == 1) {
//						board[oy][ox] = ' ';
//						ox = ox - 1;
//						board[oy][ox] = 'O';
//					}
//					if (oy == 1 && ox == 7) {
//						board[oy][ox + 1] = 'k';
//					}
//					break;
//				}
//			} while (oy == tmpoy && ox == tmpox);// verifica se o ogre fica
//													// no mesmo sitio
//		} while (board[1][0] != 'K' && board[y][x + 1] != 'O' && board[y - 1][x] != 'O' && board[y][x - 1] != 'O'
//				&& board[y + 1][x] != 'O' && board[y][x] != board[oy][ox]);
//		if (board[1][0] == 'K')
//			System.out.println("Victory");
//		else
//			System.out.println("Game Over");
//	}
}

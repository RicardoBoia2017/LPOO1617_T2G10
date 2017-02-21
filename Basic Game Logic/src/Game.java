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
=======
	
	public static void OgreLevel()
	{
		Scanner p = new Scanner(System.in);
		int y=8, x=1,ox=4,oy=1;
		char board[][]=new char[10][10];
		for(int i=0;i<board.length;i++)
		{
			for(int j=0;j<board.length;j++) 
				board[i][j] = ' ';
			if (i==0||i==9)
			{
				for(int j=0;j<board[i].length;j++)
				{
				board[i][j]='X';
				}
			}
			else 
			{
				board[i][1]='X';
				board[i][9]='X';
			}
		}
		board[1][0]='I';
		board[1][4]='O';
		board[1][8]='k';
		board[8][1]='H';
		do
		{
			for(int i=0;i<board.length;i++)
			{
				for(int j=0;j<board[i].length;j++)
				{
					System.out.print(board[i][j]);
					
				}
				System.out.println();
			}
			char pos = p.next().charAt(0);
			switch(pos)
			{
			case 'w':
				if(board[y-1][x]==' ')
				{
					board[y][x]=' ';
					y=y-1;
					board[y][x]='H';
				}
				else if(board[y][x-1]=='k')
				{
					board[y][x]=' ';
					x=x-1;
					board[y][x]='K';
				}
				break;
			case 's':
				if(board[y+1][x]==' ')
				{
					board[y][x]=' ';
					y=y+1;
					board[y][x]='H';
				}
				break;
			case 'd':
				if(board[y][x+1] == ' ')
				{
					board[y][x]=' ';
					x = x + 1;
					board[y][x]='H';
				}
				else if(board[y][x-1]=='k')
				{
					board[y][x]=' ';
					x=x-1;
					board[y][x]='K';
				}
				break;
			case 'a':
				if(board[y][x-1]==' ')
				{
					board[y][x]=' ';
					x=x-1;
					board[y][x]='H';
				}
				else if(board[y][x-1]=='I'&&board[y][x]=='K')
				{
					board[y][x-1]='S';
				}
				else if(board[y][x-1]=='S')
				{
					board[y][x]=' ';
					x=x-1;
					board[y][x]='H';
				}
			do
			{	
				Random ran = new Random();
				int Ogrepos = ran.nextInt(4);
				int tmpox=ox,tmpoy=oy//posição do ogre
				switch(Ogrepos)
				case 0://w
					if(board[oy-1][ox]==' ')
					{
						board[oy][ox]=' ';
						oy=oy-1;
						board[oy][ox]='O';
					}
					else if(board[oy][ox-1]=='k')
					{
						board[oy][ox]=' ';
						ox=ox-1;
						board[oy][ox]='$';
					}
					break;
				case 1://s
					if(board[oy+1][ox]==' ')
					{
						board[oy][ox]=' ';
						oy=oy+1;
						board[oy][ox]='O';
					}if(oy=2&&ox=8)
					{
						board[oy-1][ox]='k';
					}
					break;
				case 2://d
					if(board[oy][ox+1] == ' ')
					{
						board[oy][ox]=' ';
						ox = ox + 1;
						board[oy][ox]='O';
					}
					else if(board[oy][ox-1]=='k')
					{
						board[oy][ox]= ' ';
						ox = ox-1;
						board[oy][ox] = '$';
					}
					break;
				case 3://a
					if(board[oy][ox-1]==' ')
					{
						board[oy][ox]=' ';
						ox=ox-1;
						board[oy][ox]='O';
					}
					if(oy=1&&ox=7)
					{
						board[oy][ox+1]='k';
					}
					break;
			}
			while(oy==tmpoy&&ox==tmpox)//verifica se o ogre fica no mesmo sitio
		}while(board[1][0]!='H'&&board[y][x+1]!='O'&&board[y-1][x]!='O'&&board[y][x-1]!='O'&&board[y+1][x]!='O' && board[y][x]!=board[oy][ox]));
		if(board[1][0]=='H')
			System.out.print("Victory");
		if(board[y][x+1]=='O'||board[y-1][x]=='O'||board[y][x-1]=='O'||board[y+1][x]=='O' || board[y][x]==board[oy][ox])
			System.out.print("Game Over");
	}
>>>>>>> branch 'master' of https://github.com/RicardoBoia2017/LPOO1617_T2G10
}

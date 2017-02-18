import java.util.Scanner;
public class Game {

	public static void main(String[] args) {
		/*Scanner p = new Scanner(System.in);
		int y=1, x=1, gx=8, gy=1;
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
			if(i==1 || i==2 || i==3 || i==4 || i==7 || i==8)
			{
				board[i][0]='X';
				board[i][9]='X';
				board[i][6]='X';
			}
			if(i==2 || i==4 || i==7)
			{
				board[i][1]='X';
				board[i][2]='X';
				board[i][4]='X';
				board[i][5]='X';
			}
			if (i==7)
			{
				board[i][7]='X';
			}
			if (i==5 || i==6)
			{
				board[i][9]='X';
			}
		}
		board[5][0]='I';
		board[6][0]='I';
		board[1][4]='I';
		board[3][2]='I';
		board[3][4]='I';
		board[8][2]='I';
		board[8][4]='I';
		board[1][1]='H';
		board[1][8]='G';
		board[8][7]='K';
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
				break;
			case 'a':
				if(board[y][x-1]==' ')
				{
					board[y][x]=' ';
					x=x-1;
					board[y][x]='H';
				}
				else if(board[y][x-1]=='K')
				{
					board[y][x]=' ';
					x=x-1;
					board[y][x]='H';
					board[5][0]='S';
					board[6][0]='S';
				}
				else if(board[y][x-1]=='S')
				{
					board[y][x]=' ';
					x=x-1;
					board[y][x]='H';
				}
			}
			if((gx==8 && gy==1) || (gx==7 && gy==5) || (gx==6 && gy==5) || (gx==5 && gy==5) || (gx==4 && gy==5) || (gx==3 && gy==5) || (gx==2 && gy==5)){
				board[gy][gx]=' ';
				gx=gx-1;
				board[gy][gx]='G';
			}
			else if((gx==7 && gy==1) || (gx==7 && gy==4) || (gx==7 && gy==2) || (gx==7 && gy==3) || (gx==1 && gy==5)){
				board[gy][gx]=' ';
				gy=gy+1;
				board[gy][gx]='G';
			}
			else if((gx==8 && gy==6) || (gx==8 && gy==5) || (gx==8 && gy==4) || (gx==8 && gy==3) || (gx==8 && gy==2)){
				board[gy][gx]=' ';
				gy=gy-1;
				board[gy][gx]='G';
			}
			else if((gx==1 && gy==6) || (gx==2 && gy==6) || (gx==3 && gy==6) || (gx==4 && gy==6) || (gx==5 && gy==6) || (gx==6 && gy==6) || (gx==7 && gy==6)){
				board[gy][gx]=' ';
				gx=gx+1;
				board[gy][gx]='G';
			}
		}while(board[5][0]!='H'&&board[6][0]!='H'&&board[y][x+1]!='G'&&board[y-1][x]!='G'&&board[y][x-1]!='G'&&board[y+1][x]!='G' && board[y][x]!=board[gy][gx]);
		if(board[5][0]=='H'||board[6][0]=='H')
			System.out.print("Victory");
		if(board[y][x+1]=='G'||board[y-1][x]=='G'||board[y][x-1]=='G'||board[y+1][x]=='G' || board[y][x]==board[gy][gx])
			System.out.print("Game Over");
		p.close();*/
		OgreLevel();
	}
	
	public static void OgreLevel()
	{
		int y=8, x=1;
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
		}while(false);
	}
}

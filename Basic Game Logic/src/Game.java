import java.util.Scanner;
public class Game {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		int p1=1,p2=1;
		char board[][]=new char[10][10];
		for(int i=0;i<board.length;i++)
		{
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
				if(board[p1-1][p2]==' ')
				{
					board[p1][p2]=' ';
					p1=p1-1;
					board[p1][p2]='H';
				}
				break;
			case 's':
				if(board[p1+1][p2]==' ')
				{
					board[p1][p2]=' ';
					p1=p1+1;
					board[p1][p2]='H';
				}
				break;
			case 'd':
				if(board[p1][p2+1]==' ')
				{
					board[p1][p2]=' ';
					p2=p2+1;
					board[p1][p2]='H';
				}
				break;
			case 'a':
				if(board[p1][p2-1]==' ')
				{
					board[p1][p2]=' ';
					p2=p2-1;
					board[p1][p2]='H';
				}
				else if(board[p1][p2-1]=='K')
				{
					board[p1][p2]=' ';
					p2=p2-1;
					board[p1][p2]='H';
					board[5][0]='S';
					board[6][0]='S';
				}
				else if(board[p1][p2-1]=='S')
				{
					board[p1][p2]=' ';
					p2=p2-1;
					board[p1][p2]='H';
				}
			}
		}while(board[5][0]!='H'||board[6][0]!='H'||board[p1][p2+1]=='G'||board[p1-1][p2]=='G');
		p.close();
	}

}

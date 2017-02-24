
public class Hero extends MobileEntity {
	private char symbol;
	private boolean asKey;
	public Hero(int x, int y) {
		super(x,y);
		symbol = 'H';
		asKey = false;
	}
	public void move(int dx, int dy, Board board, int level) {
		if(asKey && level == 1){
			board.openDoor(1);
		}
		if (board.checkNextPosition(x + dx, y + dy) == 1){
			x += dx;
			y += dy;
		}
		else if (board.checkNextPosition(x + dx, y + dy) == 2){
			x += dx;
			y += dy;
			asKey = true;
			if (level == 2){
				symbol='K';
			}
			else
				board.openDoor(1);
		}
		else if (board.checkNextPosition(x + dx, y + dy) == 3){
			x += dx;
			y += dy;
		}
		else if (board.checkNextPosition(x + dx, y + dy) == 4 && level == 2){
			board.openDoor(2);
		}
	}
	public char getSymbol() {
		return symbol;
	}
	public boolean chekHeroAsKey() {
		return asKey;
	}
	
}

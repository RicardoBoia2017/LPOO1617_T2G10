
public class Hero extends MobileEntity {
	private char symbol;
	public Hero(int x, int y) {
		super(x,y);
		symbol = 'H';
	}
	public void move(int dx, int dy, Board board, int level) {
		if (board.CheckNextPosition(this.x + dx, this.y + dy) == 1){
			this.x += dx;
			this.y += dy;
		}
		else if (board.CheckNextPosition(this.x + dx, this.y + dy) == 2){
			this.x += dx;
			this.y += dy;
			if (level == 2){
				this.symbol='K';
			}
			else
				board.openDoor(1);
		}
		else if (board.CheckNextPosition(this.x + dx, this.y + dy) == 3){
			this.x += dx;
			this.y += dy;
		}
		else if (board.CheckNextPosition(this.x + dx, this.y + dy) == 4 && level == 2){
			board.openDoor(2);
		}
	}
	
}

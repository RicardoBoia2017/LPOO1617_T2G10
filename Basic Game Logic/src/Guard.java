
public class Guard extends MobileEntity {
	private char symbol;

	public Guard(int x, int y) {
		super(x, y);
		symbol='G';
	}
	public void move()
	{
		if ((x == 8 && y == 1) || (x == 7 && y == 5) || (x == 6 && y == 5) || (x == 5 && y == 5)
				|| (x == 4 && y == 5) || (x == 3 && y == 5) || (x == 2 && y == 5)) {
			x = x - 1;
		} else if ((x == 7 && y == 1) || (x == 7 && y == 4) || (x == 7 && y == 2) || (x == 7 && y == 3)
				|| (x == 1 && y == 5)) {
			y = y + 1;
		} else if ((x == 8 && y == 6) || (x == 8 && y == 5) || (x == 8 && y == 4) || (x == 8 && y == 3)
				|| (x == 8 && y == 2)) {
			y = y - 1;
		} else if ((x == 1 && y == 6) || (x == 2 && y == 6) || (x == 3 && y == 6) || (x == 4 && y == 6)
				|| (x == 5 && y == 6) || (x == 6 && y == 6) || (x == 7 && y == 6)) {
			x = x + 1;
		}
	}
}

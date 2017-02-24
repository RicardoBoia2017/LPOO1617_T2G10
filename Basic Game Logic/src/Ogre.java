
public class Ogre extends MobileEntity {
	private char symbol;
	private int weaponY;
	private int weaponX;
	private char weaponSymbol;
	public Ogre(int x, int y) {
		super(x, y);
		symbol='O';
		weaponSymbol = '*';
		weaponX = x + 1;
		weaponY = y;
	}
	public char getSymbol() {
		return symbol;
	}
	public void move(Board board) {
		int tmpox = x, tmpoy = y, dx = 0, dy = 0;
		symbol = 'O';
		do {
			int Ogrepos = 0 + (int) (Math.random() * 3);
			switch (Ogrepos) {
			case 0:// w
				dy = -1;
				break;
			case 1:// s
				dy = 1;
				break;
			case 2:// d
				dx = 1;
				break;
			case 3:// a
				dx = -1;
				break;
			}
			if (board.checkNextPosition(x + dx, y + dy) == 1){
				x += dx;
				y += dy;
			}
			else if (board.checkNextPosition(x + dx, y + dy) == 2){
				x += dx;
				y += dy;
				symbol = '$';
			}
		} while (y == tmpoy && x == tmpox);// verifica se o ogre fica no mesmo sitio		
	}
	public void attack(Board board) {
		weaponX = x;
		weaponY = y;
		int tmpox = weaponX, tmpoy = weaponY, dx = 0, dy = 0;
		weaponSymbol = '*';
		do {
			int weaponPos = 0 + (int) (Math.random() * 3);
			switch (weaponPos) {
			case 0:// w
				dy = -1;
				break;
			case 1:// s
				dy = 1;
				break;
			case 2:// d
				dx = 1;
				break;
			case 3:// a
				dx = -1;
				break;
			}
			if (board.checkNextPosition(weaponX + dx, weaponY + dy) == 1){
				weaponX += dx;
				weaponY += dy;
			}
			else if (board.checkNextPosition(weaponX + dx, weaponY + dy) == 2){
				weaponX += dx;
				weaponY += dy;
				weaponSymbol = '$';
			}
		} while (weaponY == tmpoy && weaponX == tmpox);		
	}
	public int getWeaponPositionY() {
		return weaponY;
	}
	public int getWeaponPositionX() {
		return weaponX;
	}
	public char getWeaponSymbol() {
		return weaponSymbol;
	}

}

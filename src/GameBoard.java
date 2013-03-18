import java.util.Scanner;


public class GameBoard {
	public static void main(String[] args) {
		GameBoard game = new GameBoard();
		game.start();
	}
	
	public void start() {
		Scanner scan = new Scanner(System.in);

		StringParser parser = new StringParser();
		
		// While solange durchlaufen wie es einen Fehler bei split(input) gibt
		while(true) {
			String input = scan.nextLine();
			
			try {
				parser.split(input); //gibt RuntimeException, falls eingabe nicht korrekt ist
				break; //Abbruch, wenn Eingabe korrekt
			}
			catch(RuntimeException e) {
				//Wird aufgerufen, wenn parser.split(input) einen Fehler gibt
				System.out.println("Falsche Eingabe!");
			}
		}
			
		//Richtung und Anzahl Bewegungen aus dem parser objekt holen
		//Wurde vorher gespeichert in parser.split(input).
		Direction direction = parser.getDirection();
		int moves = parser.getMoves();
		
		System.out.println(direction);
		System.out.println(moves);
	}

	String[][] board;
	
	public GameBoard() {
		board = new String[100][100];
	}
}

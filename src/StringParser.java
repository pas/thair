


public class StringParser {

	Direction direction;
	int moves;

	/**
	 * Trennt einen String in seine Bestandteile.
	 * Gibt Fehlermeldungen falls es sich nicht
	 * um einen korrekten String handelt:
	 * 
	 * "R1" => korrekt
	 * "R" => falsch
	 * "R100" => korrekt
	 * "L5L" => falsch
	 * 
	 * @author Thair
	 *
	 */
	
	public void split(String input) {
		if (input == null || input.length() == 1 || input.length() > 4) {
			throw new RuntimeException();
		}
		
		//Erster Charakter des Strings auslesen und in directionString speichern
		String directionString = input.substring(0, 1);
		//Zweiter bis letzer Charakter des Strings auslesen und in movesString speichern
		String movesString = input.substring(1, input.length());
		
		//String in character umwandeln
		char directionCharacter = directionString.charAt(0);
		
		// Testen, ob Richtung "R", "L", "U" oder "O" ist. Ansonsten
		// einen Fehler ausgeben.
		if (directionString.equals("R") || directionString.equals("L") || directionString.equals("U") 
				|| directionString.equals("O")) {
			//direction als Enumeration in Instanzvariable speichern
			switch (directionCharacter) {
				case 'R':
					direction = Direction.RECHTS;
					break;
				case 'L':
					direction = Direction.LINKS;
					break;
				case 'O':
					direction = Direction.OBEN;
					break;
				case 'U':
					direction = Direction.UNTEN;
					break;
			}
		}
		else {
			throw new RuntimeException();
		}
		
		int moves;
		
		// Versuche String to Integer umzuwandeln, falls
		// es nicht funktioniert wird ein Fehler
		// geworfen.
		try {
			moves = Integer.parseInt(movesString);
		}
		catch(NumberFormatException e) {
			throw new RuntimeException();
		}
		
		if(moves == 0 || moves > 100) {
			throw new RuntimeException();
		}
		
		//moves in Instanzvariable speichern
		this.moves = moves;
	}

	public Direction getDirection() {
		return direction;
	}
	
	public int getMoves() {
		return moves;
	}

}

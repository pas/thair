import static org.junit.Assert.*;

import org.junit.Test;


public class StringParserTest {

	@Test(expected=RuntimeException.class)
	public void shouldNotAcceptNull() {
		StringParser parser = new StringParser();
		parser.split(null);
	}
	
	@Test(expected=RuntimeException.class)
	public void shouldNotAcceptSingleCharacter() {
		StringParser parser = new StringParser();
		parser.split("R");
	}

	@Test(expected=RuntimeException.class)
	public void shouldNotAcceptMoreThanFourCharacters() {
		StringParser parser = new StringParser();
		parser.split("R1000");
	}
}

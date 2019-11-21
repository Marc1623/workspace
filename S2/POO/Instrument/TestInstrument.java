package Instrument;

public class TestInstrument {

	
	public static void main(String[] args) {
		
		Wind flute = new Wind();
		Stringed violin = new Stringed();
		Brass frenchHorn = new Brass();
		
		
		int Instrument = 1;
		
		i=flute;
		i.play();
		i=violin;
		i.play();
		i=frenchHorn;
		i.play();
	}

}

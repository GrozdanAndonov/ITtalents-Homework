package MusicalInstrument.stringed;

import MusicalInstrument.MusicalInstrument;
import enums.TypeInstrument;

public abstract class Stringed extends MusicalInstrument{

	protected Stringed(String name, double price, int quantity) {
		super(name, price, quantity);
		super.type = TypeInstrument.STRINGED;
	}

}

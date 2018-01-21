package MusicalInstrument.keyboard;

import MusicalInstrument.MusicalInstrument;
import enums.TypeInstrument;

public abstract class Keyboard extends MusicalInstrument {

	protected Keyboard(String name, double price, int quantity) {
		super(name, price, quantity);
		super.type = TypeInstrument.KEYBOARD;
	}

}

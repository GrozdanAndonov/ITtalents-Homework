package MusicalInstrument.electric;

import MusicalInstrument.MusicalInstrument;
import enums.TypeInstrument;

public abstract class Electric extends MusicalInstrument {

	protected Electric(String name, double price, int quantity) {
		super(name, price, quantity);
		super.type = TypeInstrument.ELECTRIC;
	}

}

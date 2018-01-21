package MusicalInstrument.Blown;

import MusicalInstrument.MusicalInstrument;
import enums.TypeInstrument;

public abstract class Blown extends MusicalInstrument{

	protected Blown(String name, double price, int quantity) {
		super(name, price, quantity);
		super.type = TypeInstrument.BLOWN;
	}

}

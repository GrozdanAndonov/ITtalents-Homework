package MusicalInstrument.Percussion;

import MusicalInstrument.MusicalInstrument;
import enums.TypeInstrument;

public abstract class Percussion extends MusicalInstrument{

	protected Percussion(String name, double price, int quantity) {
		super(name, price, quantity);
		super.type = TypeInstrument.PERCUSSION;
	}

}

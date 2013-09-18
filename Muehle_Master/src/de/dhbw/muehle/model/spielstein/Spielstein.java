package de.dhbw.muehle.model.spielstein;

import java.awt.Image;

import javax.swing.ImageIcon;





public class Spielstein implements ISpielstein{
	
	Position position;
	Image spielstein;
	ESpielsteinFarbe farbe;
	
	
	public Spielstein(EPositionIndex ebene,EPositionIndex x,EPositionIndex y,ESpielsteinFarbe farbe){
		
		position = new Position(ebene, x, y);
		this.farbe = farbe;
	}
	
	
	@Override
	public ESpielsteinFarbe getFarbe() {
		
		return farbe;
	}

	@Override
	public Position getPosition() {
		
		return position;
		
	}

}
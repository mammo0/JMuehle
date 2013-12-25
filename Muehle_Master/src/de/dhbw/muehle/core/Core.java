package de.dhbw.muehle.core;

import de.dhbw.muehle.gui.ViewController;
import de.dhbw.muehle.gui.menus.GamePanel.LblGameStone;
import de.dhbw.muehle.model.theme.Sound.Sounds;


/**
 * Die Coreklasse dient als zentrale Fuktionseinheit des
 * Programmes. Hier werden alle GUI Elemente initalisiert und die
 * meisten Funktionen des Programmes bereitgestellt
 * @author Kreistschen
 */
public class Core {

	private ViewController vController;
	
	private CorePvE cPvE;
	private CorePvP cPvP;
	
	private String spielModus;
	
	
	public static String PvE="PvE",
						 PvP="PvP";

	
	/**
	 * Konstruktor
	 */
	public Core(){
		// ViewController initialisieren
		vController = new ViewController(this);
		
		// einzelne Spilemodi initialisieren
		cPvE = new CorePvE();
		cPvP = new CorePvP();
	}

	// TODO Log + Datenbank
	// private void run() {
	// Log.log("run() ohne Fehler gestartet", getClass().getSimpleName());
	// }

	/**
	 * Zentrale Methode zur initalisierung der GUI und allen weiteren Fenstern.
	 */
	public void initGame(){
		vController.initGui();
	}
	
	
	/**
	 * Startet das Spiel im Einzelspielermodus.
	 */
	public void startPvE(){
		// Wenn bereits eine PvE-Sitzung läuft diese fortsetzen, andernfalls eine neue starten
		if(!isPvE())
			resetAll();
		
		vController.starteSpiel();
		
		spielModus = PvE;
	}
	
	/**
	 * Startet das Spiel im Mehrspielermodus.
	 */
	public void startPvP(){
		// Wenn bereits eine PvP-Sitzung läuft diese fortsetzen, andernfalls eine neue starten
		if(!isPvP())
			resetAll();
		
		vController.starteSpiel();
				
		spielModus = PvP;
	}
	
	
	/**
	 * Diese Methode leitet alle weiteren Schritte ein, wenn ein Label auf dem
	 * Spielbrett angeklickt wurde.
	 * 
	 * @param label
	 */
	public void labelClicked(LblGameStone label){
		
	}
	
	
	
	/**
	 * Gibt zurück, ob es sich das Spiel aktuell im Einzelspielermodus befindet.
	 * @return {@link Boolean}
	 */
	public boolean isPvE(){
		if(spielModus == PvE)
			return true;
		else
			return false;
	}
	
	/**
	 * Gibt zurück, ob es sich das Spiel aktuell im Mehrspielermodus befindet.
	 * @return {@link Boolean}
	 */
	public boolean isPvP(){
		if(spielModus == PvP)
			return true;
		else
			return false;
	}
	
	/**
	 * Gibt den aktuellen Spielmodus zurück.
	 * @return PvE / PvP
	 */
	public String getSpielModus(){
		return spielModus;
	}
	
	
	
	/**
	 *  Setzt das Spiel auf Anfang zurück.
	 */
	public void resetAll() {
		// TODO Reset Game
		
	}
}
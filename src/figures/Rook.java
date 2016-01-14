package figures;
import javafx.geometry.Point2D;


public class Rook extends Figure {
	
	private Boolean rochade;
	
	/**
	 * Rochade ist am Anfang true. Dieser Wert wird dann in der 
	 * move-Methode geaendert.
	 * @param sP Startposition der Figur
	 * @param iW Teamfarbe
	 */
	public Rook(Boolean iW, Point2D sP){
		super(sP, iW, "Figurenbilder/Rook_", "Rook");
		setRochade(true);
	}

	public Boolean getRochade() {
		return rochade;
	}

	public void setRochade(Boolean r) {
		rochade = r;
	}
}

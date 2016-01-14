package figures;
import javafx.geometry.Point2D;


public class King extends Figure {

	private Boolean rochade;
	
	/**
	 * Rochade ist am Anfang true. Dieser Werte wird in der move-Methode veraendert.
	 * @param sP Startposition der Figur
	 * @param iW Teamfarbe
	 */
	public King(Boolean iW, Point2D sP){
		super(sP, iW, "Figurenbilder/King_", "King");
		rochade = true;
	}
	
	public Boolean getRochade() {
		return rochade;
	}
	
	public void setRochade(Boolean r) {
		rochade = r;
	}
}

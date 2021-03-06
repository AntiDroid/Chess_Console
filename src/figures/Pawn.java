package figures;
import javafx.geometry.Point2D;


public class Pawn extends Figure {

	private Boolean doublemove;
	private Boolean enPassantAble;
	
	/**
	 * enPassant ist am Anfang false und der Doppelzug ist true. Diese Werte werden dann in der 
	 * move-Methode geaendert.
	 * @param sP Startposition der Figur
	 * @param iW Teamfarbe
	 */
	public Pawn(Boolean iW, Point2D sP){
		super(sP, iW, "Figurenbilder/Pawn_", "Pawn");
		enPassantAble = false;
		doublemove = true;
	}
	
	public void setEnPassant(Boolean b){
		enPassantAble = b;
	}
	
	public Boolean getEnPassant(){
		return enPassantAble;
	}

	public Boolean getDoublemove() {
		return doublemove;
	}

	public void setDoublemove(Boolean doublemove) {
		this.doublemove = doublemove;
	}
}

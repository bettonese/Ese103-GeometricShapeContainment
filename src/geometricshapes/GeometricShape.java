package geometricshapes;

abstract public class GeometricShape {
	
	/**
	 * 
	 * @return coordinata x minore della bounding box
	 */
	abstract public double getXMin();
	
	/**
	 * 
	 * @return coordinata x maggiore della bounding box
	 */
	abstract public double getXMax();
	
	/**
	 * 
	 * @return coordinata y minore della bounding box
	 */
	abstract public double getYMin();
	
	/**
	 * 
	 * @return coordinata y maggiore della bounding box
	 */
	abstract public double getYMax();
	
	public boolean contains(GeometricShape s){
		
		boolean cont=false;
		
		if(this.getXMin() <= s.getXMin() && this.getYMin() <= s.getYMin() && this.getXMax() >= s.getXMax() && this.getYMax() >= s.getYMax() ){
			cont = true;
		}
		return cont;
	}
	

}

package geometricshapes;

public class Triangle {
	
	private double xV;
	private double yV;
	private double l;
	
	public Triangle(double xV, double yV, double l) {
		this.xV = xV;
		this.yV = yV;
		if(l>0){
			this.l=l;
		}
		else{
			throw new IllegalArgumentException("Il lato deve essere maggiore di 0");
		}
		
	}
	/**
	 * 
	 * @return lunghezza del lato del triangolo
	 */
	public double getL() {
		return l;
	}
	/**
	 * setta il lato del triangolo, il quale deve essere maggiore di 0
	 * @param l
	 */
	public void setL(double l) {
		if(l>0){
			this.l=l;
		}
		else{
			throw new IllegalArgumentException("Il lato deve essere maggiore di 0");
		}
	}
	/**
	 * 
	 * @return coordinata x del vertice sinistro del triangolo
	 */
	public double getXV() {
		return xV;
	}
	/**
	 * Setta la coordinata x del vertice sinistro del triangolo
	 * @param xV coordinata x del vertice sinistro del triangolo
	 */
	public void setXV(double xV) {
		this.xV = xV;
	}
	/**
	 * 
	 * @return coordinata y del vertice sinistro del triangolo
	 */
	public double getYV() {
		return yV;
	}
	/**
	 * Setta la coordinata y del vertice sinistro del triangolo
	 * @param yV coordinata y del vertice sinistro del triangolo
	 */
	public void setYV(double yV) {
		this.yV = yV;
	}
	/**
	 * 
	 * @return ascissa minore della bounding box del triangolo
	 */
	public double getXMin(){
		return this.xV;
	}
	/**
	 * 
	 * @return ordinata minore della bounding box del triangolo
	 */
	public double getYMin(){
		return this.yV;
	}
	/**
	 * 
	 * @return ascissa maggiore della bounding box del triangolo
	 */
	public double getXMax(){
		return this.xV + this.l;
	}
	/**
	 * 
	 * @return ordinata maggiore della bounding box del triangolo
	 */
	public double getYMax(){
		return this.yV + this.l * Math.sqrt(3)/2;
	}
	/**
	 * Controlla se la bounding box di questo triangolo contiene quella di un cerchio
	 * @param t
	 * @return true se contiene la bounding box del cerchio, altrimenti false
	 */
	public boolean contains(Circle c){
		boolean cont=false;
		if(this.getXMin() <= c.getXMin() && this.getYMin() <= c.getYMin() && this.getXMax() >= c.getXMax() && this.getYMax() >= c.getYMax() ){
			cont = true;
		}
		return cont;
	}
	/**
	 * Controlla se la bounding box di questo triangolo contiene quella di un altro triangolo
	 * @param t
	 * @return true se contiene la bounding box dell'altro triangolo, altrimenti false
	 */
	public boolean contains(Triangle t){
		boolean cont=false;
		if(this.getXMin() <= t.getXMin() && this.getYMin() <= t.getYMin() && this.getXMax() >= t.getXMax() && this.getYMax() >= t.getYMax() ){
			cont = true;
		}
		return cont;
	}
	
	@Override
	public String toString() {
		return "Triangle [l=" + l + ", xV=" + xV + ", yV=" + yV + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(l);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(xV);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(yV);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangle other = (Triangle) obj;
		if (Double.doubleToLongBits(l) != Double.doubleToLongBits(other.l))
			return false;
		if (Double.doubleToLongBits(xV) != Double.doubleToLongBits(other.xV))
			return false;
		if (Double.doubleToLongBits(yV) != Double.doubleToLongBits(other.yV))
			return false;
		return true;
	}
	
}
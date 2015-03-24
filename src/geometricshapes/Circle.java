package geometricshapes;

public class Circle extends GeometricShape{
	
	private double xC;
	private double yC;
	private double r;
	
	public Circle(double xC, double yC, double r) {
		this.xC = xC;
		this.yC = yC;
		if(r>0){
			this.r = r;
		}
		else{
			throw new IllegalArgumentException("Il raggio deve essere maggiore di 0");
		}
		
	}
	/**
	 * 
	 * @return ascissa x del centro del cerchio
	 */
	public double getXC() {
		return xC;
	}
	/**
	 * setta la coordinata x del centro del cerchio
	 * @param xC coordinata x del centro del cerchio
	 */
	public void setXC(double xC) {
		this.xC = xC;
	}
	/**
	 * 
	 * @return ordinata y del centro del cerchio
	 */
	public double getYC() {
		return yC;
	}
	/**
	 * setta la coordinata y del centro del cerchio
	 * @param yC coordinata y del centro del cerchio
	 */
	public void setYC(double yC) {
		this.yC = yC;
	}
	/**
	 * 
	 * @return raggio del cerchio
	 */
	public double getR() {
		return r;
	}
	/**
	 * setta il raggio del cerchio, il quale deve essere maggiore di 0
	 * @param r raggio del cerchio
	 */
	public void setR(double r) {
		if (r>0){
			this.r = r;
		}
		else
			throw new IllegalArgumentException("Il raggio deve essere maggiore di 0");
	}
	/**
	 * 
	 * @return ascissa minore della bounding box del cerchio
	 */
	@Override
	public double getXMin(){
		return this.xC - this.r;
	}
	/**
	 * 
	 * @return ordinata minore della bounding box del cerchio
	 */
	@Override
	public double getYMin(){
		return this.yC - this.r;
	}
	/**
	 * 
	 * @return ascissa maggiore della bounding box del cerchio
	 */
	@Override
	public double getXMax(){
		return this.xC + this.r;
	}
	/**
	 * 
	 * @return ordinata maggiore della bounding box del cerchio
	 */
	@Override
	public double getYMax(){
		return this.yC + this.r;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(r);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(xC);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(yC);
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
		Circle other = (Circle) obj;
		if (Double.doubleToLongBits(r) != Double.doubleToLongBits(other.r))
			return false;
		if (Double.doubleToLongBits(xC) != Double.doubleToLongBits(other.xC))
			return false;
		if (Double.doubleToLongBits(yC) != Double.doubleToLongBits(other.yC))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "circle [xC=" + xC + ", yC=" + yC + ", r=" + r + "]";
	}
	

}
package geometricshapes;

public abstract class GeometricShape {
	
		abstract public double getXMin();
		abstract public double getXMax();
		abstract public double getYMin();
		abstract public double getYMax();
		public boolean contains(GeometricShape s){
			boolean cont=false;
			if(this.getXMin() <= s.getXMin() && this.getYMin() <= s.getYMin() && this.getXMax() >= s.getXMax() && this.getYMax() >= s.getYMax() ){
				cont = true;
			}
			return cont;
		}
	

}

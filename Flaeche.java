/**
 * 
 */
package aflt;
/**
 * @author Armin
 *
 */
public class Flaeche implements IFlaeche{
	private double flaechen;
	private double a;
	private double b;
	private double c;
	


	public Flaeche(double a, double b, double c) {
		super();
		this.flaechen = 0;
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double berechne(double a, double b, double c){
		return 0;
	}

	
	public double getFlaechen() {
		return flaechen;
	}
	public void setFlaechen(double flaechen) {
		this.flaechen = flaechen;
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	
	
	@Override
	public double getFlaeche(){
		// TODO Auto-generated method stub
		//Viereck
		if(this.getA() == 0){
			this.setFlaechen(this.getB() * this.getC());
		}
		if(this.getB() == 0){
			this.setFlaechen(this.getA() * this.getC());
		}
		if(c == 0){
			this.setFlaechen(this.getA() * this.getB());
		}
		//Dreieck
		if(this.getA() > 0 && this.getB() > 0 && this.getC() > 0){
			double s = (this.getA() + this.getB() + this.getC())/2;
			this.setFlaechen(Math.sqrt(s*(s-this.getA())*(s-this.getB())*(s-this.getC())));
		}
		//Kreis
		if(this.getA() == 0 && this.getB() == 0)
			this.setFlaechen(this.getC()*this.getC()*Math.PI);
		
		if(this.getC() == 0 && this.getB() == 0)
			this.setFlaechen(this.getA()*this.getA()*Math.PI);
					
		if(this.getA() == 0 && this.getC() == 0)	
			this.setFlaechen(b*b*Math.PI);
			
		return this.getFlaechen();
	}

	
	
}
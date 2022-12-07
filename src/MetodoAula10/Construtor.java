package MetodoAula10;

public class Construtor {
	
	 private int x; // não encapsulado
	    private int y; // não encapsulado
	    private double z; // não encapsulado
		
		public Construtor() {		
		}
		                           // sobrecarga de construtor (overloading)
		public Construtor(int x) {
			this.x = x;
		}
		
		public Construtor(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public Construtor(int x, int y, double z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}
		
		public int getX() {
			return x;
		}
		
		public void setX(int x) {
			this.x = x;
		}
		
		public int getY() {
			return y;
		}
		
		public double getZ() {
			return z;
		}
		
		public static void main(String[] args) {
			Construtor c1 = new Construtor();		
			System.out.println(c1.getX());
			
			Construtor c2 = new Construtor(5);
			//c2.setX(5);
			System.out.println(c2.getX());
			
			Construtor c3 = new Construtor(5, 6, 3.8);
			System.out.println(c3.getX()+" "+ c3.getY()+" "+c3.getZ());
		}


}

package aula01;

	public class ponto {
		
		private double x;
		private double y;
		
		public ponto(double x, double y){
			this.x=x;
			this.y=y;
		}
		
		public double x(){ 
			return this.x; 
			}
		public double y(){ 
			return this.y; 
			}
		public String toString(){ 
			return "("+x+","+y+")"; }
		
		
		public double distancia2pontos(ponto point){
			return Math.sqrt(((point.x()-this.x())*(point.x()-this.x()))+((point.y()-this.y())*(point.y()-this.y())));
		}
		
	}


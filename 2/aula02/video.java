package aula02;
public class video {
	private String categoria;
	private int idade;
	private String nome;
	private int id;
	private boolean status;
	private int nOwner;
	private int req;
	private int ratingT;
	private int ratingM;
	
	public video(int id, String nome, int idade, String categoria){
		this.nome=nome;
		this.idade=idade;
		this.categoria=categoria;
		this.id=id;
		this.status=true;
		this.nOwner=0;
		this.req=0;
		this.ratingT=0;
		this.ratingM=0;
	}
	
	public int id(){ return this.id; }
	public String nome(){ return nome;}
	public int idade(){ return this.idade; }
	public String categoria(){ return this.categoria; }
	public boolean status() { return status; }
	public void changeStatus(boolean status) { this.status=status; req++; }
	public int nOwner() { return nOwner; }
	public void changeOwner(int nOwner) {  this.nOwner=nOwner; }
	public int ratingM() { return this.ratingM;}
	
	
	public boolean valid(){
		if(this.idade<0 || this.idade>18) {
			return false;
		}
		return true;
	}
	public void rating(int r) {
		ratingT += r;
		ratingM = Math.min(Math.max((int)Math.round((double)ratingT/(double)req), 0), 10);
		
	}

	
	public String toString()
	{
		return 	  "ID: " + this.id + "\n"
				+ "Title: " + this.nome + "\n"
				+ "Category: " + this.categoria+ "\n"
				+ "Minimium Age: " + this.idade + "\n"
				+ "Available: " + this.status + "\n"
				+ "Rating: "+ this.ratingM +"\n";
	}
}

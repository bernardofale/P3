package aula02;

public class utilizadores {
	private estudantes e;
	private funcionario f;
	private int nsocio;
	private Data d;

	public utilizadores(int nsocio, Data d, estudantes e){
		this.d=d;
		this.e=e;
	}
	
	public utilizadores(int nsocio, funcionario f, Data d){
		this.f=f;
		this.d=d;
	}
	
	public int nsocio(){
		return nsocio;
	}
	public Data d(){
		return this.d;
	}
	public estudantes e(){
		return this.e;
	}
	public funcionario f() {
		return this.f;
	}
	
}

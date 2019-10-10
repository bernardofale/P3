package aula02;

public class history {
	private int idSocio;
	private int idVideo;
	
	public history(int idSocio, int idVideo) {
		this.idSocio=idSocio;
		this.idVideo=idVideo;
	}
	
	public int idSocio() {
		return this.idSocio;
	}
	public int idVideo() {
		return this.idVideo;
	}
	
	public String toString() {
		return "MemberID" + this.idSocio + "\n" + "VideoID: " + this.idVideo + "\n";
	}
	
	
}

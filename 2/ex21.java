import java.util.*;

import aula02.Pessoa;
import aula02.estudantes;
import aula02.func;
import aula02.funcionario;
import aula02.info;
import aula02.video;
import aula02.utilizadores;
import aula02.Data;
import aula02.history;

public class ex21 {
	
	  static LinkedList<utilizadores> utilizador;
	  static LinkedList<video> videos;
	  static LinkedList<Integer> ratings;
	  static LinkedList<history> hist;
	  static int nsocio=0;
	  static int nID=0;
	  static Scanner sc = new Scanner(System.in);
	  
  public static void main(String[] args) {
	  utilizador= new LinkedList<utilizadores>();
	  videos=new LinkedList<video>();
	  ratings=new LinkedList<Integer>();
	  hist=new LinkedList<history>();
	  String choice;
	  
	  do{
		  System.out.print("1-> Add user \n");
		  System.out.print("2-> Remove user \n");
		  System.out.print("3-> Add video \n");
		  System.out.print("4-> Remove video \n");
		  System.out.print("5-> List videos \n");
		  System.out.print("6-> Rent a video \n");
		  System.out.print("7-> Return video \n");
		  System.out.print("8-> Sort videos by rating \n");
		  System.out.print("9-> History of user \n");
		  System.out.print("Option: ");
		  choice=sc.nextLine();
		  
		  switch(choice){
		  	case "1":
		  		addU();	
		  		break;
		  	case "2":
		  		rmvUser();
		  		break;
		  	case "3":
		  		addV();
		  		nID++;
		  		break;
		  	case "4":
		  		rmV();
		  		break;
		  	case "5":
		  		listV();
		  		break;
		  	case "6":
		  		checkOut();
		  		break;
		  	case "7":
		  		checkIn();
		  		break;
		  	case "8":
		  		sortByRatings();
		  		break;
		  	case "9":
		  		hists();
		  		break;
		  	
		  }
		  		
	  }while(!choice.equals("q"));
}
  
  public static void addU(){
	  int choice;
	  do
		{
		  System.out.println("1-> Student");
		  System.out.println("2-> Worker");
		  System.out.print("Option: ");
		  choice = Integer.parseInt(sc.nextLine());
	  }while(choice != 1 && choice != 2);
	  
	  System.out.print("Username: ");
	  String nome=sc.nextLine();
	  System.out.print("CC number: ");
	  int cc=Integer.parseInt(sc.nextLine());	  
	  System.out.print("Birth date(dd-mm-yy): ");
	  String dat=sc.nextLine();
	  String[] dat1=dat.split("-");
	  
	  Data d2=new Data(Integer.parseInt(dat1[0]), Integer.parseInt(dat1[1]), Integer.parseInt(dat1[2])); 
	  
	  System.out.print("Today's date(dd-mm-yy): ");
	  String date=sc.nextLine();
	  String[] date1=date.split("-");

	  Data d=new Data(Integer.parseInt(date1[0]), Integer.parseInt(date1[1]), Integer.parseInt(date1[2]));
	  
	  Pessoa p=new Pessoa(nome,cc, d2);

	  if(choice==1) {
		  System.out.print("College number: ");
		  int nmec=Integer.parseInt(sc.nextLine());
		  System.out.print("Currently taking: ");
		  String curso=sc.nextLine();
		  
		  info i=new info(nmec, curso);
		  estudantes e=new estudantes(p, i);
		  utilizadores u=new utilizadores(nsocio,d,e);
		  
		  utilizador.add(u);
		  System.out.printf("User added! Your member number is %s \n", nsocio);
		  

	  }else if(choice==2){
		  System.out.print("Staff number: ");
		  int nstaff=Integer.parseInt(sc.nextLine());
		  System.out.print("Tax number: ");
		  int nfiscal=Integer.parseInt(sc.nextLine());
		  
		  func f=new func(nstaff, nfiscal);
		  funcionario func1=new funcionario(p,f);
		  utilizadores u1=new utilizadores(nsocio,func1,d);
		  
		  utilizador.add(u1);
		  System.out.printf("User added! Your member number is %s \n", nsocio);
		  
		  

	}
	  nsocio++;

  }
  
  public static void rmvUser(){
	  System.out.print("Member number of user to be removed: ");
	  int num=Integer.parseInt(sc.nextLine());
	  int k=0;
	  
	  for(int i=0; i<utilizador.size(); i++) {
		  if(utilizador.get(i).nsocio()==num){
			  utilizador.remove(i);
			  k++;
	  }
	}
	  if(k==0) {
		  System.out.print("User not found! \n");
	  }else {
	  System.out.print("User deleted! \n");
	  }
  }
  public static void addV(){
	  
	  System.out.print("Enter video's name: ");
	  String vName=sc.nextLine();
	  System.out.print("Enter video category: ");
	  String categoria=sc.nextLine();
	  System.out.print("Minimum age(0 if the video is for everyone):");
	  int maxAge=Integer.parseInt(sc.nextLine());
	  video v=new video(nID,vName,maxAge,categoria);
	  if(!v.valid()) {
		  System.out.print("Unknown minimuum age \n");
	  }else {
		  videos.add(v);
		  System.out.printf("Video uploaded! ID: %s \n", nID);
	  }
	  
  }
  
  public static void rmV(){
	  System.out.print("ID number of video to be removed: ");
	  int numid=Integer.parseInt(sc.nextLine());
	  int k=0;
	  for(int i=0; i<videos.size();i++) {
		  if(videos.get(i).id()==numid) {
			  videos.remove(i);
			  k++;
	  }
  }
	  if(k==0){
		  System.out.print("Video not found! \n");
	  }else {
	  System.out.print("Video deleted! \n");
	  }
  }
  
  public static void listV() {
	  
	  System.out.print(videos.toString());
	  }
  
  public static void checkOut() {
	System.out.print("Membership number: ");
	int id=Integer.parseInt(sc.nextLine());
	boolean k=false;
	
	for(int i=0; i<utilizador.size(); i++) {
		  if(utilizador.get(i).nsocio()==id){
			  k=true;

	  }
	}
	if(k) {
		videos.toString();
		System.out.print("Video ID to rent: ");
		int rent=Integer.parseInt(sc.nextLine());
		
		for(int i=0; i<videos.size(); i++) {
			if(videos.get(i).id()==rent && videos.get(i).status()==true) {
				videos.get(i).changeStatus(false);
				videos.get(i).changeOwner(id);
				
			}
		}
		System.out.print("Video rented! \n");
		history h=new history(id, rent);
		hist.add(h);
	}else {
		System.out.print("Video can't be rented! \n");
	}
  }
  public static void checkIn() {
	  System.out.print("Membership number: ");
	  int id=Integer.parseInt(sc.nextLine());
	  int s=0;
	  
	  if(logIn(id)) {
		  System.out.print("Video ID to return: ");
		  int returnn=Integer.parseInt(sc.nextLine());
		  
		  for(int j=0; j<videos.size(); j++) {
			  if(videos.get(j).nOwner()==id && videos.get(j).status()==false && videos.get(j).id()==returnn) {
				  videos.get(j).changeStatus(false);
				  videos.get(j).changeOwner(0);
				  System.out.print("Rating(0/10): ");
				  int rat=Integer.parseInt(sc.nextLine());
				  videos.get(j).rating(rat);
				  s++;
			  }
		  }
		  
		  if(s>0) System.out.print("Video returned! \n");
	  }else {
		  System.out.print("Video can't be returned \n");
	  }
	 
  }
  public static void sortByRatings() {
	 
	  for(int i=0; i<videos.size(); i++) {
		  ratings.add(videos.get(i).ratingM());
	  }
	  Comparator<Integer> order = Integer::compare;
	  ratings.sort(order.reversed());
  }
  
  public static void hists() {
	  System.out.print("Membership number: ");
	  int soc=Integer.parseInt(sc.nextLine());
	  
	  if(logIn(soc)){
		  System.out.printf("History of user %s: \n",soc);
		  for(int i=0; i<hist.size(); i++) {
			  if(hist.get(i).idSocio()==soc) {
				  System.out.print(hist.get(i).idVideo()+"\n");
			  }
		  }
	  }else {
		  System.out.print("User doesn't exist or has no history \n");
	  }
  }
  public static boolean logIn(int soc){
	  boolean k=false;
	  
	  for(int i=0; i<utilizador.size(); i++) {
		  if(utilizador.get(i).nsocio()==soc) {
			  k=true;
		  }
	  }
	  return k;
  }
}



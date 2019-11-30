package aula05;
import java.util.*;

public class Disciplina{
    private String nome;
    private String area;
    private int ects;
    private Professor docente;
    private List<Estudante> estudantes;

    public Disciplina(String nome, String area, int ects, Professor docente, Estudante[] alunos){
        this.nome=nome;
        this.area=area;
        this.ects=ects;
        this.docente=docente;
        estudantes=new ArrayList<Estudante>();
        for (int i = 0; i < alunos.length; i++) {
            estudantes.add(alunos[i]);
        }
    }
    public Disciplina(String nome, String area, int ects, Professor docente){
        this(nome,area,ects,docente, new Estudante[0]);
    }

    public String nome(){
        return nome;
    }
    public String area(){
        return area;
    }
    public int ects(){
        return ects;
    }
    public Professor docente(){
        return docente;
    }
    public boolean addAluno(Estudante est){
        int proof=0;
        for (int i = 0; i < estudantes.size(); i++) {
           if(est.nmec()==estudantes.get(i).nmec()){
               proof++;
           } 
        }
        if (proof<1){
            estudantes.add(est); return true;
        }
        return false;
    }
    public boolean delAluno(int nmec){
        for (int i = 0; i < estudantes.size(); i++) {
            if(estudantes.get(i).nmec()==nmec){
                estudantes.remove(i);
                return true;
            }
        }
        return false;
    }
    public boolean alunoInscrito(int nmec){
        for (int i = 0; i < estudantes.size(); i++) {
            if(estudantes.get(i).nmec()==nmec){
                return true;
            }
        }
        return false;
    }
    public int numAlunos(){
        int cont=0;
        for (int i = 0; i < estudantes.size(); i++) {
            cont++;
        }
        return cont;
    }

    public Estudante[] getAlunos(){
        Estudante[] all=new Estudante[estudantes.size()];
        all=estudantes.toArray(all);        
        return all;
    }
    public Estudante[] getAlunos(String tipo){
        List<Estudante> allTipo=new ArrayList<Estudante>();
        for (int i = 0; i < estudantes.size(); i++) {
            if(estudantes.get(i).getClass().getSimpleName().equals(tipo)){
                allTipo.add(estudantes.get(i));
            }
        }
        Estudante[] arrAllTipo=new Estudante[allTipo.size()];
        arrAllTipo=allTipo.toArray(arrAllTipo);

        return arrAllTipo;
    }
    public String toString(){
        return "Nome: "+nome+"\n"+
               "Área: "+area+"\n"+
               "ECTS: "+ects+"\n"+
               "Docente: "+docente.toString()+"\n"+
               "Alunos: "+this.numAlunos()+"\n";
    }
}
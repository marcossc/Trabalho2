/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcos Castanheira
 */
public class Aluno {
    
    private String nome;
    private int idade, semestre;
    private double valorEstagio;
    
    public Aluno(String nome,int idade, int semestre, double valorEstagio){
        setNome(nome);
        setIdade(idade);
        setSemestre(semestre);
        setValorEstagio(valorEstagio);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 16)
            idade = 16;
        this.idade = idade;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public double getValorEstagio() {
        return valorEstagio;
    }

    public void setValorEstagio(double valorEstagio) {
        if (valorEstagio < 600)
            valorEstagio = 600;
        this.valorEstagio = valorEstagio;
    }
    
    public void aumento(double aumento){
        setValorEstagio(getValorEstagio()*(1+(aumento*0.01)));
    }
    
    public String toStringAnual(){
        return "Nome: "+getNome()+"\nIdade: "+getIdade()+"\nSemestre: "+getSemestre()+"º\nSalário Anual:"+(getValorEstagio()*12)+"\n\n";
        
    }
    
    public String toStringSemestral(){
        return "Nome: "+getNome()+"\nIdade: "+getIdade()+"\nSemestre: "+getSemestre()+"º\nSalário Anual:"+(getValorEstagio()*6)+"\n\n";
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structures;

import intefaces.Item;

/**
 *
 * @author olive
 */
public class Student implements Item, Cloneable{
    
    private int matricula = 0;
    private String nomeAluno = null;
    private int faltas = 0;
    private double primeiraNota = 0;
    private double segundaNota = 0;
    private double terceiraNota = 0;
    private double media = 0;
    
    public Student() {}
    public Student(int matricula){ setKey(matricula);}
    
    public String getNomeAluno() {return nomeAluno;}

    public void setNomeAluno(String nomeAluno) {this.nomeAluno = nomeAluno;}

    public int getFaltas() {return faltas;}

    public void setFaltas(int faltas) {this.faltas = faltas;}

    public double getPrimeiraNota() {return primeiraNota;}

    public void setPrimeiraNota(double primeiraNota) {this.primeiraNota = primeiraNota;}

    public double getSegundaNota() {return segundaNota;}

    public void setSegundaNota(double segundaNota) {this.segundaNota = segundaNota;}

    public double getTerceiraNota() {return terceiraNota;}

    public void setTerceiraNota(double terceiraNota) {this.terceiraNota = terceiraNota;}

    public double getMedia() {return media;}

    public void setMedia(double media) {this.media = media;}

    @Override
    public int compare(Item it) {
        Student aluno = (Student) it;
        if(this.matricula< aluno.matricula){ //Se o item da classe for menor que o recebido pelo metodo
            return -1;
        }
        else if(this.matricula> aluno.matricula) // Se o item da classe for maior que o recebido pelo metodo
            return 1;
        return 0; //Se for igual
    }

    @Override
    public void setKey(Object matricula) {
        Integer ch = Integer.parseInt(matricula.toString());
        this.matricula = ch.intValue();
    }
    public Student getClone() {
            // call clone in Object.
            try{
                return (Student) super.clone();
            }
            catch(Exception e){}
            return null;
        }

    @Override
    public Object getKey() {
        return matricula;
    }

  
}

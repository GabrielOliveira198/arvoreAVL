/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import achive.ReaderAchive;
import achive.WriteAchive;
import intefaces.Tree;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import structures.No;
import structures.Student;
import trees.TreeAVL;

public class Turma extends AbstractTableModel {

    ArrayList<Student> turma;
    
    public List<Student> gh(){
        return turma;
    }
    
    public Turma() {
        turma = new ArrayList();
    }

    public void insereAluno(Student aluno) {
        this.turma.add(aluno);
        fireTableStructureChanged(); //Sinalizar para a tabela que houve a mudança
    }

    public void insereAluno(int index, Student aluno) {
        this.turma.add(index, aluno);
        fireTableStructureChanged();
    }

    public void removeAluno(int index) {
        this.turma.remove(index);
        fireTableStructureChanged();
    }

    public Student getAlunoAt(int index) {
        return this.turma.get(index);
    }

    public void saveToFile() throws FileNotFoundException, IOException {
        WriteAchive writeAchive = new WriteAchive();
        writeAchive.writeAchive(turma);
        fireTableStructureChanged();
    }

    public void loadFromFile() throws FileNotFoundException, IOException, ClassNotFoundException {
        turma.clear();
        ReaderAchive readerAchive = new ReaderAchive();
        Tree tree = new TreeAVL();
        tree = readerAchive.readAchive(tree);
        tree.transferToArrayList();
        ArrayList<No> arrayList = tree.getArrayList();
        Student std = new Student();
        for(int i=1; i<arrayList.size(); i++){
            std = (Student) arrayList.get(i).getItem();
            System.out.println(std.getKey());
            turma.add(std);
        }
        fireTableStructureChanged();
    }

    @Override
    public int getRowCount() {
        return this.turma.size();
    }

    @Override
    public int getColumnCount() {
        return Student.class.getDeclaredFields().length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Student aluno = this.getAlunoAt(rowIndex);
        if (columnIndex == 0) {
            return "" + aluno.getKey();
        } else if (columnIndex == 1) {
            return aluno.getNomeAluno();
        } else if (columnIndex == 2) {
            return "" + aluno.getFaltas();
        } else if (columnIndex == 3) {
            return "" + aluno.getPrimeiraNota();
        }else if (columnIndex == 4) {
            return "" + aluno.getSegundaNota();
        }
        else if (columnIndex == 5) {
            return "" + aluno.getTerceiraNota();
        }
        else if (columnIndex == 6) {
            return "" + ((aluno.getPrimeiraNota()*0.2) + (aluno.getSegundaNota()*0.35) + (aluno.getTerceiraNota()*0.45));
        }else {
            return "ERRO";
        }
    }

    public String getColumnName(int columnIndex) {
        return Student.class.getDeclaredFields()[columnIndex].getName();
    }

    @Override
    public String toString() {
        return "Turma{" + "turma=" + turma + '}';
    }

}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package achive;

import intefaces.Item;
import intefaces.Tree;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.function.UnaryOperator;
import structures.No;
import structures.Student;
import trees.TreeAVL;

/**
 *
 * @author olive
 */
public class WriteAchive {

    public void writeAchive(ArrayList<Student> array) throws IOException {
        Tree tree = new TreeAVL();
        for(int i=0; i<array.size(); i++){
            tree.insert(array.get(i));
        }
        
        tree.transferToArrayList();
        ArrayList<No> a = tree.getArrayList();
        ArrayList<Student> array2 = new ArrayList<>();
        for(int i=0; i<a.size(); i++){
         array2.add((Student) a.get(i).getItem());
        }
        
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter("saida.txt"));
        Student std;
        String linha;
        for(int i=0; i<array2.size(); i++){
            linha = "";
            std  = (Student) array2.get(i);
            linha = ""+std.getKey()+","+""+std.getNomeAluno()+","+std.getFaltas()+
                ","+std.getPrimeiraNota()+","+std.getSegundaNota()+","+std.getTerceiraNota() + "," + std.getMedia();
            System.out.println(linha);
            buffWrite.append(linha+"\r\n");
        }
        buffWrite.close();
    }
}

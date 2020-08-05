/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package achive;

import intefaces.Tree;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import structures.Student;

/**
 *
 * @author olive
 */
public class ReaderAchive {
    Student student = new Student();
    public Tree readAchive(Tree tree){
        try{
            FileReader fileReader = new FileReader("entrada.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            System.out.printf("|| Criado ||\n");
            String linha = "sem dados";
            while(linha!= null){
                linha = bufferedReader.readLine();
                if(linha!=null){
                    //MATRICULA
                    String res = selectSubString(linha);
                    int x = covertStringToInt(res);
                    student.setKey(x);
                    linha = hashString(linha);
                    //NOME
                    res = selectSubString(linha);
                    student.setNomeAluno(res);
                    linha = hashString(linha);
                    //FALTAS
                    res = selectSubString(linha);
                    x = covertStringToInt(res);
                    student.setFaltas(x);
                    linha = hashString(linha);
                    //NOTA01
                    res = selectSubString(linha);
                    double y = covertStringToDouble(res);
                    double media = y*0.2;
                    student.setPrimeiraNota(y);
                    linha = hashString(linha);
                    //NOTA02
                    res = selectSubString(linha);
                    y = covertStringToDouble(res);
                    student.setSegundaNota(y);
                    media += y*0.35;
                    linha = hashString(linha);
                    //NOTA03
                    //Vai direto pois e o que sobrou da string.
                    y = covertStringToDouble(linha);
                    student.setTerceiraNota(y);
                    media += y*0.45;
                    student.setMedia(media);
                    
                   tree.insert(student.getClone());
                }
                    
            }
            fileReader.close();
        }
        catch(Exception e){System.out.printf("Erro na Abertura do arquivo: %s \n");}
        return tree;
    }
    private String selectSubString(String linha){
        try {
            int index = linha.indexOf(',');
        linha = linha.substring(0, index);
        }
        catch(Exception e){System.out.println("Erro no metodo: selectSubString");}
        return linha;
    }
    private String hashString(String linha){
        try{
            int index = linha.indexOf(',');
            String result = linha.substring(0, index);
            linha = linha.replace(result+',', "");
        }
        catch(Exception e){System.out.println("Erro no metodo: hashString");}
        return linha;
    }
    private int covertStringToInt(String string){
        int x = 0;
        try{x = Integer.parseInt(string);}
        catch(Exception e){System.out.println("Erro no metodo: covertStringToInt");}
        return x;
    }
    private double covertStringToDouble(String string){
        double x = 0.0D;
        try{x = Double.parseDouble(string);}
        catch(Exception e){System.out.println("Erro no metodo: covertStringToDouble");}
        return x;
    }
}

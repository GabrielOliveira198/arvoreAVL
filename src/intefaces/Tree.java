/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intefaces;

import java.util.ArrayList;
import structures.No;
import structures.Student;

/**
 *
 * @author olive
 */
public interface Tree {
    public Item search(Item reg);
    public void insert(Item reg);
    public void remove(Item reg);
    public void transferToArrayList();
    public ArrayList<No> getArrayList();
}

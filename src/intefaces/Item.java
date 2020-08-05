/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intefaces;

/**
 *
 * @author olive
 */
public interface Item {
    public int compare(Item it);
    public void setKey(Object chave);
    public Object getKey();
}

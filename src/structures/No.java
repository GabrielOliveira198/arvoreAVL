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
public class No {
  
	private No left = null;
	private No right  = null;
	private No father  = null;
	//A chave do no fica dentro do item. Acesse ela pelo metodo getKey() de Item
        private Item item  = null;
	private int balancing = 0;
    public int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

	public No(Item item) {
            setItem(item);
	}

    public No() {}
    public No(Item item, No parent){
        this.item = item;
        this.father = parent;
    }

    public No getLeft() {
        return left;
    }

    public void setLeft(No left) {
        this.left = left;
    }

    public No getRight() {
        return right;
    }

    public void setRight(No right) {
        this.right = right;
    }

    public No getFather() {
        return father;
    }

    public void setFather(No father) {
        this.father = father;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getBalancing() {
        return balancing;
    }

    public void setBalancing(int balancing) {
        this.balancing = balancing;
    }
        
}
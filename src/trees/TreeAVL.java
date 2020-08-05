package trees;

import intefaces.Item;
import intefaces.Tree;
import java.util.ArrayList;
import structures.No;
import structures.Student;

public class TreeAVL implements Tree {

    private No root;

    @Override
    public void insert(Item key) {
        boolean ok = true;
        if (root == null) {
            root = new No(key, null);
            ok =  true;
        }
 
        No n = root;
        while (ok) {
            if (n.getItem().getKey() == key.getKey())
                ok =  false;
 
            No parent = n;
 
            boolean goLeft = (int) n.getItem().getKey() > (int) key.getKey();
            n = goLeft ? n.getLeft() : n.getRight();
 
            if (n == null) {
                if (goLeft) {
                    parent.setLeft(new No(key, parent));
                } else {
                    parent.setRight( new No(key, parent));
                }
                rebalance(parent);
                break;
            }
        }
        ok =   true;
    }
 
    
 
    private void rebalance(No n) {
        setBalance(n);
 
        if (n.getBalancing() == -2) {
            if (height(n.getLeft().getLeft()) >= height(n.getLeft().getRight()))
                n = rotateRight(n);
            else
                n = rotateLeftThenRight(n);
 
        } else if (n.getBalancing() == 2) {
            if (height(n.getRight().getRight()) >= height(n.getRight().getLeft()))
                n = rotateLeft(n);
            else
                n = rotateRightThenLeft(n);
        }
 
        if (n.getFather() != null) {
            rebalance(n.getFather());
        } else {
            root = n;
        }
    }
 
    private No rotateLeft(No a) {
 
        No b = a.getRight();
        b.setFather(a.getFather());
 
        a.setRight(b.getLeft());
 
        if (a.getRight() != null)
            a.getRight().setFather(a);
 
        b.setLeft(a);
        a.setFather(b);
 
        if (b.getFather() != null) {
            if (b.getFather().getRight() == a) {
                b.getFather().setRight(b);
            } else {
                b.getFather().setLeft(b);
            }
        }
 
        setBalance(a, b);
 
        return b;
    }
 ///////De agora em diante com mais cuidado
    private No rotateRight(No a) {
 
        No b = a.getLeft();
        b.setFather(a.getFather());
 
        a.setLeft(b.getRight());
 
        if (a.getLeft() != null)
            a.getLeft().setFather(a);
 
        b.setRight(a);
        a.setFather(b);
 
        if (b.getFather() != null) {
            if (b.getFather().getRight() == a) {
                b.getFather().setRight(b);
            } else {
                b.getFather().setLeft(b);
            }
        }
 
        setBalance(a, b);
 
        return b;
    }
 
    private No rotateLeftThenRight(No n) {
        n.setLeft(rotateLeft(n.getLeft()));
        return rotateRight(n);
    }
 
    private No rotateRightThenLeft(No n) {
        n.setRight(rotateRight(n.getRight()));
        return rotateLeft(n);
    }
 
    private int height(No n) {
        if (n == null)
            return -1;
        return n.getHeight();
    }
 
    private void setBalance(No... nodes) {
        for (No n : nodes) {
            reheight(n);
            n.setBalancing(height(n.getRight()) - height(n.getLeft()));
        }
    }
 
    public void printBalance() {
        printBalance(root);
    }
 
    private void printBalance(No n) {
        if (n != null) {
            printBalance(n.getLeft());
            System.out.printf("%s ", n.getBalancing());
            printBalance(n.getRight());
        }
    }
 
    private void reheight(No node) {
        if (node != null) {
            node.height = 1 + Math.max(height(node.getLeft()), height(node.getRight()));
        }
    }
    @Override
    public Item search(Item key) {
        return binarySearch(root, key);
    }

    private Item binarySearch(No node, Item key) {
        if (node == null) return null;

        if (key.getKey() == node.getItem().getKey()) {
            return node.getItem();
        }

        if ((int)key.getKey() < (int) node.getItem().getKey() && node.getLeft() != null) {
            return binarySearch(node.getLeft(), key);
        }

        if ((int) key.getKey() > (int) node.getItem().getKey() && node.getRight() != null) {
            return binarySearch(node.getRight(), key);
        }

        return null;
    }
    @Override
    public void transferToArrayList() {
        System.out.println("transferToArrayList()");
        try {
            this.center(this.root);
        } catch (Exception ex) {}
    }

    private void center(No p) throws Exception {
        if (p != null) {
           center(p.getLeft());
           res.add(p);
           center(p.getRight());
        }
    }
 
    ArrayList<No> res = new ArrayList<No> ();
    
 
    @Override
    public ArrayList<No> getArrayList() {
        return res;
    }
    @Override
    public void remove(Item key) {
         remove(this.root, key);
     }
    private No remove(No root, Item key){
        // STEP 1: PERFORM STANDARD BST DELETE
        if (root == null)
            return root;
 
        // If the key to be deleted is smaller than
        // the root's key, then it lies in left subtree
        if ((int) key.getKey() < (int) root.getItem().getKey())
            root.setLeft(remove(root.getLeft(), key));
 
        // If the key to be deleted is greater than the
        // root's key, then it lies in right subtree
        else if ((int) key.getKey() > (int) root.getItem().getKey())
            root.setRight(remove(root.getRight(), key));
 
        // if key is same as root's key, then this is the node
        // to be deleted
        else
        {
 
            // node with only one child or no child
            if ((root.getLeft() == null) || (root.getRight() == null))
            {
                No temp = null;
                if (temp == root.getLeft())
                    temp = root.getRight();
                else
                    temp = root.getLeft();
 
                // No child case
                if (temp == null)
                {
                    temp = root;
                    root = null;
                }
                else   // One child case
                    root = temp; // Copy the contents of
                                 // the non-empty child
            }
            else
            {
 
                // node with two children: Get the inorder
                // successor (smallest in the right subtree)
                No temp = minValueNode(root.getRight()); 
 
                // Copy the inorder successor's data to this node
                root.setItem(temp.getItem());
 
                // Delete the inorder successor
                root.setRight(remove(root.getRight(), (Student) temp.getItem()));
            }
        }
 
        // If the tree had only one node then return
        if (root == null)
            return root;
 
        // STEP 2: UPDATE HEIGHT OF THE CURRENT NODE
        root.height = max(height(root.getLeft()), height(root.getRight())) + 1;
 
        // STEP 3: GET THE BALANCE FACTOR OF THIS NODE (to check whether
        //  this node became unbalanced)
        int balance = root.getBalancing();
 
        // If this node becomes unbalanced, then there are 4 cases
        // Left Left Case
        if (balance > 1 && root.getLeft().getBalancing() >= 0)
            return rotateRight(root);
 
        // Left Right Case
        if (balance > 1 && root.getLeft().getBalancing() < 0)
        {
            root.setLeft(rotateLeft(root.getLeft()));
            return rotateRight(root);
        }
 
        // Right Right Case
        if (balance < -1 && root.getRight().getBalancing() <= 0)
            return rotateLeft(root);
 
        // Right Left Case
        if (balance < -1 && root.getRight().getBalancing() > 0)
        {
            root.setRight(rotateRight(root.getRight()));
            return rotateLeft(root);
        }
 
        return root;
    }
     public No minValueNode(No node){
        No current = node;
 
        /* loop down to find the leftmost leaf */
        while (current.getLeft() != null)
           current = current.getLeft();
 
        return current;
    }
     int max(int a, int b)
    {
        return (a > b) ? a : b;
    }
}

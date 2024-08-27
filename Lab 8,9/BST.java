package default_package;

import java.util.Stack;

class BST<Key extends Comparable <Key> , T> {
	public static int leafcount=0;
    public static int  counter=0;
    private BSTNode<Key, T> root; 
    int size;             
    BST() {
        root = null;
        size = 0;
    }

    public void clear() {
        root = null;
        size = 0;
    }

    
    public int size() {
        return size;
    }

    public BSTNode<Key, T> Getroot(){
        return root;
    }

    public void Inorder (BSTNode<Key, T> root){
          if (root==null) return;
          Inorder ( root.getLeft());
          System.out.print (root.getData());
          Inorder ( root.getRight());

    }

    
    public void insert(Key k, T e) {
        root = inserthelp(root, k, e);
        size++;
    }

    private BSTNode<Key, T> inserthelp (BSTNode<Key, T> rt, Key k, T e) {
        BSTNode<Key, T> node =new BSTNode(k, e);
        if (rt == null) {
            return node; 
        }

        BSTNode<Key, T> parent=null , current = rt;

        while (current!=null){
            parent=current;
            if (current.getKey().compareTo(k) < 0){
                current=current.getRight();
            }
            else {
               current=current.getLeft(); 
                 }
        }
        if (parent.getKey().compareTo(k) > 0) {
            parent.setLeft(node); 
        } else {
            parent.setRight(node);
        }
        return rt;
    }

  

    private BSTNode<Key, T> find(BSTNode<Key, T> rt, Key k) {
        if (rt == null) {
            return null;
        }
        BSTNode<Key, T>  current = rt;

        while (current!=null && current.getKey()!=k){
            if (current.getKey().compareTo(k) < 0){
                current=current.getRight();
            }
            else {
               current=current.getLeft(); 
                 }
        }

        if (current!=null) {
            return  current;
        } else {
            return null;}
    }

    

    public BSTNode<Key, T> remove(Key k) {
        BSTNode<Key, T> temp = find(root, k); // First find it
        if (temp != null) {
             root = removehelp(root, k); // Now remove it
            size--;
        }
        return temp;
    }

    private BSTNode<Key, T> getmin(BSTNode<Key, T> rt) {//return the min node in the right subtree
        if (rt == null) {
            return null;
        }
        BSTNode<Key, T> temp =rt.getRight();
        while (temp.getLeft()!=null){
            temp= temp.getLeft();
        }
        return temp;
    }
     public boolean contains(Key data) {
         
        BSTNode<Key, T> current=root;

        if(root==null) 
      	  return false;

        while (current!=null &&  current.getKey()!=data){
            if ((Integer)current.getKey()< (Integer)data){
                current=current.getRight();
                counter++;
            }
            else {
               current=current.getLeft(); 
               counter++;
                 }
            
        }

        if (current!=null) {
        	counter++;
        	System.out.print("Number of counter: "+counter);
            return  true;
            
        } else {
            return false;}
            
        }
        
    private BSTNode <Key, T> removehelp(BSTNode<Key, T> rt, Key k) {
     
         if (rt.getKey().compareTo(k)<0){
            rt.setRight(removehelp(rt.getRight(),k));
        }
        else if (rt.getKey().compareTo(k)>0){
            rt.setLeft(removehelp(rt.getLeft(),k));}

            else {//found the node to be delete
                if (rt.isLeaf()){
                    rt =null;
                    
                }
                else if (rt.getLeft()==null && rt.getRight()!=null){
                    rt =rt.getRight();
                    
                }
                else if (rt.getLeft()!=null && rt.getRight()==null){
                    rt =rt.getLeft();
                    
                }
                else {
                    BSTNode<Key, T> min =getmin (rt);
                    rt.setData(min.getData());
                    rt.setKey(min.getKey());
                    rt.setRight (removehelp (rt.getRight(),rt.getKey()));
                    
                    
                }
            }
            return rt;

        
        }
    public Integer NumberLeafs(BSTNode<Integer,Student> root){
    	
    	
    	while(root!=null) {
    		if(root.isLeaf()) {
    			leafcount++;
    			}
    			 else if (root.getLeft()==null && root.getRight()!=null){
                     root =root.getRight();
                     
                 }
                 else if (root.getLeft()!=null && root.getRight()==null){
                     root =root.getLeft(); }
    		}
   
     return leafcount;
  }
    public void printLeafs(BSTNode<Integer,Student> root){	
    	if(root!=null) 
    		if(root.isLeaf()) {
    			System.out.print(root.getData());
    			}
    			printLeafs(root.getLeft());
    			printLeafs(root.getRight());
    		}
}

    			  
    		
    	
    
 


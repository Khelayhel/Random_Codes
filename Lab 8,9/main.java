package default_package;

import java.util.Objects;
import java.util.Scanner;
import java.nio.file.Paths;


public class main {
    static boolean isFound=false;
    public static boolean isExist(Integer key,BSTNode<Integer,Student> current) {
    	if(current !=null) {
    		if(Objects.equals(key, current.getKey())) {
    			isFound=true;
    		}
    		if(key < current.getKey())
    			isExist(key,current.getLeft());
    		if(key > current.getKey())	
    			isExist(key,current.getRight());
    	}
    	return isFound;
    }
	
    public static void main (String [] args)throws Exception {

        BST <Integer, Student>Students = new BST();
        
        Scanner input= new Scanner (Paths.get("students.txt"));

        while (input.hasNextLine()){

            Student s1 = new Student(input.nextInt(), input.next(),input.nextDouble());

            Students.insert(s1.getID(), s1);
        }

        System.out.println ("Root before the remove : \n" + Students.Getroot().getData());
        System.out.println();
        Students.Inorder(Students.Getroot());
     
        Students.remove(118);

        System.out.println ("\n: ");

        System.out.println ("\nRoot after the remove : \n " +Students.Getroot().getData());

        System.out.println();

        Students.Inorder(Students.Getroot());
        Students.contains(112);
        Students.NumberLeafs(Students.Getroot());
        Students.printLeafs(Students.Getroot());
        isExist(118,Students.Getroot());
        
    }
}


package Lab9;
import java.util.*;
import java.lang.Math;
public class HashTable {
  private String[] words;
  public static int count=0;
  public static int size;
  public HashTable(int N) {
	 size=N;  
    words = new String[N];
    for (int i = 0; i < words.length; i++)
      words[i] = new String();
  }

  public static int hash(char key) {
    int i=(((int) key)-97);
    Math.abs(i);
    return i;

  }

  public void put(String w) {
	if(count==size) {  
	  System.out.println("Array is full");
	  return;
	  }
    int index = hash(w.charAt(0));

    if (words[index] == null || words[index]=="!") {
      words[index] = w;
      count++;
      return;
    }
    while (index < words.length-1 && words[index] != null && words[index] != "!") {
      index++;
    }

    words[index] = w;
    count++;
  }

  public String get(String w) {

    int index = hash(w.charAt(0));

    if (words[index].equals(w)) {
      return words[index];
    }

    while (index < words.length && !words[index].equals(w)) {

      index++;

    }
    if (index == words.length) {
      return null;
    }
    return words[index];

  }

  public String remove(String w) {

    int index = hash(w.charAt(0));

    if (words[index].equals(w)) {// find direct in index
      String word = words[index];
      words[index] = new String("!");
      count--;
      return word;
    }

    while (index < words.length && !words[index].equals(w)) {// find based on linear probing

      ++index;

    }

    if (index < words.length && words[index].equals(w)) {
      String word = words[index];
      words[index] = new String("!");
      count--;
      return word;
    } else {
      count--;
      return null;
    }

  }

  public void print() {
    for (int i = 0; i < words.length; i++) {
      if (words[i] != null) {
        System.out.println("i is " + i + " the word is " + words[i]);
      }
    }
  }

  public String[] EntrySet() {
    return words;
  }
public static void main(String[] args) {
	 
	 HashTable Names =new HashTable(100);
	 Names.put("Khalid");
	 Names.print();
	 Names.remove("Khalid");
	
	
}
}

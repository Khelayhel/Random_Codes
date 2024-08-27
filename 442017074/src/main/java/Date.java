/*
Name: Khalid Ahmad Helayhel
Student ID:442017074
Section:173
Lab Exam 1
 */
public class Date {
 private int day; 
 private int month; 
 private int year; 
 
public Date(int day, int month, int year) { 
  this.day = day; 
  this.month = month; 
  this.year = year; 
  } 
 public String toString(){
    
     return String.format("Date= %d/%d/%d",day,month,year);
    
 }
}

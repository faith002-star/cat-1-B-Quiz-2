import java.util.Scanner;

public class StudentRecord{
int studentID;
String name;
String course;
//constructor
StudentRecord(int studentID,String name,String course){
this. studentID = studentID;
this.name = name;
this.course = course;
}
//display info
public void displayInfo(){
System.out.println("STUDENTID:" + studentID);
System.out.println("NAME:" +name);
System.out.println("COURSE:" +course);
}
}
public class studentApp{
public static void main ( String[] args){
Scanner scanner =  new Scanner (System.in);
//prompt the user to student details
System.out.println("Enter studentID,name and course:");
int studentID = scanner nextInt();
String name = scanner nextLine();
String course = scanner nextLine();
//Instantiate an object
StudentRecord studcord = new StudentRecord(studentID,name,course);
System.out.println("student details");
studcord.displayInfo();
scanner.close();
}
}









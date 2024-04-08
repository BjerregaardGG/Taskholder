import java.util.Scanner; 

public class UI{

public static void main (String[] args){

Scanner scan = new Scanner(System.in); 
TaskController taskcontroller = new TaskController();

System.out.println("Her er din to do liste:"); 
System.out.println(); 

taskcontroller.printTasks();

while(true){
System.out.println("Hvad kunne du tænke dig at gøre med din to do list?");
System.out.println("1. Jeg vil gerne tilføje en opgave til min to do list");
System.out.println("2. Jeg vil gerne fjerne en opgave");
System.out.println("3. Oversigt"); 
System.out.println("4. Luk min liste"); 
int choice = scan.nextInt();

switch(choice){
case 1: 
taskcontroller.addTask();
System.out.println("Din opdateret to do liste ser ud således: "); 
System.out.println();
taskcontroller.printTasks();
break; 

case 2: 
System.out.println("Hvad er titlen på opgaven der skal fjernes fra listen?");
String opgave = scan.next().toLowerCase();
taskcontroller.removeTask(opgave);
System.out.println("Din opdateret to do liste ser ud således: "); 
System.out.println();
taskcontroller.printTasks();
break; 

case 3: 
taskcontroller.printTasks();
break; 

case 4:  
System.exit(0);
break; 

default: 
 System.out.println("kan ikke læse svaret... prøv igen");
break;

   }
}



   } // main 
}
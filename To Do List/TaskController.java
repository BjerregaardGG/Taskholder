import java.util.ArrayList; 
import java.util.Scanner; 

public class TaskController{

ArrayList<Task> taskList = new ArrayList<Task>(); 
Scanner scan = new Scanner(System.in); 

public TaskController(){
taskList.add(new Task("Yousee", "Afmelde Yousee abonnement", 28042024, false));
taskList.add(new Task("Shopping", "Køb mælk ind", 21042024, true)); 

}

public void printTasks(){
for(Task task : taskList){
System.out.println("Titel: " + task.getTitel()); 
System.out.println("Beskrivelse: " + task.getBeskrivelse()); 
System.out.println("Dato : " + task.getDeadline()); 
System.out.println("Status : " + task.isTaskdone()); 
System.out.println(); 

   }
}

public void addTask(){
System.out.println("Hvor mange opgaver vil du tilføje?"); 
int antal = scan.nextInt();  
int startIndex = 0; // initialiserer en variabel til at holde styr på, hvor i arrayet tilføjelsen af den nye task skal starte

// finder første ledige index i arrayet
for(int i=0; i<taskList.size(); i++){
 if(taskList.get(i)==null){
   startIndex=i; // sætter startindex til index af første tomme sted i arrayet
   break; 
 }
}
   
// for loop der kører gennem antal af task der skal tilføjes 
for(int i=startIndex; i<startIndex + antal; i++){
   System.out.println("Hvad er titlen på opgaven?");
      String titel = scan.nextLine();
      scan.nextLine();

   System.out.println("Tilføj en beskrivelse"); 
      String beskrivelse = scan.nextLine(); 

   System.out.println("Tilføj deadline [DDMMYYYY]"); 
      int dato = scan.nextInt();

   System.out.println("Er denne opgave allerede løst [true] eller skal den løses [false]?"); 
      boolean status = scan.nextBoolean(); 
      
   
   taskList.add(new Task(titel, beskrivelse, dato, status)); 
   
      }
  }

public void removeTask(String titel){

boolean opgaveFundet = false; 

for(Task task : taskList){
if(task.getTitel().equalsIgnoreCase(titel)){
taskList.remove(task); 
opgaveFundet = true; 
System.out.println("Din opgave " + titel + " er fjernet fra listen"); 
break; 
   }
}
if(opgaveFundet = false){
System.out.println("Vi kunne ikke finde " + titel + "opgaven"); 
   }
  }
}
     
   



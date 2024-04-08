public class Task{

private String titel; 
private String beskrivelse; 
private int deadline; 
private boolean taskdone; 

// konstruktør
public Task(String titel, String beskrivelse, int deadline, boolean taskdone){
this.titel=titel; 
this.beskrivelse=beskrivelse; 
this.deadline=deadline;
this.taskdone=taskdone; 
}

public String getTitel(){
return titel; 
}

public String getBeskrivelse(){
return beskrivelse; 
}

public int getDeadline(){
return deadline; 
}

public boolean isTaskdone(){
return taskdone; 
}

public void setTitel(String titel){
this.titel=titel; 
}

public void setBeskrivelse(String beskrivelse){
this.beskrivelse=beskrivelse; 
}

public void setDeadline(int deadline){
this.deadline=deadline; 
}

public void setTaskdone(boolean taskdone){
this.taskdone=taskdone; 
}

}
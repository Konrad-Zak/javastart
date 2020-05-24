package loop;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.stream.Stream;

public class Hospital {
    private Queue<Patient> patientQueue = new ArrayDeque<>();


    public void addPatient(Patient patient){
        if(patientQueue.size()<10){
        patientQueue.offer(patient);
        System.out.println("\nAdd to Queue: " + patient );
        } else {
            System.out.println("Sorry...full patients");
        }
    }

    public void peekFirstPatientQueue(){
        System.out.println("\nRemove: "+ patientQueue.peek());
        patientQueue.poll();
    }

    public void showQueue(){
        Stream.iterate(1,n->n+1)
                .limit(patientQueue.size())
                .forEach(n-> System.out.println(n + " " + patientQueue.peek()));
    }
}

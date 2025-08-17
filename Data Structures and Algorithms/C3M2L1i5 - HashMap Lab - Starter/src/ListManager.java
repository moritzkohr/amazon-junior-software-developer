// TODO 1: Import HashMap, Map, and Set types
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ListManager {
    // TODO 2: Create a new hash map named studentsMap //
    HashMap studentsMap = new HashMap();

    public ListManager(Student [] students){
        /* TODO 3:  Iterate through the studentsArray and add the
                    data to the studentsMap. Use the students'
                    last names as the keys and the student
                    objects as the values  */
        for(Student student : students){
            studentsMap.put(student.lastName, student);
        }
    }


    public void listStudents( ){
        // TODO 4: Check if studentsMap is empty.
        // TODO 5: If studentsMap is empty, print an alert saying that
        /* TODO 6: If the studentMap is not empty, print a list of all
                   student  */
        if(studentsMap.isEmpty()){
            System.out.println("No students in the list.");
        }else{
            Set entries = studentsMap.entrySet();
            for(Object entry:entries){
                Map.Entry mapEntry = (Map.Entry)entry;
                Student student = (Student)mapEntry.getValue();
                System.out.println(student);
            }
        }
    }

    public void findStudent(String lastName){
        /* TODO 7: Check to see if studentMap contains the
                   lastName as a key If the key is not found. Print an
                   error message and return.*/
        /* TODO 8: Get a reference to the Student whose key is the
                   lastName */
        // TODO 9: If the student exists, print the Student object
        // TODO 10: If the student doesn't exist. Print error message */
        if(studentsMap.containsKey(lastName)){
            System.out.println("Student found.");
            Student student = (Student) studentsMap.get(lastName);
            System.out.println(student);
        }else{
            System.out.println("Student not found.");
        }
    }


    public void updateStudentStatus(String lastName, String newStatus){
        /* TODO 12: Use the get() method on studentMap to obtain a
                    reference to the Student object */
        /* TODO 13: If the student exists, change the status to
                    newStatus, and print a confirmation message. */
        // TODO 14: Print an error message if the student doesn't exist.
        if(studentsMap.containsKey(lastName)){
            Student student = (Student) studentsMap.get(lastName);
            student.status = newStatus;
            studentsMap.put(lastName, student);
            System.out.println("Student ("+lastName+") status updated to " + newStatus +".");
        }else{
            System.out.println("Student not found.");
        }
    }


    public void removeStudent(String lastName){
        /* TODO 16: using the lastName parameter, attempt to remove
                    a student from the studentsMap */
        /* TODO 17:  print a message confirmation and student
                     information if the student was successfully
                     removed. */
        /* TODO 18: If the student is not removed, print
                    a statement that the student was not removed. */
        Student studentRemoved = (Student) studentsMap.remove(lastName);
        if(studentRemoved != null){
            System.out.println("Student ("+studentRemoved+") removed.");
        }else{
            System.out.println("Student was not removed.");
        }
    }
}
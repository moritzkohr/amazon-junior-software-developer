import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        Subject subject1=new Subject("Java",4);
        Subject subject2=new Subject("Java Online",4);
        Subject subject3=new Subject("JavaScript",6);
        Subject subject4=new Subject("JavaScript Online",6);
        Course course1=null;
        System.out.println("Available courses");
        System.out.println("1. Java");
        System.out.println("2. Java Online");
        System.out.println("3. JavaScript");
        System.out.println("4. Java Script Online");
        System.out.println("Enter course code:");
        int ch=scanner.nextInt();
        if(ch==1||ch==3)
            course1=new ClassroomCourse(subject1,"Mark",1000,"Cambbeidge","Winter");
        if(ch==2||ch==4)
            course1=new OnlineCourse(subject2,"Mark",1000);
        Learner learner=new Learner(name,course1);
        System.out.println("Enter assignment marks (max 100 for classroom course, 30 for online course)");
        int mark1=scanner.nextInt();
        System.out.println("Enter quiz marks (max 30 for classroom course, 10 for online course)");
        int mark2=scanner.nextInt();
        learner.assignmentScore(mark1);
        learner.quizScore(mark2);
        String title=learner.course.subject.title;
        System.out.println("Grade score: "+learner.calculateGrade());
        if(learner.gradeScore>=5)
            System.out.println("Congratulations "+learner.name+" you have successfully passed the "+title+" course");
        else
            System.out.println("Congratulations "+learner.name+" you have successfully completed the "+title+" course");
    }
}
public class ExamSchedule {
    private ExamNode head;
    private ExamNode current;

    public ExamSchedule() {
        this.head = null;
        this.current = null;
    }


    public void addExam(String examDetails) {
        // TODO 2: Implement logic to add an exam to the end of the linked list
    }


    public void viewNextExam() {
        if (current == null) {
            System.out.println("No exams available.");
        } else {
            // TODO 3: Implement the logic to move to the next exam in the list and displays it
        }
    }


    public void viewPreviousExam() {
        if (current == null) {
            System.out.println("No exams available.");
        } else {
            // TODO 4: Implement logic to move to the previous exam in the list and display it
        }
    }

    public void viewAllExamSchedule() {
        ExamNode temp = head;
        if (temp == null) {
            System.out.println("No exams scheduled.");
        } else {
            System.out.println("Exam Schedule:");
            while (temp != null) {
                System.out.println(temp.examDetails);
                temp = temp.next;
            }
        }
    }
}



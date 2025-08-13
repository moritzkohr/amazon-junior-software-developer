package com.lesson.lab;

public class Main {
    public static void main(String[] args) {
        // created array object of Student class
        Student[] students = new Student[5];
        // set the values through the constructor
        students[0] = new Student(1, "John", 19);
        // TODO 1:  create other 4 object of student class and assign to the array Students
        students[1] = new Student(2, "Alex", 17);
        students[2] = new Student(3, "David", 18);
        students[3] = new Student(4, "Mary", 16);
        students[4] = new Student(5, "Mike", 18);

        // TODO 2: Uncomment the method call once you have completed the mentioned tasks
        // remove 5th student from record
        int IndexToDelete = 4;
        System.out.println("Remove element at index: " + IndexToDelete);
        removeElement(IndexToDelete, students);
        // Add new student
        System.out.println("\n Add new student rollNumber: 6, name: Jane, age: 20");
        Student newStudent = new Student(6, "Jane", 20);
        AddElement(newStudent, students);
        //Update 3rd student information
        int IndexToUpdate = 2;
        System.out.println("\n Update an element at index: " + IndexToUpdate);
        updateElement(IndexToUpdate, students);
    }

    public static void removeElement(int IndexToDelete, Student[] originalArray) {
        //TODO 3: create a new array with a length less than the existing one. For example, if your existing array is students, the new array's size will be students.length - 1
        Student[] newArray = new Student[originalArray.length - 1];
        //TODO 4 : use a ‘for loop’ to copy all elements from the existing array to the new array, except for the element at the index you want to remove
        for (int i = 0, j = 0; i < originalArray.length; i++) {
            if (i != IndexToDelete) {
                newArray[j++] = originalArray[i];
            }
        }
        //TODO 5: if needed, add the new array back to your original array variable
        //TODO 6: call printArray method and pass "Remove" and new array.
        printArray("Remove", newArray);
    }

    public static void AddElement(Student newStudent, Student[] originalArray) {
        //TODO 7: define a new array with a length of students.length + 1. This ensures there is space for the new element.
        Student[] newArray = new Student[originalArray.length + 1];
        // TODO 8: use a ‘for loop’ to copy all elements from the existing students array to the new array. Iterate over each element and assign it to the corresponding index in the new array.
        for (int i = 0; i < newArray.length; i++) {
            if (i == (newArray.length - 1)) {
                newArray[i] = newStudent;
            } else {
                newArray[i] = originalArray[i];
            }
        }
        // TODO 9: create a newStudent object and assign it to the last index of the new array, which is newArray[newArray.length - 1].
        // TODO 10: place these three steps inside the addElement method in your class. printArray("Add",newArray);
        printArray("Add", newArray);
    }

    public static void updateElement(int indexToUpdate, Student[] originalArray) {
        // TODO 11: locate the element you need to update. Use the element's index of the array.
        //TODO 12: once you have the index, access the element and update its properties.
        // Use the ‘setter’ method in the Student class to change values like name, age, or ID.
        originalArray[indexToUpdate].setName("Sebastian");
        printArray("Update", originalArray);
    }

    public static void printArray(String message, Student[] students) {
       /* TODO 13: include a print statement to indicate the current action being performed,
           such as ‘Removing student’, ‘Adding student’, or ‘Updating student’
        */
        System.out.println(message);
        // TODO 14: use a ‘for loop’ to go through each element in the array.
        // TODO 15: within the loop, use the ‘getter’ method to fetch each student's details and print them using the student object.
        for (Student student : students) {
            System.out.println("Student Name:" + student.getName() + "\tStudent Age: " + student.getAge());
        }
    }
}

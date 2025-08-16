package com.lesson.lab;

public class TextEditorUndo {
    private String[] stack;
    private int top;

    // Constructor to initialize the stack and top index
    public TextEditorUndo(int size) {
        // TODO 1: initialize the stack array
        stack = new String[size];
        // TODO 2: set initial top index to -1
        top = -1;
    }

    // Method to add a new action to the stack
    public void push(String action) {
        // TODO 3: check if the stack is full
        // TODO 4: print message if the stack is full
        // TODO 5: increment top and add action to the stack
        // TODO 6: print confirmation message
        if (top == stack.length - 1) {
            System.out.println("Stack is full. No more actions can be added.");
        }else{
            stack[++top] = action;
            System.out.println("Action \""+action+"\" added to the stack.");
        }
    }

    // Method to remove and return the most recent action from the stack
    public String pop() {
        // TODO 7: Check if the stack is empty
        // TODO 8: Print message if the stack is empty and return null
        // TODO 9: Retrieve and remove the top action from the stack
        // TODO 10: Print confirmation message, return and replace empty string with the undone action
        if (top==-1){
            System.out.println("Undo Stack is empty. No more actions can be undone.");
            return null;
        }else{
            String action = stack[top--];
            System.out.println("Action \""+action+"\" undone.");
            return action;
        }
    }

    // Method to view the most recent action in the stack without removing it
    public String peek() {
        // TODO 11: Check if the stack is empty
        // TODO 12: Print message if the stack is empty and return null
        // TODO 13: Return and replace empty string with the most recent action without removing it
        if (top==-1){
            System.out.println("Undo Stack is empty. No actions can be viewed.");
            return null;
        }else{
            return stack[top];
        }
    }

    // Method to display all actions in the stack
    public void display() {
        // TODO 14: Check if the stack is empty
        // TODO 15: Print message if the stack is empty
        // TODO 16: Iterate through the stack and print each action
        // TODO 17: Print a new line after displaying all actions
        if(top==-1){
            System.out.println(("Undo Stack is empty."));
        }else{
            for (int i=0;i<=top;i++){
                System.out.println("\""+stack[i]+"\"");
            }
            System.out.println();
        }
    }
}
package com.lesson.lab;

public class TextEditorUndo {
    private String[] stack;
    private int top;

    // Constructor to initialize the stack and top index
    public TextEditorUndo(int size) {
        // TODO 1: initialize the stack array
        // TODO 2: set initial top index to -1
    }

    // Method to add a new action to the stack
    public void push(String action) {
        // TODO 3: check if the stack is full
        // TODO 4: print message if the stack is full
        // TODO 5: increment top and add action to the stack
        // TODO 6: print confirmation message
    }
    // Method to remove and return the most recent action from the stack
    public String pop() {
        // TODO 7: Check if the stack is empty
        // TODO 8: Print message if the stack is empty and return null
        // TODO 9: Retrieve and remove the top action from the stack
        // TODO 10: Print confirmation message, return and replace empty string with the undone action
        return "";

    }
    // Method to view the most recent action in the stack without removing it
    public String peek() {
        // TODO 11: Check if the stack is empty
        // TODO 12: Print message if the stack is empty and return null
        // TODO 13: Return and replace empty string with the most recent action without removing it
        return "";
    }

    // Method to display all actions in the stack
    public void display() {
        // TODO 14: Check if the stack is empty

        // TODO 15: Print message if the stack is empty

        // TODO 16: Iterate through the stack and print each action

        // TODO 17: Print a new line after displaying all actions
    }
}
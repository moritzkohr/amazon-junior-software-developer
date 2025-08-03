import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void textFileWrite() {
        Person person = new Person("John", 25, 70.5);
        String message = person.toString();
        try {
            FileWriter fileObj = new FileWriter("file1.txt");
            fileObj.write(message);
            System.out.println("File written with FileWriter...");
            fileObj.close();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    public static void printWrite() {
        String data;
        try {
            PrintWriter fileObj = new PrintWriter("file3.txt");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter name: ");
            String name = scanner.nextLine();
            System.out.println("Enter age: ");
            int age = scanner.nextInt();
            System.out.println("Enter weight: ");
            double weigth = scanner.nextDouble();
            Person person = new Person(name, age, weigth);
            data=person.toString();
            fileObj.println(data);
            fileObj.close();
            System.out.println("File written with PrintWriter...");
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    public static void binaryFileWrite() {
        byte[] numbers ={10,20,30,40,50};
        try(FileOutputStream fileObj=new FileOutputStream("file2.dat")){
            for (int i=0;i<numbers.length;i++){
                fileObj.write(numbers[i]);
            }
            System.out.println("File written with FileOutputStream...");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void streamWrite(){
        try{
            FileOutputStream fileObj=new FileOutputStream("file4.dat");
            DataOutputStream dataObj=new DataOutputStream(fileObj);
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter name: ");
            String name=scanner.nextLine();
            System.out.println("Enter age: ");
            int age=scanner.nextInt();
            System.out.println("Enter weight: ");
            double weight=scanner.nextDouble();
            Person person=new Person(name,age,weight);
            dataObj.writeUTF(person.name);
            dataObj.writeInt(person.age);
            dataObj.writeDouble(person.weight);
            dataObj.close();
            System.out.println("File written with DataOutputStream...");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        textFileWrite();
        printWrite();
        binaryFileWrite();
        streamWrite();
    }
}
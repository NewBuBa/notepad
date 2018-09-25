package notepad;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static List<String> personList = new ArrayList();

    public static void main(String[] args) {
        while(true){
            System.out.println("Enter command");
            String cmd = scanner.next();
            switch (cmd){
                case "create":
                    create();
                    break;
                case"exit":
                    return;
                default:
                    System.out.println("It is't a comand");
            }
        }

    }

    private static void create() {
        notepad.Person person = new notepad.Person();
        System.out.println("Enter Id");
        person.setId(scanner.nextInt());
        System.out.println("Enter Name");
        person.setName(scanner.next());
        System.out.println("Enter Surname");
        person.setSurname(scanner.next());
        System.out.println("Enter Phone");
        person.setPhone(scanner.nextInt());
        System.out.println(person.getId() + " " + person.getName() + " " + person.getSurname() + " " + person.getPhone());
    }
}
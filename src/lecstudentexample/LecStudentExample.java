/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lecstudentexample;

import java.util.Scanner;

/**
 *
 * @author musulinm
 */
public class LecStudentExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        lecStudent[] students = new lecStudent[5];
        
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter a name");
            String name = input.nextLine();
            students[i] = new lecStudent(name);   
        }
        
        students[2].setAge(18);
        
        for (lecStudent student: students) {
            System.out.printf("Student %s is %d years old\n", 
                    student.getName(), student.getAge());
        }
    }
    
}

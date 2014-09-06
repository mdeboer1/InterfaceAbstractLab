/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;
import java.util.Scanner;
/**
 * As with lab1, when using Liskov's Substitution Principle, any method not
 * contained in the parent class is not immediately available to the object, casting
 * is needed.  
 * @author meboer1
 */
public class Startup {
    
    public static void main (String[] args){
        
        String courseName, courseNumber, prerequisite;
        double credits;
        Scanner keyboard = new Scanner(System.in);
        
        //Use Liskov's Substitution Principle
        
        ProgrammingCourse a = new IntroToProgrammingCourse();
        ProgrammingCourse b = new IntroJavaCourse();
        ProgrammingCourse c = new AdvancedJavaCourse();
        
        //Use standard object instantiation
        IntroToProgrammingCourse d = new IntroToProgrammingCourse();
        IntroJavaCourse e = new IntroJavaCourse();
        AdvancedJavaCourse f = new AdvancedJavaCourse();
        
        System.out.println("Enter in the course number.");
        courseNumber = keyboard.nextLine();
        
        System.out.println("Enter in the course name.");
        courseName = keyboard.nextLine();
        
        System.out.println("Enter in the prerequisite, if any.");
        prerequisite = keyboard.nextLine();
        
        System.out.println("Enter in the number of credits.");
        credits = Double.parseDouble(keyboard.nextLine());
        
        ((IntroToProgrammingCourse)a).setCourseNumber(courseNumber);
        ((IntroToProgrammingCourse)a).setCourseName(courseName);
        ((IntroToProgrammingCourse)a).setCredits(credits);
        
        System.out.println(a.getCourseName() + " " + a.getCourseNumber() + " " +
                ((IntroToProgrammingCourse)a).getCredits());
        
        ((IntroJavaCourse)b).setCourseNumber(courseNumber);
        ((IntroJavaCourse)b).setCourseName(courseName);
        ((IntroJavaCourse)b).setCredits(credits);
        ((IntroJavaCourse)b).setPrerequisites(prerequisite);
        
        System.out.println(b.getCourseName() + " " + b.getCourseNumber() + " " +
                ((IntroJavaCourse)b).getCredits() + " " + 
                ((IntroJavaCourse)b).getPrerequisites());
        
        ((AdvancedJavaCourse)c).setCourseNumber(courseNumber);
        ((AdvancedJavaCourse)c).setCourseName(courseName);
        ((AdvancedJavaCourse)c).setCredits(credits);
        ((AdvancedJavaCourse)c).setPrerequisites(prerequisite);
        
        System.out.println(c.getCourseName() + " " + c.getCourseNumber() + " " +
                ((AdvancedJavaCourse)c).getCredits() + " " + 
                ((AdvancedJavaCourse)c).getPrerequisites());
        
        //With Liskov's Principle, methods not in the superclass are not available
        //to be used by the object without casting it first
        
        d.setCourseNumber(courseNumber);
        d.setCourseName(courseName);
        d.setCredits(credits);
        
        System.out.println(d.getCourseName() + " " + d.getCourseNumber() + " " +
                d.getCredits());
        
        e.setCourseNumber(courseNumber);
        e.setCourseName(courseName);
        e.setCredits(credits);
        e.setPrerequisites(prerequisite);
        
        System.out.println(e.getCourseName() + " " + e.getCourseNumber() + " " +
                e.getCredits() + " " + e.getPrerequisites());
        
        f.setCourseNumber(courseNumber);
        f.setCourseName(courseName);
        f.setCredits(credits);
        f.setPrerequisites(prerequisite);
        
        System.out.println(f.getCourseName() + " " + f.getCourseNumber() + " " +
                f.getCredits() + " " + f.getPrerequisites());

    }
 
}

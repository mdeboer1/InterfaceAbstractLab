/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;
import java.util.Scanner;
/**
 * This class is used to test Lab1 package.  In use is standard instantiation 
 * and Liskov's Substitution Principle.  In the latter, methods in the subclass
 * are not directly available to the object, since it was created as a superclass
 * type.  Because of this, casting the object name to the correct subclass type 
 * was required before access would be allowed.  This was not the case obviously
 * with the standard way of object creation.  This creates more coding, though
 * was not difficult to overcome.  An advantage of this is when both classes have
 * the same methods, overridden in the subclass, that may work differently than
 * in the superclass.  This allows the flexibility to use the correct method for
 * the situation.  Though this could be done by using the super.methodName as well.
 * 
 * @author mdeboer1
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
        
        a.setCourseNumber(courseNumber);
        a.setCourseName(courseName);
        a.setCredits(credits);
        
        System.out.println(a.getCourseName() + " " + a.getCourseNumber() + " " +
                a.getCredits());
        
        b.setCourseNumber(courseNumber);
        b.setCourseName(courseName);
        b.setCredits(credits);
        ((IntroJavaCourse)b).setPrerequisites(prerequisite);
        
        System.out.println(b.getCourseName() + " " + b.getCourseNumber() + " " +
                b.getCredits() + " " + ((IntroJavaCourse)b).getPrerequisites());
        
        c.setCourseNumber(courseNumber);
        c.setCourseName(courseName);
        c.setCredits(credits);
        ((AdvancedJavaCourse)c).setPrerequisites(prerequisite);
        
        System.out.println(c.getCourseName() + " " + c.getCourseNumber() + " " +
                c.getCredits() + " " + ((AdvancedJavaCourse)c).getPrerequisites());
        
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

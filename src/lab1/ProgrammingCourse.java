/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

import javax.swing.JOptionPane;

/**
 *
 * @author mdeboer1
 */
public abstract class ProgrammingCourse {
    
    private String courseName, courseNumber;
    
    public ProgrammingCourse() {
        
    }

    public String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }
    
    public String getCourseNumber(){
        return courseNumber;
    }

    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }
    
    public String getCourseName() {
        return courseName;
    }
    
    public abstract void setCredits(double credits);
    public abstract double getCredits();
}

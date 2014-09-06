/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

/**
 *
 * @author mdeboer1
 */
public abstract class ProgrammingCourse {
    
    private String courseName;
    
    public ProgrammingCourse(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public abstract String getCourseNumber();

    public abstract void setCourseNumber(String courseNumber);

    }

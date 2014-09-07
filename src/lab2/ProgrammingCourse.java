/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;

/**
 * This is an interface for implementation in other course subclasses.
 * @author mdeboer1
 */
public interface ProgrammingCourse {
    
    public String getCourseNumber();
    
    public void setCourseNumber(String courseNumber);
    
    public void setCourseName(String courseName);
    
    public String getCourseName();
    
    public String getCapitalizedCourseName();

}

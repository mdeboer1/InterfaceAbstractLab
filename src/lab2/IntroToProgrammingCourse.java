package lab2;

import javax.swing.JOptionPane;

/**
 * Methods set/get all properties for the intro class.  JOptionPane used for all
 * error output.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroToProgrammingCourse implements ProgrammingCourse {
    private double credits;
    String courseNumber, courseName;

    public IntroToProgrammingCourse() {
        super();
    }

    public String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }
    
    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }

    public String getCourseNumber() {
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
    
}

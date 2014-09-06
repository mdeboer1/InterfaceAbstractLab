package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      mdeboer1
 * @version     1.00
 */
public class AdvancedJavaCourse extends ProgrammingCourse {
    
    private double credits;
    private String prerequisites;

    public AdvancedJavaCourse() {
        super();
    }

    public String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }
    
    public double getCredits(){
        return credits;
    }
}

package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      mdeboer1
 * @version     1.00
 */
public class IntroJavaCourse extends ProgrammingCourse{
    
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber) {
        super(courseName);
        this.courseNumber = courseNumber;
    }

    public double getCredits() {
        return credits;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

        public void setCredits(double credits) {
        if(credits < 0 || credits > 4.0) {
            System.out.println(
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }

    @Override
    public String getCourseNumber() {
        return courseNumber;
    }

    @Override
    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

}

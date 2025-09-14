package OOPs.InstanceVsClassVariables_Methods;

public class Q2 {
    static class Course {
        String courseName;
        int duration; // in months
        double fee;
        static String instituteName = "ABC Institute";

   
        Course(String courseName, int duration, double fee) {
            this.courseName = courseName;
            this.duration = duration;
            this.fee = fee;
        }

     
        void displayCourseDetails() {
            System.out.println("Course: " + courseName + ", Duration: " + duration + " months, Fee: " + fee + ", Institute: " + instituteName);
        }

  
        static void updateInstituteName(String newName) {
            instituteName = newName;
        }
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 6, 15000);
        Course c2 = new Course("Web Development", 4, 12000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        Course.updateInstituteName("XYZ Academy");

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}

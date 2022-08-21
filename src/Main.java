public class Main {
    public static void main(String[] args) {

//        System.out.println();
//
//        Course course1 = new Course("JAVA", "Мухамед Алланов","01.07.2022","9 месяцев","м/р Восток-5 улица Гражданская 119");
//        Student student1 = new Student("Kerezbek",18,"male",20,"Beginner","Offline");
//        Student student2 = new Student("Helen",30,"female",50,"Advanced","Online");
//        Student student3 = new Student("Otoguro",23,"male",40,"Advenced","Offline");
//
//        course1.addStudent(student1);
//        course1.addStudent(student2);
//        course1.addStudent(student3);
//
//        System.out.println("----COURSE DETAILS----");
//        System.out.println("Course name: "+course1.getCourseName());
//        System.out.println("Instructor name: "+course1.getInstructorName());
//        System.out.println("Start date: "+course1.getStartedAt());
//        System.out.println("Course lenght: "+course1.getCourseLenght());
//        System.out.println("Course adress: "+course1.getCourseAdress());
//        System.out.println("Minimum typing speed: "+course1.getMinimumTypingSpeed());
//
//        System.out.println("--------------------");
//        System.out.println("Students passed = "+course1.getLastStudentIndex());
//        System.out.println("Students rejected = "+course1.getRejectedStudents());
//
//        System.out.println("\n----STUDENTS PASSED REJECTED----");
//
//        for (int i = 0; i < course1.getLastStudentIndex(); i++) {
//            Student [] passedStudents = course1.();
//
//            System.out.println("NAme: "+passedStudents[i].getStudentName());
//            System.out.println("Age: "+passedStudents[i].getAge());
//            System.out.println("Gender: "+passedStudents[i].getGender());
//            System.out.println("Typing speed: "+passedStudents[i].getTypingSpeed());
//            System.out.println("English level: "+passedStudents[i].getEnglishLevel());
//            System.out.println("Study format: "+passedStudents[i].getStudyFormat());
//            System.out.println("-------------------");



//        }

        Course course1 = new Course("Java", "Muhamed","01.07.22" ,
                "9 month","Гражданская 119");

        Student student1 = new Student("Kerezbek",18,"Man",
                20, "Beginner", "Offline");
        Student student2 = new Student("Maroulis",30,"Woman",
                65, "Advanced", "Online");
        Student student3 = new Student("Otoguro",23,"Man",
                40, "Advanced", "Offline");

        course1.addStudent(student1);
        course1.addStudent(student2);
        course1.addStudent(student3);

        System.out.println("*****COURSE DETAILS*****");
        System.out.println("Course name: "+course1.getCourseName());
        System.out.println("Instructor name: "+course1.getInstructorName());
        System.out.println("Start date: "+course1.getStartedAt());
        System.out.println("Course lenght: "+course1.getCourseLength());
        System.out.println("Course adress: "+course1.getCourseAddress());
        System.out.println("Minimum Typing Speed: "+course1.getMinimumTypingSpeed());

        System.out.println("******************");
        System.out.println("Students passed = "+(course1.getLastStudentIndex()));
        System.out.println("Students rejected = "+course1.getRejectedStudents());

        System.out.println("\n*****STUDENTS PASSED DETAILS*****");
        for (int i = 0; i < course1.getLastStudentIndex(); i++) {
            Student[] passedStudents = course1.getStudents();

            System.out.println("Name : "+ passedStudents[i].getStudentName());
            System.out.println("Age:  "+ passedStudents[i].getAge());
            System.out.println("Gender : "+ passedStudents[i].getGender());
            System.out.println("Typing speed : "+ passedStudents[i].getTypingSpeed());
            System.out.println("English level : "+ passedStudents[i].getEnglishLevel());
            System.out.println("Study format : "+ passedStudents[i].getStudyFormat());
            System.out.println("********************");
        }
    }
}
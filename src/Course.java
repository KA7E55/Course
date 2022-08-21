public class Course {
//    private String courseName;
//    private String instructorName;
//    private String startedAt;
//    private Course[] students = new Course[70];
//    private String courseLenght;
//    private String courseAdress;
//    private  int minimumTypingSpeed = 20;
//    private int lastStudentIndex = 0;
//    private int rejectedStudents = 0;
//    public Course(String courseName,String instructorName,String startedAt,
//                  String courseLenght,String courseAdress){
//        this.courseName = courseName;
//        if (instructorName.length()<=2){
//            System.out.println("Имя инструктора введено неправильно");
//        }else {
//            this.instructorName = instructorName;
//            this.startedAt = startedAt;
//            this.courseLenght = courseLenght;
//            this.courseAdress = courseAdress;
//        }
//    }
//    public String getCourseName(){
//        return courseName;
//    }
//    public String getInstructorName(){
//        return instructorName;
//    }
//    public String getStartedAt(){
//        return startedAt;
//    }
//    public Student[] = getStudents(){
//        return students;
//    }
//    public int getLastStudentIndex(){
//        return lastStudentIndex;
//    }
//    public int getRejectedStudents(){
//        return rejectedStudents;
//    }
//    public String getCourseLenght(){return courseLenght;}
//    public String getCourseAdress(){return courseAdress;}
//    public int getMinimumTypingSpeed(){return minimumTypingSpeed;}
//
//    public void addStudent(Student student){
//
//        if (student.getTypingSpeed()>minimumTypingSpeed){
//            students[lastStudentIndex]=student;
//            lastStudentIndex++;
//        }else {
//            rejectedStudents++;
//        }
//
//    }
    private String courseName;
    private String instructorName;
    private String startedAt;
    private Student[] students = new Student[70];
    private String courseLength;
    private String courseAddress;
    private int minimumTypingSpeed = 20;
    private int lastStudentIndex = 0;
    private int rejectedStudents = 0;
    public Course(String courseName, String instructorName, String startedAt,
                  String courseLength, String courseAddress){
        this.courseName = courseName;
        if(instructorName.length()<=2)
            System.out.println("Имя инструктора введено неправильно");
        else
            this.instructorName = instructorName;
        this.startedAt = startedAt;
        this.courseLength = courseLength;
        this.courseAddress = courseAddress;
    }
    public String getCourseName() {
        return courseName;
    }
    public String getInstructorName() {
        return instructorName;
    }
    public String getStartedAt(){
        return startedAt;
    }
    public Student[] getStudents(){
        return students;
    }
    public int getLastStudentIndex(){
        return lastStudentIndex;
    }
    public int getRejectedStudents(){
        return rejectedStudents;
    }
    public String getCourseLength(){
        return courseLength;
    }
    public String getCourseAddress(){
        return courseAddress;
    }
    public int getMinimumTypingSpeed(){
        return minimumTypingSpeed;
    }
    public void addStudent(Student student){
        if(student.getTypingSpeed()>minimumTypingSpeed){
            students[lastStudentIndex] = student;
            lastStudentIndex++;
        }
        else
            rejectedStudents++;
    }

}

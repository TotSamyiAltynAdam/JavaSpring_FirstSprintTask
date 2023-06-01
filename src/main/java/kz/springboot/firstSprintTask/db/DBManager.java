package kz.springboot.firstSprintTask.db;

import java.util.ArrayList;

public class DBManager {
    private static ArrayList<Students> students = new ArrayList<>();
    static {
        students.add(new Students(1L,"Ilyas","Zhaunyshev",88,"B"));
        students.add(new Students(2L,"Serik","Erikov",91,"A"));
        students.add(new Students(3L,"Erik","Serikov",65,"C"));
        students.add(new Students(4L,"Nurzhan","Bolatov",48,"F"));
        students.add(new Students(5L,"Partick","Zuckerberg",100,"A"));
        students.add(new Students(6L,"Sabina","Assetova",33,"F"));
        students.add(new Students(7L,"Madina","Adiletova",77,"B"));
        students.add(new Students(8L,"Karina","Serzhanova",51,"D"));
    }
    private static Long id = 9L;
    public static ArrayList<Students> getStudents(){
        return students;
    }
    public static void addStudent(Students student){
        student.setId(id++);
        if(student.getExam()>=90) student.setMark("A");
        else if(student.getExam()>=75) student.setMark("B");
        else if(student.getExam()>=60) student.setMark("C");
        else if(student.getExam()>=50) student.setMark("D");
        else student.setMark("F");
        students.add(student);
    }
}

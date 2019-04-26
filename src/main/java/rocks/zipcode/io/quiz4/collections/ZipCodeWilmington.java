package rocks.zipcode.io.quiz4.collections;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {
    List<Student> list;

    public ZipCodeWilmington(List<Student> list) {
        this.list = list;
    }

    public ZipCodeWilmington() {
        this.list = new ArrayList<>();
    }

    public void enroll(Student student) {
        list.add(student);

    }

    public Boolean isEnrolled(Student student) {
        for(Student s1 : list){
            if(s1 == student)
                return true;
        }
        return false;
    }

    public void lecture(double numberOfHours) {
        for(Student s1 : list){
            s1.learn(numberOfHours);
        }

    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> studentStudyMap = new TreeMap<>();
        list.forEach(student -> studentStudyMap.put(student, student.getTotalStudyTime()));
        return studentStudyMap;
    }

//        Map<Student, Double> map = new HashMap<>();
//        for (Student s1 : list)
//            map.put(s1, s1.getTotalStudyTime());
//
//        return map;
//    }
}

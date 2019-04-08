package rocks.zipcode.io.quiz4.collections;



/**
 * @author leon on 11/12/2018.
 */
public class Student {
    private Double totalAmountOfHoursLearned;
    private int id;


    public Student() {
        this.id = id;

       // this(null);
    }

    public Student(Integer id) {

    }

    public void learn(Double amountOfHours) {
        totalAmountOfHoursLearned =amountOfHours;

    }

    public Double getTotalStudyTime() {

        return totalAmountOfHoursLearned;
    }
}

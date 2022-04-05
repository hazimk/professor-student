package maltepe.edu.tr.oop;

public class Student extends Person implements Do_sport {

    public Student(int stu_ID) {
        this.stu_ID = stu_ID;
    }

    private int stu_ID;

    public Student() {

    }

    public int getStu_ID() {
        return stu_ID;
    }

    public void setStu_ID(int stu_ID) {
        this.stu_ID = stu_ID;
    }

    void learns() {

        System.out.println("prof"+"stu_name"+"is teaching now" );
    }
    @Override
    public void Speak(){
        System.out.println("Student can speak");
    }


    @Override
    public void swim() {

    }

    @Override
    public void play_football() {

    }

    @Override
    public void swimming(String prof, Sportscenter sc) {

    }

    @Override
    public void playingFootball(String prof, Sportscenter sc) {

    }
}

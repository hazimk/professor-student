package maltepe.edu.tr.oop;

public abstract class Person {


    public Person() {
//        this.stu_name = stu_name;
//        this.pro_name = pro_name;
//    }
//
//    private String stu_name;
//    private String pro_name;
//
//    public String getStu_name() {
//        return stu_name;
//    }
//
//    public void setStu_name(String stu_name) {
//        this.stu_name = stu_name;
//    }
//
//    public String getPro_name() {
//        return pro_name;
//    }
//
//    public void setPro_name(String pro_name) {
//        this.pro_name = pro_name;
//    }
//

    void Speak(){
        System.out.println("Person can speak");
    }

    public abstract void swim();

    public abstract void play_football();


    public void playing(){
        System.out.println("Person can play");
    }

    public abstract void swimming(String prof, Sportscenter sc);

    public abstract void playingFootball(String prof, Sportscenter sc);
}

    public abstract void swim();

    public abstract void play_football();
}



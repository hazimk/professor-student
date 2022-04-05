package maltepe.edu.tr.oop;

public class Main {



    public static void main(String[] args){
        Person obj0 = new Person() {
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
        };
        Professor obj1 = new Professor();
        Student obj2 = new Student();

       obj0.Speak();
       obj2.Speak();





    }
}

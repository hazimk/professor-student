package maltepe.edu.tr.oop;

public class Main {



    public void main(String[] args) {
        Person obj0 = new Person();
        Professor obj1 = new Professor();
        Student obj2 = new Student();


     obj0.setName("ensar");
     //obj0.getName();
        System.out.println(obj0.getName());

        obj0.setName1("hazem");
        //obj0.getName1();
        System.out.println(obj0.getName1());
////////////////////////////////////////////////////////////////
        obj2.setstu_ID(19222);
        System.out.println(obj2.getstu_ID());

        System.out.println("khalil");

        obj1.setPro_ID(123456);
        System.out.println(obj1.getpro_ID());


        //System.out.println("");
    }
}

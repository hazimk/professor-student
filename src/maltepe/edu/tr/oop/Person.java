package maltepe.edu.tr.oop;

public class Person {

    public Person() {

    }
   private String stu_name;
   private String pro_name;

   public   void setName (String n){

         stu_name=n;
     }
    public String getName(){
         return stu_name;
     }

   public void setName1 (String n){

        pro_name=n;
    }
   public String getName1(){
        return pro_name;
    }

}

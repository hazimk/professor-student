package maltepe.edu.tr.oop;

public class Professor extends Person {
    public Professor() {

    }
        private int pro_ID;


 public void setPro_ID (int pi) {

    pro_ID = pi;
  }
  public int getpro_ID() {
    return pro_ID;

  }

    void teaches () {

        System.out.println("prof"+pro_name+"is teaching now" )
    }
  }



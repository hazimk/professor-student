package maltepe.edu.tr.oop;
import java.util.ArrayList;
public class Sportscenter {

    String football_field;
    String swimming_pool;


    static ArrayList<String> players;

    public Sportscenter() {

        players = new ArrayList<String>();
    }
    public void addMembers(String name){
        players.add(name);
    }
    public ArrayList<String> printMembers(){
        System.out.println(players + " is in sport center");

        return players;
    }



}

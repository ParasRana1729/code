import java.util.ArrayList;

public class UsersData {

    private String _name;
    private String _membership = "Bronze";

    public static ArrayList<UsersData> Admin;

    public UsersData(){
        
    }

    public static void print_data(){
        for(UsersData u : Admin){
            System.out.println(u);
        }
    }

    public String toString(){
        return get_name() + " " + get_membership();
    } 

    public boolean equals(UsersData data2){
        if(get_name() == data2.get_name() && get_membership() == data2.get_membership()){
            return true;
        } else{
            return false;
        }
    }

    public UsersData(String name, Membership membership) {
        set_name(name);
        set_membership(membership);
    }

    void set_name(String name) {
        _name = name;
    }

    String get_name() {
        return _name;
    }

    void set_membership(Membership membership) {
        _membership = membership.toString();
    }

    String get_membership() {
        return _membership;
    }

    public enum Membership {
        Gold,
        Silver,
        Bronze,
    }
}

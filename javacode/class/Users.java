import java.util.ArrayList;

public class Users {

    public static void main(String args[]) {
        UsersData.Admin = new ArrayList<UsersData>();
        UsersData.Admin.add(new UsersData("Paras", UsersData.Membership.Gold));
        UsersData.Admin.add(new UsersData("Raul", UsersData.Membership.Silver));
        UsersData.print_data();
        
    }
}

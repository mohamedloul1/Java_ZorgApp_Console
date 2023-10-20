public class Users {
    int userId;
    String userName;

    String userType;

public Users(int userId, String UserName, String UserType){
    this.userId = userId;
    this.userName=UserName;
    this.userType=UserType;

}

public int getUserId(){return userId;}
    public String getUserName(){return userName;}
    public String getUserType(){return userType;}

}

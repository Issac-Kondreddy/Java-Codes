public class static_keyword {
    public static void main(String[] args) {
        //static - modifier, A single copy of variable is created and shared
        //the class owns the static member
        Friend friend1 = new Friend("Pranay");
        Friend friend2 = new Friend("Bharadwaj");
        Friend  friend3 = new Friend("Sulthan");
        Friend friend4 = new Friend("Nandha");
//        System.out.println(Friend.NumberofFriends);
        Friend.displayfriends();
        //if no static keyword is there then each objects referred to individual copu!!
        //means everytime we print it says one

    }
}

class Friend{
    String name;
    static int NumberofFriends;
    Friend(String name){
        this.name = name;
        NumberofFriends++;
    }
    static void displayfriends(){
        System.out.println("You have " +NumberofFriends + " Friends");
    }
}
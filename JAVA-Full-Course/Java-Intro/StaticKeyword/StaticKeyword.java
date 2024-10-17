package StaticKeyword;

public class StaticKeyword {

    public static void main(String[] args) {
        
        Friend friend1 = new Friend("Rebel");
        Friend friend2 = new Friend("Star");
        Friend friend3 = new Friend("Prabhas");
        Friend friend4 = new Friend("Pawan");

        Friend.displayFriends();
    }
}

// static = modifier. A single copy of a variable/method is created and shared.
//          The class "owns" the static member

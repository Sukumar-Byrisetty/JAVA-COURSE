package AccessModifiers.Package1;
import AccessModifiers.Package2.*;

public class A {

    public static void main(String[] args) {

        // public message eg:
        C c = new C();
        System.out.println(c.publicMessage);

        // protected message eg:
        // protected String protectedMessage = " This is protected";

        // private message eg:
        // B b = new B();
        // System.out.println(b.privateMessage);
    }
}

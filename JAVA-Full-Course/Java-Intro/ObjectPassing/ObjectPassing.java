package ObjectPassing;

public class ObjectPassing {

    public static void main(String[] args) {

        Showroom showroom = new Showroom();
        Mobile mobile1 = new Mobile("OnePlus");
        Mobile mobile2 = new Mobile("RealMe");

        showroom.repair(mobile1);
        showroom.repair(mobile2);

    }
}

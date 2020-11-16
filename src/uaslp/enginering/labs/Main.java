package uaslp.enginering.labs;

public class Main {

    public static void main(String[] args) {
        try {
            otro();
        } catch (PhantomCollisionException e) {
            System.out.println("B1 Phantom Collision");
        }
    }

    public static void otro() throws PhantomCollisionException {
        try {
            System.out.println("A0 Inicia");
            move(2);
            System.out.println("A1 Try");
        }  catch (WallCollisionException e) {
            System.out.println("A3 WallCollision");
            //e.printStackTrace();
        } finally {
            System.out.println("A5 Sentencias despues de Try and Catch");
        }

        System.out.println("A4 Finaliza");
    }

    private static void stopMovement() {

    }

    private static void die() {

    }

    public static void move(int delta) throws PhantomCollisionException, WallCollisionException {
        setPosition(getX() + 1, getY());

        if (hasCollisions(Phantom.class) || delta == 1) {
            throw new PhantomCollisionException();
        }

        if (hasCollisions(Wall.class) || delta == 2) {
            throw new WallCollisionException();
        }

    }

    public static void setPosition(int x, int y) {

    }

    public static int getX() {
        return 0;
    }

    public static int getY() {
        return 0;
    }

    public static boolean hasCollisions(Class c) {
        boolean booleanForTest = false;

        return booleanForTest;
    }


}
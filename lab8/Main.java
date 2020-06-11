package lab8;

import lab6.PopularSong;
import lab7.MyList;


public class Main {
    public static void main(String[] args) {
        String name = null;

        try {
            new MyList().add(new PopularSong("123", -23));
            System.out.println(":)");
        } catch (WrongNameValueException e) {
//            System.out.println("Композиція не може бути без назви.");
            System.out.println(e.getMessage());
        } catch (WrongDurationValueException e) {
//            System.out.println("Композиція не може бути без часу.");
            System.out.println(e.getMessage());
        }
    }

    static void myMethod() {
        throw new NullPointerException();
    }
}

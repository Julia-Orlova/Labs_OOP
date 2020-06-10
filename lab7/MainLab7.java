package lab7;

import lab6.PopularSong;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MainLab7 {
    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.add(new PopularSong("Song 7", 2));
        myList.add(new PopularSong("Song 8", 4));
        myList.add(new PopularSong("Song 9", 5));

        Iterator iterator = myList.iterator();

        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());

        try {
            System.out.println(iterator.next());
        } catch (NoSuchElementException e) {
            System.out.println("");
        }
    }
}

package lab6;

public class Main {
    public static void main(String[] args) {
        Albom albom = new Albom();
        albom.add(new PopularSong("Song 1", 4));
        albom.add(new PopularSong("Song 2", 3));
        albom.add(new RockSong("Song 3", 7));
        albom.add(new ClassicSong("Song 4", 8));
        albom.add(new PopularSong("Song 5", 5));
        albom.add(new ClassicSong("Song 6", 12));

        System.out.print(albom);
        System.out.print("\nТривалість альбому: " + albom.a() + " хвилин");
        System.out.print("\n-----------------------------------\n");
        System.out.print("Композиції, що відповідають заданому діапазону:\n");

        Song[] findSongs = albom.getSongsInRange(2, 6);

        for (Song foundSong : findSongs) {
            System.out.println(foundSong);
        }

        System.out.print("-----------------------------------\n");
        albom.sortByTime();
    }
}

package day12.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        MusicArtist artist1 = new MusicArtist("Jim", 36);
        MusicArtist artist2 = new MusicArtist("Jimmy", 36);
        MusicArtist artist3 = new MusicArtist("Vasya", 25);
        List<MusicArtist> listA = new ArrayList<>(Arrays.asList(artist1, artist2));
        List<MusicArtist> listB = new ArrayList<>(Arrays.asList(artist3));

        MusicBand band1 = new MusicBand("Band1", 2020, listA);
        MusicBand band2 = new MusicBand("Band2", 2020, listB);
        System.out.println(band1);
        System.out.println(band2);
        MusicBand.transferMembers(band1, band2);
        band1.printMembers();
        band2.printMembers();

    }
}

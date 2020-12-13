package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> membersListA = new ArrayList<>(Arrays.asList("Lars Ulrich", "James Hatefield", "Kirck Hammeth"));
        List<String> membersListB = new ArrayList<>(Arrays.asList("Jim"));
        MusicBand metallica = new MusicBand("Metallica", 1981, membersListA);
        MusicBand nonameBand = new MusicBand("Noname Super Puper Jimmys's Band", 2020, membersListB);

        System.out.println(metallica);
        System.out.println(nonameBand);

        MusicBand.transferMembers(metallica, nonameBand);
        System.out.println(metallica.participantsList);
        System.out.println(nonameBand.participantsList);
    }
}

package day12.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> musicBandList = new ArrayList<>(Arrays.asList(
                new MusicBand("Metallica", 1981),
                new MusicBand("Scorpions", 1965),
                new MusicBand("Rolling Stones", 1962),
                new MusicBand("Slipknot", 1995),
                new MusicBand("In Flames", 1990),
                new MusicBand("Hollywood Undead", 2005),
                new MusicBand("Bring me te horizon", 2004),
                new MusicBand("Billy Talent", 1993),
                new MusicBand("Muse", 1994),
                new MusicBand("Limp Bizkit", 1994),
                new MusicBand("Korn", 1993)
        ));

        Collections.shuffle(musicBandList);
        System.out.println(musicBandList);
        System.out.println(groupsAfter2000(musicBandList));
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> result = new ArrayList<>();
        for (MusicBand band : bands) {
            if (band.getYear() > 2_000) {
                result.add(band);
            }
        }
        return result;
    }
}

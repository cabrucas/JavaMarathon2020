package day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    List<MusicArtist> participantsList;

    public MusicBand(String name, int year, List<MusicArtist> participantsList) {
        this.name = name;
        this.year = year;
        this.participantsList = participantsList;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public static void transferMembers(MusicBand a, MusicBand b) {
        b.participantsList.addAll(a.participantsList);
        a.participantsList.clear();
    }

    public List<MusicArtist> getMembers() {
        return participantsList;
    }

    public void printMembers() {
        System.out.println(participantsList);
    }

    @Override
    public String toString() {
        return String.format("%s {%s, %d, %s}", getClass().getSimpleName(), name, year, participantsList);
    }
}

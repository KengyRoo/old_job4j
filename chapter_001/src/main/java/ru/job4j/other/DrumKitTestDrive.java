package ru.job4j.other;

public class DrumKitTestDrive {
    public static void main (String[] args) {
        DrimKit d = new DrimKit();
        d.playShare();
        d.snare = false;
        d.playToHat();

        if (d.snare == true) {
            d.playShare();
        }
    }
}

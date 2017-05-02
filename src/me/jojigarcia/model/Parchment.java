package me.jojigarcia.model;

/**
 * Created by garci on 02/05/2017.
 */
public class Parchment extends Available implements Revision{
    public Parchment() {
    }

    public Parchment(int code, String title, int year) {
        super(code, title, year);
    }

    @Override
    public String toString() {
        return "Parchment( " +
                super.toString();
    }
}

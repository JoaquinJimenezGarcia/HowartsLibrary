package me.jojigarcia.model;

/**
 * Created by garci on 02/05/2017.
 */
public class Map extends Available implements Revision{

    public Map() {
    }

    public Map(int code, String title, int year) {
        super(code, title, year);
    }

    @Override
    public String toString() {
        return "Map( " +
                super.toString();
    }
}

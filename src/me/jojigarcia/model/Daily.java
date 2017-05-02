package me.jojigarcia.model;

/**
 * Created by joaquinjimenezgarcia on 27/4/17.
 */
public class Daily extends Available implements Loan{
    java.util.Date date = new java.util.Date();

    public Daily() {
    }

    public Daily(int code, String title, int year) {
        super(code, title, year);
        this.date  = new java.util.Date();
    }

    @Override
    public String toString() {
        return "Daily( " +
                "date = " + date +
                " ha devolver en "+toReturn() + " días " +
                super.toString();
    }

    public int toReturn(){
        int days = 30;

        return days;
    }
}

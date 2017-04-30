package me.jojigarcia.model;

/**
 * Created by joaquinjimenezgarcia on 27/4/17.
 */
public class Daily extends Available implements Loan{
    public Daily() {
    }

    public Daily(int code, String title, int year) {
        super(code, title, year);
    }
}

package me.jojigarcia.model;

/**
 * Created by joaquinjimenezgarcia on 27/4/17.
 */
public abstract class Available {
    private int code;
    private String title;
    private int year;

    public Available(){
        this.code = 99999;
        this.title = "Sin título";
        this.year = 1990;
    }

    public Available(int code, String title, int year) {
        this.setCode(code);
        this.setTitle(title);
        this.setYear(year);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        if (code > 0) {
            this.code = code;
        }else {
            this.code = 999999;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title.equals("")){
            this.title = "Sin título";
        }else{
            this.title = title;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 0){
            this.year = year;
        }else{
            this.year = 1990;
        }
    }

    @Override
    public String toString() {
        return "Available{" +
                "code=" + code +
                ", title='" + title + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}

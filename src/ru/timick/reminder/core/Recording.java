package ru.timick.reminder.core;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Recording {

    private Date date;
    private String text;
    private int priority;
    private int status;

    public Recording(Date date, String text, int priority) {
        this.date = date;
        this.text = text;
        this.priority = priority;
        String string0 = date.toString();
        System.out.println(string0);
    }

    public Date getDate() { return date; }
    public String getText() { return text; }
    public int getPriority() { return priority; }
    public void setText(String text) { this.text = text; }
    public void setDate(Date date) { this.date = date; }
    public void setPriority(int priority) { this.priority = priority; }

}

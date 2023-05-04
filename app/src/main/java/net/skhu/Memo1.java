package net.skhu;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Memo1 {
    final static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Date date;

    public Memo1(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDateFormatted() {
        return format.format(date);
    }
}


package org.example.models;
import java.util.Date;

public class Message {
    private String contend;
    private String from;
    private String to;
    private Date date;

    public Message(String contend, String from, String to, Date date){
        this.contend = contend;
        this.date = date;
        this.from = from;
        this.to = to;
    }

    public String getContend(){
        return contend;
    }
    public void setContend(String contend){
        this.contend = contend;
    }

    public String getFrom(){
        return from;
    }
    public void setFrom(String from){
        this.from = from;
    }

    public String getTo(){
        return to;
    }
    public void setTo(String to){
        this.to = to;
    }

    public Date getDate(){
        return date;
    }
    public void setDate(Date date){
        this.date = date;
    }


}

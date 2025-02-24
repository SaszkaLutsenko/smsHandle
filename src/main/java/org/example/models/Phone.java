package org.example.models;
import java.util.ArrayList;

public class Phone {
    private String name;
    private String number;
    private ArrayList<Message> sendMessageList;
    private ArrayList<Message> receivedMessageList;
    private Provider provider;
    private double balance;

    public Phone(String name, String number, Provider provider, double balance){
        this.name = name;
        this.number = number;
        this.sendMessageList = new ArrayList<>();
        this.receivedMessageList = new ArrayList<>();
        this.provider = provider;
        this.balance = 0.0;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public ArrayList<Message> getReceivedMessageList() {
        return receivedMessageList;
    }

    public ArrayList<Message> getSendMessageList() {
        return sendMessageList;
    }

    public Provider getProvider(){
        return provider;
    }
    public void setProvider(Provider provider){
        this.provider = provider;
    }

    public void deposit(double amount){
        this.balance = balance + amount;
    }

    public double getBalance() {
        return balance;
    }
}

/*

Copyright © 2016 Aaron Smith & Xenia Zantello

*/

package homework2.user;

import java.io.Serializable;

public class User implements Serializable {

    private String amount;
    private String rate;
    private String year;
    private String future;


    public User() {
        amount = "";
        rate = "";
        year = "";
        future = "";
    }
    public User(String amount, String rate, String year, String future) {
    this.amount = amount;
    this.rate = rate;
    this.year = year;
    this.future = future;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
    
    public String getFuture() {
        return future;
    }

    public void setFuture(String future) {
        this.future = future;
    }
    
}
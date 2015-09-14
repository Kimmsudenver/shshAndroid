package com.example.kimbui.shshandroid.data;

/**
 * Created by kimbui on 8/26/15.
 */
public class Pair {
    private String firstCoin;
    private String secondCoin;
    private float rate;
    private float depositLimit;
    private float minerFee;

    public String getFirstCoin() {
        return firstCoin;
    }

    public void setFirstCoin(String firstCoin) {
        this.firstCoin = firstCoin;
    }

    public String getSecondCoin() {
        return secondCoin;
    }

    public void setSecondCoin(String secondCoin) {
        this.secondCoin = secondCoin;
    }

    public float getDepositLimit() {
        return depositLimit;
    }

    public void setDepositLimit(float depositLimit) {
        this.depositLimit = depositLimit;
    }

    public float getMinerFee() {
        return minerFee;
    }

    public void setMinerFee(float minerFee) {
        this.minerFee = minerFee;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }




    public Pair(){
        firstCoin = "";
        secondCoin = "";
        rate = depositLimit = minerFee = 0;
    }

    public Pair(String first, String second, float r, float d , float m){
        firstCoin = first;
        secondCoin = second;
        rate = r;
        depositLimit = d;
        minerFee = m;
    }

    public String getPair(){
        return firstCoin+"_"+secondCoin;
    }


}

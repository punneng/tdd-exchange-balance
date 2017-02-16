package com.exchange.app;
import java.util.HashMap;

public class Balance
{
  private HashMap<Integer, Integer> banknote = new HashMap<Integer, Integer>();

  public Balance( int balance )
  {
    this.exchange(balance);
  }

  public int getBanknote(int banknote) {
    return this.banknote.get(banknote);
  }

  private void exchange(int balance) {
    int accumulatedResult = this.exchangeBanknote(500, balance);
    accumulatedResult = this.exchangeBanknote(100, accumulatedResult);
    int banknote50Amt = accumulatedResult / 50;
    banknote.put(50, banknote50Amt);
    accumulatedResult = accumulatedResult - (banknote50Amt * 50);
    int banknote20Amt = accumulatedResult / 20;
    banknote.put(20, banknote20Amt);
    accumulatedResult = accumulatedResult - (banknote20Amt * 20);
    int banknote10Amt = accumulatedResult / 10;
    banknote.put(10, banknote10Amt);
  }

  private int exchangeBanknote(int value, int balance) {
    int amount = balance / value;
    this.banknote.put(value, amount);
    return balance - (amount * value);
  }

}

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
    accumulatedResult = this.exchangeBanknote(50, accumulatedResult);
    accumulatedResult = this.exchangeBanknote(20, accumulatedResult);
    accumulatedResult = this.exchangeBanknote(10, accumulatedResult);
  }

  private int exchangeBanknote(int value, int balance) {
    int amount = balance / value;
    this.banknote.put(value, amount);
    return balance - (amount * value);
  }

}

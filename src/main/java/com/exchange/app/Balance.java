package com.exchange.app;
import java.util.HashMap;

public class Balance
{
  private HashMap<Integer, Integer> banknote = new HashMap<Integer, Integer>();
  public Balance( int balance )
  {
    this.exchange(balance);
  }

  private void exchange(int balance) {
    int accumulatedResult = balance;
    int banknote500Amt = accumulatedResult / 500;
    banknote.put(500, banknote500Amt);
    accumulatedResult = accumulatedResult - (banknote500Amt * 500);
    int banknote100Amt = accumulatedResult / 100;
    banknote.put(100, banknote100Amt);
    accumulatedResult = accumulatedResult - (banknote100Amt * 100);
    int banknote50Amt = accumulatedResult / 50;
    banknote.put(50, banknote50Amt);
    banknote.put(20, 0);
    banknote.put(10, 0);
  }

  public int getBanknote(int banknote) {
    return this.banknote.get(banknote);
  }
}

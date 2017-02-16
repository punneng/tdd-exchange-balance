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
    int banknote500Amt = balance / 500;
    banknote.put(500, banknote500Amt);
    banknote.put(100, 0);
    banknote.put(50, 0);
    banknote.put(20, 0);
    banknote.put(10, 0);
  }

  public int getBanknote(int banknote) {
    return this.banknote.get(banknote);
  }
}

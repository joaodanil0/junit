package com.practicalunittesting;

public class Money {
    
    private final int amount;
    private final String currency;

    public Money(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }

    public int getAmount(){
        return amount;
    }

    public String getCurrency(){
        return currency;
    }

    public boolean equals(Object anObject) {
        if(anObject instanceof Money) {
            Money money = (Money) anObject;
            boolean isCurrentTheSame = money.getCurrency().equals(getCurrency());
            boolean isAmountTheSame = getAmount() == money.getAmount();
            return  isCurrentTheSame && isAmountTheSame;
        }
        return false;
    }
}


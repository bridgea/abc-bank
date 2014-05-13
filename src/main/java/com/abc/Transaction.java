package com.abc;

abstract class Transaction {
  protected final double amount;

  /***
   * @throws IllegalArgumentException if amount is less than or equal to zero
   */
  public Transaction(double amount) {
    if(amount <= 0)
      throw new IllegalArgumentException("amount must be greater than zero");
    this.amount = amount;
  }

  abstract String getStatementText();

  abstract double getAmount();
}

package com.bitwise.parking

/**
  * Created by akankshag on 8/1/2016.
  */
/*
def iterate(n:Int,f:Int =>Int,x:Int): Unit ={
require(x!=0)
iterate(n-1,f,f(x))
}
def square(x:Int)= x*x

iterate(1,square,2)
*/

trait AccountDetails{
  val currentBalance:Int
  def withdraw(amount:Int)

}
case class BankAccount(val currentBalance:Int) extends AccountDetails{

  def withdraw(amount:Int)={
    if(amount<=0 && amount >=  currentBalance) {

      new BankAccount(currentBalance - amount)
    }
  }
  def deposit(amount:Int)={
    if(amount<=0 && amount >=  currentBalance) {

      new BankAccount(currentBalance + amount)
    }
  }

}

object AccountDetails{

  def apply(currentBalance: Int): BankAccount = currentBalance match{
    case 0 => throw new Error("Empty BankAccount")
    case _ => if(currentBalance < 0)
      throw new Error("Insufficient fund")
    else new BankAccount(currentBalance)

  }


}
class Test{
  @Test
  def display(): Unit ={
    val t = new BankAccount(50)
    val t1=t.withdraw(10)


  }

}
package com.knoldus

class ArithmeticOperation {

  /**
    * Function utili
    * @param first Fir
    * @param second
    * @return
    */
  def add(first: Int, second: Int): Int = {
    first + second
  }



  def multiply(first: Int, second: Int): Int = {
    first * second
  }

  def subtract(first: Int, second: Int): Int = {
    first - second
  }

  def divide(first: Int, second: Int): Int = {
    try {
      first / second
    } catch {
      case arithmeticException: ArithmeticException => {
        throw new ArithmeticException("Divide by zero not possible.")
      }
    }
  }
}

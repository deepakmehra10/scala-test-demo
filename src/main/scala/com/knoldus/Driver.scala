package com.knoldus

object Driver extends App {

  val arithmeticOperation = new ArithmeticOperation()

  // Add two numbers
  val addition = arithmeticOperation.add(5,5);
  println(addition)

  // Subtract two numbers
  val subtract = arithmeticOperation.subtract(5,5);
  println(subtract)

  // Multiply two numbers
  val multiplication = arithmeticOperation.multiply(5,5);
  println(multiplication)

  // Divide two numbers
  val division = arithmeticOperation.divide(5,5);
  println(division)
}

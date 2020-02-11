package com.knoldus

import org.scalatest.FunSuite

class ArithmeticOperationASpec extends FunSuite {

  test("Mehtod should add two numbers") {
    val arithmeticOperation = new ArithmeticOperation()
    val actualResult = arithmeticOperation.add(5,5)
    val expectedResult = 10
    assert(expectedResult == actualResult)
  }
}

package com.knoldus

import org.scalatest.{BeforeAndAfterAll, FlatSpec}
import org.scalatest.mockito.MockitoSugar
import org.mockito.Mockito._

class WelcomeServiceSpec extends FlatSpec with BeforeAndAfterAll with MockitoSugar {

  val mockNameService: NameService = mock[NameService]
  var welcomeService: WelcomeService = _

  override def beforeAll(): Unit = {
    welcomeService = new WelcomeService(mockNameService)
  }

  "Method" should "welcome user" in {
    when(mockNameService.getNameById(5)).thenReturn("Deepak Mehra")
    val actualResult: String = welcomeService.welcomeUser(5)

    val expectedResult = "Welcome, Deepak Mehra"
    assert(expectedResult == actualResult)
  }
}

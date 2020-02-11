package com.knoldus

class WelcomeService(nameService: NameService) {

  def welcomeUser(id: Int): String = {
    val name = nameService.getNameById(id)
    "Welcome, " + name
  }
}


package org.example

abstract class Animal(private val name: String, private val age: Int) {

    fun getName(): String {
        return name
    }

    fun getAge(): Int {
        return age
    }
}

class Dog(name: String, age: Int) : Animal(name, age), Omnivore {

    override fun toString(): String {
        return "Dog name = ${this.getName()}, age = ${this.getAge()}. ${this.hunt()}"
    }

    override fun hunt(): String {
        return "I can hunt for robbers"
    }
}

class Cat(name: String, age: Int) : Animal(name, age), Omnivore {

    override fun toString(): String {
        return "Cat name = ${this.getName()}, age = ${this.getAge()}. ${this.hunt()}"
    }

    override fun hunt(): String {
        return "I can hunt for mice"
    }
}

class Hamster(name: String, age: Int) : Animal(name, age), Herbivore {

    override fun toString(): String {
        return "Hamster name = ${this.getName()}, age = ${this.getAge()}. ${this.chill()}"
    }

    override fun chill(): String {
        return "I can chill for 8 hours"
    }
}

class GuineaPig(name: String, age: Int) : Animal(name, age), Herbivore {

    override fun toString(): String {
        return "GuineaPig name = ${this.getName()}, age = ${this.getAge()}. ${this.chill()}"
    }

    override fun chill(): String {
        return "I can chill for 12 hours"
    }

}
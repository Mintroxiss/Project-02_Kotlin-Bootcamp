package org.example

abstract class Animal(private val name: String, private val age: Int) {

    fun getName(): String {
        return name
    }

    fun getAge(): Int {
        return age
    }
}

class Dog(name: String, age: Int) : Animal(name, age) {
    override fun toString(): String {
        return "Dog name = ${this.getName()}, age = ${this.getAge()}"
    }
}

class Cat(name: String, age: Int) : Animal(name, age) {
    override fun toString(): String {
        return "Cat name = ${this.getName()}, age = ${this.getAge()}"
    }
}
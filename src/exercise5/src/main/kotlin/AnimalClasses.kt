package org.example

import java.util.concurrent.TimeUnit

abstract class Animal(private val name: String, private val age: Int) {

    fun getName(): String {
        return name
    }

    fun getAge(): Int {
        return age
    }

    abstract fun goToWalk(): Long
}

class Dog(name: String, age: Int) : Animal(name, age) {

    override fun toString(): String {
        return "Dog name = ${this.getName()}, age = ${this.getAge()}"
    }

    override fun goToWalk(): Long {
        val time = (this.getAge() * 500).toLong()

        TimeUnit.MILLISECONDS.sleep(time)

        return time
    }
}

class Cat(name: String, age: Int) : Animal(name, age) {

    override fun toString(): String {
        return "Cat name = ${this.getName()}, age = ${this.getAge()}"
    }

    override fun goToWalk(): Long {
        val time = (this.getAge() * 250).toLong()

        TimeUnit.MILLISECONDS.sleep(time)

        return time
    }
}
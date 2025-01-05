package org.example

abstract class Animal(private val name: String, private val age:Int, private val mass: Float) {

    fun getName(): String {
        return name
    }

    fun getAge(): Int {
        return age
    }

    fun getMass(): Float {
        return mass
    }

    // Возвращает вес корма
    abstract fun getFeedInfoKg(): Float
}

class Dog(name:String, age: Int, weight: Float) : Animal(name, age, weight) {

    override fun toString(): String {
        return "Dog " +
                "name = ${this.getName()}, " +
                "age = ${this.getAge()}, " +
                "mass = ${String.format("%.2f", this.getMass())}, " +
                "feed = ${String.format("%.2f", this.getFeedInfoKg())}"
    }

    override fun getFeedInfoKg(): Float {
        return this.getMass() * 0.3f
    }
}

class Cat(name:String, age: Int, weight: Float) : Animal(name, age, weight) {

    override fun toString(): String {
        return "Cat " +
                "name = ${this.getName()}, " +
                "age = ${this.getAge()}, " +
                "mass = ${String.format("%.2f", this.getMass())}, " +
                "feed = ${String.format("%.2f", this.getFeedInfoKg())}"
    }

    override fun getFeedInfoKg(): Float {
        return this.getMass() * 0.1f
    }
}
package org.example

fun main() {
    val pets: MutableList<Animal> = mutableListOf()

    val numOfAnimals = numInput()

    var i = 0
    while (i < numOfAnimals) {
        ++i

        val animalType = readln()

        if (animalType != "dog" && animalType != "cat") {
            println("Incorrect input. Unsupported pet type")
            continue
        }

        val name = readln()
        val age = numInput()

        if (age <= 0) {
            println("Incorrect input. Age <= 0")
            continue
        }

        when (animalType) {
            "dog" -> pets.add(Dog(name, age))
            "cat" -> pets.add(Cat(name, age))
        }
    }

    val animalIterator = AnimalIterator(pets)

    while (animalIterator.hasNext()) println(animalIterator.next())

    animalIterator.reset()
}

fun numInput(): Int {
    var value: Int

    while (true) {
        try {
            value = readln().toInt()

            break
        } catch (e: NumberFormatException) {
            println("Couldn't parse a number. Please, try again")
        }
    }

    return value
}
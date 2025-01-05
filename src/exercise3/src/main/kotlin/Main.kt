package org.example

fun main() {
    val pets: MutableList<Animal> = mutableListOf()

    val numOfAnimals = intInput()

    var i = 0
    while (i < numOfAnimals) {
        ++i

        val animalType = readln()

        if (animalType != "dog" && animalType != "cat" && animalType != "hamster" && animalType != "guinea") {
            println("Incorrect input. Unsupported pet type")
            continue
        }

        val name = readln()
        val age = intInput()

        if (age <= 0) {
            println("Incorrect input. Age <= 0")
            continue
        }

        when(animalType) {
            "dog" -> pets.add(Dog(name, age))
            "cat" -> pets.add(Cat(name, age))
            "guinea" -> pets.add(GuineaPig(name, age))
            "hamster" -> pets.add(Hamster(name, age))
        }
    }

    val herbivores = pets.filterIsInstance<Herbivore>()
    for (pet in herbivores) println(pet)

    val omnivores = pets.filterIsInstance<Omnivore>()
    for (pet in omnivores) println(pet)
}

fun intInput(): Int {
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
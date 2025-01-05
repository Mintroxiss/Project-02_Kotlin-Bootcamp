package org.example

import kotlinx.coroutines.*
import kotlin.math.round

fun main() = runBlocking {
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

        when(animalType) {
            "dog" -> pets.add(Dog(name, age))
            "cat" -> pets.add(Cat(name, age))
        }
    }

    val startTime = System.nanoTime()

    val scope = CoroutineScope(Dispatchers.Default)

    val jobs = pets.map { pet ->
        scope.async {
            val startWalk = round((System.nanoTime() - startTime) / 1_000_000_000.0 * 100) / 100
            pet.goToWalk()
            val endWalk = round((System.nanoTime() - startTime) / 1_000_000_000.0 * 100) / 100
            println("$pet, start time = $startWalk, end time = $endWalk")
        }
    }

    jobs.forEach { it.await() }
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
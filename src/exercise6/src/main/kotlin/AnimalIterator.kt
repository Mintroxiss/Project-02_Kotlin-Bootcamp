package org.example

interface BaseIterator<T> {

    fun next(): T

    fun hasNext(): Boolean

    fun reset()

}

class AnimalIterator(private val pets: List<Animal>) : BaseIterator<Animal> {

    private var index = 0

    override fun next(): Animal {
        return pets[index++]
    }

    override fun hasNext(): Boolean {
        return index < pets.size
    }

    override fun reset() {
        index = 0
    }
}
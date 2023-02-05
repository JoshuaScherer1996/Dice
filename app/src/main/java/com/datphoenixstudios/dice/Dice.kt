package com.datphoenixstudios.dice

class Dice (val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}
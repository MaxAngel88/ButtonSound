package com.example.angelomassimino.buttonsound.models

data class Food (var name: String? = null, var image: Int? = null){

    constructor(name : String, image : Int) : this() {
        this.name = name
        this.image = image
    }
}
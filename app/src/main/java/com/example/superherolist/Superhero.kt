package com.example.superherolist

class Superhero {
    val superhero: String
    val publisher: String
    val realName: String
    var photo: String
}

fun main() {
    val superheroes = mutableListOf<Superhero>()

    do {
        val nuevoSuperheroe = ingresarSuperheroe()
        superheroes.add(nuevoSuperheroe)
    } while (deseaIngresarOtroSuperheroe())

    mostrarSuperheroes(superheroes)
}

fun ingresarSuperheroe(): Superhero {
    println("Ingrese los datos del Superhéroe:")
    print("Nombre del Superhéroe: ")
    val superhero = readLine() ?: ""

    print("Editorial/Publisher: ")
    val publisher = readLine() ?: ""

    print("Nombre real: ")
    val realName = readLine() ?: ""

    print("URL de la foto: ")
    val photo = readLine() ?: ""

    return Superhero(superhero, publisher, realName, photo)
}

fun deseaIngresarOtroSuperheroe(): Boolean {
    print("Desea ingresar otro Superhéroe? (s/n): ")
    val opcion = readLine()?.toLowerCase() ?: ""
    return opcion == "s"
}

fun mostrarSuperheroes(superheroes: List<Superhero>) {
    println("Datos de los Superhéroes:")
    superheroes.forEachIndexed { index, superhero ->
        println("Superhéroe ${index + 1}:")
        println("Nombre: ${superhero.superhero}")
        println("Editorial/Publisher: ${superhero.publisher}")
        println("Nombre real: ${superhero.realName}")
        println("URL de la foto: ${superhero.photo}")
        println()
    }
}
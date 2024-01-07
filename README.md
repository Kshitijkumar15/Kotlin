# Learn Kotlin Programming Language

Welcome to the Kotlin Learning Repository! This repository is designed to help you learn and master the Kotlin programming language. Whether you are a beginner or an experienced developer looking to add Kotlin to your skill set, you'll find resources and examples here to guide you through the learning process.

## Table of Contents
- Introduction to Kotlin
- Setting Up Your Development Environment
- Basic Syntax
- Data Types
- Control Flow
- Functions
- Object-Oriented Programming in Kotlin
- Collections
- Concurrency
- Kotlin for Android Development
- Advanced Topics
- Useful Links
- Contributing
- License
- Introduction to Kotlin

Kotlin is a modern, expressive, and statically-typed programming language that runs on the Java Virtual Machine (JVM). It was developed by JetBrains and officially supported by Google for Android app development. Kotlin combines concise syntax with powerful features, making it an excellent choice for both backend and Android development.

Setting Up Your Development Environment

Before diving into Kotlin, you'll need to set up your development environment. Follow the instructions in this section to install the necessary tools and get your system ready for Kotlin development.

Install IntelliJ IDEA (recommended IDE for Kotlin)
Install Kotlin Plugin for IntelliJ IDEA
Setting up Gradle for Kotlin projects
Basic Syntax


## Basic program 

Get started with the basic syntax of Kotlin. Learn about variables, data types, operators, and other fundamental concepts that form the building blocks of Kotlin programs.

fun main() {
    // Hello, World!
    println("Hello, Kotlin!")
    
    // Variables and Constants
    var mutableVariable: String = "I can be changed"
    val immutableVariable: Int = 42
    
    // Basic Operators
    val sum = 5 + 3
    val product = 4 * 7
    
    // Control Flow
    if (sum > product) {
        println("Sum is greater than product.")
    } else {
        println("Product is greater than sum.")
    }
}

## Data Types

Explore the different data types available in Kotlin, including numbers, strings, booleans, arrays, and more. Understand how to work with these data types and perform operations on them.

fun main() {
    // Numbers
    val integer: Int = 42
    val double: Double = 3.14
    
    // Strings
    val message: String = "Hello, Kotlin!"
    
    // Booleans
    val isTrue: Boolean = true
    
    // Arrays
    val numbers: IntArray = intArrayOf(1, 2, 3, 4, 5)
}

## Control flow
Learn how to control the flow of your Kotlin programs with conditional statements (if, else, when) and loops (for, while).
fun main() {
    // If-Else Statement
    val x = 10
    if (x > 0) {
        println("Positive number")
    } else if (x < 0) {
        println("Negative number")
    } else {
        println("Zero")
    }
    
    // When Expression
    val day = 3
    when (day) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        // ...
        else -> println("Unknown day")
    }
    
    // For Loop
    for (i in 1..5) {
        println("Count: $i")
    }
    
    // While Loop
    var count = 0
    while (count < 3) {
        println("Looping... $count")
        count++
    }
}

## Functions
Understand the basics of defining and calling functions in Kotlin. Learn about function parameters, return types, and the use of default arguments.
fun main() {
    // Simple Function
    fun greet(name: String): String {
        return "Hello, $name!"
    }
    
    val greeting = greet("John")
    println(greeting)
    
    // Function with Default Argument
    fun greetDefault(name: String = "Guest"): String {
        return "Hello, $name!"
    }
    
    val defaultGreeting = greetDefault()
    println(defaultGreeting)
}
## OOPs in Kotlin
Dive into the world of object-oriented programming (OOP) in Kotlin. Learn about classes, objects, inheritance, interfaces, and other key concepts.
// Define a simple class
class Person(val name: String, var age: Int) {
    // Member function
    fun celebrateBirthday() {
        age++
        println("$name is now $age years old!")
    }
}

fun main() {
    // Create an instance of the Person class
    val person = Person("Alice", 30)
    
    // Access properties and call methods
    println("${person.name} is ${person.age} years old.")
    person.celebrateBirthday()
}

## Collections
Explore the various collection types in Kotlin, such as lists, sets, and maps. Learn how to perform common operations on collections and iterate through their elements.

fun main() {
    // List
    val numbersList = listOf(1, 2, 3, 4, 5)
    
    // Set
    val uniqueNumbers = setOf(1, 2, 3, 4, 5, 5, 5) // Duplicates are automatically removed
    
    // Map
    val userMap = mapOf("username" to "john_doe", "age" to 25)
    
    // Iterating through a List
    for (number in numbersList) {
        println("Number: $number")
    }
    
    // Iterating through a Map
    for ((key, value) in userMap) {
        println("$key: $value")
    }
}

## Kotlin for Android Development
Discover how Kotlin is used in Android app development. Learn about the advantages of using Kotlin for Android and explore basic Android development concepts.

[Official Kotlin for Android Developers Guide](https://developer.android.com/k



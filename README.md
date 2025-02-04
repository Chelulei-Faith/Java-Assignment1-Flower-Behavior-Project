# Java-Assignment1-Flower-Behavior-Project
# Flower Behavior Project

## Project Overview
This project demonstrates key concepts in java(OOP), specifically focusing on the use of concrete classes, abstract classes, and interfaces.

## Key Concepts Explored
### 1. **Concrete Classes**
In this project, `Rose` is a concrete class.

### 2. **Abstract Classes**
In this project, `Flower` is an abstract class that defines the common properties and behaviors of flowers.
- **Abstract Method:** `fragrance()` requires subclasses to provide specific implementations.
- **Concrete Method:** `displayColor()` provides a common implementation for all subclasses.

### 3. **Interfaces**
In this project, `FlowerBehavior` is an interface that ensures all implementing classes provide a `bloom()` method.

## Project Structure
``
FlowerBehavior.java         // Interface defining flower behavior
Flower.java                 // Abstract class for flower properties
Rose.java                   // Concrete class extending Flower and implementing FlowerBehavior
Main.java         // Main class to demonstrate the project
``

## Code Explanation

## 1. `FlowerBehavior.java`
This interface defines a single abstract method `bloom()`, which must be implemented by any class that adopts this behavior.

## 2. `Flower.java` (Abstract Class)
The `Flower` abstract class defines a common property (`color`) and methods that must or can be shared by all flower types.

## 3. `Rose.java` (Concrete Class)
The `Rose` class extends the `Flower` abstract class and implements the `FlowerBehavior` interface. It provides implementations for both `fragrance()` and `bloom()` methods.

## 4. `Main.java`
The main class demonstrates the usage of the `Rose` object by invoking methods defined in the abstract class and interface.




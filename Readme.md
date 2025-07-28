## Sprint 1. 1st Task: Inheritance and Polymorphism

This repository implements the solution to the Java OOP exercises assigned in Sprint 1, Level 1 through Level 3. The codebase has been developed using **IntelliJ IDEA**, and follows the **good practices guidelines** defined in Sprint 0.

## Project Structure

The solution is written in **Java**, following object-oriented programming principles. The source code is organized into packages by responsibility and functionality, applying the **Single Responsibility Principle** where appropriate.

## Technologies

- Java 17+
- IntelliJ IDEA (Recommended)
- No external libraries or frameworks (pure Java)

## Language

The application is fully implemented in English, including class names, methods, and comments.

---

## Level 1

### Exercise 1 - Instruments

We define an abstract class `Instrument` containing the common properties:

- `String name`
- `double price`

It declares an abstract method `play()` which is overridden by the subclasses:

- `WindInstrument`
- `StringInstrument`
- `PercussionInstrument`

Each subclass overrides `play()` to display a specific message based on the instrument type.

Static and initialization blocks are used to demonstrate class loading behavior:
- A static block executes once upon the first reference to the class.
- An instance initializer block executes upon each instance creation.

### Exercise 2 - Car

We define a `Car` class with the following fields:

- `public static final String brand` → must be initialized at declaration
- `public static String model` → can be modified
- `public final int power` → can be initialized in the constructor

The class also contains:

- A static method `brake()` → logs "The vehicle is braking"
- A non-static method `accelerate()` → logs "The vehicle is accelerating"

From the `main()` method, we demonstrate the difference between static and instance method invocation.

---

## Level 2

### Exercise 1 - Smartphone

We define a class `Phone` with basic fields:

- `String brand`
- `String model`

It contains a method `call(String number)` that simulates a phone call.

We define two interfaces:
- `Camera` → method `photograph()`
- `Clock` → method `alarm()`

A `Smartphone` class extends `Phone` and implements `Camera` and `Clock`. It overrides the interface methods to simulate camera and alarm behavior.

In the `main()` method, we instantiate a `Smartphone` and invoke all its methods.

---

## Level 3

### Exercise 1 - Sports Newsroom

We model a sports newsroom environment with the following structure:

#### Editor

- Attributes: `String name`, `final String id`
- Shared salary: `static double salary = 1500.0`
- Method to manage a list of associated `Article` objects.

#### Articles

- Base class `Article` with:
    - `String headline`
    - `String text` (initially empty)
    - `int score`
    - `double price`
    - `abstract calculatePrice()`
    - `abstract calculateScore()`

- Subclasses for different sports:
    - `FootballArticle`, `BasketballArticle`, `TennisArticle`, `F1Article`, `MotorcyclingArticle`

Each subclass overrides price and score calculation based on specific business rules.

#### Application Menu

The console application includes the following options:

1. Add editor
2. Remove editor
3. Add article to editor
4. Remove article
5. Show all articles by editor
6. Calculate article score
7. Calculate article price

User interaction is handled through a shared `Scanner` instance, which is passed to methods as a parameter to prevent code duplication and ensure centralized input handling.

---

## Best Practices Followed

- Single Responsibility Principle: separated logic into individual classes
- Use of interfaces to simulate multiple inheritance
- Immutable identifiers (`final`) and shared static fields
- Polymorphism for article processing
- Descriptive and English-based naming conventions
- Modular design for reusability and maintainability

---

## How to Run

1. Clone the repository
2. Open in IntelliJ IDEA
3. Run `Main.java` in the root of the application
4. Follow the menu options in the console

---

## Author

Developed by a Daniel Caldito Serrano as part of the Java Back-end Development bootcamp conducted by IT Academy.
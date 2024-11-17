# Design Pattern

https://refactoring.guru/design-patterns

## Singleton

Singleton is a creational design pattern that lets you ensure that a class has only one instance, while providing a
global access point to this instance.

https://refactoring.guru/design-patterns/singleton

### Comparison of Implementations

| Implementation         | Lazy Initialization | Thread-Safe | Performance | Complexity |
|------------------------|---------------------|-------------|-------------|------------|
| Eager Initialization   | No                  | Yes         | High        | Low        |
| Lazy Initialization    | Yes                 | No          | High        | Low        |
| Thread-Safe Singleton  | Yes                 | Yes         | Moderate    | Moderate   |
| Double-Checked Locking | Yes                 | Yes         | High        | High       |
| Bill Pugh Singleton    | Yes                 | Yes         | High        | Low        |
| Enum Singleton         | No                  | Yes         | High        | Very Low   |
| Multiton               | Conditional         | Yes         | Varies      | Moderate   |

### Recommendation

* **Simple projects**: Use Eager Initialization or Bill Pugh Singleton.
* **Multithreaded applications**: Use Double-Checked Locking or Bill Pugh Singleton.
* **Serialization safety**: Use Enum Singleton.
* **Parameterized singletons**: Use Multiton.

## Abstract Factory

Abstract Factory is a creational design pattern that lets you produce families of related objects without specifying
their concrete classes.

https://refactoring.guru/design-patterns/abstract-factory
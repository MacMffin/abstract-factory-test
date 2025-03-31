# abstract-factory-test

This project is purely for getting used to the Abstract Factory Pattern as discussed in the book "Design Patterns".

### What's an Abstract Factory Pattern?

The Abstract Factory Pattern allows you to create _families of related objects_ without exposing the concrete classes to the client.

Why is this useful?

1. **Clean code** – You only need to switch out the factory to use a different family of objects. The client never needs to know about the concrete classes.
2. **Flexibility** – You can easily add new implementations of a `Factory` without changing any client code.
3. **Testability** – It's easy to create mock implementations of a `Factory`, making testing simpler and more isolated.

### Abstract Factory Pattern in this repo
This repository contains a simple example of how the pattern works using a sports analogy.

In the `SportsResource`, the client can select either **Football** or **Baseball**. Based on this choice, a specific factory is injected — each one extending the abstract `SportsFactory`.

Each factory provides a family of related objects, such as a `Ball` and a `Pitch`, that match the chosen sport. This way, the client doesn’t need to know which concrete classes are being used — it just uses the factory and gets the right objects.
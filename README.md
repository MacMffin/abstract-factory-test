# abstract-factory-test

This project is purely for getting used to the Abstract Factory Pattern as discussed in the book "Design Patterns".

### What's an Abstract Factory Pattern?

The Abstract Factory Pattern allows you to create _families of related objects_ without exposing the concrete classes to the client.

Why is this useful?

1. **Clean code** – You only need to switch out the factory to use a different family of objects. The client never needs to know about the concrete classes.
2. **Flexibility** – You can easily add new implementations of a `Factory` without changing any client code.
3. **Testability** – It's easy to create mock implementations of a `Factory`, making testing simpler and more isolated.

### Abstract Factory Pattern in this repo
In this repository I've tried to create an example of how this can work. In the SportsResource, 
the client can select between Football and Baseball. Based on this, they get a Factory that inherits
from an Abstract Factory named SportsFactory. The factories make sure that the client receives a family of 
related objects. That way, the client doesn't have to think about which concrete classes they need.
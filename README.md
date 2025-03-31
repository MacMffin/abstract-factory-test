# abstract-factory-test

This project is purely for getting used to the Abstract Factory Pattern as discussed in the book "Design Patterns".

### What's an Abstract Factory Pattern?
The Abstract Factory Pattern makes it so that you can create _families of related objects_ without the client needing 
to know which concrete classes are being used.

### Abstract Factory Pattern in this repo
In this repository I've tried to create an example of how this can work. In the SportsResource, 
the client can select between Football and Baseball. Based on this, they get a Factory that inherits
from an Abstract Factory named SportsFactory. The factories make sure that the client receives a family of 
related objects. That way, the client doesn't have to think about which concrete classes they need.
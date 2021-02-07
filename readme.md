Design Patterns

A Pattern is a solution to a problem in a context.

* The 'context' is the situation in which the pattern applies. This should be a recurring situation.
* The 'problem' refers to the goal you are trying to achieve in this context, but it also refers to any constraints that
  occur in the context.

* The 'solution' is what you're after: a general design that anyone can apply which resolves the goal and set of
  constraints.

"If you find yourself in a context with a problem that has a goal that is affected by a set of constraints, then you can
apply a design that resolves the goal and constraints and leads to a solution."

Pattern Categories:

Creational Patterns involve object instantiation and all provide a way to decouple a client from the objects it needs to
instantiate.

* Singleton
* Factory Method
* Abstract Factory
* Builder
* Prototype

Behavioral Patterns are concerned with how the classes and objects interact and distribute responsibility.

* Strategy
* Observer
* Command
* Template Method
* Iterator
* State
* Chain of Responsibility
* Interpreter
* Mediator
* Memento
* Visitor

Structural Patterns let you compose classes and objects into larger structures

* Decorator
* Adapter
* Facade
* Composite
* Proxy
* Bridge
* Flyweight

Pattern Definitions:

1. <a href="https://github.com/raxb/design_patterns/tree/master/src/learn/patterns/strategy">Strategy Pattern </a>- 
   categorizes logical functionality separately and encapsulates each, so that client 
   could invoke
   the same polymorphically during the runtime.
    - Abstraction
    - Encapsulation
    - Polymorphism
    - Inheritance
    - Composition

2. <a href="https://github.com/raxb/design_patterns/tree/master/src/learn/patterns/observer">Observer Pattern </a>- when the Publisher state changes all the underlying Subscriber(s) will be updated with 
   the state
   changes, if and only if the Subscriber(s) registered with Publisher for updates.

3. <a href="https://github.com/raxb/design_patterns/tree/master/src/learn/patterns/decorator">Decorator Pattern </a>- by making the classes implement an identical interface/abstract class, objects can be wrapped
   with new functionalities dynamically.

4. <a href="https://github.com/raxb/design_patterns/tree/master/src/learn/patterns/factory">Factory Method Pattern </a>- create an abstract class with abstract factory method, which will be responsible for object
   creation in the subclasses. Superclass method can call the abstract factory method which gets defined based on
   subclass object creation.
   'Object creation - Inheritance'

5. <a href="https://github.com/raxb/design_patterns/tree/master/src/learn/patterns/abstractfactory">Abstract Factory Pattern </a>- create an interface with methods, so that the concrete implementation classes performs the
   objects' creation for each method. These methods are in-turn Factory Method Pattern.
   'Object Creation - Composition'

6. <a href="https://github.com/raxb/design_patterns/tree/master/src/learn/patterns/singleton">Singleton Pattern </a>- class with Private Constructor, Private Static variable and Public Static method to return the
   single global instance. Further, making the Static variable Volatile and creating Synchronized block in Static method
   retains single object on multiple threads access. Yet Singleton Pattern breaks when multiple classloaders are in
   play.

7. <a href="https://github.com/raxb/design_patterns/tree/master/src/learn/patterns/command">Command Pattern </a>- decouples an object making the request from the one that performs actions on the request. Receiver
   encapsulates set of actions, so Client could call the Invoker to invoke the exposed Receiver method (with actions) by
   parameterizing/dynamically passing on the respective Receiver.

8. <a href="https://github.com/raxb/design_patterns/tree/master/src/learn/patterns/adapter">Adapter Pattern </a>- receives the interface that the Client expects and translates the request to another interface that
   is Vendor compatible. Decouples Client and Vendor however Adapter complexity is directly proportional to the
   interface complexity Achieved via Object Composition.

9. <a href="https://github.com/raxb/design_patterns/tree/master/src/learn/patterns/facade">Facade Pattern </a>- Unified set of more complex classes for performing sequence of operations by delegating
   responsibility to the corresponding components in the subsystems.

10. <a href="https://github.com/raxb/design_patterns/tree/master/src/learn/patterns/templatemethod">Template Method Pattern </a>- abstract class with a final method defining the skeleton of algorithm and deferring some
    steps to the subclasses by making it abstract, so that implementation resides with subclasses. Further, with hooks
    in abstract class, the subclasses have the ability to 'hook into' the algorithm at various points.

11. <a href="https://github.com/raxb/design_patterns/tree/master/src/learn/patterns/iterator">Iterator Pattern </a>- access the elements of Collection object without exposing its underlying representation.
    Decouples the Collection object from a traversal and iteration operations. By extending Iteration interface the any
    custom aggregate object can be made iterable.

12. <a href="https://github.com/raxb/design_patterns/tree/master/src/learn/patterns/composite">Composite Pattern </a>- by making both the composite and leaf nodes of the same interface/abstract type, we can apply
    generic operations over both composites and individual objects. i.e, recursive same type iterations (composites with
    leaf nodes)

13. <a href="https://github.com/raxb/design_patterns/tree/master/src/learn/patterns/state">State Pattern </a>- behaviors encapsulated in state objects and context manages the sequence of operations by
    initializing the state and as code flow progresses the state changes and context delegates the same across
    functionalities defined. State transition can be controlled by the State classes or by the Context classes.

14. <a href="https://github.com/raxb/design_patterns/tree/master/src/learn/patterns/proxy">Proxy Pattern </a>- create Client-Server stub with Remote RMI interface which acts as a proxy invoking methods on this
    proxy stubs performs remote calls to the server and returns serializable objects.

15. <a href="https://github.com/raxb/design_patterns/tree/master/src/learn/patterns/compound">Compound Pattern </a>- combination of multiple patterns as a design solution. MVC is a Compound Pattern, 
    with Model
    defined as Observer Pattern - for notifying the observers on state changes. View defined as Composite Pattern -
    usually comprising nested UI layout components. Controller defined as Strategy Pattern - dynamically the View can
    use the Controller for different behaviors.

16. Bridge Pattern - for varying the implementations, and the abstractions in separate hierarchies and establishing
    HAS-A bridge relationship in Abstraction. Methods in abstraction implemented in terms of the implementation.
    Concrete subclasses are implemented in terms of the abstraction.

17. Builder Pattern - to encapsulate the construction of the product and allow it to be constructed in steps.

18. Chain of Responsibility Pattern - to give more than one object a chance to handle the request. Request Handlers to
    be of same type, such that multiple handlers can evaluate the request. Allows adding/removing responsibilities
    dynamically by changing the members or order of the chain.

19. Flyweight Pattern - when one instance of a class cab be used to provide many "virtual instances". Client to maintain
    the states of all virtual instance rather than creating new instance.

20. Interpreter Pattern - to builder an interpreter for a language. Defines a class-based representation for its grammar
    along with an interpreter to interpret its sentences. As grammar represented by classes, it is easy to change/extend
    the language.

21. Mediator Pattern - for centralized communications and control between the different modules, provides a decoupling
    between the modules. On state changes the Mediator is notified from the modules that are registered to trigger
    updates on corresponding dependent modules.

22. Memento Pattern - to return an object from one of its previous states. Isolating the object that holds the previous
    state is called Memento object.

23. Prototype Pattern - for object cloning on certain pre-requisites, as well as when creating an instance of a given
    class is either expensive or complicated.

24. Visitor Pattern - for adding capabilities to Composite Objects with the help of a Traverser, without changing
    Composite Structure itself. 
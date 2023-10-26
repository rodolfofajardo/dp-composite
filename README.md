# Composite Design Pattern
Structural design pattern which composes 
objects in terms of a tree structure 
to represent part as well as whole
hierarchy.

There is an interface common for all nodes
of the tree which contains methods to be
implemented in children.

There are two types of nodes:
* __leaf.__ this node has no children
* __composite.__ This node has children
which could be leaves or other composites.

The parent nodes delegate part of the
execution of inherited methods to their
children.

## References
https://www.tutorialspoint.com/design_pattern/composite_pattern.htm

https://refactoring.guru/es/design-patterns/composite

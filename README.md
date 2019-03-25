# Test manager module

Refactoring strategy for the module Test Manager of LIS (Laboratory Information System).

## UML diagram
This is the UML class diagram [UML class diagram][1].

[1]: ClassDiagram.html  "UML class diagram"

## Refactoring strategy

### Before refactoring

- Design the solution first.
- Make a proof of concept of the proposal solution first.
- Make a list of operations:  Divide it by complexity, coupling and importance. For migrate the easy and less importance first.
- Check common code:  Eliminate code duplications and make as simple as possible before refactoring.
- Check unit test: If they are not enough make the necessary test before refactoring.
- Check all the libraries: it is a good moment for version update.
- Divide refactoring in phases.
	* Phase 1: Move Test hierarchy using inheritance for all the types with the common properties in Test parent and the own types properties in the type class.
	* Phase 2: Move old operations to Test parent and override the necessary in its sons (the different types).
	* Phase 3: Creates the delegate patron for operations and make it with generics.
	* Phase 4: Move all the operations to delegate patron.
- Create task for these phases.
- Design and document the refactor strategy.

### During refactoring

- Make unit test: Create unit test as soon as possible.
- Start by simple and loose coupling operations.
- Try to refactor as litle piece of code as possible and test it.
- Document all the possible changes, the things that are not possible to refactor now...
- Update the technical documentation.

### After refactoring

- Execute all the test (unit, integration, security...)
- Check if all the functionalities are working as before and none of them have been lost.
- Make sure that developers have knowledge about the new architecture. Possible training may be required.
- Verify the new code with pull request for avoid as far as possible new refactor.


  

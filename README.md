## Objective
The objective of this project is to implement multiple palindrome checking algorithms using the Strategy Pattern.
This design allows different palindrome strategies (stack + queue, deque, linked list, recursion, etc.) to be encapsulated and swapped at runtime, promoting flexibility and scalability.

## Flow of the Project
1. 	Input Handling
      • 	User enters a string.
      • 	The string is normalized (case-insensitive, spaces removed).
2. 	Strategy Pattern Setup
      • 	Define a  interface with a method .
      • 	Implement multiple concrete strategies (e.g., , , , ).
3. 	Context Class
      • 	A  class holds a reference to a chosen strategy.
      • 	The context delegates the palindrome check to the selected strategy.
4. 	Execution
      • 	User selects which algorithm to use.
      • 	The context applies the chosen strategy to check if the string is a palindrome.
5. 	Output
      • 	Display whether the string is a palindrome or not, along with the strategy used.

## Use Case
• 	Educational Purpose: Demonstrates advanced object-oriented design patterns in practice.
• 	Flexibility: Easily switch between different palindrome algorithms without changing client code.
• 	Interview Preparation: Showcases knowledge of design patterns and clean architecture.
• 	Real-world Applications:
• 	Systems requiring multiple algorithm implementations for testing or optimization.
• 	Modular applications where algorithm choice depends on performance or context.
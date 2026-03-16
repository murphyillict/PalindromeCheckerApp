## Objective
The goal of this project is to demonstrate palindrome checking using both a stack and a queue.
By leveraging the LIFO (Last-In-First-Out) property of stacks and the FIFO (First-In-First-Out) property of queues, we can compare characters from the front and back of a string efficiently. This dual-structure approach reinforces understanding of data structures and their practical applications.

## Flow of the Project
1. 	Input Handling
      • 	User enters a string.
      • 	The string is normalized (converted to lowercase, spaces removed).
2. 	Data Structure Usage
      • 	Each character is pushed into a stack.
      • 	Each character is enqueued into a queue.
3. 	Comparison Process
      • 	Characters are popped from the stack (reverse order).
      • 	Characters are dequeued from the queue (original order).
      • 	If all characters match, the string is a palindrome.
4. 	Output
      • 	Display whether the string is a palindrome or not.

## Use Case
• 	Educational Purpose: Helps students understand how stacks and queues work in tandem.
• 	String Processing: Useful in text validation, natural language processing, and pattern recognition.
• 	Interview Preparation: A common data structure problem asked in coding interviews.
• 	Real-world Applications:
• 	Checking palindromic DNA sequences in bioinformatics.
• 	Validating symmetric encryption keys.
• 	Detecting mirrored patterns in data streams.

--------------------
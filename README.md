## Objective
The objective of this project is to implement an optimized palindrome checker using a Deque (Double-Ended Queue).
Unlike the stack + queue approach, a deque allows direct access to both ends of the sequence, making palindrome checking more efficient and elegant.

## Flow of the Project
1. 	Input Handling
      • 	User enters a string.
      • 	The string is normalized (converted to lowercase, spaces removed).
2. 	Deque Operations
      • 	Each character of the string is added to the deque.
      • 	Characters are compared by removing from the front and back simultaneously.
3. 	Comparison Logic
      • 	If all corresponding characters match, the string is a palindrome.
      • 	If any mismatch occurs, the string is not a palindrome.
4. 	Output
      • 	Display whether the string is a palindrome or not.

## Use Case
• 	Educational Purpose: Demonstrates how a single data structure (Deque) can replace both stack and queue.
• 	Performance-Oriented: Optimized solution with fewer operations and cleaner logic.
• 	Interview Preparation: A common problem in coding interviews, showcasing knowledge of advanced data structures.
• 	Real-world Applications:
• 	Checking palindromic sequences in computational biology.
• 	Detecting mirrored patterns in text or data streams.
• 	Useful in algorithms for symmetric encryption and pattern recognition.
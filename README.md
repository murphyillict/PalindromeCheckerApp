## Objective
The objective of this project is to check if a string is a palindrome using recursion.
This approach avoids extra data structures and instead relies on recursive function calls to compare characters from both ends of the string.

## Flow of the Project
1. 	Input Handling
      • 	User enters a string.
      • 	The string is normalized (converted to lowercase, spaces removed).
2. 	Recursive Function
      • 	Compare the first and last characters.
      • 	If they match, call the function again for the substring moving inward.
      • 	If they don’t match, return false.
      • 	Base case: when start index crosses or meets end index, return true.
3. 	Output
      • 	Display whether the string is a palindrome or not.

## Use Case
• 	Educational Purpose: Demonstrates recursion in a simple, practical problem.
• 	Algorithm Practice: Helps students understand base cases and recursive calls.
• 	Interview Preparation: A common recursion problem asked in coding interviews.
• 	Real-world Applications:
• 	Useful in recursive algorithms for string processing.
• 	Can be extended to check palindromes in arrays or linked structures.
# Palindrome Checker App

## Overview
**Palindrome Checker App** is a Java-based application designed to validate whether a given string is a palindrome. The project is structured into multiple **use cases**, each demonstrating a different approach to palindrome checking.  

This repository is useful for learning string manipulation, algorithmic thinking, and branch-based development in Git.

---

## Features / Use Cases

### **Use Case 1: Basic Palindrome Checker**
- Stored in branch: `HomePage`  
- Checks a word or string for palindrome property using **simple character comparison**.
- Iterates over the string with **manual loops**.

---

### **Use Case 2: Reverse String with Iteration**
- Stored in branch: `UseCase2`  
- Checks palindrome by **reversing the string manually** with a two-pointer approach.
- Compares the original and reversed strings to determine validity.
- Demonstrates **string transformation before advanced data structures**.

---

### **Use Case 3: Palindrome Check Using `StringBuilder.reverse()`**
- Stored in branch: `UseCase3`  
- Simplifies palindrome checking using Java’s built-in string reversal:
  ```java
  String reversed = new StringBuilder(word).reverse().toString();
  if (word.equals(reversed)) {
      System.out.println(word + " is a palindrome.");
  }

# Project Context: Java Array Algorithms

## Project Overview
This directory (`arrayc`) contains Java implementations of various array-based algorithmic problems and data structure exercises. It serves as a study aid for understanding concepts like Sliding Window, Two Pointers, Hashing, and Array manipulation.

## Key Files & Concepts

### Array Manipulation
*   **`checkIfArrayIsSorted.java`**: Solution for LeetCode 1752. Checks if an array is sorted and rotated using a simulated circular array approach.
*   **`removeDuplicates.java`**: Solution for LeetCode 26. Implements the Two Pointer technique to remove duplicates from a sorted array in-place.

### Subarray Problems
*   **`longestSubarraySumKHashing.java`**: Finds the longest subarray with sum K using the HashMap (Prefix Sum) approach. **Time Complexity:** O(N). **Space Complexity:** O(N).
*   **`longestSubarraySumKTwoPointers.java`**: Finds the longest subarray with sum K using the Two Pointer (Sliding Window) approach. Optimized for non-negative numbers. **Time Complexity:** O(N). **Space Complexity:** O(1).

## Building and Running

### Prerequisites
*   Java Development Kit (JDK) installed (e.g., OpenJDK, Oracle JDK).

### Compilation & Execution
These are standalone Java files. You can compile and run them directly from the terminal.

**Note:** Some files have the package declaration `package javacode.arrayc;`. To run these, you should navigate to the root `javacode` directory's parent and run:
```bash
javac javacode/arrayc/filename.java
java javacode.arrayc.filename
```

For files without a package declaration (or if you remove the package line):
```bash
javac filename.java
java filename
```

## Development Conventions
*   **Naming:** Class names usually reflect the algorithm or problem being solved.
*   **Structure:** Solutions generally include a core logic method (e.g., `solve`, `check`) and a `main` method for demonstration/testing.
*   **Style:** Standard Java naming conventions (CamelCase for classes, camelCase for methods).

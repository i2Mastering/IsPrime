# Prime Number Checker in Java

## Overview
This project implements a **Prime Number Checker** in Java. The program prompts the user to enter a positive number and determines whether it is a prime number. It uses regular expressions to extract the numeric part of the user's input and performs optimized primality testing.

## Features
- Accepts large numbers (e.g., 982451653).
- Ignores trailing non-digit characters but exits if a non-digit character precedes a number.
- Converts floating-point numbers by truncating them to integers.
- Exits on negative numbers or invalid input.
- Efficient prime checking using a 6k +/- 1 optimization algorithm.

## How It Works
1. **User Input**:
   - Prompts the user to enter a positive number.
   - Accepts input as a string.

2. **Regex Extraction**:
   - Uses regular expressions to extract the leading numeric portion of the string.

3. **Input Validation**:
   - If the extracted number is less than or equal to zero, the program exits.
   - If the input does not contain valid digits, the program exits.

4. **Prime Checking**:
   - Uses an optimized algorithm for primality testing.
   - Outputs whether the number is prime or not.

5. **Loop Continuation**:
   - Continues prompting for numbers until the user provides an invalid input or a non-positive number.

## Usage
### Compilation
Make sure you have Java installed and configured in your system. Then, compile the program:

```bash
javac IsPrime.java
```

### Execution
Run the compiled Java program:

```bash
java IsPrime
```

## Example Run
```
Enter a positive number (0 or negative to exit): 982451653
982451653 is a prime number.

Enter a positive number (0 or negative to exit): 55u
55 is not a prime number.

Enter a positive number (0 or negative to exit): -5
```

## Notes
- Floating-point numbers are truncated (e.g., 55.7 becomes 55).
- Input with letters after the number is accepted, but letters before the number exit the program.
- Negative numbers and numbers less than or equal to zero terminate the program.

## License
This project is provided for educational purposes and is open-source.

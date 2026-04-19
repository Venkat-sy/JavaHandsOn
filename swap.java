/*Let’s break down what happens in your `swapNumbers` method step by step. The trick here is that it uses the **bitwise XOR operator (`^`)** to swap two numbers without a temporary variable.

### Code Walkthrough

```java
public static String swapNumbers(int n1, int n2) {
    String swap = "No swap to be performed";
    n1 = n1 ^ n2;   // Step 1
    n2 = n1 ^ n2;   // Step 2
    n1 = n1 ^ n2;   // Step 3
    swap = n1 + "," + n2;
    return swap;
}
```

### Step-by-Step Explanation

1. **`n1 = n1 ^ n2;`**
   - XOR compares each bit of `n1` and `n2`.
   - If bits are the same → result is `0`; if different → result is `1`.
   - After this line, `n1` holds the XOR of the original `n1` and `n2`.
   - Example: if `n1 = 5 (0101)` and `n2 = 3 (0011)`, then `n1 = 0101 ^ 0011 = 0110 (6)`.

2. **`n2 = n1 ^ n2;`**
   - Now `n2` becomes `(n1 ^ n2) ^ n2`.
   - By XOR properties: `(A ^ B) ^ B = A`.
   - So `n2` now holds the original value of `n1`.
   - Continuing the example: `n2 = 0110 ^ 0011 = 0101 (5)` → original `n1`.

3. **`n1 = n1 ^ n2;`**
   - Now `n1` becomes `(n1 ^ n2) ^ n2`.
   - Again, by XOR properties: `(A ^ B) ^ A = B`.
   - So `n1` now holds the original value of `n2`.
   - Example: `n1 = 0110 ^ 0101 = 0011 (3)` → original `n2`.

4. **Result**
   - At this point, the values have been swapped:
     - `n1` contains the original `n2`.
     - `n2` contains the original `n1`.
   - The method returns them as a string `"n1,n2"`.

### Key Insight
The XOR swap works because XOR has these properties:
- `A ^ A = 0`
- `A ^ 0 = A`
- `(A ^ B) ^ B = A`

This allows values to be swapped without needing a temporary variable.

---

Would you like me to also show you a **trace table** (with actual numbers at each step) so you can visually see how the values change during execution?







*/

public class swap {
    public static String swapNumbers(int n1, int n2) {
        String swap = "No swap to be performed";
        n1 = n1 ^ n2;
        n2 = n1 ^ n2;
        n1 = n1 ^ n2;
        swap = n1 + "," + n2;
        return swap;
    }

    public static void main(String[] args) {
       // swap s=new swap();
        int a = 5, b = 3;
     
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        String result =swapNumbers(a, b);
        System.out.println("After swapping: " + result);
    }
    
}

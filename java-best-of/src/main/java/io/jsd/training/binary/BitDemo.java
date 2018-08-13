package io.jsd.training.binary;

public class BitDemo {
	
//	Bitwise and Bit Shift Operators
//	The Java programming language also provides operators that perform bitwise and bit shift operations on integral types. The operators discussed in this section are less commonly used. Therefore, their coverage is brief; the intent is to simply make you aware that these operators exist.
//	The unary bitwise complement operator "~" inverts a bit pattern; ex : 000 --> 111
//	The signed left shift operator "<<" shifts a bit pattern to the left, and the signed right shift operator ">>" shifts a bit pattern to the right. The bit pattern is given by the left-hand operand, and the number of positions to shift by the right-hand operand. The unsigned right shift operator ">>>" shifts a zero into the leftmost position, while the leftmost position after ">>" depends on sign extension.
//	The bitwise & operator performs a bitwise AND operation.
//	The bitwise ^ operator performs a bitwise exclusive OR operation.
//	The bitwise | operator performs a bitwise inclusive OR operation.
//	The following program, BitDemo, uses the bitwise AND operator to print the number "2" to standard output.

	public static void main(String[] args) {
		int bitmask = 0x000F;
		System.out.println(bitmask);
        int val = 0x2222;
        System.out.println(val);
        // prints "2"
        System.out.println(val & bitmask);
	}

}

package com.semanticsquare.basics;  //package com.semanticsquare.basics;

public class BasicsDemo {
    // Adapted from http://www.ntu.edu.sg/home/ehchua/programming/java/J1a_Introduction.html
    static void print() {
      System.out.println("\n\nInside print ...");
      System.out.println("Hello, world!!"); // Advance cursor to beginning of next line
      System.out.println();                 // Print empty line
      System.out.print("Hello, world!!");   // Cursor stayed after the printed string
      System.out.println("Hello,");
      System.out.print(" ");                // Print a space
      System.out.print("world!!");
    }

	static void primitives() {
	  System.out.println("\n\nInside primitives ...");
	  // literals demo
	  int intHex = 0x0041;
	  System.out.println("intHex: " + intHex);
	  int intBinary = 0b01000001;
	  System.out.println("intBinary: " + intBinary);
	  int intChar = 'A'; // holds decimal equivalent, which is 65
	  System.out.println("intChar: " + intChar);
	  int intUnderscore = 1_23_456;
	  System.out.println("intUnderscore: " + intUnderscore);

	  char charA = 'A';
	  System.out.println("charA: " + charA);
	  char charInt = 65;
	  System.out.println("charInt: " + charInt);
	  char charUnicode1 = '\u0041'; // 4 * (16 power 1 )+ 1 * (16 power 0)
	  System.out.println("charUnicode1: " + charUnicode1);
	  char charUnicode2 = 0x41;     // 4 * (16 power 1 )+ 1 * (16 power 0)
	  System.out.println("charUnicode2: " + charUnicode2);
	  char charBinary = 0b01000001; // binary corresponding to decimal 65
	  System.out.println("charBinary: " + charBinary);
    }

    static void typeCasting() {
      System.out.println("\nInside typeCasting ...");
      // Explicit casting
      long y = 42;
      //int x = y;
      int x = (int)y;

      // Information loss due to out-of-range assignment
      byte narrowdByte = (byte)123456;
	  System.out.println("narrowdByte: " + narrowdByte);

	  // Truncation
	  int iTruncated = (int)0.99;
	  System.out.println("iTruncated: " + iTruncated);

	  // Implicit cast (int to long)
	  y = x;

	  // Implicit cast (char to int)
	  char cChar = 'A';
	  int iInt = cChar;
	  System.out.println("iInt: " + iInt);

	  // byte to char using an explicit cast
	  byte bByte = 65;
	  cChar = (char)bByte; // special conversion (widening from byte --> int followed by narrowing from int --> char)
	  System.out.println("cChar: " + cChar);
    }

	static void arrays() {
	   System.out.println("\nInside arrays ...");
	   int[] myArray = new int[]{9, 11, 2, 5, 4, 4, 6};
       System.out.println("myArray.length: " + myArray.length);
	   System.out.println("myArray[1]: " + myArray[1]);
	   System.out.println("myArray[7]: " + myArray[7]);
	}

    static void threeDimensionalArrays() {
	   System.out.println("\nInside threeDimensionalArrays ...");
	   int[][][] unitsSold = new int[][][]{
										   { // New York
											 {0,0,0,0}, // Jan
											 {0,0,0,0}, // Feb
											 {0,0,0,0}, // Mar
											 {0,850,0,0}// Apr
										   },
										   { // San Francisco
											 {0,0,0,0}, // Jan
											 {0,0,0,0}, // Feb
											 {0,0,0,0}, // Mar
											 {0,0,0,0}  // Apr
										   },
										   {
											 {0,0,0,0},
											 {0,0,0,0},
											 {0,0,0,0},
											 {0,0,0,0}
										   },
										   {
											 {0,0,0,0},
											 {0,0,0,0},
											 {0,0,0,0},
											 {0,0,0,0}
										   }
										 };

		System.out.println("unitsSold[0][3][1]: " + unitsSold[0][3][1]);
	}

	static void varargsOverload(boolean b, int i, int j, int k){
	   System.out.println("\nInside varargsOverload without varargs ...");
	}
	static void varargsOverload(boolean b, int... list){
	   System.out.println("\nInside varargsOverload with varargs ...");
	   System.out.println("list.length: " + list.length);
	}

	static void charTypePromotion() {
	  System.out.println("\nInside charTypePromotion ...");
	  char char1 = 50; // Will be assigned corresponding UTF16 value 2
	  System.out.println("char1: " + char1);
	  System.out.println("(73 - char1): " + (73 - char1)); // char1 gets promoted to int, i.e., decimal equivalent 50 in UTF16 is used
	  System.out.println("(char1 - '3'): " + (char1 - '3')); // char1 & '3' are promoted to ints
	  System.out.println("('a' + 'b'): " + ('a' +'b')); // 'a' & 'b' are promoted to ints and the respective equivalents 97 & 98 are added
    }

	static void bitwiseOperators() {
	    System.out.println("\nInside bitwiseOperators ...");
	    int x = 1;
		int y = 3;

		System.out.println("x & y: " + (x & y));
		System.out.println("x | y: " + (x | y));
		System.out.println("x ^ y: " + (x ^ y));
		System.out.println("~x: " + (~x));
		System.out.println("true & false: " + (true & false));

		char c1 = 'a'; // U+0061 --> 0110 0001
		char c2 = 'b'; // U+0062 --> 0110 0010
		System.out.println("c1 | c2: " + (c1 | c2)); // 0110 0011 --> 99 in decimal

		// Since bitwise work only on Integer types, following will not compile
		//double d1 = 3.14;
		//double d2 = 5.15;
		//System.out.println("d1 | d2: " + (d1 | d2));
    }

    static void switchExample() {
	    System.out.println("\nInside switchExample ...");
	    int month = 3;
	    switch (month) {
		    case 1: System.out.println("January");
	                break;
		    case 2: System.out.println("February");
	                break;
	        case 3: System.out.println("March");
	                break;
		    default: System.out.println("April");
	    }
    }

    static void labeledBreak() {
	    System.out.println("\nInside labeledBreak ...");
	    int num = 0;

	    outermost: for (int i = 0; i < 10; i++) {
	        for (int j = 0; j < 10; j++) {
	            if (i == 5 && j == 5) {
	                break outermost;
	            }
	            num++;
	        }
	    }

	    System.out.println("num: " + num); // prints 55
    }

	static void labeledContinue() {
	    System.out.println("\nInside labeledContinue ...");
	    int num = 0;

	    outermost: for (int i = 0; i < 10; i++) {
	        for (int j = 0; j < 10; j++) {
	            if (i == 5 && j == 5) {
	                continue outermost;
	            }
	            num++;
	        }
	    }

	    System.out.println("num: " + num); // prints 55
    }

	static void stringExamples() {
		System.out.println("\nInside stringExamples ...");
		String s = "hello world!";
		System.out.println("s: " + s);

		System.out.println("\ns.length(): " + s.length());
		System.out.println("s.isEmpty(): " + s.isEmpty());

		// Comparison
		System.out.println("\ns.equals(\"HELLO WORLD!\"): " + s.equals("HELLO WORLD!"));
		System.out.println("s.equalsIgnoreCase(\"HELLO WORLD!\"): " + s.equalsIgnoreCase("HELLO WORLD!"));
		System.out.println("s.compareTo(\"HELLO WORLD!\"): " + s.compareTo("HELLO WORLD!"));

		// Searching
		System.out.println("\ns.contains(\"HELLO WORLD!\"): " + s.contains("HELLO WORLD!"));
		System.out.println("s.contains(\"world!\"): " + s.contains("world!"));
		System.out.println("s.startsWith(\"HELLO WORLD!\"): " + s.startsWith("HELLO WORLD!"));
		System.out.println("s.startsWith(\"hello world!\"): " + s.startsWith("hello world!"));
		System.out.println("s.endsWith(\"!\"): " + s.endsWith("!"));
		System.out.println("s.indexOf(\"lo\"): " + s.indexOf("lo"));
		System.out.println("s.indexOf(\"o\"): " + s.indexOf('o'));
		System.out.println("s.lastIndexOf(\"o\"): " + s.lastIndexOf('o'));

		// Examining individual characters
		System.out.println("\ns.charAt(4): " + s.charAt(4));

		// Extracting substrings
		System.out.println("\ns.substring(4): " + s.substring(4));
		System.out.println("s.substring(4, 9): " + s.substring(4, 9));

		// Case conversions
		System.out.println("\ns.toUpperCase(): " + s.toUpperCase());
		System.out.println("s.toLowerCase(): " + s.toLowerCase());

		System.out.println("\ns.trim(): " + s.trim()); // returns a copy of string after trimming any leading & trailing white spaces

		// Replace
		System.out.println("\ns.replaceAll(\"o\", \"r\"): " + s.replaceAll("o", "r"));

		// Split
		System.out.println("\ns.split(\"o\"): ");
		String[] sa = s.split("o");
		for (String temp : sa) {
			System.out.println(temp);
		}

		System.out.println("\ns.valueOf(1.3): " + s.valueOf(1.3));
	}

	static void stringPool() {
	  System.out.println("\nInside stringPool ...");
	  String s1 = "hello!";
	  String s2 = "hello!";
	  String s3 = "hello!".intern();
	  String s4 = new String("hello!");
	  String s5 = "lo!";

      System.out.println("s1 == s2: " + (s1 == s2));
      System.out.println("s1 == s3: " + (s1 == s3));
      System.out.println("s1 == s4: " + (s1 == s4));
      System.out.println("s1 == s4.intern(): " + (s1 == s4.intern()));
      System.out.println("s1 == \"hel\" + \"lo!\": " + (s1 == "hel" + "lo!"));
      System.out.println("s1 == \"hel\" + s5: " + (s1 == "hel" + s5));
    }

	public BasicsDemo () {
	    System.out.println("Inside no-arg constructor ...");
	}

	public BasicsDemo (int id) {
	    System.out.println("Inside constructor with a parameter ...");
	}

	{
	    System.out.println("Inside instance initializer ...");
	}

	static void veryExpensive() {
	  System.out.println("\nInside veryExpensive ...");
      Long sum = 0L;
	  for (long i = 0; i < Integer.MAX_VALUE; i++) {
	      sum = sum + i;
	  }
    }

	static void compareBoxPrimitives() {
	  System.out.println("\nInside compareBoxPrimitives ...");
      Integer num1 = new Integer(0);
	  Integer num2 = new Integer(0);
	  System.out.println("(num1 == num2): " + (num1 == num2));

	  // Solutions:
	  System.out.println("(num1.intValue() == num2.intValue()): " + (num1.intValue() == num2.intValue()));
	  System.out.println("(num1.equals(num2)): " + (num1.equals(num2)));

	  Integer num3 = new Integer(1);
	  System.out.println("(num1 < num3): " + (num1 < num3)); // "<" does un-boxing first
    }

	static Integer i;
	static void unbelievable() {
	  System.out.println("\nInside unbelievable ...");
      if (i == 0)
         System.out.println("weird!");
    }

	public static void main(String[] args) {
	  // Language Basics 1
	  //print();
	  //primitives();
	  //typeCasting();
	  //arrays();
      //threeDimensionalArrays();
      /*varargsOverload(true, 1, 2, 3);
      varargsOverload(true, 1, 2, 3, 4, 5, 6, 7, 8);
      varargsOverload(true);*/
	  //charTypePromotion();
	  //bitwiseOperators();
	  //switchExample();
	  //labeledBreak();
	  //labeledContinue();
      // import demo
      // package creation demo
      //stringExamples();
      //stringPool();
	  //BasicsDemo bd = new BasicsDemo(1);

	  //Integer[] items = new int[]{1, 2};

	  /*
	  long start = System.nanoTime();
	  veryExpensive();
	  System.out.println("Elapsed time: " + ((System.nanoTime() - start) / 1000000.0) + " msec");
	  */

	  compareBoxPrimitives();
	  //unbelievable();
    }
  }

package com.semanticsquare.basics;

import java.util.*;

class BasicsDemo {
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


    static void preAndPost() {
        System.out.println("\nInside preAndPost ...");

        int x = 5;

        //--x;
        //System.out.println("x: " + x);

        //int y = x--;
        //System.out.println("y: " + y + ", x: " +  x);

        int index = 0;
        int[] array = new int[3];
        array[index++] = 10;
        array[index++] = 20;
        array[index++] = 30;

        System.out.println(index);
    }


    static void compoundArithmeticAssignment() {
        int x = 100;

        System.out.println("x += 5: " + (x += 5));
        System.out.println("x -= 5: " + (x -= 5));
        System.out.println("x *= 5: " + (x *= 5));
        System.out.println("x /= 5: " + (x /= 5));
        System.out.println("x %= 5: " + (x %= 5));

        // Invalid
        System.out.println("x =+ 5: " + (x =+ 5)); // Unary plus ~ x = +5
        System.out.println("x =- 5: " + (x =- 5)); // Unary minus ~ x = -5
		/*System.out.println("x =* 5: " + (x =* 5));
		System.out.println("x =/ 5: " + (x =/ 5));
		System.out.println("x =% 5: " + (x =% 5));*/
    }

    static void isOddOrEven(int num) {
        System.out.println(num % 2);
    }


    // Comparison or Relational operators
	/*
       static void comparisonOperators() {
	    System.out.println("\nInside comparisonOperators ...");
		int age = 20;
	        //if (age > 21) {
		//	System.out.println("Graduate student");
		//}
		System.out.println("age > 21: " + (age > 21));
		System.out.println("age >= 21: " + (age >= 21));
		System.out.println("age < 21: " + (age < 21));
		System.out.println("age <= 21: " + (age <= 21));
		System.out.println("age == 21: " + (age == 21)); // equal to (equality operator)
		System.out.println("age != 21: " + (age != 21)); // not equal to (equality operator)

		boolean isInternational = true;
		//System.out.println("isInternational <= true: " + (isInternational <= true));
		System.out.println("isInternational == true: " + (isInternational == true));
		System.out.println("isInternational != true: " + (isInternational != true));

		Student s1 = new Student(1000, "Dheeru");
		Student s2 = new Student(1000, "Dheeru");
		System.out.println("s1 == s2: " + (s1 == s2)); // See object class
		System.out.println("s1 != s2: " + (s1 != s2));

		update(s1, "John");
	}

	static boolean update(Student s, String name) {
	    if (s == null) {
		   return false;
		}

		s.name = name;
		return true;
	}


	static void logicalOperators() {
		System.out.println("\nInside logicalOperators ...");
		int age = 37;
	    int salary = 85000;
	    boolean hasBadCredit = false;

		// 1. Core (AND, OR, NOT & Operator Chaining)

	    if (age > 35 && salary > 90000 || !hasBadCredit) {
	    	System.out.println("Loan approved!");
	    } else {
			System.out.println("Loan not approved!");
		}

		// 2.
		//    (a) Left-associative ~ Order of grouping
		//    (b) Associativity (a && b) && c = a && (b && c)
		//    Applies to both && and ||


		// 3.
		//    (a) Operator precedence of Logical Operators: Helps with ONLY grouping operations. Not order of execution. (! > && > ||)

		          // Other Examples: A && B || C && D = (A && B) || (C && D)
				  //                 A && B && C || D = ((A && B) && C) || D


		//    (b) Operator Precedence across logical, comparison and arithmetic
		//          ! > arithmetic > comparison > &&, ||
		//    See resources section for complete precedence rules

		// ALWAYS USE PARENTHESIS for READABILITY. Not everyone is aware of precedence rules

		// 4. Use && to avoid NullPointerException
		Student s1 = new Student(1001, "Raj");
		update(s1, "Dheeru");
	}
	*/

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

    // Business logic for loan approval
    static boolean ifStatement() {
        boolean approved = false;

        int age = 27;
        int salary = 60000;
        boolean hasBadCredit = false;

        if (age >= 25 && age <= 35 && salary >= 50000) {
            approved = true;
            System.out.println("age >= 25 && age <= 35 && salary >= 50000");
        } else if (age > 35 && age <= 45 && salary >= 70000) {
            approved = true;
            System.out.println("age > 35 && age <= 45 && salary >= 70000");
        } else if (age > 45 && age <= 55 && salary >= 90000) {
            approved = true;
            System.out.println("age > 45 && age <= 55 && salary >= 90000");
        } else {
            if (age > 55 && !hasBadCredit) {
                approved = true;
                System.out.println("age > 55 && !hasBadCredit");
            }

            System.out.println("else block");
        }

        System.out.println("outside if");

        return approved;
    }

    // Constant Expression (In the context of switch):
    // (i) int literals (e.g., 3), string literals ("March"), enum constants (e.g., MARCH)
    // (ii) Constant variables
    // (a) final variables that are INITIALIZED +
    // (b) variable type has to be byte/short/char/int/String

    // case L -> an expression | block of statements | throw statement
    //       No fall through (safer & compact code)
    // case L : {0 or more statements }
    static String getSeason(int month) {

        return switch (month) {
            case 1,2,3 -> "Spring";
            case 4,5,6 -> "Summer";
            case 7,8,9 -> "Rainy";
            case 10,11,12 -> "Winter";
            default -> throw new IllegalArgumentException("unknown");//season = "unknown";
        };

		/*
		// Switch expression with traditional syntax
		return switch (month) {
			case 1,2,3 : yield "Spring";
			case 4,5,6 : yield "Summer";
			case 7,8,9 : yield "Rainy";
			case 10,11,12 : yield "Winter";
			default : throw new IllegalArgumentException("unknown");//season = "unknown";
		};
		*/
    }

    // Arrow label in Switch Statement: "expression" validity tests
    static void arrowLabelTests(int month) {

        int temp = 0;

        switch (month) {
            // Valid - must be valid "expression statements"
            case 1 -> foo();
            case 2 -> temp++; // ++temp; temp--, --temp
            case 3 -> temp = 3;
            case 4 -> new String("Dheeru");


            // Invalid
			/*case 5 -> int x; // declaration statement
			case 6 -> temp;
			case 7 -> 5;
			case 8 -> if (month > 3) {} // control flow statement
			case 9 -> break;
            case 10 -> ;*/

        }
    }

    static String foo(){
        return "Spring";
    }

    // Switch expression with traditional case label
    // General syntax:
    //          case L: block of statements
    // Same semantics as switch statements: fall through
    // Confusing!!!
    static double getDiscount(String customerType) {
        double discount = 0.0;

        return switch (customerType) {
            case "supersenior": discount += 5.0;
            case "senior": yield discount += 5.0; // statement
            case "kid": yield discount += 5.0;
            default : yield discount;
        };
    }

    // String -> from Java 7
    static String getSeason(String month) {
        String season = null;

        switch (month) {
            case "January":
                season = "Spring";
                break;
            case "February":
                season = "Spring";
                break;
            case "March":
                season = "Spring";
                break;
            case "April":
                season = "Summer";
                break;
            case "May":
                season = "Summer";
                break;
            case "June":
                season = "Summer";
                break;
            case "July":
                season = "Rainy";
                break;
            case "August":
                season = "Rainy";
                break;
            case "September":
                season = "Rainy";
                break;
            case "October":
                season = "Winter";
                break;
            case "November":
                season = "Winter";
                break;
            case "December":
                season = "Winter";
                break;
            default :
                season = "unknown";
                break;
        }

        return season;
    }

    enum Month { JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER}

    static String getSeason(Month month) {
        //String season = null;

		/*
		switch (month) {
			case JANUARY :
			   season = "Spring";
			   break;
			case FEBRUARY:
			   season = "Spring";
			   break;
			case MARCH:
			   season = "Spring";
			   break;
			case APRIL:
			   season = "Summer";
			   break;
			case MAY:
			   season = "Summer";
			   break;
			case JUNE:
			   season = "Summer";
			   break;
			case JULY:
			   season = "Rainy";
			   break;
			case AUGUST:
			   season = "Rainy";
			   break;
			case SEPTEMBER:
			   season = "Rainy";
			   break;
			case OCTOBER:
			   season = "Winter";
			   break;
			case NOVEMBER:
			   season = "Winter";
			   break;
			case DECEMBER:
			   season = "Winter";
			   break;
		}*/


        String season = switch (month) {
            case JANUARY,FEBRUARY,MARCH -> season = "Spring";
            case APRIL,MAY,JUNE -> "Summer";
            case JULY,AUGUST,SEPTEMBER -> "Rainy";
            case OCTOBER,NOVEMBER,DECEMBER -> "Winter";
        };

        return season;

    }

    void forStatement() {
        int[] iArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0, j = iArray.length-1, middle = iArray.length >>> 1; i < middle; i++, j--) {
            int temp = iArray[i];
            iArray[i] = iArray[j];
            iArray[j] = temp;
        }

        for (int i = 0; i < iArray.length; i++) {
            System.out.print(iArray[i] + " ");
        }

        System.out.println("\n\nCounting divisors");
        int x = 24;
        int count = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println("\ndivisors count: " + count);

        System.out.println("\nDisplaying Student Grades ...");
        int[][] studentGrades = {{76, 52, 69, 83, 45, 90}, {22, 71, 67, 69, 40}, {53, 87, 91, 25}};

        for (int i = 0; i < studentGrades.length; i++) {
            int max = 0;
            System.out.println("\n\nDisplaying grades of section " + i);

            for (int j = 0; j < studentGrades[i].length; j++) {
                if (studentGrades[i][j] > max) {
                    max = studentGrades[i][j];
                }
                System.out.print(studentGrades[i][j] + " ");
            }

            System.out.println("\nmax: " +  max);
        }

    }

    private static void whileStatement() {

        int[] iArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

		/*
	  	for (int i = 0, j = iArray.length-1, middle = iArray.length >>> 1; i < middle; i++, j--) {
			int temp = iArray[i];
			iArray[i] = iArray[j];
			iArray[j] = temp;
	  	}

      	for (int i : iArray) {
			System.out.print(i + " ");
		}			*/

		/*
		int i = 0, j = iArray.length-1, middle = iArray.length >>> 1;

		while (i < middle) {
			int temp = iArray[i];
			iArray[i] = iArray[j];
			iArray[j] = temp;

			i++;
			j--;
	  	}

		i = 0;
      	while (i < iArray.length)  {
			System.out.print(iArray[i++] + " ");
		}
			*/


        // Reading from file
	  /* try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("curriculum.txt"), "UTF-8"))) {

			String line;

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (IOException e) {}
		*/


        // Element removal during iteration
		/*ArrayList<Integer> list = new ArrayList<>(List.of(29, -1, 39));
		Iterator<Integer> iterator = list.iterator();

		while (iterator.hasNext()) {

			if (iterator.next() == -1) {
				iterator.remove();
			}

		}

		System.out.println(list);*/



        // Infinite Loop (Rare in general. Common in Embedded Programming)
		/*Path sourcePath = Paths.get("C:/javaindepth/src/com/semanticsquare/basics/download/curriculum.txt");
        Path destinationPath = Paths.get("C:/javaindepth/src/com/semanticsquare/basics/index/curriculum.txt");

        while (true) {

            if (Files.exists(sourcePath)) {

                try {
                    Files.move(sourcePath, destinationPath);

                    System.out.println("File copied successfully.");
                } catch (IOException e) { }

            } else {
                System.out.println("Source file does not exist. ");
            }

			try {
                Thread.sleep(2000); // suspends execution for 2 seconds
            } catch (InterruptedException e) { }

        }
		*/
        //int unReachable = 0;

    }

    private static void doStatement() {
        Scanner scanner = new Scanner(System.in);
        int choice;
		/*
		System.out.println("Menu:");
		System.out.println("1. Pizza: $12");
		System.out.println("2. Burger: $8");
		System.out.println("3. Coffee: $3");
		System.out.println("4. Soft Drink: $3");
		System.out.println("5. Cake: $5");

		System.out.print("Enter your choice: ");
		choice = scanner.nextInt();

		while (choice < 1 || choice > 5) {
			System.out.println("Menu:");
			System.out.println("1. Pizza: $12");
			System.out.println("2. Burger: $8");
			System.out.println("3. Coffee: $3");
			System.out.println("4. Soft Drink: $3");
			System.out.println("5. Cake: $5");

			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();
		}

		System.out.print("Placing order ");*/

        do {
            System.out.println("Menu:");
            System.out.println("1. Pizza: $12");
            System.out.println("2. Burger: $8");
            System.out.println("3. Coffee: $3");
            System.out.println("4. Soft Drink: $3");
            System.out.println("5. Cake: $5");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

        } while (choice < 1 || choice > 5);

        System.out.print("Placing order ");

    }

    public static boolean containsPerfectScore(int[] studentScores) {
        boolean perfectScore = false;

        for (int score : studentScores) {
            System.out.println("Current score: " + score);


            if (score == 100) {
                System.out.println("Perfect score!!!");
                perfectScore = true;
                break;
            }

            System.out.println("Not perfect score");
        }

        return perfectScore;
    }

    public static boolean containsPerfectScore(int[][] studentScores) {
        boolean perfectScore = false;

        outerfor : for (int[] scores : studentScores) {
            System.out.println("\nProcessing new test scores");

            for (int score : scores) {
                System.out.println("Current score: " + score);

                if (score == 100) {
                    System.out.println("Perfect score!!!");
                    perfectScore = true;
                    break outerfor;
                }

                System.out.println("Not perfect score");
            }
        }

        return perfectScore;
    }

    private static void labelStatementScope() {
        int[] x = {1, 2};

        // Multiple labels + Degree of nestedness doesn't matter
        outermost : for (int i : x) {
            outer : for (int j : x) {
                for (int k : x) {
                    break outermost;
                }
                break outer;
            }
            //break outer; // Invalid - out of scope
        }

        // Invalid - Out of scope
        abc : for (int i : x) {}
        //xyz : for (int j : x) { break abc; }

        // Invalid - Duplicate label
        abc : for (int i : x) {
            //abc : for (int j : x) {}
        }

        //invalidLabel : int temp = 0; // Not a statement

    }

    private static boolean moreLabeledStatement() {
        boolean flag = false;

        labeledWhile : while (flag) {
        }

        labeledDo : do {
            labeledBreak: break labeledDo;
        } while (true);

        // Expression statements (RAREST!)
        reset : flag = false;
        log : System.out.println(flag);

        labeledReturn : return true;
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

        //preAndPost();
        //compoundArithmeticAssignment();
        //isOddOrEven(51);

        //comparisonOperators();
        //logicalOperators();
        //bitwiseOperators();
        //ifStatement();

        //String season = getSeason(3);
        //String season = getSeason("March"); // Java 7
        //String season = getSeason(Month.CUCUMBER);

        //System.out.println(season);

        //System.out.println(getDiscount("senior"));

        // whileStatement();

        // doStatement();

//        int[][] studentScores = {{76, 52, 69, 100, 45, 90}, {22, 71, 67, 69, 40}, {53, 87, 91, 25}};
        //int[] studentScores = {76, 52, 69, 100, 45, 90};
        //containsPerfectScore(studentScores);

        // continue statement demo
        /*int[] studentScores = {76, 52, -1, 100, 45, -1};
        double average = computeAverageScore(studentScores);
        System.out.println("\nAverage: " + average);*/

        // labeled continue demo
        int[][] studentScores = {
                {76, -1, 52},
                {90, 100, 80},
                {75, 85, 95}
        };

        double[] averageScores = computeAverageScore(studentScores);
        System.out.println("\nPrinting average scores");

        for(double avgScore: averageScores) {
            System.out.println(avgScore);
        }
    }

    private static double[] computeAverageScore(int[][] studentScores) {
        double[] average = new double[studentScores.length];
        int index = 0;
        outerfor: for(int[] scores: studentScores) {
            System.out.println("\nProcessing scores of new student");
            int sum =0, count=0;
            for(int score: scores) {
                System.out.println("Current score:" + score);
                if (score == -1) {
                    index++;
                    System.out.println("Cheated");
                    continue outerfor;
                }
                sum += score;
                count++;
                System.out.println("Sum: " + sum);
            }
            average[index++] = (double)sum/count;
        }
        return average;
    }

    private static double computeAverageScore(int[] studentScores) {
        double average = 0.0;
        int sum=0, count=0;
        for(int score: studentScores) {
            System.out.println("Current Score: " + score);
            if (score == -1) {
                System.out.println("Absent");
                continue;
            }
            sum += score;
            count++;
            System.out.println("Sum: " + sum);
        }
        average = (double)sum/count;
        return  average;
    }

}

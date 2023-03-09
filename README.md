# Java

**Referenzen:**

- [https://www.freecodecamp.org/news/the-java-handbook/](https://www.freecodecamp.org/news/the-java-handbook/)

**Beispiel Projekte:**

- 

**Übungen:**

- [https://www.w3schools.com/java/default.asp](https://www.w3schools.com/java/default.asp)
- [https://www.w3schools.com/sql/default.asp](https://www.w3schools.com/sql/default.asp)

## Tasks

- [ ]  Taschenrechner
    - eigener Upgrade
- [ ]  Java Datenbank
- [ ]  eigene ArrayList
- [ ]  E-Mail Programm
- [ ]  JDBC-Connection

## Arbeitsplan

1. Variablen
2. Casting/Convert
3. Operatoren
4. JVM
5. Compiler
6. IF/ELSE
7. Arrays
8. List
    1. Eigene ArrayList
    2. Eigene LinkedList
9. Loops
    1. While
    2. For
    3. Foreach
10. Klassen
11. Abstraktion
12. Interfaces
13. Exceptions
14. Libraries
    1. java.util.*
15. JUnit
16. Projektaufbau
17. Aufgabenanalyse
    1. Requirements
18. Schreibweisen
    1. Camelcase
    2. UPPER CASE - ENUM, STATICS

## Java

- Was ist Java?
- Warum nutzen wir Java?
- Open Source vs Oracle
- JRE vs JDK
- JSE und JE

# Comments

- //
- /* */
- /** */

### Tasks

- [x]  Ein Code mit verschiedenen Arten auskommentieren  und ausführen lassen

# Variablen

- Non-primitive
    - Object
        - String
        - Arrays
        - Classes
        - Integer
        - Double
        - Long
        - methods
            - size/length
            - toString()
            - equals()
            - valueOf()
            - Integer val = new Integer(1);
- Primitive
    - Beispiel:
        - 1==1
        - int i = 1;
    - byte
    - short
    - long
    - int
    - float
    - char
    - double
    - boolean
    
    | Data Type | Size | Description |
    | --- | --- | --- |
    | byte | 1 byte | Stores whole numbers from -128 to 127 |
    | short | 2 bytes | Stores whole numbers from -32,768 to 32,767 |
    | int | 4 bytes | Stores whole numbers from -2,147,483,648 to 2,147,483,647 |
    | long | 8 bytes | Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |
    | float | 4 bytes | Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits |
    | double | 8 bytes | Stores fractional numbers. Sufficient for storing 15 decimal digits |
    | boolean | 1 bit | Stores true or false values |
    | char | 2 bytes | Stores a single character/letter or ASCII values |
    |  |  |  |

### Tasks

- [ ]  Alle Arten von Variablen erstellen und mit Sysout ausgeben lassen

# Casting/Converter

![Untitled](Java%207687f1d4cf3345e79a775ac010e1e3de/Untitled.png)

![Untitled](Java%207687f1d4cf3345e79a775ac010e1e3de/Untitled%201.png)

zwei Möglichkeiten:

1. default ⇒ (primitiv) primitiv ⇒ (int) double
2. valueOf ⇒ by Objekten ⇒ String.valueOf(int)

## What are Wrapper Classes in Java?

Wrapper classes can wrap around primitive datatypes and turn them into reference types. Wrapper classes are available for all eight primitive data types.

| PRIMITIVE TYPE | WRAPPER CLASS |
| --- | --- |
| int | Integer |
| long | Long |
| short | Short |
| byte | Byte |
| boolean | Boolean |
| char | Character |
| float | Float |
| double | Double |

# Operatoren

| OPERATOR | OPERATION |
| --- | --- |
| + | Addition |
| - | Subtraction |
| * | Multiplication |
| / | Division |
| % | Remainder (Modulo/Modulus) |
| ++ | +1 |
| — | -1 |
| += | +x |
| -= | -x |

### Übungen

- [ ]  Taschenrechner
- [ ]  Schreibe eine Warteschlange mit einer Methode “ticketZiehen”
- [ ]  100%50

## Relationale Operatoren

These relational operators return either `true`
 or `false`
 depending on the operation you've performed.

| OPERATOR | EXPLANATION | USAGE |
| --- | --- | --- |
| == | Is Equal To | 5 == 8 returns false |
| != | Is Not Equal To | 5 != 8 returns true |
| > | Is Greater Than | 5 > 8 returns false |
| < | Is Less Than | 5 < 8 returns true |
| >= | Greater Than or Equal To | 5 >= 8 returns false |
| <= | Less Than or Equal To | 5 <= 8 returns true |

### Übungen

- [ ]  Vergleiche Buchstaben ‘a’ und ‘A’

## Logische Operatoren

| OPERATOR | USAGE | EXPLANATION |
| --- | --- | --- |
| Logical And (&&) | age >= 18 && age <= 40 | Evaluates to true, only if both conditions are true |
| Logical Or (||) | isSchoolStudent || isLibraryMember | Evaluates to true if one of the two or both conditions are true |
| Not (!) | !isLibraryMember | Evaluates to false if the inner condition evaluates to true and vise versa |

# Strings

```
public class Main {

	public static void main(String[] args) {
		String literalString1 = "abc";
		String literalString2 = "abc";

		String objectString1 = new String("abc");
		String objectString2 = new String("abc");

		System.out.println(literalString1 == literalString2);
		System.out.println(objectString1 == objectString2);

	}

}
```

- [ ]  schreibe if Abfrage die einen anderen Wert der selben Variable zuweist.

## String format

```
public class Main {
	public static void main(String[] args) {
		String name = "Farhan";
		int age = 27;

		String formattedString = String.format("My name is %s and I'm %d years old.", name, age);

		System.out.println(formattedString);
	}
}
```

| SPECIFIER | DATA TYPE |
| --- | --- |
| %b, %B | Boolean |
| %s, %S | String |
| %c, %C | Unicode Character |
| %d | Decimal Integer |
| %f | Floating Point Numbers |

## String - length und empty

- isEmpty()
    - wenn der String ein Objekt ist. Die Funktion zählt die Zeichen auch die Leerzeichen
- isBlank()
    - bei null gibt es false. Leerzeichen werden ignoriert.
- trim()
    - Schneidet vorne und hinten alle Leerzeichen ab
- length()
    - Zählt alle chars auch die Leerzeichen. Wirft eine NullPointerEception wenn String nicht initiallisert ist.

## String - split

```
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		String name = "Farhan Hasin Chowdhury";

		System.out.println(Arrays.toString(name.split(" ")));
	}

}
```

## String - join

```
public class Main {
	public static void main(String[] args) {
		System.out.println(String.join(" ", "Farhan", "Hasin", "Chowdhury")); // Farhan Hasin Chowdhury
	}

}
```

# IF/ELSE - Condition Statements

```
public class Main {
	public static void main(String[] args) {
		String lyric = "Roses are red, violets are blue";

		if (lyric.contains("blue")) {
			System.out.println("The lyric has the word blue in it.");
		} else if (lyric.contains("red")) {
			System.out.println("The lyric has the word red in it.");
		} else {
			System.out.println("The lyric doesn't have the word blue and red in it.");
		}
	}
}
```

# Arrays

```
public class Main {

	public static void main(String[] args) {
		// <type> <name>[] = new <type>[<length>]
		char vowels[] = new char[5];

	}
}
```

**Beispiel**

```
public class Main {

	public static void main(String[] args) {
		char vowels[] = new char[5];

		vowels[0] = 'a';
	}
}
```

**Fehlermeldungen**

```
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
	at arrays.Main.main(Main.java:18)
```

# List

```
import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        oddNumbers.add(1);
        oddNumbers.add(3);
        oddNumbers.add(5);
        oddNumbers.add(7);
        oddNumbers.add(9);

        System.out.println(oddNumbers.toString()); // [1, 3, 5, 7, 9]
    }
}
```

Weitere Fuktionen:

- get(i) - get by index
- set(i, v) - update
- add(v) - put new one
- addAll(vv) - put a new list to another list
- remove(i) - lösche ein Element mit dem Index
- removeAll(vv) - lösche alles
- clear() - leer die Liste
- size() - gebe die Anzahl der Elemente aus
- equals()
- isEmpty()
- contains(i)
- toString()

# INPUT/OUTPUT

Scanner

- scanner.nextLine();
- scanner.nextInt();
- scanner.nextDouble()

Print

- System.out.printf()
- System.out.println()

Beispiel

```
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("What's your name? ");
		String name = scanner.nextLine();

		System.out.printf("So %s. How old are you? ", name);
		int age = scanner.nextInt();

		System.out.printf("Cool! %d is a good age to start programming.", age);

		scanner.close();

	}

}
```

# Loops

- for

```
public class Main {

	public static void main(String[] args) {
		int number = 5;

		for (int multiplier = 1; multiplier <= 10; multiplier++) {
			System.out.println(String.format("%d x %d = %d", number, multiplier, number * multiplier));
		}
	}
}
```

- for-each

```
public class Main {

	public static void main(String[] args) {
		int fibonacciNumbers[] = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55};

		for(int number : fibonacciNumbers) {
			System.out.println(number);
		}
	}
}
```

- while

```
public class Main {

	public static void main(String[] args) {
		int number = 5;
		int multiplier = 1;

		while (multiplier <= 10) {
			System.out.println(String.format("%d x %d = %d", number, multiplier, number*multiplier));

			multiplier++;
		}
	}
}

```

# OOP

## Import

`import java.util.ArrayList;`

## Klassen

## Constructor

## Method

## Overloading

## Access Modfier

| PRIMITIVE TYPE | WRAPPER CLASS |
| --- | --- |
| Default | Accessible within the package |
| Public | Accessible everywhere |
| Private | Accessible within the class |
| Protected | Accessible within the class and subclasses |

## Getter and Setter

```
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class User {
    private String name;
    private LocalDate birthDay;
    private ArrayList<Book> borrowedBooks = new ArrayList<Book>();

    public String getName() {
        return this.name;
    }

    public String getBirthDay() {
        return this.birthDay.toString();
    }

    public String getBorrowedBooks() {
        return this.borrowedBooks.toString();
    }

    User (String name, String birthDay) {
        this.name = name;
        this.birthDay = LocalDate.parse(birthDay);
    }

    int age() {
        return Period.between(this.birthDay, LocalDate.now()).getYears();
    }

    void borrow(Book book) {
        borrowedBooks.add(book);
    }
}
```

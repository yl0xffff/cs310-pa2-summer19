# CS310 Programming Assignment 02 Summer 2019
## Tree Dictionary 

Many data (e.g, records of movies, songs, video games, etc) come with keywords so these data can be eaily found using keywords. 
You are tasked to implement a binary tree structure that allows querys composed of one or multiple keywords.
For example, you can find pokemons using their attacts as illustrated below.

```
Welcome to CS310 PA02: Tree Dictionary
Read 124 records from json/pokemon.json
Options:
	f: find records
	p: print the tree
	q: quit
> f
> Provide keywords (seprate by ,): thundershock, spark
> Found 2 records
> ... [Magnemite, (tackle, thundershock, spark)]
> ... [Magneton, (tackle, thundershock, spark, zap cannon)]
```

## Table of Contents
* [Introduction](#introduction-and-definitions)
* [Examples](#examples)
* [Tasks](#tasks)
* [Rules](#rules)
* [Submission Instructions](#submission-instructions)
* [Grading Rubric](#grading-rubric)

## Introduction and Definitions

The following code is provided to you. There are five java files: PA02.java, DynamicArray.java, LinkedList.java, Record.java, and TreeDictionary.java. 

Note, we use an external library called **json-simple-1.1.1.jar**. Therefore, to compile the code from command line, you need:
```
javac -cp .:json-simple-1.1.1.jar PA02.java
```

To run the code, you need:
```
java -cp .:json-simple-1.1.1.jar  PA02 -name name -keyword moves -max 10 json/pokemon.json
```

A script, called ["run"](./run), is provided to help you compile and run the examples. 

## Tasks

### Coding (95 points + 20 bonus points)

These are the only files you should modify to finish the code. You are recommended to finish them in the given order below.
- _DynamicArray.java_, 15 points 
- _LinkedList.java_, 20 points 
- _TreeDictionary.java_, 60 points and 20 bonus points

See the commends in these java files for detail. 

### Complete README.txt (5 points)
You should complete the provided README.txt and submit it with the rest of the code.

## Examples

- Coming soon

## Rules

### You must

1. Have a style (indentation, good variable names, etc.)
2. Comment your code well in JavaDoc style (no need to overdo it, just do it well)
3. Have code that compiles with the command: _javac -cp .:json-simple-1.1.1.jar *.java_ in your user directory

### You may 

1. Add private methods and private data

### You cannot 
1. Make your program part of a package.
2. Import any additional libraries/packages
3. Copy code from your text book _Data Structures and Problem Solving Using Java_, 4th Edition by _Mark A. Weiss_ or any other online or offine resources. 
4. Copy code from our in-class coding
4. Add public methods or public data
5. Change any given methods and data prototype

## Submission Instructions
- Use the cloud or some other server to backup your code!
- Remove all test files, jar files, class files, etc.
- You should just submit your java files and your readme.txt
- Zip your user folder (not just the files) and name the zip “username-p2.zip” (no other type of archive) where “username” is your username.
- Submit to blackboard.

## Grading Rubric
[back to top](#table-of-contents)

See rubrics under [Tasks](#tasks)

### No Credit
- Non submitted assignments
- Late assignments after 48 hours (**late tokens will be automatically applied**)
- Non compiling assignments
- Non-independent work
- "Hard coded" solutions
- Code that would win an obfuscated code competition with the rest of CS310 students.

### How will my assignment be graded?
- Grading will be divided into two portions:
  1. Manual/Automatic Testing (90%): To assess the correctness of programs.
  2. Manual Inspection (10% off the top points): [A checklist](#manual-code-inspection-rubric-10-off-the-top-points) of features your programs should exhibit. These comprise things that cannot be easily checked via unit tests such as good variable name selection, proper decomposition of a problem into multiple functions or cooperating objects, overall design elegance, and proper asymptotic complexity. These features will be checked by graders and assigned credit based on level of compliance. See the remainder of this document for more information.
- You CANNOT get points (even style/manual-inspection points) for code that doesn't compile or for submitting just the files given to you with the assignment. You CAN get manual inspection points for code that (a) compiles and (b) is an "honest attempt" at the assignment, but does not pass any unit tests.

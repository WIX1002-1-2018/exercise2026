# WIX1002 Sample code for 2026

[![Course](https://img.shields.io/badge/Course-WIX1002%20Fundamentals%20of%20Programming-2E2D87)](#wix1002-sample-code-for-2026)
[![Universiti Malaya](https://img.shields.io/badge/Universiti%20Malaya-Sem%201%202026%2F2027-B8902B)](https://fsktm.um.edu.my)
[![Java](https://img.shields.io/badge/Java-JDK%2025-ED8B00?logo=openjdk&logoColor=white)](https://jdk.java.net/25/)
[![VS Code](https://img.shields.io/badge/VS%20Code-ready-007ACC)](#how-to-run)
[![NetBeans](https://img.shields.io/badge/NetBeans-project-1B6AC6?logo=apachenetbeanside&logoColor=white)](#how-to-run)
[![Dev Container](https://img.shields.io/badge/Dev%20Container-included-2496ED?logo=docker&logoColor=white)](.devcontainer/devcontainer.json)
[![YouTube](https://img.shields.io/badge/YouTube-Programming%20Essentials-FF0000?logo=youtube&logoColor=white)](https://www.youtube.com/playlist?list=PLHpDJHOFvRCU)
[![Last commit](https://img.shields.io/github/last-commit/WIX1002-1-2018/exercise2026)](https://github.com/WIX1002-1-2018/exercise2026/commits/main)
[![Stars](https://img.shields.io/github/stars/WIX1002-1-2018/exercise2026?style=flat)](https://github.com/WIX1002-1-2018/exercise2026/stargazers)

This repository contains solutions and example exercises for WIX1002 (2026), Sem 1 2026/2027.

Contents
--------
- Exercise2026/: main project folder with Java exercises organized by week (W01..).

Summary of Week 01 (W01)
-------------------------
The `src/W01` folder contains introductory Java examples covering basic output and escape sequences:

- [`W01E01.java`](Exercise2026/src/W01/W01E01.java): Basic `println()` - printing simple text messages.
- [`W01E02.java`](Exercise2026/src/W01/W01E02.java): Printing numbers and performing basic arithmetic operations.
- [`W01E03.java`](Exercise2026/src/W01/W01E03.java): Combining text and numbers using string concatenation.
- [`W01E04.java`](Exercise2026/src/W01/W01E04.java): Using `\n` (newline) escape sequence for multi-line output.
- [`W01E05.java`](Exercise2026/src/W01/W01E05.java): Using `\t` (tab) escape sequence for formatted columns.
- [`W01E06.java`](Exercise2026/src/W01/W01E06.java): Combining `\n` and `\t` escape sequences for structured output.
- [`W01E07.java`](Exercise2026/src/W01/W01E07.java): Other escape sequences: `\"` (quotes), `\\` (backslash), and `\'` (single quote).
- [`W01E08.java`](Exercise2026/src/W01/W01E08.java): Creating formatted output with escape sequences (student information report).
- [`W01T01.java`](Exercise2026/src/W01/W01T01.java): A minimal "Hello World" program (prints "Hello World").

Week 01 videos (Programming Essentials)
---------------------------------------
Playlist: https://www.youtube.com/playlist?list=PLHpDJHOFvRCU

| Video | Topic or files used |
|---|---|
| [#1 Thinking Like a Programmer: From Problem to Java](https://youtu.be/NbYAiyNEEuA) | problem solving |
| [#2 Algorithmic Thinking: Clear Steps for People, Computers and AI Agents](https://youtu.be/hGMtItTWWUo) | algorithms |
| [#3 Computational Thinking: Plan Before You Code](https://youtu.be/hIhc1XcDxQg) | decomposition, patterns, abstraction |
| [#4 Git and GitHub for Beginners](https://youtu.be/tktRXtLFQUQ) | the course repo workflow |
| [#5 Pseudocode and Flowcharts](https://youtu.be/mHY8kjneLEk) | sequence, selection, repetition |
| [#6 How Java Runs: javac, Bytecode and the JVM](https://youtu.be/1Tci_WeNjtI) | compile and run |
| [#7 Your First Java Program in NetBeans, Line by Line](https://youtu.be/yo15exfEPHw) | a first program |
| [#8 Get the Course Code: Clone and Run a GitHub Repo in NetBeans](https://youtu.be/BfGDHFgktN0) | W01E01, W01E05, W01E08, W01T01 |
| [#9 Syntax, Logic and Run-time Errors: How to Debug in NetBeans](https://youtu.be/xgLIfXQ-S9I) | errors and debugging |
| [#10 Java in VS Code: Run, Debug, Claude Code and a Dev Container](https://youtu.be/8Hh2lBH_iV8) | W01E01, W01E03, W01E05 |
| [#11 Plan First, Then Prompt: Coding with AI the Right Way](https://youtu.be/mtg2qyUC4hw) | AI agents, plan first |

Summary of Week 02 (W02)
-------------------------
The `src/W02` folder contains the Java fundamentals examples (variables, types, operators, casting, Strings, Scanner input and printf output), in the same order as the Week 2 lecture and the Programming Essentials videos #12 to #14. Lines marked "Try it" are commented out on purpose: remove the `//` to see the compiler or run-time message, then put it back.

- [`W02E01.java`](Exercise2026/src/W02/W02E01.java): Variables: declare, assign and initialise one variable of each common type.
- [`W02E02.java`](Exercise2026/src/W02/W02E02.java): Assignment copies a value: changing x later does not change y.
- [`W02E03.java`](Exercise2026/src/W02/W02E03.java): Two compile errors to try: a wrong type, and a variable used before it has a value.
- [`W02E04.java`](Exercise2026/src/W02/W02E04.java): The ranges of the whole-number primitive types.
- [`W02E05.java`](Exercise2026/src/W02/W02E05.java): Java is case sensitive: total and Total are two different variables.
- [`W02E06.java`](Exercise2026/src/W02/W02E06.java): Constants with final: the value cannot be reassigned after it is set.
- [`W02E07.java`](Exercise2026/src/W02/W02E07.java): Arithmetic operators, integer division and the remainder operator %.
- [`W02E08.java`](Exercise2026/src/W02/W02E08.java): Operator precedence and parentheses.
- [`W02E09.java`](Exercise2026/src/W02/W02E09.java): Postfix x++ and prefix ++x.
- [`W02E10.java`](Exercise2026/src/W02/W02E10.java): Compound assignment (+=) converts the result back to the variable's type.
- [`W02E11.java`](Exercise2026/src/W02/W02E11.java): Casting: widening is automatic, narrowing needs (type) and cuts the decimals.
- [`W02E12.java`](Exercise2026/src/W02/W02E12.java): Convert before you divide; doubles store many decimals approximately.
- [`W02E13.java`](Exercise2026/src/W02/W02E13.java): Integer overflow: past the largest int, the value wraps around.
- [`W02E14.java`](Exercise2026/src/W02/W02E14.java): Useful Math methods (no import needed).
- [`W02E15.java`](Exercise2026/src/W02/W02E15.java): Strings: joining with + (left to right) and three String methods.
- [`W02E16.java`](Exercise2026/src/W02/W02E16.java): Scanner in four steps: import, create, prompt, read.
- [`W02E17.java`](Exercise2026/src/W02/W02E17.java): next() reads one word (token); nextLine() reads the rest of the line.
- [`W02E18.java`](Exercise2026/src/W02/W02E18.java): The nextLine trap: run it with 19 and a name. Why is the name empty? (Fixed in W02E19.)
- [`W02E19.java`](Exercise2026/src/W02/W02E19.java): The nextLine trap, fixed: discard the rest of the line after nextInt().
- [`W02E20.java`](Exercise2026/src/W02/W02E20.java): print, println and printf with the common format codes.
- [`W02E21.java`](Exercise2026/src/W02/W02E21.java): Escape characters: \n, \t, \" and \\.
- [`W02E22.java`](Exercise2026/src/W02/W02E22.java): Comment styles: //, /* */, /** */ (Javadoc) and /// (Markdown, JDK 23).
- [`W02E23.java`](Exercise2026/src/W02/W02E23.java): Random numbers: roll a die (1 to 6) and pick a number from 0 to 99.
- [`W02E24.java`](Exercise2026/src/W02/W02E24.java): Modern Java: var (Java 10) and underscores in numbers (Java 7).
- [`W02E25.java`](Exercise2026/src/W02/W02E25.java): Modern Java: a text block (Java 15) and newer String methods (Java 11 and 15).
- [`W02E26.java`](Exercise2026/src/W02/W02E26.java): JDK 25: IO.readln asks and reads a whole line (no Scanner, no nextLine trap).
- [`W02E27.java`](Exercise2026/src/W02/W02E27.java): Worked example: a BMI calculator from IPO to Java.
- [`W02E28.java`](Exercise2026/src/W02/W02E28.java): Find the bug: the average of 70, 85 and 90 should be about 81.67.
- [`W02E29.java`](Exercise2026/src/W02/W02E29.java): Improve this program: choose better names, better types and a constant.
- [`W02E30.java`](Exercise2026/src/W02/W02E30.java): Security: never hard-code a password like this. It is readable in the .class file.
- [`W02E31.java`](Exercise2026/src/W02/W02E31.java): Never trust input: try abc (crash) and 150 (out of range) as the mark.
- [`W02E32.java`](Exercise2026/src/W02/W02E32.java): JDK 25: an instance main method, void main(), with IO.readln and IO.println (no Scanner, no String[] args).
- [`W02E33.java`](Exercise2026/src/W02/W02E33.java): W02E28 fixed: divide by 3.0 so the division is done in double, not int.
- [`W02E34.java`](Exercise2026/src/W02/W02E34.java): W02E29 improved: clear names, types that fit the data, and a constant.

Week 02 videos (Programming Essentials)
---------------------------------------
Pull first (NetBeans: Team > Remote > Pull, or `git pull`), then open the file shown in the corner of the video. Playlist: https://www.youtube.com/playlist?list=PLHpDJHOFvRCU

| Video | Files used |
|---|---|
| [#12 Variables, Types and Constants](https://youtu.be/UP-LZhsr7ic) | W02E01, W02E02, W02E03, W02E05, W02E06, W02E24, W02E29 (AI agent: the task), W02E34 (the agent's fix), W02E30 (security) |
| [#13 Operators and Type Casting](https://youtu.be/vAugf_W1WbU) | W02E07 to W02E14, W02E28 (AI agent: the bug), W02E33 (the fix) |
| [#14 Input and Output](https://youtu.be/B8YtURZVWOE) | W02E15 to W02E21, W02E27, W02E31 (security), W02E32 (void main and IO.readln, JDK 25); W02E18 (AI agent: the bug), W02E19 (the fix) |

Self-study (in the lecture slides, not in a video): W02E04 (type ranges), W02E22 (comment styles), W02E23 (Random), W02E25 (text block and newer String methods), W02E26 (IO.readln inside psvm, JDK 25).

Summary of Week 03 (W03)
-------------------------
The `src/W03` folder contains the selection examples (Chapter 3, Flow of Control: Selection): relational and logical operators, short-circuit evaluation, if, if-else, else-if chains, nested if, comparing Strings and decimals, switch (classic and arrow), the conditional operator, input checks and a worked example, in the same order as the Week 3 lecture. W03E23 to W03E27 are the answers to each video's Try it task: try it yourself first. Lines marked "Try it" are commented out on purpose: remove the `//` to see the compiler or run-time message, then put it back. Files marked INTENTIONALLY FAULTY or MISLEADING are there to be found and fixed, not copied.

- [`W03E01.java`](Exercise2026/src/W03/W03E01.java): Relational operators compare two values and give a boolean: true or false.
- [`W03E02.java`](Exercise2026/src/W03/W03E02.java): Logical operators join conditions: && (and), || (or), ! (not).
- [`W03E03.java`](Exercise2026/src/W03/W03E03.java): && and || are evaluated left to right and stop early (short-circuit) once the answer is known.
- [`W03E04.java`](Exercise2026/src/W03/W03E04.java): && has higher precedence than ||: it groups first. Java still evaluates left to right.
- [`W03E05.java`](Exercise2026/src/W03/W03E05.java): if: the body runs only when the condition is true. Braces group the statements of the body.
- [`W03E06.java`](Exercise2026/src/W03/W03E06.java): if-else: choose one of two actions.
- [`W03E07.java`](Exercise2026/src/W03/W03E07.java): Multi-way if-else: else if adds more choices; the last else catches everything left.
- [`W03E08.java`](Exercise2026/src/W03/W03E08.java): Separate if statements are all tested; an else-if chain stops at the first true test.
- [`W03E09.java`](Exercise2026/src/W03/W03E09.java): Grade from a mark: the first true condition wins, so test from the highest grade down.
- [`W03E10.java`](Exercise2026/src/W03/W03E10.java): INTENTIONALLY MISLEADING: an else belongs to the nearest if that has no else, whatever the indentation says. Braces make the meaning clear.
- [`W03E11.java`](Exercise2026/src/W03/W03E11.java): Compare String contents with equals, not ==.
- [`W03E12.java`](Exercise2026/src/W03/W03E12.java): Read one character with charAt(0), then decide with if-else.
- [`W03E13.java`](Exercise2026/src/W03/W03E13.java): Computed decimals can carry rounding error, so 0.1 + 0.2 is not exactly 0.3.
- [`W03E14.java`](Exercise2026/src/W03/W03E14.java): switch picks a case by value; break stops it running into the next case.
- [`W03E15.java`](Exercise2026/src/W03/W03E15.java): Modern switch (Java 14+): case ... -> needs no break.
- [`W03E16.java`](Exercise2026/src/W03/W03E16.java): The conditional operator ?: picks one of two values: condition ? valueIfTrue : valueIfFalse
- [`W03E17.java`](Exercise2026/src/W03/W03E17.java): A random number in a range, then a decision. nextInt(1, 101) gives 1 to 100 (Java 17+).
- [`W03E18.java`](Exercise2026/src/W03/W03E18.java): INTENTIONALLY FAULTY: one logic bug that compiles, and one Try it line that does not compile.
- [`W03E19.java`](Exercise2026/src/W03/W03E19.java): Check input before using it. hasNextInt() looks at the next token only: is it a number that fits in an int?
- [`W03E20.java`](Exercise2026/src/W03/W03E20.java): Worked example: parcel postage by weight. Plan (IPO) first, then code, then test every boundary.
- [`W03E21.java`](Exercise2026/src/W03/W03E21.java): INTENTIONALLY FAULTY (for the AI agent check): a mark of 80 should be grade A, but this prints B. Predict first, then test every boundary: 39 and 40, 49 and 50, 59 and 60, 79 and 80.
- [`W03E22.java`](Exercise2026/src/W03/W03E22.java): W03E21 fixed: use >= so that each boundary mark (80, 60, 50, 40) gets the higher grade.
- [`W03E23.java`](Exercise2026/src/W03/W03E23.java): Try it answer for video #15 (try it yourself first): entry needs attendance of at least 80 AND the fee paid.
- [`W03E24.java`](Exercise2026/src/W03/W03E24.java): Try it answer for video #16 (try it yourself first): a battery message from a level of 0 to 100.
- [`W03E25.java`](Exercise2026/src/W03/W03E25.java): Try it answer for video #17 (try it yourself first): check a voucher code, ignoring upper and lower case.
- [`W03E26.java`](Exercise2026/src/W03/W03E26.java): Try it answer for video #18 (try it yourself first): a traffic light with a switch expression and a default.
- [`W03E27.java`](Exercise2026/src/W03/W03E27.java): Try it answer for video #19 (try it yourself first): bus fare by distance, with safe input.
- [`W03L01.java`](Exercise2026/src/W03/W03L01.java): Lab 2, question 1: Fahrenheit to Celsius, two decimal places. Answer by [Ethan (@ETHAN071104)](https://github.com/ETHAN071104), accepted from [PR #5](https://github.com/WIX1002-1-2018/exercise2026/pull/5).
- [`W03L02.java`](Exercise2026/src/W03/W03L02.java): Lab 2, question 2: monthly car loan payment, two decimal places. Answer by [Ethan (@ETHAN071104)](https://github.com/ETHAN071104), accepted from [PR #5](https://github.com/WIX1002-1-2018/exercise2026/pull/5).
- [`W03L03.java`](Exercise2026/src/W03/W03L03.java): Lab 2, question 3: three random numbers from 10 to 50, their sum and average (two decimal places). Answer by [Faiz (@faizmibadurrahman)](https://github.com/faizmibadurrahman), accepted from [PR #14](https://github.com/WIX1002-1-2018/exercise2026/pull/14).
- [`W03L04.java`](Exercise2026/src/W03/W03L04.java): Lab 2, question 4: seconds to hours, minutes and seconds (hh:mm:ss). Answer by [Azzam (@azzamaziz-2026)](https://github.com/azzamaziz-2026), accepted from [PR #11](https://github.com/WIX1002-1-2018/exercise2026/pull/11).
- [`W03L05.java`](Exercise2026/src/W03/W03L05.java): Lab 2, question 5: a random number from 0 to 10000 and the sum of its digits, with `/` and `%` only. Answer by [Mahjabin (@MarziaMahjabin)](https://github.com/MarziaMahjabin), accepted from [PR #18](https://github.com/WIX1002-1-2018/exercise2026/pull/18).
- [`W03L06.java`](Exercise2026/src/W03/W03L06.java): Lab 2, question 6: energy needed to heat water (grams and Fahrenheit, as in the lab sample). Answer by [Firhan (@Firharish21)](https://github.com/Firharish21), accepted from [PR #6](https://github.com/WIX1002-1-2018/exercise2026/pull/6).
- [`W03T06.java`](Exercise2026/src/W03/W03T06.java): Tutorial 2, question 6 (solved in the T2 tutorial, 20 Oct 2026): read the diameter, print the circumference with `Math.PI`, three decimal places.
- [`W03T07.java`](Exercise2026/src/W03/W03T07.java): Tutorial 2, question 7 (solved in the T2 tutorial, 20 Oct 2026): convert inches to meters (1 inch = 2.54 cm), two decimal places.

Week 03 videos (Programming Essentials)
---------------------------------------
Pull first (NetBeans: Team > Remote > Pull, or `git pull`), then open the file shown in the corner of the video. Playlist: https://www.youtube.com/playlist?list=PLHpDJHOFvRCU

| Video | Files used | Try it answer (try first) |
|---|---|---|
| [#15 Conditions: True or False](https://youtu.be/SPZsnZsslsM) | W03E01 to W03E04 | W03E23 |
| [#16 if, if-else and else-if](https://youtu.be/fhm8WwlMoU0) | W03E05 to W03E09 | W03E24 |
| [#17 Comparing Text, Characters and Decimals](https://youtu.be/nDpflpj00fM) | W03E10 to W03E13 | W03E25 |
| [#18 switch and the Conditional Operator](https://youtu.be/vdlpqWgrSEI) | W03E14 to W03E16 | W03E26 |
| [#19 Selection Mistakes, Safe Input and an AI Check](https://youtu.be/N1fly6WvgPw) | W03E18, W03E19, W03E20, W03E21 (AI agent: the bug), W03E22 (the fix) | W03E27 |

Self-study (in the lecture slides, not in a video): W03E17 (a random number in a range, then a decision).

Summary of Week 04 (W04)
-------------------------
The `src/W04` folder contains the repetition examples (Chapter 4, Flow of Control: Repetition, part 1): while, tracing a loop, counter- and condition-controlled loops, sentinel and yes/no loops, do-while, input validation in a loop, for, loop-variable scope, choosing a loop, off-by-one errors, a worked example and an AI agent check, in the same order as the Week 4 lecture. Nested loops, break and continue come in Week 5. From Week 4 the videos use VS Code (see How to run, Option 1b); NetBeans still opens the same files. Files marked INTENTIONALLY FAULTY are there to be found and fixed, not copied. Only W04E08 checks its input fully; the other files skip input checks to keep each example short.

- [`W04E01.java`](Exercise2026/src/W04/W04E01.java): while: repeat the body as long as the condition is true. Every loop has four parts: start, condition, body, update.
- [`W04E02.java`](Exercise2026/src/W04/W04E02.java): Trace a loop: write down every variable after every pass. Here the loop prints its own trace table.
- [`W04E03.java`](Exercise2026/src/W04/W04E03.java): Counter-controlled loop: the number of passes is known before the loop starts (here 10).
- [`W04E04.java`](Exercise2026/src/W04/W04E04.java): Condition-controlled loop: the number of passes is not known in advance.
- [`W04E05.java`](Exercise2026/src/W04/W04E05.java): Sentinel-controlled loop: a special value (0) marks the end of the input. Read before the loop, then again at the end of the body.
- [`W04E06.java`](Exercise2026/src/W04/W04E06.java): User-confirmation loop: repeat while the user answers y. Try with: 30 y 100 n
- [`W04E07.java`](Exercise2026/src/W04/W04E07.java): do-while: the body runs first, the condition is tested after it, so the body runs at least once.
- [`W04E08.java`](Exercise2026/src/W04/W04E08.java): Input validation with do-while: keep asking until the input is valid (W03E19 asked only once).
- [`W04E09.java`](Exercise2026/src/W04/W04E09.java): while tests first, do-while tests last. When the condition is false from the start, the while body runs 0 times but the do-while body still runs once.
- [`W04E10.java`](Exercise2026/src/W04/W04E10.java): for puts the start, the condition and the update in one line. A variable declared in the header exists only inside the loop (Try it line).
- [`W04E11.java`](Exercise2026/src/W04/W04E11.java): The update can be any step: up by 5, down by 2, or through the letters of the alphabet.
- [`W04E12.java`](Exercise2026/src/W04/W04E12.java): Loop over the characters of a String: index 0 to length() - 1, so the condition is i < length().
- [`W04E13.java`](Exercise2026/src/W04/W04E13.java): The same task with the three loops: print 3 6 9 12 15.
- [`W04E14.java`](Exercise2026/src/W04/W04E14.java): Guessing game: loop until the guess is right, with a hint after every wrong guess. A fixed seed (1002) makes the secret the same on every run.
- [`W04E15.java`](Exercise2026/src/W04/W04E15.java): Off-by-one: the loop runs one time too many or too few. Check the FIRST and the LAST pass.
- [`W04E16.java`](Exercise2026/src/W04/W04E16.java): INTENTIONALLY FAULTY: two loop bugs that compile and run (a semicolon after the for header; a total reset inside the loop). Predict, run, then fix.
- [`W04E17.java`](Exercise2026/src/W04/W04E17.java): Worked example: a bus card pays fares while the balance covers the fare. IPO, money in sen, tests planned first.
- [`W04E18.java`](Exercise2026/src/W04/W04E18.java): INTENTIONALLY FAULTY (for the AI agent check): the agent's do-while adds the sentinel -1 to the total and counts it as a day.
- [`W04E19.java`](Exercise2026/src/W04/W04E19.java): W04E18 fixed with the sentinel pattern: read before the loop, test, use, read again at the end.
- [`W04E20.java`](Exercise2026/src/W04/W04E20.java): Try it answer for video #20 (try it yourself first): a plant grows 3 cm a week; print its height each week until it is taller than 20 cm.
- [`W04E21.java`](Exercise2026/src/W04/W04E21.java): Try it answer for video #21 (try it yourself first): read words until the user types stop, then print how many words were typed.
- [`W04E22.java`](Exercise2026/src/W04/W04E22.java): Try it answer for video #22 (try it yourself first): with a for loop, print every fourth year from 2028 to 2048, then how many years were printed.
- [`W04E23.java`](Exercise2026/src/W04/W04E23.java): Try it answer for video #23 (try it yourself first): a countdown 5 4 3 2 1 Lift off!, checking the first and the last pass.
- [`W04L01.java`](Exercise2026/src/W04/W04L01.java): Lab 3, question 1: a simple calculator; two integers and an operator (+, -, *, /, %) read with `charAt(0)`. Answer by [@songwei07](https://github.com/songwei07), accepted from [PR #29](https://github.com/WIX1002-1-2018/exercise2026/pull/29).
- [`W04L02.java`](Exercise2026/src/W04/W04L02.java): Lab 3, question 2: a random integer from 0 to 5 shown in words (for example, 2 is two). Answer by [Wong Yik Sheng (@tms-tm)](https://github.com/tms-tm), accepted from [PR #23](https://github.com/WIX1002-1-2018/exercise2026/pull/23).
- [`W04L03.java`](Exercise2026/src/W04/W04L03.java): Lab 3, question 3: commission from the sales volume (5%, 7.5%, 10% or 12.5%), two decimal places. Answer by [Elin Lim Yok Ling (@26006095)](https://github.com/26006095), accepted from [PR #25](https://github.com/WIX1002-1-2018/exercise2026/pull/25).
- [`W04L04.java`](Exercise2026/src/W04/W04L04.java): Lab 3, question 4: a two-player dice game; each player rolls twice and the higher total wins (a tie is handled). Answer by [Tan Yong Sheng (@Ystan35)](https://github.com/Ystan35), accepted from [PR #26](https://github.com/WIX1002-1-2018/exercise2026/pull/26).
- [`W04L05.java`](Exercise2026/src/W04/W04L05.java): Lab 3, question 5: Cramer's rule for ax + by = e and cx + dy = f, with "The equation has no solution" when ad - bc is 0. Answer by [Mah Yun Xian (@yxPYmah)](https://github.com/yxPYmah), accepted from [PR #37](https://github.com/WIX1002-1-2018/exercise2026/pull/37).
- [`W04L06.java`](Exercise2026/src/W04/W04L06.java): Lab 3, question 6: is a point (x, y) inside, on or outside a circle centred at (0, 0)? Answer by [Mahjabin (@MarziaMahjabin)](https://github.com/MarziaMahjabin), accepted from [PR #36](https://github.com/WIX1002-1-2018/exercise2026/pull/36).

Week 04 videos (Programming Essentials)
---------------------------------------
Pull first (VS Code: Source Control > ... > Pull, or `git pull`), then open the file shown in the corner of the video. Links are added when the videos are published.

| Video | Files used | Try it answer (try first) |
|---|---|---|
| [#20 while Loops and Tracing](https://youtu.be/_uGscHGTRB0) | W04E01 to W04E04 | W04E20 |
| [#21 Stopping a Loop: Sentinel, Yes/No, do-while, Safe Input](https://youtu.be/G3jM-xdFwVw) | W04E05 to W04E09 | W04E21 |
| [#22 for Loops, Choosing a Loop, Guessing Game](https://youtu.be/7_gdlAP7SoE) | W04E10 to W04E14 | W04E22 |
| [#23 Loop Mistakes and an AI Check](https://youtu.be/ckwJhZjnCq0) | W04E15, W04E16, W04E18 (AI agent: the bug), W04E19 (the fix) | W04E23 |

Self-study (in the lecture slides, not in a video): W04E17 (bus card worked example).

Summary of Week 05 (W05)
-------------------------
The `src/W05` folder contains the repetition examples, part 2 (Chapter 4, Flow of Control: Repetition): nested loops, patterns, break and continue (with labels), a GCD case study, numeric errors in loops, a worked example, an AI agent check and a few modern Java features (W05E19 to W05E22), in the same order as the Week 5 lecture. The videos use VS Code (see How to run, Option 1b). W05E20 needs JDK 25; W05E22 needs JDK 23 or later. Files marked INTENTIONALLY FAULTY are there to be found and fixed, not copied.

- [`W05E01.java`](Exercise2026/src/W05/W05E01.java): Nested loops: the inner loop runs completely for every pass of the outer loop. 3 rows x 4 columns = 12 passes.
- [`W05E02.java`](Exercise2026/src/W05/W05E02.java): A table is a loop inside a loop: the 1 to 9 multiplication table with printf columns.
- [`W05E03.java`](Exercise2026/src/W05/W05E03.java): Pattern: a right triangle. Plan by rows: row i prints i stars.
- [`W05E04.java`](Exercise2026/src/W05/W05E04.java): Pattern: a number triangle (row i prints 1 to i), then the upside-down triangle.
- [`W05E05.java`](Exercise2026/src/W05/W05E05.java): Pattern: a pyramid. Row i prints (height - i) spaces, then (2i - 1) stars.
- [`W05E06.java`](Exercise2026/src/W05/W05E06.java): Trace a nested loop where the inner loop depends on the outer one (j <= i): predict the total passes (10) before running it.
- [`W05E07.java`](Exercise2026/src/W05/W05E07.java): break stops the loop at once: the first multiple of 13 above 100 (104), after checking only 4 numbers.
- [`W05E08.java`](Exercise2026/src/W05/W05E08.java): Loop and a half: while (true) with break in the middle of the body (compare W04E05, the sentinel pattern). Try with: 12.50 3.90 8.00 0
- [`W05E09.java`](Exercise2026/src/W05/W05E09.java): continue skips the rest of one pass: 1 to 20 without the multiples of 3.
- [`W05E10.java`](Exercise2026/src/W05/W05E10.java): break vs continue on the same loop, side by side.
- [`W05E11.java`](Exercise2026/src/W05/W05E11.java): In nested loops a plain break leaves only the inner loop; a labelled break (`break search;`) leaves both. The first pair a < b with a x b = 36.
- [`W05E12.java`](Exercise2026/src/W05/W05E12.java): A labelled continue goes to the next pass of the outer loop: a seat chart closes the rest of a row at a broken seat.
- [`W05E13.java`](Exercise2026/src/W05/W05E13.java): Case study: the GCD of 84 and 36, brute force (25 tries) vs Euclid's algorithm (2 steps).
- [`W05E14.java`](Exercise2026/src/W05/W05E14.java): Numeric error: for fixed decimal steps, control the loop with an int and compute the decimal from it. A double 0.1 step prints 0.30000000000000004 and never reaches 1.0.
- [`W05E15.java`](Exercise2026/src/W05/W05E15.java): Numeric error: adding 0.01 to 1.00 in two orders, with float and double, gives slightly different sums (exact: 50.5).
- [`W05E16.java`](Exercise2026/src/W05/W05E16.java): Worked example: a cinema seat chart (rows A to E, seats 1 to 8, an aisle, booked seats X by a rule). IPO and tests planned first.
- [`W05E17.java`](Exercise2026/src/W05/W05E17.java): INTENTIONALLY FAULTY (for the AI agent check): the agent's nested search uses a plain break, so later rows overwrite the answer and the wrong seat is reported.
- [`W05E18.java`](Exercise2026/src/W05/W05E18.java): W05E17 fixed with a labelled break: the search stops at the first match (row 3, seat 7).
- [`W05E19.java`](Exercise2026/src/W05/W05E19.java): Modern Java (Java 11): `String.repeat` builds the W05E05 pyramid with one loop.
- [`W05E20.java`](Exercise2026/src/W05/W05E20.java): Modern Java (JDK 25): `void main()`, `IO.readln` / `IO.println` and `var` in a loop and a half that reads commands until quit. Needs JDK 25.
- [`W05E21.java`](Exercise2026/src/W05/W05E21.java): Modern Java (Java 8, `takeWhile` Java 9): streams doing the work of loops: `filter` (similar to continue), `findFirst` (similar to break), `takeWhile` (temperatures until the first reading of 30 or more). Good to know; the labs use for and while.
- [`W05E22.java`](Exercise2026/src/W05/W05E22.java): Modern Java: the unnamed variable `_` (JDK 22), `Math.clamp` (JDK 21) and a `///` Markdown documentation comment (JDK 23).
- [`W05E23.java`](Exercise2026/src/W05/W05E23.java): Try it answer for video #24 (try it yourself first): a number staircase with 4 rows; row i prints the number i, i times.
- [`W05E24.java`](Exercise2026/src/W05/W05E24.java): Try it answer for video #25 (try it yourself first): count from 1 to 30, skip every multiple of 4, and stop as soon as the number is greater than 25.
- [`W05E25.java`](Exercise2026/src/W05/W05E25.java): Try it answer for video #26 (try it yourself first): Euclid's algorithm for the GCD of 252 and 105, counting the steps.
- [`W05E26.java`](Exercise2026/src/W05/W05E26.java): Try it answer for video #27 (try it yourself first): the seat chart with the rule (r * s) % 5 == 0; predict the free seats first.
- [`W05E27.java`](Exercise2026/src/W05/W05E27.java): Try it answer for video #28 (try it yourself first): a right-aligned triangle with one loop and String.repeat.

Week 05 videos (Programming Essentials)
---------------------------------------
Pull first (VS Code: Source Control > ... > Pull, or `git pull`), then open the file shown in the corner of the video. Links are added when the videos are published.

| Video | Files used | Try it answer (try first) |
|---|---|---|
| #24 Nested Loops and Patterns | W05E01 to W05E06 | W05E23 |
| #25 break, continue and Labels | W05E07 to W05E12 | W05E24 |
| #26 GCD and Numeric Errors in Loops | W05E13 to W05E15 | W05E25 |
| #27 A Seat Chart and an AI Check | W05E16, W05E17 (AI agent: the bug), W05E18 (the fix) | W05E26 |
| #28 Modern Java Loops | W05E19 to W05E22 | W05E27 |

Summary of Week 06 (W06)
-------------------------
The `src/W06` folder contains the array examples (Chapter 5, Arrays): declaring and creating arrays, processing them with loops, copying and comparing, searching, sorting, 2D and ragged arrays, a worked example and an AI agent check, in the same order as the Week 6 lecture. Methods come in Week 7, so every example uses `main` only. Files marked INTENTIONALLY FAULTY are there to be found and fixed, not copied.

- [`W06E01.java`](Exercise2026/src/W06/W06E01.java): Why arrays: seven step counts in seven variables vs one array and one loop.
- [`W06E02.java`](Exercise2026/src/W06/W06E02.java): Declare and create: `new` fills an array with default values (0, 0.0, false, null, character code 0).
- [`W06E03.java`](Exercise2026/src/W06/W06E03.java): Initialiser list, index from 0, `length`, the last element at `length - 1`, changing one element.
- [`W06E04.java`](Exercise2026/src/W06/W06E04.java): Out of bounds: check an index typed by the user before using it; the unchecked line (Try it) throws `ArrayIndexOutOfBoundsException`.
- [`W06E05.java`](Exercise2026/src/W06/W06E05.java): Fill an array from input (parcel weights), then print it with its indexes.
- [`W06E06.java`](Exercise2026/src/W06/W06E06.java): `for` vs enhanced `for`: the enhanced `for` variable is a copy, so it cannot change the array.
- [`W06E07.java`](Exercise2026/src/W06/W06E07.java): Total, average and the largest value with its index in one pass (monthly bills).
- [`W06E08.java`](Exercise2026/src/W06/W06E08.java): Counting with a condition: days hotter than 33.0 C, and which days.
- [`W06E09.java`](Exercise2026/src/W06/W06E09.java): An array as counters: 600 dice rolls tallied in `count[face]` (fixed seed).
- [`W06E10.java`](Exercise2026/src/W06/W06E10.java): Reference vs copy: `alias = a` vs a loop copy, `Arrays.copyOf` and `System.arraycopy`.
- [`W06E11.java`](Exercise2026/src/W06/W06E11.java): `==` vs `Arrays.equals`; printing an array directly vs `Arrays.toString`; `Arrays.fill`.
- [`W06E12.java`](Exercise2026/src/W06/W06E12.java): Moving elements in place: rotate a playlist left, reverse an array with two indexes.
- [`W06E13.java`](Exercise2026/src/W06/W06E13.java): Linear search with a `found` index and `break` (book codes).
- [`W06E14.java`](Exercise2026/src/W06/W06E14.java): Binary search on a sorted array, with a low, mid, high trace.
- [`W06E15.java`](Exercise2026/src/W06/W06E15.java): Selection sort, printed after every pass.
- [`W06E16.java`](Exercise2026/src/W06/W06E16.java): Bubble sort with an early stop when a pass makes no swap.
- [`W06E17.java`](Exercise2026/src/W06/W06E17.java): The library way: `Arrays.sort` and `Arrays.binarySearch` (negative when not found).
- [`W06E18.java`](Exercise2026/src/W06/W06E18.java): `String[] args` in `main`, and `split` returns an array.
- [`W06E19.java`](Exercise2026/src/W06/W06E19.java): 2D array: the W05E16 seat chart stored in `boolean[5][8]`; `booked.length` and `booked[r].length`.
- [`W06E20.java`](Exercise2026/src/W06/W06E20.java): Row and column totals of a table (rainfall for 3 towns over 4 weeks).
- [`W06E21.java`](Exercise2026/src/W06/W06E21.java): Ragged arrays: rows of different length (cafe orders per table).
- [`W06E22.java`](Exercise2026/src/W06/W06E22.java): Three array mistakes: a `null` array (Try it), an alias that is not a backup, and the wrong bound in a 2D loop.
- [`W06E23.java`](Exercise2026/src/W06/W06E23.java): Worked example: canteen orders, counts per item, best-seller and total sales; IPO, trace and tests in the comments.
- [`W06E24.java`](Exercise2026/src/W06/W06E24.java): INTENTIONALLY FAULTY (AI agent check): the largest freezer temperature, with `max` starting at 0.
- [`W06E25.java`](Exercise2026/src/W06/W06E25.java): Fix of W06E24: start `max` at the first element.
- [`W06E26.java`](Exercise2026/src/W06/W06E26.java): Try it answer for video #29 (try it yourself first): days in each month: February, the last month (length) and the number of months.
- [`W06E27.java`](Exercise2026/src/W06/W06E27.java): Try it answer for video #30 (try it yourself first): rainfall for 7 days: count the dry days and find the wettest day.
- [`W06E28.java`](Exercise2026/src/W06/W06E28.java): Try it answer for video #31 (try it yourself first): copy the prices with `Arrays.copyOf`, discount the copy, and show the original is unchanged.
- [`W06E29.java`](Exercise2026/src/W06/W06E29.java): Try it answer for video #32 (try it yourself first): one pass of selection sort: find the smallest and swap it into index 0.
- [`W06E30.java`](Exercise2026/src/W06/W06E30.java): Try it answer for video #33 (try it yourself first): a noughts and crosses board in a 2D `char` array: print it and count the X marks.
- [`W06E31.java`](Exercise2026/src/W06/W06E31.java): Try it answer for video #34 (try it yourself first): count the freezer readings colder than -19 C (expected 2, worked out by hand first).

Week 06 videos (Programming Essentials)
---------------------------------------
Pull first (VS Code: Source Control > ... > Pull, or `git pull`), then open the file shown in the corner of the video. Links are added when the videos are published.

| Video | Files used | Try it answer (try first) |
|---|---|---|
| #29 Arrays: Declare, Create and Index | W06E01 to W06E05, W06E18 | W06E26 |
| #30 Processing Arrays: Totals, Largest and Counting | W06E06 to W06E09 | W06E27 |
| #31 Copying and Comparing Arrays | W06E10 to W06E12 | W06E28 |
| #32 Searching and Sorting Arrays | W06E13 to W06E17 | W06E29 |
| #33 2D Arrays: Grids, Totals and Ragged Rows | W06E19 to W06E21 | W06E30 |
| #34 Array Mistakes and an AI Check | W06E22, W06E24 (AI agent: the bug), W06E25 (the fix) | W06E31 |

Summary of Week 07 (W07)
-------------------------
The `src/W07` folder contains the Java methods examples (Chapter 6, Java Methods), with arrays and methods, recursion and a few modern Java features (W07E24, W07E25), in the same order as the Week 7 lecture. Files marked INTENTIONALLY FAULTY are there to be found and fixed, not copied.

- [`W07E01.java`](Exercise2026/src/W07/W07E01.java): Why methods: the same receipt header copied three times.
- [`W07E02.java`](Exercise2026/src/W07/W07E02.java): Define a method once and call it many times: `printHeader()`.
- [`W07E03.java`](Exercise2026/src/W07/W07E03.java): Parameters: `printRow(item, qty, price)`; arguments must match in number, order and type (Try it: wrong order).
- [`W07E04.java`](Exercise2026/src/W07/W07E04.java): Return values: the Week 2 BMI as `bmi(kg, m)`.
- [`W07E05.java`](Exercise2026/src/W07/W07E05.java): The call stack: main calls checkIn, checkIn calls printBadge (enter and leave lines).
- [`W07E06.java`](Exercise2026/src/W07/W07E06.java): Pass-by-value: changing a parameter changes only the method's copy.
- [`W07E07.java`](Exercise2026/src/W07/W07E07.java): Scope: local variables with the same name in two methods; a loop variable used after the loop (Try it).
- [`W07E08.java`](Exercise2026/src/W07/W07E08.java): A boolean method with early return: `isValidMark(mark)`.
- [`W07E09.java`](Exercise2026/src/W07/W07E09.java): Method abstraction: a coffee order built from small methods.
- [`W07E10.java`](Exercise2026/src/W07/W07E10.java): Overloading: `shippingCost(kg)` and `shippingCost(kg, express)`.
- [`W07E11.java`](Exercise2026/src/W07/W07E11.java): A documentation comment with precondition, postcondition, @param and @return.
- [`W07E12.java`](Exercise2026/src/W07/W07E12.java): Library methods (Math, Integer.parseInt) and a method from another class (`W07E04.bmi`).
- [`W07E13.java`](Exercise2026/src/W07/W07E13.java): An array as a parameter: `total` and `average`.
- [`W07E14.java`](Exercise2026/src/W07/W07E14.java): A method can change the caller's array elements, but giving the parameter a new array does not affect the caller.
- [`W07E15.java`](Exercise2026/src/W07/W07E15.java): Returning a new array: `copyAndScale`.
- [`W07E16.java`](Exercise2026/src/W07/W07E16.java): Linear search as a method that returns the index or -1.
- [`W07E17.java`](Exercise2026/src/W07/W07E17.java): A 2D array as a parameter: `rowTotals` of the rainfall table.
- [`W07E18.java`](Exercise2026/src/W07/W07E18.java): Variable-length arguments: `sum(int... nums)`.
- [`W07E19.java`](Exercise2026/src/W07/W07E19.java): Three method mistakes the compiler catches (Try it lines).
- [`W07E20.java`](Exercise2026/src/W07/W07E20.java): Recursion: `countdown(n)` with a base case.
- [`W07E21.java`](Exercise2026/src/W07/W07E21.java): A recursive method that returns a value: `power(base, exp)` with a call trace.
- [`W07E22.java`](Exercise2026/src/W07/W07E22.java): Recursion on arrays: a recursive sum and a recursive binary search.
- [`W07E23.java`](Exercise2026/src/W07/W07E23.java): Recursion or a loop; no base case gives StackOverflowError (Try it).
- [`W07E24.java`](Exercise2026/src/W07/W07E24.java): Good to know: a method that returns a switch expression (Java 14) and `///` Markdown documentation comments (JDK 23).
- [`W07E25.java`](Exercise2026/src/W07/W07E25.java): Good to know: methods as values, a method reference and a lambda (Java 8).
- [`W07E26.java`](Exercise2026/src/W07/W07E26.java): Worked example: a weekly pay slip with overtime; IPO and tests in the comments.
- [`W07E27.java`](Exercise2026/src/W07/W07E27.java): INTENTIONALLY FAULTY (AI agent check): a `swap(int a, int b)` method that changes nothing.
- [`W07E28.java`](Exercise2026/src/W07/W07E28.java): Fix of W07E27: swap two elements of an array.
- [`W07E29.java`](Exercise2026/src/W07/W07E29.java): Try it answer for video #35 (try it yourself first): a method `tip(bill, percent)` that returns the tip, for a RM48.00 bill at 10% and 15%.
- [`W07E30.java`](Exercise2026/src/W07/W07E30.java): Try it answer for video #36 (try it yourself first): predict, then run: a parameter `n` and an array parameter `a` changed inside a method.
- [`W07E31.java`](Exercise2026/src/W07/W07E31.java): Try it answer for video #37 (try it yourself first): two overloaded methods called `label`: `label(3)` gives "3 items"; `label(3, "kg")` gives "3 kg".
- [`W07E32.java`](Exercise2026/src/W07/W07E32.java): Try it answer for video #38 (try it yourself first): `countAbove(a, limit)` returns how many bus delays are above 10 minutes (expected 2).
- [`W07E33.java`](Exercise2026/src/W07/W07E33.java): Try it answer for video #39 (try it yourself first): the largest element found with recursion, `maxFrom(a, i)`; the base case is the last element.
- [`W07E34.java`](Exercise2026/src/W07/W07E34.java): Try it answer for video #40 (try it yourself first): a method that returns a switch expression: `dayType(1)` to `dayType(5)` give "weekday"; 6 and 7 give "weekend".

Week 07 videos (Programming Essentials)
---------------------------------------
Pull first (VS Code: Source Control > ... > Pull, or `git pull`), then open the file shown in the corner of the video. Links are added when the videos are published. W07E26 (worked example: pay slip) is for self-study.

| Video | Files used | Try it answer (try first) |
|---|---|---|
| #35 Defining and Calling Methods | W07E01 to W07E04 | W07E29 |
| #36 How Method Calls Work: Stack, Pass-by-Value and Scope | W07E05 to W07E08, W07E19 | W07E30 |
| #37 Designing with Methods: Abstraction, Overloading and Documentation | W07E09 to W07E12 | W07E31 |
| #38 Methods and Arrays | W07E13 to W07E18 | W07E32 |
| #39 Recursion | W07E20 to W07E23 | W07E33 |
| #40 Modern Java Methods and an AI Check | W07E24, W07E25, W07E27 (AI agent: the bug), W07E28 (the fix) | W07E34 |

Summary of Week 09 (W09)
-------------------------
The `src/W09` folder contains the file input and output examples (Chapter 7, File Input and Output): text files, CSV data, buffered I/O, binary files, the `File` class and a modern `java.nio.file` example, in the same order as the Week 9 lecture. Each program makes its own sample data, so any file runs on its own. The data files are created in the working folder (NetBeans: `Exercise2026/`; VS Code: the repository folder) and are ignored by Git.

- [`W09E01.java`](Exercise2026/src/W09/W09E01.java): Why files: a value in a variable is lost when the program ends; save it to `steps.txt` with `PrintWriter`.
- [`W09E02.java`](Exercise2026/src/W09/W09E02.java): Write a text file: `PrintWriter` + `FileOutputStream`, with `println` and `printf` (attendance list).
- [`W09E03.java`](Exercise2026/src/W09/W09E03.java): Where did the file go? The working folder (NetBeans: the project folder; VS Code: the opened folder), `getAbsolutePath()`, and `/` or `\\` in paths.
- [`W09E04.java`](Exercise2026/src/W09/W09E04.java): Overwrite or append: `new FileOutputStream(name, true)` adds to the end. Run it two or three times.
- [`W09E05.java`](Exercise2026/src/W09/W09E05.java): Forgetting `close()`: the file stays empty (0 bytes) until it is closed. Try it: remove `close()`.
- [`W09E06.java`](Exercise2026/src/W09/W09E06.java): Read a text file line by line: `Scanner` on a `File`, `hasNextLine()`, `nextLine()`.
- [`W09E07.java`](Exercise2026/src/W09/W09E07.java): Read numbers from a file with `hasNextInt()` and `nextInt()` (a week of step counts).
- [`W09E08.java`](Exercise2026/src/W09/W09E08.java): Read simple comma-separated records (a CSV file without quotes): skip the header, `split(",")`, `Integer.parseInt`, `Double.parseDouble` (a daily steps and km log).
- [`W09E09.java`](Exercise2026/src/W09/W09E09.java): Never trust the data in a file: each record is checked with a small `Scanner` (`hasNextInt`, `hasNextDouble`, sensible ranges) and bad lines are skipped instead of crashing.
- [`W09E10.java`](Exercise2026/src/W09/W09E10.java): `BufferedReader` with `FileReader`: `readLine()` returns `null` at the end of the file.
- [`W09E11.java`](Exercise2026/src/W09/W09E11.java): `BufferedWriter` with `FileWriter`: `write()` and `newLine()`.
- [`W09E12.java`](Exercise2026/src/W09/W09E12.java): Closing safely: try-with-resources (Java 7) and the older `try`/`finally`.
- [`W09E13.java`](Exercise2026/src/W09/W09E13.java): Methods for files: `saveScores(file, int[])` and `loadScores(file)` (arrays + methods + files).
- [`W09E14.java`](Exercise2026/src/W09/W09E14.java): Write a binary file with `ObjectOutputStream`: `writeUTF`, `writeInt`, `writeDouble`. The file does not label the values, so the reader must know the types and the order; the byte count is explained.
- [`W09E15.java`](Exercise2026/src/W09/W09E15.java): Read a binary file in the same order and with the same types. Try it: read in the wrong order.
- [`W09E16.java`](Exercise2026/src/W09/W09E16.java): Read binary records until the end: `EOFException` stops the loop.
- [`W09E17.java`](Exercise2026/src/W09/W09E17.java): Text or binary? The same 1000 numbers saved both ways and the file sizes compared.
- [`W09E18.java`](Exercise2026/src/W09/W09E18.java): Optional preview (objects come in Week 10): save a whole array with `writeObject` and read it back with `readObject` and a cast.
- [`W09E19.java`](Exercise2026/src/W09/W09E19.java): The `File` class: `createNewFile`, `getName`, `getPath`, `exists`, `isFile`, `isDirectory`, `length`, `canRead`, `canWrite`, `lastModified`.
- [`W09E20.java`](Exercise2026/src/W09/W09E20.java): Folders: `mkdirs()`, `listFiles()` (checked for `null`), `isDirectory()`.
- [`W09E21.java`](Exercise2026/src/W09/W09E21.java): Rename and delete two demo files in its own `w09_demo` folder (it stops if either is already there): `renameTo()` and `delete()` return true or false; the program checks the result before going on.
- [`W09E22.java`](Exercise2026/src/W09/W09E22.java): Common mistakes: `new Scanner("marks.txt")` reads the text, not the file; a missing file (check `exists()` first). Try it: open a missing file.
- [`W09E23.java`](Exercise2026/src/W09/W09E23.java): Modern Java (good to know): `Path.of`, `Files.writeString`, `Files.readString`, `Files.readAllLines`, `Files.size` (Java 7 and 11), with a text block.
- [`W09E24.java`](Exercise2026/src/W09/W09E24.java): Worked example: an expense tracker that appends to `expenses.csv` (always with a dot as the decimal point) and shows all expenses and the total; the typed amount and every saved amount are checked (damaged lines are skipped); IPO in the comments.
- [`W09E25.java`](Exercise2026/src/W09/W09E25.java): INTENTIONALLY FAULTY (AI agent check): saves three names and reads them back, but reads 0 names.
- [`W09E26.java`](Exercise2026/src/W09/W09E26.java): Fix of W09E25: close the writer (try-with-resources) before reading the file.
- [`W09E27.java`](Exercise2026/src/W09/W09E27.java): Try it answer for video #41 (try it yourself first): write three to-do items to `todo.txt`, then open it again in append mode and add a fourth; `checkError()` after each close.
- [`W09E28.java`](Exercise2026/src/W09/W09E28.java): Try it answer for video #42 (try it yourself first): count how many passed (50 or more) and failed in `quiz_marks.csv` (name,mark), skipping a line whose mark is not a whole number from 0 to 100; a sample file is made only if none is there.
- [`W09E29.java`](Exercise2026/src/W09/W09E29.java): Try it answer for video #43 (try it yourself first): methods `saveLines(file, String[])` with BufferedWriter and `lastLine(file)` with BufferedReader (null for an empty file), both with try-with-resources.
- [`W09E30.java`](Exercise2026/src/W09/W09E30.java): Try it answer for video #44 (try it yourself first): save three cities and temperatures in a binary file, read them back until the end of the file, and print the cities above 30.0 degrees and how many.
- [`W09E31.java`](Exercise2026/src/W09/W09E31.java): Try it answer for video #45 (try it yourself first): make a folder, write `notes.txt`, print its size and rename it, checking every result (mkdirs, checkError, renameTo).

Week 09 videos (Programming Essentials)
---------------------------------------
Planned for Sat 5 Dec 2026. Links are added when the videos are published.

| Video | Files used | Try it answer (try first) |
|---|---|---|
| #41 Why Files? Writing Your First Text File | W09E01 to W09E05 | W09E27 |
| #42 Reading Text Files: Lines, Numbers and CSV | W09E06 to W09E09 | W09E28 |
| #43 Buffered I/O, try-with-resources and File Methods | W09E10 to W09E13 | W09E29 |
| #44 Binary Files: Saving and Loading Data | W09E14 to W09E18 | W09E30 |
| #45 The File Class, Modern Files API and an AI Check | W09E19 to W09E23, W09E25 (AI agent: the bug), W09E26 (the fix) | W09E31 |


Summary of Week 10 (W10)
-------------------------
The `src/W10` folder contains the class examples (Chapter 8, Class), in the same order as the Week 10 lecture. One running example, a parcel delivery app, grows step by step. Each helper class sits in the same file as its example (no `public`, named with the file number, e.g. `ParcelE02`), so every file runs on its own; `W10Parcel.java` with `W10E10` shows the usual layout of one public class per file.

- [`W10E01.java`](Exercise2026/src/W10/W10E01.java): Why classes: three parcels in parallel arrays; swapping only one array mixes up the data.
- [`W10E02.java`](Exercise2026/src/W10/W10E02.java): A first class: fields, `new`, the dot; two objects keep separate values.
- [`W10E03.java`](Exercise2026/src/W10/W10E03.java): Methods in a class: `fee()` and `describe()` use the object's own fields.
- [`W10E04.java`](Exercise2026/src/W10/W10E04.java): References: `b = a` gives two names for one object; `==` compares references; `null`.
- [`W10E05.java`](Exercise2026/src/W10/W10E05.java): Constructors: default values (0, false, null), a constructor with parameters, `this.weightKg = weightKg`.
- [`W10E06.java`](Exercise2026/src/W10/W10E06.java): Constructor overloading, `this(...)`, and a copy constructor (a copy vs an alias).
- [`W10E07.java`](Exercise2026/src/W10/W10E07.java): Why `private`: a public field accepts -5 kg; a setter that checks the value.
- [`W10E08.java`](Exercise2026/src/W10/W10E08.java): Getters and setters: `getX`, `setX`, `isX`, a read-only `final` tracking number, `markDelivered()`.
- [`W10E09.java`](Exercise2026/src/W10/W10E09.java): `toString` and `equals`: readable printing; `==` vs `equals` (same tracking number).
- [`W10Parcel.java`](Exercise2026/src/W10/W10Parcel.java) and [`W10E10.java`](Exercise2026/src/W10/W10E10.java): Two files, one package: one public class per file, `package W10;`, `import` from another package.
- [`W10E11.java`](Exercise2026/src/W10/W10E11.java): `static`: one shared counter gives each new parcel the next tracking number.
- [`W10E12.java`](Exercise2026/src/W10/W10E12.java): `static final` constants and static methods (no object needed, like `Math.max`).
- [`W10E13.java`](Exercise2026/src/W10/W10E13.java): Method overloading: `fee(double)`, `fee(double, boolean)`, `fee(int grams)`; why `fee(1)` means 1 gram.
- [`W10E14.java`](Exercise2026/src/W10/W10E14.java): An array of objects: every slot starts as `null`; total, heaviest, not delivered.
- [`W10E15.java`](Exercise2026/src/W10/W10E15.java): Objects and methods: a method can change the object it receives, but not the caller's variable.
- [`W10E16.java`](Exercise2026/src/W10/W10E16.java): Objects inside objects: a delivery route holds an array of parcels.
- [`W10E17.java`](Exercise2026/src/W10/W10E17.java): Objects and files: save parcels as CSV lines and build new objects from them (`route.csv`).
- [`W10E18.java`](Exercise2026/src/W10/W10E18.java): Wrapper classes: `Integer.MAX_VALUE`, `parseInt`, autoboxing, `==` vs `equals` on `Integer` (127 and 128).
- [`W10E19.java`](Exercise2026/src/W10/W10E19.java): `Character` methods: check a tracking code (two capital letters, five digits).
- [`W10E20.java`](Exercise2026/src/W10/W10E20.java): Modern Java (good to know): a `record` (Java 16) with a compact constructor.
- [`W10E21.java`](Exercise2026/src/W10/W10E21.java): Three common mistakes (Try it): `null` before `new`, an instance field in `static main`, `==` on objects.
- [`W10E22.java`](Exercise2026/src/W10/W10E22.java): Worked example (self-study): a club membership list with a static id, an array of members and a file.
- [`W10E23.java`](Exercise2026/src/W10/W10E23.java): AI agent check, intentionally faulty: a constructor that assigns each parameter to itself (study it, do not copy it).
- [`W10E24.java`](Exercise2026/src/W10/W10E24.java): The fix with `this`, and a test line.
- `W10E25.java` to `W10E30.java`: Try it answers for videos #46 to #51 (try each task yourself first).

Week 10 videos (Programming Essentials)
---------------------------------------
Planned for Sat 12 Dec 2026. Links are added when the videos are published.

| Video | Files used | Try it answer (try first) |
|---|---|---|
| #46 Classes and Objects | W10E01 to W10E04 | W10E25 |
| #47 Constructors and this | W10E05, W10E06, W10Parcel and W10E10 | W10E26 |
| #48 Encapsulation: private, Getters, Setters, toString and equals | W10E07 to W10E09 | W10E27 |
| #49 static and Method Overloading | W10E11 to W10E13 | W10E28 |
| #50 Objects Working Together: Arrays, Methods and Files | W10E14 to W10E17 | W10E29 |
| #51 Wrapper Classes, Records and an AI Check | W10E18 to W10E20, W10E23 (AI agent: the bug), W10E24 (the fix) | W10E30 |

Summary of Week 11 (W11)
-------------------------
The `src/W11` folder contains the inheritance examples (Chapter 9, Inheritance), in the same order as the Week 11 videos. The Week 10 parcel app continues: `Parcel` → `ExpressParcel`, `FragileParcel`, `SameDayParcel`. Helper classes sit in the same file as their example, so every file runs on its own; `W11Parcel.java` (public, own file) and the package `W11.depot` show `protected` across packages. Each "Try it" is a small edit that should NOT compile: make it, read the compiler message, then undo it.

- [`W11E01.java`](Exercise2026/src/W11/W11E01.java): Why inheritance: a copy-pasted express class misses a fee change (RM 15.40 instead of RM 16.40).
- [`W11E02.java`](Exercise2026/src/W11/W11E02.java): `extends`: the subclass inherits the methods (not the private fields) and adds one field; the UML arrow.
- [`W11E03.java`](Exercise2026/src/W11/W11E03.java): Private fields stay private: the subclass reads the weight through a getter (Try it: use the field).
- [`W11E04.java`](Exercise2026/src/W11/W11E04.java): Constructor chaining: `super(...)` first; three levels print from the top class down.
- [`W11E05.java`](Exercise2026/src/W11/W11E05.java): Every chain must reach a superclass constructor: `super(...)` directly or through `this(...)`.
- [`W11E06.java`](Exercise2026/src/W11/W11E06.java): Overriding `fee()` with `super.fee()` plus a surcharge (express) or insurance (fragile).
- [`W11E07.java`](Exercise2026/src/W11/W11E07.java): `@Override`: a misspelled `fees()` compiles silently without it (Try it: add `@Override`).
- [`W11E08.java`](Exercise2026/src/W11/W11E08.java): Overriding vs overloading: `fee()` and `fee(boolean insured)`.
- [`W11E09.java`](Exercise2026/src/W11/W11E09.java): Override rules: covariant return (`self()`), no weaker access, a private method is not overridden.
- [`W11E10.java`](Exercise2026/src/W11/W11E10.java): The `Object` class: `getClass()` vs `instanceof`, and `null instanceof`.
- [`W11E11.java`](Exercise2026/src/W11/W11E11.java): `toString` overridden in the parent and extended with `super.toString()` in the child.
- [`W11E12.java`](Exercise2026/src/W11/W11E12.java): The standard `equals(Object)` and `hashCode()`: equal tracking numbers mean equal parcels.
- [`W11Parcel.java`](Exercise2026/src/W11/W11Parcel.java) and [`W11E13.java`](Exercise2026/src/W11/W11E13.java): package access and `protected` inside the package `W11`.
- [`depot/W11E14.java`](Exercise2026/src/W11/depot/W11E14.java): another package (`W11.depot`): a subclass uses the protected field through `this` (Try it: three edits that do not compile).
- [`W11E15.java`](Exercise2026/src/W11/W11E15.java): `final` field, `final` method and `final` class (`String` is final).
- [`W11E16.java`](Exercise2026/src/W11/W11E16.java): Modern Java (good to know): a `sealed` class (Java 17) with `permits`, `final` and `non-sealed` subclasses.
- [`W11E17.java`](Exercise2026/src/W11/W11E17.java): AI agent check, intentionally faulty: `tostring()` without `@Override` (study it, do not copy it).
- [`W11E18.java`](Exercise2026/src/W11/W11E18.java): The fix: `@Override public String toString()`.
- [`W11E19.java`](Exercise2026/src/W11/W11E19.java): Guided exercise: is-a (`extends`) or has-a (a field).
- [`W11E20.java`](Exercise2026/src/W11/W11E20.java): Guided exercise: a field declared again in the subclass hides the parent's field (prints 0.0).
- `W11E25.java` to `W11E28.java`, `depot/W11E29.java`, `W11E30.java`: Try it answers for videos #52 to #57 (try each task yourself first; write your own version in your own project, since these class names are already in the repo).

Week 11 videos (Programming Essentials)
---------------------------------------
Planned for Sat 19 Dec 2026. Links are added when the videos are published.

| Video | Files used | Try it answer (try first) |
|---|---|---|
| #52 Inheritance: Why extends | W11E01 to W11E03 | W11E25 |
| #53 Constructors and super | W11E04, W11E05 | W11E26 |
| #54 Overriding and @Override | W11E06 to W11E09 | W11E27 |
| #55 The Object Class: getClass, toString and equals | W11E10 to W11E12 | W11E28 |
| #56 protected and Packages | W11Parcel, W11E13, depot/W11E14 | depot/W11E29 |
| #57 final, sealed and an AI Check | W11E15 to W11E18 | W11E30 |

Summary of Week 12 (W12)
-------------------------
The `src/W12` folder contains the polymorphism examples (Chapter 10, Polymorphism), in the same order as the Week 12 lecture. The parcel app continues: one variable or one list holds every kind of parcel, and each object runs its own version of a method. Helper classes sit in the same file as their example, so every file runs on its own. Each "Try it" is a small edit: make it, read the compiler message (or the run-time error), then undo it.

- [`W12E01.java`](Exercise2026/src/W12/W12E01.java): One `ParcelE01` variable, two kinds of parcel: `fee()` follows the object.
- [`W12E02.java`](Exercise2026/src/W12/W12E02.java): A polymorphic route: one array, four kinds of parcel, one loop, the total.
- [`W12E03.java`](Exercise2026/src/W12/W12E03.java): The declared type decides what may be called (Try it: an express-only method through a parcel variable).
- [`W12E04.java`](Exercise2026/src/W12/W12E04.java): Special cases: a private method is not overridden, a static method is hidden, a final method stops overriding.
- [`W12E05.java`](Exercise2026/src/W12/W12E05.java): Downcasting with a cast (Try it: a wrong cast gives `ClassCastException`; no cast gives a compiler error).
- [`W12E06.java`](Exercise2026/src/W12/W12E06.java): `instanceof` and the pattern form `p instanceof ExpressParcelE06 e` (Java 16).
- [`W12E07.java`](Exercise2026/src/W12/W12E07.java): An abstract class with an abstract `fee()`; three concrete delivery items (Try it: `new` on the abstract class).
- [`W12E08.java`](Exercise2026/src/W12/W12E08.java): Abstract class rules: a constructor and a normal method next to the abstract one (Try it: forget `fee()`).
- [`W12E09.java`](Exercise2026/src/W12/W12E09.java): An interface: a parcel and a tracking kiosk in one `TrackableE09[]`.
- [`W12E10.java`](Exercise2026/src/W12/W12E10.java): One class, two interfaces, and an interface constant.
- [`W12E11.java`](Exercise2026/src/W12/W12E11.java): Interface rules: a `default` method; the implementation must be `public` (Try it).
- [`W12E12.java`](Exercise2026/src/W12/W12E12.java): `Comparable<ParcelE12>`: natural order by tracking number, consistent with `equals`; `Arrays.sort`.
- [`W12E13.java`](Exercise2026/src/W12/W12E13.java): `ArrayList<ParcelE13>`: `add`, `get`, `size`, for-each, `sort(null)`, `set`, `remove`.
- [`W12E14.java`](Exercise2026/src/W12/W12E14.java): Copying: two names for one object vs a copy constructor; `clone()` built on it.
- [`W12E15.java`](Exercise2026/src/W12/W12E15.java): A member inner class: each `Stop` belongs to one route.
- [`W12E16.java`](Exercise2026/src/W12/W12E16.java): A static nested class and a local class.
- [`W12E17.java`](Exercise2026/src/W12/W12E17.java): A `Comparator` by fee: first an anonymous class, then a lambda.
- [`W12E18.java`](Exercise2026/src/W12/W12E18.java): Modern Java (good to know): `switch` with type patterns over a sealed family (Java 21).
- [`W12E19.java`](Exercise2026/src/W12/W12E19.java): AI agent check, intentionally faulty: an unchecked cast stops with `ClassCastException` (study it, do not copy it).
- [`W12E20.java`](Exercise2026/src/W12/W12E20.java): The fix: an overridden `promise()`, no cast.
- [`W12E21.java`](Exercise2026/src/W12/W12E21.java): Guided exercise: abstract class or interface?
- [`W12E22.java`](Exercise2026/src/W12/W12E22.java): Guided exercise: never compare by subtraction; use `Double.compare`.

Week 12 videos (Programming Essentials)
---------------------------------------
Planned for Sat 26 Dec 2026. Links are added when the videos are published.

| Video | Files used |
|---|---|
| #58 Polymorphism: One Variable, Many Objects | W12E01 to W12E03 |
| #59 Casting, instanceof and an AI Check | W12E05, W12E06, W12E19, W12E20 |
| #60 Abstract Classes | W12E07, W12E08 |
| #61 Interfaces | W12E09 to W12E11 |
| #62 Comparable and ArrayList | W12E12, W12E13 |
| #63 Nested Classes and Lambdas | W12E15 to W12E17 |

How to run
----------

### Option 1: Using Dev Container in VS Code (Recommended)
This repository includes a `.devcontainer` configuration for the best development experience with VS Code:

1. **Prerequisites:**
   - Install [Visual Studio Code](https://code.visualstudio.com/)
   - Install [Docker Desktop](https://www.docker.com/products/docker-desktop/)
   - Install the [Dev Containers extension](https://marketplace.visualstudio.com/items?itemName=ms-vscode-remote.remote-containers) for VS Code

2. **Open in Container:**
   ```bash
   git clone https://github.com/WIX1002-1-2018/exercise2026.git
   cd exercise2026
   code .
   ```
   - VS Code will detect the `.devcontainer` folder
   - Click "Reopen in Container" when prompted (or press `F1` and select "Dev Containers: Reopen in Container")
   - Wait for the container to build (first time only)

3. **Run a program:**
   - Navigate to any `.java` file in the `Exercise2026/src` folder
   - Right-click and select "Run Java" or click the "Run" button above the `main` method
   - Output will appear in the integrated terminal

### Option 1b: VS Code on your own computer (used in the Week 4 videos)
1. Install [JDK 25](https://adoptium.net/) and [Visual Studio Code](https://code.visualstudio.com/), then the **Extension Pack for Java** (Microsoft).
2. File → Open Folder → the `exercise2026` folder (the whole folder, so VS Code finds the packages `W01`, `W02`, ...).
3. Open a file and click **Run** above `main`. Type input in the **TERMINAL** panel.
4. VS Code reports compile errors with the Eclipse compiler, so the wording can differ from NetBeans (javac), e.g. `i cannot be resolved to a variable` instead of `cannot find symbol`.

### Option 2: Using Command Line
From the `Exercise2026` directory you can compile and run any example using `javac` and `java`.

Example (Unix / Linux / macOS):

```bash
cd Exercise2026
javac -d out $(find src -name "*.java")
java -cp out W01.W01E01
```

### Option 3: Using an IDE (NetBeans, IntelliJ IDEA, Eclipse, etc.)
Students are free to clone this repository to any Java IDE:

1. **Clone the repository:**
   ```bash
   git clone https://github.com/WIX1002-1-2018/exercise2026.git
   cd exercise2026
   ```

2. **Open in your IDE:**
   - **NetBeans**: File → Open Project → Select the `Exercise2026` folder
   - **IntelliJ IDEA**: File → Open → Select the `Exercise2026` folder
   - **Eclipse**: File → Import → Existing Projects into Workspace → Select the `Exercise2026` folder

3. **Run a program:**
   - Right-click on any `.java` file (e.g., `W01E01.java`) and select "Run File" or press Shift+F6 (NetBeans) / Ctrl+Shift+F10 (IntelliJ)

Notes
-----
- These examples are small, self-contained learning exercises intended for beginners.
- Learn Fork and Pull Request. Try to add a new file and submit pull request.
- If you help to contribute, your name will be listed as one of the contributors.

Version 1.0

# WIX1002 Sample code for 2026

This repository contains solutions and example exercises for WIX1002 (2026), Sem 1 2026/2027.

Contents
--------
- Exercise2026/: main project folder with Java exercises organized by week (W01..).

Summary of Week 01 (W01)
-------------------------
The `src/W01` folder contains introductory Java examples covering basic output and escape sequences:

- [`W01E01.java`](Exercise2026/src/W01/W01E01.java) — Basic `println()` - printing simple text messages.
- [`W01E02.java`](Exercise2026/src/W01/W01E02.java) — Printing numbers and performing basic arithmetic operations.
- [`W01E03.java`](Exercise2026/src/W01/W01E03.java) — Combining text and numbers using string concatenation.
- [`W01E04.java`](Exercise2026/src/W01/W01E04.java) — Using `\n` (newline) escape sequence for multi-line output.
- [`W01E05.java`](Exercise2026/src/W01/W01E05.java) — Using `\t` (tab) escape sequence for formatted columns.
- [`W01E06.java`](Exercise2026/src/W01/W01E06.java) — Combining `\n` and `\t` escape sequences for structured output.
- [`W01E07.java`](Exercise2026/src/W01/W01E07.java) — Other escape sequences: `\"` (quotes), `\\` (backslash), and `\'` (single quote).
- [`W01E08.java`](Exercise2026/src/W01/W01E08.java) — Creating formatted output with escape sequences (student information report).
- [`W01T01.java`](Exercise2026/src/W01/W01T01.java) — A minimal "Hello World" program (prints "Hello World").

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
- [`W04E09.java`](Exercise2026/src/W04/W04E09.java): while tests first, do-while tests last. When the condition is false from the start,
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

Week 04 videos (Programming Essentials)
---------------------------------------
Pull first (VS Code: Source Control > ... > Pull, or `git pull`), then open the file shown in the corner of the video. Links are added when the videos are published.

| Video | Files used | Try it answer (try first) |
|---|---|---|
| #20 while Loops and Tracing | W04E01 to W04E04 | W04E20 |
| #21 Stopping a Loop: Sentinel, Yes/No, do-while, Safe Input | W04E05 to W04E09 | W04E21 |
| #22 for Loops, Choosing a Loop, Guessing Game | W04E10 to W04E14 | W04E22 |
| #23 Loop Mistakes and an AI Check | W04E15, W04E16, W04E18 (AI agent: the bug), W04E19 (the fix) | W04E23 |

Self-study (in the lecture slides, not in a video): W04E17 (bus card worked example).

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

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
| #12 Variables, Types and Constants | W02E01, W02E02, W02E03, W02E05, W02E06, W02E24, W02E29 (AI agent: the task), W02E34 (the agent's fix), W02E30 (security) |
| #13 Operators and Type Casting | W02E07 to W02E14, W02E28 (AI agent: the bug), W02E33 (the fix) |
| #14 Input and Output | W02E15 to W02E21, W02E27, W02E31 (security), W02E32 (void main and IO.readln, JDK 25); W02E18 (AI agent: the bug), W02E19 (the fix) |

Self-study (in the lecture slides, not in a video): W02E04 (type ranges), W02E22 (comment styles), W02E23 (Random), W02E25 (text block and newer String methods), W02E26 (IO.readln inside psvm, JDK 25).

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

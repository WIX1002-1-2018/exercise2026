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

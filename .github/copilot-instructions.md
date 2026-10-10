# AI Coding Agent Instructions for exercise2026

## Project Overview

This is a **Java course exercise repository** (WIX1002-2026) containing progressively complex programming exercises organized by week. Each week covers specific Java concepts, building toward advanced OOP topics like inheritance, polymorphism, and interfaces.

## Repository Structure

- **`Exercise2026/src/`** - Main source code organized by week
  - `W01/` - Basic output and escape sequences (`W01E01.java` - `W01E08.java`, `W01T01.java`)
  - `W02/` - Java fundamentals: variables, types, operators, casting, Strings, Scanner and printf (`W02E01.java` - `W02E34.java`)
  - `W03/` - Selection: relational and logical operators, if, if-else, else-if, nested if, comparing Strings and decimals, switch (classic and arrow), the conditional operator, input checks (`W03E01.java` - `W03E27.java`; E23 to E27 are video Try it answers)
  - `W04/` - Repetition I: while, do-while, for, tracing, counter/sentinel/yes-no loops, input validation in a loop, loop-variable scope, off-by-one (`W04E01.java` - `W04E21.java`; W04E20 onward are video Try it answers)
  - more weeks are added through the semester, following the same pattern as `exercise2025`

- **Build System**: NetBeans Ant-based (`build.xml`, `nbproject/`)
- **Output Files**: Generated `.txt` files saved to `Exercise2026/` root

## Naming Conventions

**Strict Naming Pattern**:
- **Classes**: `W##E##` for exercises, `W##T##` for tutorial, `W##L##` for lab (e.g., `W01E01.java`, `W02T06.java`, `W02L01.java`)
  - W = Week, E = Exercise, T = Tutorial, L = Lab
- **Package**: `package W##;` corresponds to folder name

## When Adding New Exercises

1. **Create class**: `W##E##.java` (or `T##`/`L##`) in `Exercise2026/src/W##/` folder
2. **Package declaration**: `package W##;`
3. **Main method**: Always include `public static void main(String[] args)`
4. **File I/O**: Use try-with-resources with `Locale.US` for number parsing (from W09 onward)
5. **Comments**: One short header comment describing what the exercise teaches
6. Update `README.md`'s weekly summary section with a one-line bullet per new file

## Development Workflow

### Compiling & Running
- **Build**: `ant clean build` (NetBeans Ant)
- **Run Single Class**: `java -cp out W##.W##E##`
- **Dev Container**: `.devcontainer/devcontainer.json` gives a ready-to-use Java 25 environment (JDK 25, the course standard) in VS Code

## Anti-Patterns to Avoid

- Manual resource management: use try-with-resources instead of manual `.close()`
- Regional locale dependencies: always set `Locale.US` for number parsing
- Mixed Scanner usage: don't mix `next()` and `nextLine()` without `.skip("\n")`
- Case-sensitive string comparisons on user input: use `equalsIgnoreCase()`
- Hardcoding paths: use relative file names

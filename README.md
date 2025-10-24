# NotesManager

1. Overview:
The Notes App is a simple command-line Java application that allows users to add and view notes using File I/O operations.
It demonstrates how to handle files, manage user input, and structure a Java program using multiple classes and object-oriented programming principles.

2.Features:
1.Add a new note
2. View all saved notes
3. Notes are stored persistently using text files
4. Modular design using multiple classes
5.Demonstrates practical use of FileWriter, FileReader, and BufferedReader

3.Project Structure:
| File/Folder Path       | Description                                                                                               |
| ---------------------- | --------------------------------------------------------------------------------------------------------- |
| src/                   | Main source directory containing all Java files                                                           |
| ├── Note.java          | Defines the **Note** class with attributes (title, content, createdAt) and a formatted toString()         |
| ├── NoteApp.java       | Contains methods for **adding** and **viewing** notes using File I/O                                      |
| └── NoteManager.java   | Contains the **main method** and menu-driven logic for user interaction                                   |
| notes.txt              | File used to **store all user notes** (auto-created if not present)                                       |
| README.md              | Project documentation file                                                                                |

4.Class Responsibilities:
1. Note.java
Represents a single note with attributes like title and content.
Contains constructors, getters, and overridden toString() method.

2. NoteApp.java
Handles file operations:
addNote(): Saves new note data to the file.
viewNotes(): Reads and displays all notes from the file.
Uses FileWriter, BufferedWriter, FileReader, and BufferedReader.
Handles IOException properly.

3. NoteManager.java
Provides a menu-driven interface.
Uses a while loop with user input choices:
1 → Add Note
2 → View Notes
3 → Exit
Uses a flag variable (running) to control the loop termination safely.
Creates objects of NoteApp and calls appropriate methods.

5.Technologies Used:
Java (JDK 8 or above)
File I/O (java.io package)
Object-Oriented Programming (OOP)
Exceptional Handling

6.Exception Handling:
1.Handles IOException gracefully using throws declaration.
2.Ensures file readers and writers are closed properly after each operation.

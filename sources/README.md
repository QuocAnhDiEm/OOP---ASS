# Java OOP Project – Library Usage Guide

## Project Structure

Project is organized as follows:

```
OOP---ASS/
├── .vscode/
│   └── settings.json
├── lib/
│   └── (all external .jar libraries, e.g., JavaFX)
├── data/
│   ├── products.txt
│   ├── orders.txt
│   └── users.txt
├── sources/
│   ├── src/
│   └── bin/
└── ...
```

## How to Use External Libraries

1. **Add Libraries:**  
   Place all required `.jar` files (such as JavaFX libraries) inside the `lib` folder at the root of your project.

2. **VS Code Configuration:**  
   The file `.vscode/settings.json` is already set up to automatically include all `.jar` files in the `lib` directory:
   ```json
   {
       "java.project.referencedLibraries": [
           "lib/**/*.jar"
       ]
   }
   ```
   This ensures that all libraries in `lib` are available to your Java project without using any absolute paths.

3. **No Absolute Paths:**  
   Do **not** use absolute paths for library references. Always use the `lib` folder and relative paths as shown above. This makes your project portable and easy to share.

4. **Compiling and Running:**  
   - When compiling or running your project, VS Code will automatically include the libraries from `lib`.
   - If you use the command line, make sure to add all `.jar` files in `lib` to your classpath. Example:
     ```
     javac -cp "lib/*;." sources/src/Main.java
     java -cp "lib/*;sources/src" Main
     ```

5. **Sharing the Project:**  
   - When sharing your project, include the `lib` folder with all necessary `.jar` files.
   - Other users will not need to change any configuration if they use VS Code.

## Notes

- If you add or remove `.jar` files in `lib`, VS Code will automatically update the classpath.
- For more information on managing dependencies in VS Code, see the [official documentation](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

---
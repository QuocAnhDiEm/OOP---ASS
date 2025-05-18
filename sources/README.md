# Project Documentation

## Getting Started

Welcome to the VS Code Java world! Here is a guideline to help you get started with writing and running Java code in Visual Studio Code.

### Folder Structure

The workspace contains the following folders:
- **`data`**: The folder to maintain data files.
- **`src`**: The folder to maintain Java source code files.
- **`lib`**: The folder to store external dependencies (such as JAR files).
- **`bin`**: The folder where compiled output files (i.e., `.class` files) are stored.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings.

### Dependency Management

- The `JAVA PROJECTS` view in **VSCode** allows you to manage your Java dependencies.
- For this project, we are using **JavaFX** for generating graphical charts. Here’s how you can set up JavaFX in your project.

## Step-by-Step Setup

Follow these steps to set up the environment:

### 1. **Download JavaFX SDK**

JavaFX is used for creating graphical charts (like bar charts, pie charts, etc.) in this project. To add JavaFX to your project:

- Download the **JavaFX SDK** from [JavaFX Downloads](https://openjfx.io/).
- Extract the ZIP file and navigate to the `lib` folder inside the extracted folder.
- Copy all the JAR files inside the `lib` folder (e.g., `javafx-controls.jar`, `javafx-base.jar`, `javafx-graphics.jar`, etc.) into the `lib` folder of your project.

### 2. **JAR Files Used in This Project**

The following JAR files are used in this project and should be added to the `lib` folder:

- `javafx.base.jar`
- `javafx.controls.jar`
- `javafx.fxml.jar`
- `javafx.graphics.jar`
- `javafx.media.jar`
- `javafx.swing.jar`
- `javafx.web.jar`
- `javafx-swt.jar`
- `jdk.sobject.jar`
- `jfx.incubator.input.jar`
- `jfx.incubator.richtext.jar`

### 3. **Set Up VSCode for Java Development**

To work with Java in **VSCode**, make sure you have the following extensions installed:

- **Java Extension Pack** (This will include essential extensions like `Java Language Support`, `Debugger for Java`, etc.)
  
   - Open **VSCode** > Go to **Extensions** (Ctrl+Shift+X) > Search for **Java Extension Pack** and install it.

### 4. **Configure VSCode to Use JavaFX**

You need to add the JavaFX JAR files to your project's classpath for VSCode to use them.

1. **Create the `lib` Folder**:
   - If not already done, create a folder named **`lib`** in your project and add the downloaded JavaFX JAR files (as mentioned above).

2. **Create `launch.json` for Running the Project**:
   - Go to the **Run** menu in VSCode > **Add Configuration** > Select **Java** and then **Java: Launch Program**.
   - VSCode will create a `launch.json` file in the `.vscode/` folder. Here is how you should modify it to include the JavaFX JAR files from the `lib` folder.

```json
{
    "version": "0.2.0",
    "configurations": [
        {
            "type": "java",
            "name": "Launch Main",
            "request": "launch",
            "mainClass": "Main",  // Replace with the actual main class 
            "vmArgs": "--module-path ${workspaceFolder}/lib --add-modules javafx.controls,javafx.fxml",
            "classPaths": [
                "bin",  // Folder containing compiled .class files
                "lib/javafx-controls.jar",  // Path to JavaFX Controls JAR
                "lib/javafx-base.jar",  // Path to JavaFX Base JAR
                "lib/javafx-graphics.jar",  // Path to JavaFX Graphics JAR
                "lib/javafx-media.jar",  // Path to JavaFX Media JAR
                "lib/javafx-swing.jar",  // Path to JavaFX Swing JAR
                "lib/javafx-web.jar",  // Path to JavaFX Web JAR
                "lib/javafx-swt.jar",  // Path to JavaFX SWT JAR
                "lib/jdk.sobject.jar",  // Add other necessary JARs if any
                "lib/jfx.incubator.input.jar",  // Add other necessary JARs if any
                "lib/jfx.incubator.richtext.jar"  // Add other necessary JARs if any
            ]
        }
    ]
}

# TaskManager :clipboard:

This project is part of the practical work for the course "Automating Software Applications in the Java Language" at NaUKMA. It is a simple console-based task manager application implemented as a multi-module Maven project. 

## Structure :open_file_folder:

The project consists of three modules:

1. **core**: This module contains the main business logic of the application.
2. **storage**: This module is responsible for persisting tasks to a file using Google's Gson library.
3. **ui**: This module contains the user interface logic for interacting with tasks via a command-line interface.

## Features :gear:

1. **Multi-module Maven Project**: The project is organized into three related modules: core, storage, and ui.
2. **Maven Dependencies**: Dependencies between the modules and with external libraries from Maven Central are managed using Maven.
3. **Maven Copy Resources Plugin**: This plugin is used to copy resources between modules.
4. **Maven Profile**: A Maven profile is used for project assembly.
5. **Maven Archetype**: The project is setup using a Maven archetype.

## Setup :wrench:

You can build and run the project using Maven commands. 

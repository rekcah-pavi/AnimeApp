# AnimeApp

## Overview

It is a Java-based application designed for anime enthusiasts to manage their favorite characters. The application allows users to add, view, and remove characters with detailed information such as character name, description, and associated image. The project was developed as part of a lab exercise for the Data Structures and Algorithms course.


## Video Guide

For a detailed walkthrough of how this project was developed, watch the [YouTube video guide](https://youtu.be/sMVWIjkGP9s).


## Features

- **Add Characters**: Users can add a new character with a name, description, and picture.
  - **Add First**: Insert a character at the beginning of the list.
  - **Add Last**: Append a character at the end of the list.
  - **Insert Before**: Add a character before an existing character by name.
- **View Details**: Users can view the list of added characters and their details.
  - **Search by Name**: Find a character by their name.
  - **Next Character**: Navigate to the next character in the list.
- **Remove Characters**: Users can delete characters from the list.

## Project Structure

The project is organized into two main packages:

- **Code Package**: Contains the core classes that implement the linked list and character management functionality.
  - `Link.java`: Represents a node in the linked list, containing the character's details.
  - `LinkedList.java`: Implements the linked list operations such as insertion, deletion, and search.
  
- **Gui Package**: Contains the user interface components.
  - `AnimeGui.java`: Manages the graphical user interface of the application, allowing users to interact with the character list.


## Sample UI

The application provides a graphical user interface for ease of use. Below is a sample of what the interface might look like:

- **Add Character Interface**: A form with fields for entering the character's name, description, and a button to browse for an image.
  
  ![image](https://github.com/user-attachments/assets/8f9520f7-67a0-447d-be3d-7e757e420db2)


- **Character List Interface**: Displays the list of characters added, with options to view details, search by name, navigate to the next character, or remove a character.
  
  ![image](https://github.com/user-attachments/assets/739f5115-ce95-4c70-a869-d7e8354b0c8f)

## How It Works

The application uses a custom linked list to store and manage the characters. Each character is represented as a node in the list. Operations such as adding, finding, and deleting characters are performed using linked list methods.





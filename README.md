# data-structures-algorithms
- DSA Code written in JAVA
- PY Basics


### Coding Profile
- **[leetcode.com/himanshujaindev](https://leetcode.com/u/himanshujaindev/)**


### Installation and Setup
1. Download JDK - [here](https://www.oracle.com/java/technologies/downloads/)
```
❯ javac -version
javac 23.0.1

❯ java -version
java version "23.0.1" 2024-10-15
Java(TM) SE Runtime Environment (build 23.0.1+11-39)
Java HotSpot(TM) 64-Bit Server VM (build 23.0.1+11-39, mixed mode, sharing)

❯ python3 --version  
Python 3.13.1

❯ alias activate_python 
activate_python='python3 -m venv ~/pyenv && source ~/pyenv/bin/activate && pip3 list'
```

2. VS Code Extension - [java](https://marketplace.visualstudio.com/items?itemName=Oracle.oracle-java), [py-format](https://marketplace.visualstudio.com/items?itemName=ms-python.black-formatter)

<img width="400" alt="py-extension" src="https://github.com/user-attachments/assets/b7b511d0-8514-4d56-a938-f2feb82339be" />
<img width="400" alt="java-extension" src="https://github.com/user-attachments/assets/034e0831-b44c-4d83-bdd3-238a050cee98" />

3. Enable Format on Save option
4. Update Keyboard shortcut:<br>
    a. Start Debugging = ```⌘+'```<br>
    b. Run Without Debugging = ```⌘+⏎```
    


### Folder Structure
```
(tree -P '*.java|*.py') | sed '1s/^/```\n/' | sed '$a\
```' > FILES.md
```


### Keyboard Shortcuts (VSCode)

1. Format: ```⌘+S```
2. Debug: ```⌘+'```
3. Run: ```⌘+⏎```


### Todo Before Commit

- Format the document
- Update the directory tree
- Follow the naming convention


### Commands

```
javac Rootpath/<filename>.java
java Rootpath/<classname>
```


### Naming Convention

- Folder Name = Upper Camel Case -> ```DataStructures```
- File Name | Class Name = Small Underscore Case -> ```min_heap.java```
- Method Name | Variable Name = Small Camel Case -> ```printHeap()```


### Resources
1. https://neetcode.io/practice

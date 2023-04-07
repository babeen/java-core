# java-swing

### write hello world java program in kali linux 


* Open a terminal in Kali Linux by clicking on the Terminal icon in the main menu or by pressing the Ctrl+Alt+T shortcut.

* Create a new directory for your Java project by entering the following command:

bash

`mkdir HelloWorld 
`


This will create a new directory named "HelloWorld" in the current working directory.

Change to the newly created directory by entering the following command:
bash

` cd HelloWorld `
* Create a new Java file named "HelloWorld.java" by entering the following command:

` nano HelloWorld.java `
In the text editor, enter the following code:
java

``` 
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

Save the changes to the file by pressing Ctrl+O, then Enter.

Exit the text editor by pressing Ctrl+X.

Compile the Java program by entering the following command:

`
javac HelloWorld.java
`
This will generate a class file named "HelloWorld.class" in the same directory.

Run the Java program by entering the following command:

` java HelloWorld `
This will execute the "Hello, World!" program and display the output in the terminal:


` Hello, World! `
That's it! You have successfully written and executed your first Java program in Kali Linux.

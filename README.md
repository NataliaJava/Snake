# Snake
![Snake](https://user-images.githubusercontent.com/105055910/167138458-14767cc2-2dd4-4d56-af59-7ab49a6d24fd.png)

## Live video
https://www.canva.com/design/DAE_7WHu7NE/b3EV1AZmtPq5HJuMD4-bpQ/watch?utm_content=DAE_7WHu7NE&utm_campaign=designshare&utm_medium=link2&utm_source=sharebutton

## Description

<p>Classic cult game familiar to us all since childhood. </p>

![2](https://user-images.githubusercontent.com/105055910/167157666-c7527d6d-95da-4829-9783-4a0f11e9187d.png)

![1](https://user-images.githubusercontent.com/105055910/167157695-f62f349c-2123-432e-9061-32c3c61ceff1.png)


## History developing game

<h3>Create Display for game</h3>

<ul>
    <li> Create class MainWindow </li>
    <li> For class MainWindow I use: </li>
        <ul>
            <li>import javax.swing.*;</li>
            <li>import java.awt.*;</li>
            <li>and extends class JFrame</li>
        </ul>
    <li> Create public constructor class and add next to: </li>
        <ul>
            <li>setTitle("Snake");</li>
            <li>setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);</li>
            <li>setSize(320, 345);</li>
            <li>setLocation(400, 400);</li>
            <li>add(new GameField());</li>
            <li>setVisible(true);</li>
        </ul>
    <li>And create start program: </br> public static void main(String[] args) {</br>
        MainWindow mw = new MainWindow();
    }</li>
</ul>

<h3>Create Game</h3>

<ul>
    <li> Create class GameField </li>
    <li> For class MainWindow I use: </li>
        <ul>
            <li>import javax.swing.*;</li>
            <li>import java.awt.*;</li>
            <li>import java.awt.event.ActionEvent;</li>
            <li>import java.awt.event.ActionListener;</li>
            <li>import java.awt.event.KeyAdapter;</li>
            <li>import java.awt.event.KeyEvent;</li>
            <li>import java.util.Random;</li>
            <li>extends class JPanel</li>
            <li>and implements interface ActionListener</li>
        </ul>
    <li>@Overright method paintComponent from interface ActionListener </li>
    <li> Add to class important variable</li>
    <li>Create method loadImage</li>
    <li>Create method for apple</li>
    <li>Create method for check apple</li>
    <li>Create method initGame</li>
    <li>Addition method paintComponent</li>
    <li>Create methods for check frames and snake</li>
    <li>Create class constructor and add methods for call</li>
    <li>in class GameField create class FieldFeyListener and extends class KeyAdapter</li>
    <li>@Override method keyPressed for actions click on the keyboard</li>
    <li>That`s all, game is finish!)</li>
</ul>

### Good playing)

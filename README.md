# Snake
![Snake](https://user-images.githubusercontent.com/105055910/167138458-14767cc2-2dd4-4d56-af59-7ab49a6d24fd.png)

## Description

<p>Classic cult game familiar to us all since childhood. </p>

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

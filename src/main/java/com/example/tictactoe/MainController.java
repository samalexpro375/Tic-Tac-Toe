package com.example.tictactoe;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
public class MainController {

    private Random random = new Random();

    private boolean isWin = false;

    private boolean isWinB = false;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private Button button4;

    @FXML
    private Button button5;

    @FXML
    private Button button6;

    @FXML
    private Button button7;

    @FXML
    private Button button8;

    @FXML
    private Button button9;

    @FXML
    private GridPane buttons;

    @FXML
    void initialize() {
            button1.setOnAction(event ->
            {
                if(button1.getText() == "")
                {
                    button1.setText("X");
                    bot();
                }
                if(button1.getText() == "X" && button2.getText() == "X" && button3.getText() == "X" || button1.getText() == "X" && button5.getText() == "X" && button9.getText() == "X" || button1.getText() == "X" && button4.getText() == "X" && button7.getText() == "X" || button2.getText() == "X" && button5.getText() == "X" && button8.getText() == "X" || button3.getText() == "X" && button5.getText() == "X" && button7.getText() == "X" || button4.getText() == "X" && button5.getText() == "X" && button6.getText() == "X" || button3.getText() == "X" && button6.getText() == "X" && button9.getText() == "X" || button7.getText() == "X" && button8.getText() == "X" && button9.getText() == "X")
                {
                    isWin = true;
                    button1.setText("X");
                    button2.setText("X");
                    button3.setText("X");
                    button4.setText("X");
                    button5.setText("X");
                    button6.setText("X");
                    button7.setText("X");
                    button8.setText("X");
                    button9.setText("X");
                }
            });
            button2.setOnAction(event ->
            {
                if(button2.getText() == "")
                {
                    button2.setText("X");
                    bot();
                }
                if(button1.getText() == "X" && button2.getText() == "X" && button3.getText() == "X" || button1.getText() == "X" && button5.getText() == "X" && button9.getText() == "X" || button1.getText() == "X" && button4.getText() == "X" && button7.getText() == "X" || button2.getText() == "X" && button5.getText() == "X" && button8.getText() == "X" || button3.getText() == "X" && button5.getText() == "X" && button7.getText() == "X" || button4.getText() == "X" && button5.getText() == "X" && button6.getText() == "X" || button3.getText() == "X" && button6.getText() == "X" && button9.getText() == "X" || button7.getText() == "X" && button8.getText() == "X" && button9.getText() == "X")
                {
                    isWin = true;
                    button1.setText("X");
                    button2.setText("X");
                    button3.setText("X");
                    button4.setText("X");
                    button5.setText("X");
                    button6.setText("X");
                    button7.setText("X");
                    button8.setText("X");
                    button9.setText("X");
                }
            });
            button3.setOnAction(event ->
            {
                if(button3.getText() == "")
                {
                    button3.setText("X");
                    bot();
                }
                if(button1.getText() == "X" && button2.getText() == "X" && button3.getText() == "X" || button1.getText() == "X" && button5.getText() == "X" && button9.getText() == "X" || button1.getText() == "X" && button4.getText() == "X" && button7.getText() == "X" || button2.getText() == "X" && button5.getText() == "X" && button8.getText() == "X" || button3.getText() == "X" && button5.getText() == "X" && button7.getText() == "X" || button4.getText() == "X" && button5.getText() == "X" && button6.getText() == "X" || button3.getText() == "X" && button6.getText() == "X" && button9.getText() == "X" || button7.getText() == "X" && button8.getText() == "X" && button9.getText() == "X")
                {
                    isWin = true;
                    button1.setText("X");
                    button2.setText("X");
                    button3.setText("X");
                    button4.setText("X");
                    button5.setText("X");
                    button6.setText("X");
                    button7.setText("X");
                    button8.setText("X");
                    button9.setText("X");
                }
            });
            button4.setOnAction(event ->
            {
                if(button4.getText() == "")
                {
                    button4.setText("X");
                    bot();
                }
                if(button1.getText() == "X" && button2.getText() == "X" && button3.getText() == "X" || button1.getText() == "X" && button5.getText() == "X" && button9.getText() == "X" || button1.getText() == "X" && button4.getText() == "X" && button7.getText() == "X" || button2.getText() == "X" && button5.getText() == "X" && button8.getText() == "X" || button3.getText() == "X" && button5.getText() == "X" && button7.getText() == "X" || button4.getText() == "X" && button5.getText() == "X" && button6.getText() == "X" || button3.getText() == "X" && button6.getText() == "X" && button9.getText() == "X" || button7.getText() == "X" && button8.getText() == "X" && button9.getText() == "X")
                {
                    isWin = true;
                    button1.setText("X");
                    button2.setText("X");
                    button3.setText("X");
                    button4.setText("X");
                    button5.setText("X");
                    button6.setText("X");
                    button7.setText("X");
                    button8.setText("X");
                    button9.setText("X");
                }
            });
            button5.setOnAction(event ->
            {
                if(button5.getText() == "")
                {
                    button5.setText("X");
                    bot();
                }
                if(button1.getText() == "X" && button2.getText() == "X" && button3.getText() == "X" || button1.getText() == "X" && button5.getText() == "X" && button9.getText() == "X" || button1.getText() == "X" && button4.getText() == "X" && button7.getText() == "X" || button2.getText() == "X" && button5.getText() == "X" && button8.getText() == "X" || button3.getText() == "X" && button5.getText() == "X" && button7.getText() == "X" || button4.getText() == "X" && button5.getText() == "X" && button6.getText() == "X" || button3.getText() == "X" && button6.getText() == "X" && button9.getText() == "X" || button7.getText() == "X" && button8.getText() == "X" && button9.getText() == "X")
                {
                    isWin = true;
                    button1.setText("X");
                    button2.setText("X");
                    button3.setText("X");
                    button4.setText("X");
                    button5.setText("X");
                    button6.setText("X");
                    button7.setText("X");
                    button8.setText("X");
                    button9.setText("X");
                }
            });
            button6.setOnAction(event ->
            {
                if(button6.getText() == "")
                {
                    button6.setText("X");
                    bot();
                }
                if(button1.getText() == "X" && button2.getText() == "X" && button3.getText() == "X" || button1.getText() == "X" && button5.getText() == "X" && button9.getText() == "X" || button1.getText() == "X" && button4.getText() == "X" && button7.getText() == "X" || button2.getText() == "X" && button5.getText() == "X" && button8.getText() == "X" || button3.getText() == "X" && button5.getText() == "X" && button7.getText() == "X" || button4.getText() == "X" && button5.getText() == "X" && button6.getText() == "X" || button3.getText() == "X" && button6.getText() == "X" && button9.getText() == "X" || button7.getText() == "X" && button8.getText() == "X" && button9.getText() == "X")
                {
                    isWin = true;
                    button1.setText("X");
                    button2.setText("X");
                    button3.setText("X");
                    button4.setText("X");
                    button5.setText("X");
                    button6.setText("X");
                    button7.setText("X");
                    button8.setText("X");
                    button9.setText("X");
                }
            });
            button7.setOnAction(event ->
            {
                if(button7.getText() == "")
                {
                    button7.setText("X");
                    bot();
                }
                if(button1.getText() == "X" && button2.getText() == "X" && button3.getText() == "X" || button1.getText() == "X" && button5.getText() == "X" && button9.getText() == "X" || button1.getText() == "X" && button4.getText() == "X" && button7.getText() == "X" || button2.getText() == "X" && button5.getText() == "X" && button8.getText() == "X" || button3.getText() == "X" && button5.getText() == "X" && button7.getText() == "X" || button4.getText() == "X" && button5.getText() == "X" && button6.getText() == "X" || button3.getText() == "X" && button6.getText() == "X" && button9.getText() == "X" || button7.getText() == "X" && button8.getText() == "X" && button9.getText() == "X")
                {
                    isWin = true;
                    button1.setText("X");
                    button2.setText("X");
                    button3.setText("X");
                    button4.setText("X");
                    button5.setText("X");
                    button6.setText("X");
                    button7.setText("X");
                    button8.setText("X");
                    button9.setText("X");
                }
            });
            button8.setOnAction(event ->
            {
                if(button8.getText() == "")
                {
                    button8.setText("X");
                    bot();
                }
                if(button1.getText() == "X" && button2.getText() == "X" && button3.getText() == "X" || button1.getText() == "X" && button5.getText() == "X" && button9.getText() == "X" || button1.getText() == "X" && button4.getText() == "X" && button7.getText() == "X" || button2.getText() == "X" && button5.getText() == "X" && button8.getText() == "X" || button3.getText() == "X" && button5.getText() == "X" && button7.getText() == "X" || button4.getText() == "X" && button5.getText() == "X" && button6.getText() == "X" || button3.getText() == "X" && button6.getText() == "X" && button9.getText() == "X" || button7.getText() == "X" && button8.getText() == "X" && button9.getText() == "X")
                {
                    isWin = true;
                    button1.setText("X");
                    button2.setText("X");
                    button3.setText("X");
                    button4.setText("X");
                    button5.setText("X");
                    button6.setText("X");
                    button7.setText("X");
                    button8.setText("X");
                    button9.setText("X");
                }
            });
            button9.setOnAction(event ->
            {
                if(button9.getText() == "")
                {
                    button9.setText("X");
                    bot();
                }
                if(button1.getText() == "X" && button2.getText() == "X" && button3.getText() == "X" || button1.getText() == "X" && button5.getText() == "X" && button9.getText() == "X" || button1.getText() == "X" && button4.getText() == "X" && button7.getText() == "X" || button2.getText() == "X" && button5.getText() == "X" && button8.getText() == "X" || button3.getText() == "X" && button5.getText() == "X" && button7.getText() == "X" || button4.getText() == "X" && button5.getText() == "X" && button6.getText() == "X" || button3.getText() == "X" && button6.getText() == "X" && button9.getText() == "X" || button7.getText() == "X" && button8.getText() == "X" && button9.getText() == "X")
                {
                    isWin = true;
                    button1.setText("X");
                    button2.setText("X");
                    button3.setText("X");
                    button4.setText("X");
                    button5.setText("X");
                    button6.setText("X");
                    button7.setText("X");
                    button8.setText("X");
                    button9.setText("X");
                }
            });
    }

    void bot()
    {
        int a = random.nextInt(1, 10);
        try{
            if(a == 1 && button1.getText() == "")
            {
                button1.setText("O");
            }
            else if(a == 2 && button2.getText() == "")
            {
                button2.setText("O");
            }
            else if(a == 3 && button3.getText() == "")
            {
                button3.setText("O");
            }
            else if(a == 4 && button4.getText() == "")
            {
                button4.setText("O");
            }
            else if(a == 5 && button5.getText() == "")
            {
                button5.setText("O");
            }
            else if(a == 6 && button6.getText() == "")
            {
                button6.setText("O");
            }
            else if(a == 7 && button7.getText() == "")
            {
                button7.setText("O");
            }
            else if(a == 8 && button8.getText() == "")
            {
                button8.setText("O");
            }
            else if(a == 9 && button9.getText() == "")
            {
                button9.setText("O");
            }
            else {
                bot();
            }
        }
        catch (Exception e)
        {
            if(isWin == false && isWinB == false)
            {
                System.exit(0);
            }
            else {
                if(button1.getText() == "O" && button2.getText() == "O" && button3.getText() == "O" || button1.getText() == "O" && button5.getText() == "O" && button9.getText() == "O" || button1.getText() == "O" && button4.getText() == "O" && button7.getText() == "O" || button2.getText() == "O" && button5.getText() == "O" && button8.getText() == "O" || button3.getText() == "O" && button5.getText() == "O" && button7.getText() == "O" || button4.getText() == "O" && button5.getText() == "O" && button6.getText() == "O" || button3.getText() == "O" && button6.getText() == "O" && button9.getText() == "O" || button7.getText() == "O" && button8.getText() == "O" && button9.getText() == "O")
                {
                    isWinB = true;
                    button1.setText("O");
                    button2.setText("O");
                    button3.setText("O");
                    button4.setText("O");
                    button5.setText("O");
                    button6.setText("O");
                    button7.setText("O");
                    button8.setText("O");
                    button9.setText("O");
                }
            }
        }
        if(button1.getText() == "O" && button2.getText() == "O" && button3.getText() == "O" || button1.getText() == "O" && button5.getText() == "O" && button9.getText() == "O" || button1.getText() == "O" && button4.getText() == "O" && button7.getText() == "O" || button2.getText() == "O" && button5.getText() == "O" && button8.getText() == "O" || button3.getText() == "O" && button5.getText() == "O" && button7.getText() == "O" || button4.getText() == "O" && button5.getText() == "O" && button6.getText() == "O" || button3.getText() == "O" && button6.getText() == "O" && button9.getText() == "O" || button7.getText() == "O" && button8.getText() == "O" && button9.getText() == "O")
        {
            isWinB = true;
            button1.setText("O");
            button2.setText("O");
            button3.setText("O");
            button4.setText("O");
            button5.setText("O");
            button6.setText("O");
            button7.setText("O");
            button8.setText("O");
            button9.setText("O");
        }

    }

}


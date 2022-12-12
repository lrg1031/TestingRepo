package com.mycompany.lukegreen_assignment02_csc311;

import java.io.IOException;
import javafx.animation.FillTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.util.Duration;

/**
 * contains all the member variables and methods to make up the
 * PrimaryController class for this GUI
 * 
 * @author Luke Green
 */
public class PrimaryController {

    @FXML
    private TextField winsText;
    
    @FXML
    private TextField lossText;
    
    @FXML
    private Pane shapesPane;
    
    /**
     * event handler for spin button
     * generates shapes, and accounts for wins/losses
     */
    @FXML 
    private void handleSpinButton() {
        generateShapes();
    }
    
    /**
     * event handler for menu, close button
     * closes app
     */
    @FXML
    private void handleClose() {
        System.exit(0);
    }
    
    /**
     * event handler for menu, new game
     * will reset shapes and win/loss ratio
     */
    @FXML
    private void handleNewGame() {
        shapesPane.getChildren().clear();
        winsText.setText(String.valueOf(0));
        lossText.setText(String.valueOf(0));
    }
    
    /**
     * will generate 9 random shapes on the spin
     * will account for when a loss happens
     */
    private void generateShapes() {
        shapesPane.getChildren().clear();
        
        int currentWins = Integer.parseInt(winsText.getText());
  
        generateRow();
        
        if (Integer.parseInt(winsText.getText()) == currentWins) {
            int loss = Integer.parseInt(lossText.getText());
            loss = loss + 1;
            lossText.setText(String.valueOf(loss));
        }
        
    }
    
    /**
     * will handle generation of shapes, one row at a time
     * puts shapes into an array for each row; for easy editing
     */
    private void generateRow() {
        int winningRows = 0;
        //arrays of shaper representing each row
        Shape[] shapes = new Shape[3];
        Shape[] shapes2 = new Shape[3];
        Shape[] shapes3 = new Shape[3];
        //rand's decide which shapes are chosen
        int rand1 = (Math.random() <= 0.5) ? 1 : 2;
        int rand2 = (Math.random() <= 0.5) ? 1 : 2;
        int rand3 = (Math.random() <= 0.5) ? 1 : 2;
        
        int rand4 = (Math.random() <= 0.5) ? 1 : 2;
        int rand5 = (Math.random() <= 0.5) ? 1 : 2;
        int rand6 = (Math.random() <= 0.5) ? 1 : 2;
        
        int rand7 = (Math.random() <= 0.5) ? 1 : 2;
        int rand8 = (Math.random() <= 0.5) ? 1 : 2;
        int rand9 = (Math.random() <= 0.5) ? 1 : 2;
        
        //counter for circles in each row
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        
        //counter for rects in each row
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        
        //row 1
        if (rand1 == 1) {
            shapes[0] = new Rectangle(69, -15, 45, 45);
            shapesPane.getChildren().add(shapes[0]);
            r1++;
        } else {
            shapes[0] = new Circle(91, 9, 21);
            shapesPane.getChildren().add(shapes[0]);
            c1++;
        }
        if (rand2 == 1) {
            shapes[1] = new Rectangle(159, -15, 45, 45);
            shapesPane.getChildren().add(shapes[1]);
            r1++;
        } else {
            shapes[1] = new Circle(181, 9, 21);
            shapesPane.getChildren().add(shapes[1]);
            c1++;
        }
        if (rand3 == 1) {
            shapes[2] = new Rectangle(249, -15, 45, 45);
            shapesPane.getChildren().add(shapes[2]);
            r1++;
        } else {
            shapes[2] = new Circle(271, 9, 21);
            shapesPane.getChildren().add(shapes[2]);
            c1++;
        }
        //checks to see if a winning row, if so turn green aswell
        if (winningRows == 0) {
            if(r1 == 3 || c1 == 3) {
                FillTransition ft1 = new FillTransition(Duration.seconds(4), shapes[0]);
                FillTransition ft2 = new FillTransition(Duration.seconds(4), shapes[1]);
                FillTransition ft3 = new FillTransition(Duration.seconds(4), shapes[2]);
                ft1.setToValue(Color.GREEN);
                ft2.setToValue(Color.GREEN);
                ft3.setToValue(Color.GREEN);
                ParallelTransition pt = new ParallelTransition();
                pt.getChildren().add(ft1);
                pt.getChildren().add(ft2);
                pt.getChildren().add(ft3);
                pt.play();

                winningRows++;

                int wins = Integer.parseInt(winsText.getText());
                wins = wins + 1;
                winsText.setText(String.valueOf(wins));
            }
        }
        
        //row 2
        if (rand4 == 1) {
            shapes2[0] = new Rectangle(69, -15, 45, 45);
            shapesPane.getChildren().add(shapes2[0]);
            r2++;
        } else {
            shapes2[0] = new Circle(91, 9, 21);
            shapesPane.getChildren().add(shapes2[0]);
            c2++;
        }
        if (rand5 == 1) {
            shapes2[1] = new Rectangle(159, -15, 45, 45);
            shapesPane.getChildren().add(shapes2[1]);
            r2++;
        } else {
            shapes2[1] = new Circle(181, 9, 21);
            shapesPane.getChildren().add(shapes2[1]);
            c2++;
        }
        if (rand6 == 1) {
            shapes2[2] = new Rectangle(249, -15, 45, 45);
            shapesPane.getChildren().add(shapes2[2]);
            r2++;
        } else {
            shapes2[2] = new Circle(271, 9, 21);
            shapesPane.getChildren().add(shapes2[2]);
            c2++;
        }
        //checks to see if a winning row, if so turn green aswell
        if (winningRows == 0) {
            if (r2 == 3 || c2 == 3) {
                FillTransition ft1 = new FillTransition(Duration.seconds(4), shapes2[0]);
                FillTransition ft2 = new FillTransition(Duration.seconds(4), shapes2[1]);
                FillTransition ft3 = new FillTransition(Duration.seconds(4), shapes2[2]);
                ft1.setToValue(Color.GREEN);
                ft2.setToValue(Color.GREEN);
                ft3.setToValue(Color.GREEN);
                ParallelTransition pt = new ParallelTransition();
                pt.getChildren().add(ft1);
                pt.getChildren().add(ft2);
                pt.getChildren().add(ft3);
                pt.play();

                winningRows++;

                int wins = Integer.parseInt(winsText.getText());
                wins = wins + 1;
                winsText.setText(String.valueOf(wins));
            }
        }
        
        //row 3
        if (rand7 == 1) {
            shapes3[0] = new Rectangle(69, -15, 45, 45);
            shapesPane.getChildren().add(shapes3[0]);
            r3++;
        } else {
            shapes3[0] = new Circle(91, 9, 21);
            shapesPane.getChildren().add(shapes3[0]);
            c3++;
        }
        if (rand8 == 1) {
            shapes3[1] = new Rectangle(159, -15, 45, 45);
            shapesPane.getChildren().add(shapes3[1]);
            r3++;
        } else {
            shapes3[1] = new Circle(181, 9, 21);
            shapesPane.getChildren().add(shapes3[1]);
            c3++;
        }
        if (rand9 == 1) {
            shapes3[2] = new Rectangle(249, -15, 45, 45);
            shapesPane.getChildren().add(shapes3[2]);
            r3++;
        } else {
            shapes3[2] = new Circle(271, 9, 21);
            shapesPane.getChildren().add(shapes3[2]);
            c3++;
        }
        //checks to see if a winning row, if so turn green aswell
        if (winningRows == 0) {
            if (c3 ==3 || r3 == 3) {
                FillTransition ft1 = new FillTransition(Duration.seconds(4), shapes3[0]);
                FillTransition ft2 = new FillTransition(Duration.seconds(4), shapes3[1]);
                FillTransition ft3 = new FillTransition(Duration.seconds(4), shapes3[2]);
                ft1.setToValue(Color.GREEN);
                ft2.setToValue(Color.GREEN);
                ft3.setToValue(Color.GREEN);
                ParallelTransition pt = new ParallelTransition();
                pt.getChildren().add(ft1);
                pt.getChildren().add(ft2);
                pt.getChildren().add(ft3);
                pt.play();

                winningRows++;

                int wins = Integer.parseInt(winsText.getText());
                wins = wins + 1;
                winsText.setText(String.valueOf(wins));
            }
        }
        
        //move first row
        TranslateTransition tt1 = new TranslateTransition(Duration.seconds(2), shapes[0]);
        tt1.setToY(100);
        TranslateTransition tt2 = new TranslateTransition(Duration.seconds(2), shapes[1]);
        tt2.setToY(100);
        TranslateTransition tt3 = new TranslateTransition(Duration.seconds(2), shapes[2]);
        tt3.setToY(100);
        
        //move second row
        TranslateTransition tt4 = new TranslateTransition(Duration.seconds(2), shapes2[0]);
        tt4.setToY(190);
        TranslateTransition tt5 = new TranslateTransition(Duration.seconds(2), shapes2[1]);
        tt5.setToY(190);
        TranslateTransition tt6 = new TranslateTransition(Duration.seconds(2), shapes2[2]);
        tt6.setToY(190);
        
        //move third row
        TranslateTransition tt7 = new TranslateTransition(Duration.seconds(2), shapes3[0]);
        tt7.setToY(280);
        TranslateTransition tt8 = new TranslateTransition(Duration.seconds(2), shapes3[1]);
        tt8.setToY(280);
        TranslateTransition tt9 = new TranslateTransition(Duration.seconds(2), shapes3[2]);
        tt9.setToY(280);
        
        //first column moves
        ParallelTransition pt = new ParallelTransition();
        pt.getChildren().add(tt1);
        pt.getChildren().add(tt4);
        pt.getChildren().add(tt7);
        
        //second column moves
        ParallelTransition pt2 = new ParallelTransition();
        pt2.getChildren().add(tt2);
        pt2.getChildren().add(tt5);
        pt2.getChildren().add(tt8);
        
        //third column moves
        ParallelTransition pt3 = new ParallelTransition();
        pt3.getChildren().add(tt3);
        pt3.getChildren().add(tt6);
        pt3.getChildren().add(tt9);
        
        //move all parallel transitions one at a time
        SequentialTransition st = new SequentialTransition(pt, pt2, pt3);
        st.play();
    }
    
    
    /**
     * not used, switches GUI view
     * 
     * @throws IOException if no secondary root
     */
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}

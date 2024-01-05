package com.example.memorygame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    int [][] board;

    int [] pic;

    private int counter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void onNewGame() {
        board = new int[4][4];
        for (int row=0; row < 4; row++)
            for (int col=0; col < 4; col++)
                board[row][col] = new int();
    }
}
package gui;
import java.awt.Dimension;
import java.util.concurrent.SynchronousQueue;

import javax.swing.*;
import life.GameOfLife;
public class Main{
    public static void main(String args[]){
        GameOfLife gol = new GameOfLife(12,12);
        gol.trucDeBase(0);
        JFrame frame = new JFrame("Jeu de la vie");
        frame.setPreferredSize(new Dimension(430, 700));
        GUI panneau = new GUI(gol);
        frame.getContentPane().add(panneau);

        // Buffer buffer = new Buffer();
        SynchronousQueue<GameOfLife> buffer = new SynchronousQueue<GameOfLife>();
        ThreadGen threadGen= new ThreadGen(gol,buffer);
        ThreadGUI threadGui = new ThreadGUI(panneau, buffer);
        threadGen.start();
        threadGui.start();
        int nbGen = 0;
        while(nbGen < 100){
            nbGen = nbGen + 1;
            
            // System.out.println("NEW WAVE n°"+nbGen);
            // gol = buffer.prendre();
            // System.out.println(gol);
           
        }
        // threadGen.stop();
        // threadGui.stop();
        // System.out.print("FINI");
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
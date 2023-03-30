package gui;
import java.util.LinkedList;
import java.util.Queue;

import life.GameOfLife;

public class Buffer {
    Queue<GameOfLife> fifo;
    // GameOfLife gol;
    private boolean dispo = false;

    public Buffer() {
        this.fifo = new LinkedList<GameOfLife>();
    }

    public GameOfLife prendre() {
        System.out.println("prendre");
        while (this.fifo.isEmpty()) {
            try {wait();} catch (InterruptedException e) { }
        }
        System.out.println("prendreFin");
        dispo = false; 
        notifyAll(); 
        return this.fifo.poll();
        // dispo = false; notifyAll(); return gol;
    }

    public void mettre(GameOfLife grille){
        System.out.println("test");

        // while (dispo) {
        //     try {wait();} catch (InterruptedException e) { }
        // }
        // gol = grille;
        this.fifo.add(grille);
        System.out.println("fin mettre");
        // notifyAll();
    }

}

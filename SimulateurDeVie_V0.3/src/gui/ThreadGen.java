package gui;

import life.GameOfLife;
import java.util.concurrent.SynchronousQueue;

public class ThreadGen extends Thread {
    // calculer la prochaine génération et la placer dans le buffer  
    public SynchronousQueue<GameOfLife> buffer;
    public GameOfLife gol; 
    public ThreadGen(GameOfLife gol, SynchronousQueue<GameOfLife> buffer) {
        this.gol = gol;
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while(true){
            gol.prochaineGeneration();
            try {
                buffer.put(gol);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }  
    }
}


package gui;
import life.GameOfLife;
import java.util.concurrent.SynchronousQueue;

public class ThreadGUI extends Thread {
    private GUI board;
    public SynchronousQueue<GameOfLife> buffer;

    public ThreadGUI(GUI board, SynchronousQueue<GameOfLife> buffer) {
        this.board = board;
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while(true){
            System.out.println("avantPrendre");
            this.board.game = buffer.poll();
            System.out.println("aprèsPrendre");
            this.board.repaint();  
            try {
                Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }   
          }  
        }
                    
    }

package life;
import java.util.Arrays;

public class Noeud{
    public int[][] val;
    public boolean isFeuille;
    public Noeud NW, NE, SW, SE;

    public Noeud(){
        this.val = null;
        this.NW = null;
        this.NE = null;
        this.SW = null;
        this.SE = null;
        this.isFeuille = false;
    }

    public Noeud(int[][] val, boolean isFeuille){
        this.val = val;
        this.isFeuille = isFeuille;
        this.NW = null;
        this.NE = null;
        this.SW = null;
        this.SE = null;
    }

    public Noeud(int[][] val, boolean isFeuille, Noeud NW, Noeud NE, Noeud SW, Noeud SE){
        this.val = val;
        this.isFeuille = isFeuille;
        this.NW = NW;
        this.NE = NE;
        this.SW = SW;
        this.SE = SE;
    }

    public void afficheQuad(){
        if (this.isFeuille == true){
            System.out.println(Arrays.deepToString(this.val) + "  ");
        }
        else{
            System.out.println(Arrays.deepToString(this.val) + "  ");
            this.NW.afficheQuad();
            this.NE.afficheQuad();
            this.SE.afficheQuad();
            this.SW.afficheQuad();
        }
    }

    @Override
    public String toString(){
        if(this.NE == null){
            return Arrays.deepToString(this.val);
        }
        return "         " + Arrays.deepToString(this.val) + "\n" + this.NW.toString() + "   " + this.NE.toString() + "   " + this.SW.toString() + "   " + this.SE.toString() + "   ";
    }

    // @Override
    // public String toString() {
    //     String s = "";
    //     s+= this.NW.toStringWithIndent(1);
    //     s+= this.NE.toStringWithIndent(1);
    //     s+= this.SW.toStringWithIndent(1);
    //     s+= this.SE.toStringWithIndent(1);
    //     return s;
    // }

    // public String toStringWithIndent(int depth) {
    //     // same as toString() but with indent
    //     String s = indentFor(depth);
        
    //     s+= indentFor(depth) + this.NW;
    //     s+= indentFor(depth) +  this.NE;
    //     s+= indentFor(depth) +  this.SW;
    //     s+= indentFor(depth) +  this.SE;
    //     return s;
    // }

    // private static String indentFor(int depth) {
    //     StringBuilder b = new StringBuilder(depth);

    //     while(depth-- > 0) {
    //         b.append(" ");
    //     }

    //     return b.toString();
    // }
    
}
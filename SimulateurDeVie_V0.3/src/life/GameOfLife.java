package life;


public class GameOfLife{

    public int[][] grille;
    private int tailleColonne = 4;
    private int tailleLigne = 4;
    Noeud arbre = new Noeud();

    public GameOfLife(int tailleColonne, int tailleLigne){
        this.tailleColonne = tailleColonne;
        this.tailleLigne = tailleLigne;
        this.grille = new int[tailleLigne][tailleColonne];
        this.setupTest();
        this.arbre = this.initQuad(0,0,this.tailleLigne);
    }

    private void setup(){
        // Méthode qui initialise la grille
        for(int i=0; i<this.tailleLigne;i++){
            for(int j=0; j<this.tailleColonne;j++){
                this.grille[i][j] = 0;
            }
        }
    }

    private void setupTest(){
        // Méthode qui initialise la grille
        for(int i=0; i<this.tailleLigne;i++){
            for(int j=0; j<this.tailleColonne;j++){
                this.grille[i][j] = i+j;
            }
        }
    }

    public Noeud initQuad(int i, int j, int taille){
        int firstElem = this.grille[i][j];
        if(taille == 1){
            return new Noeud(this.grille,true);
        }
        for(int row = 0; row<taille; row++){
            // test si toutes les cases sont les mêmes
            // si oui on fait qu'un noeud
            for(int column = 0; column<taille; column++){
                if (this.grille[i+row][j+column] != firstElem){
                    return new Noeud(this.grille[],true);
                }
            }
        }
        Noeud noeud = new Noeud(this.grille, false);
        noeud.NW = initQuad( i, j, taille/2);
        noeud.NE = initQuad( i, j + taille/2, taille/2);
        noeud.SW = initQuad( i + taille/2, j, taille/2);
        noeud.SE = initQuad( i + taille/2, j + taille/2, taille/2);

        return noeud;
        }


    public void setCellule(int x,int y){this.grille[x][y] = 1;}

    public int nbVoisin(int x, int y){
        return 
        this.grille[(x-1+this.tailleLigne)%this.tailleLigne][(y-1+this.tailleColonne)%this.tailleColonne] + 
        this.grille[(x-1+this.tailleLigne)%this.tailleLigne][y] + 
        this.grille[(x-1+this.tailleLigne)%this.tailleLigne][(y+1+this.tailleColonne)%this.tailleColonne] + 

        this.grille[x][(y-1+this.tailleColonne)%this.tailleColonne] + 
        this.grille[x][(y+1+this.tailleColonne)%this.tailleColonne] + 

        this.grille[(x+1+this.tailleLigne)%this.tailleLigne][(y-1+this.tailleColonne)%this.tailleColonne] + 
        this.grille[(x+1+this.tailleLigne)%this.tailleLigne][y] + 
        this.grille[(x+1+this.tailleLigne)%this.tailleLigne][(y+1+this.tailleColonne)%this.tailleColonne];
    }

    public void prochaineGeneration(){
        int[][] grilleRes = new int[this.tailleLigne][this.tailleColonne];
        for(int i=0; i<this.tailleLigne;i++){
            for(int j=0; j<this.tailleColonne;j++){
                int voisin = this.nbVoisin(i, j);
                if(this.grille[i][j] == 1){
                    // La cellule est vivante
                    if(voisin < 2 || voisin > 3){
                        grilleRes[i][j] = 0; 
                    }
                    else{
                        grilleRes[i][j] = 1;
                    }
                }
                else{
                    if(voisin == 3){
                        grilleRes[i][j] = 1;
                    } 
                }                
            }
        }
        this.grille = grilleRes;
    }

    public int hash(){
        return this.toString().hashCode();
    }

    public void trucDeBase(int delta){
        this.setCellule(1+delta,2+delta);
        this.setCellule(2+delta,3+delta);
        this.setCellule(3+delta,1+delta);
        this.setCellule(3+delta,2+delta);
        this.setCellule(3+delta,3+delta);
    }

    @Override
    public String toString(){
        String res = "";
        for(int i=0; i<this.tailleLigne; i++){
            for(int j=0; j<this.tailleColonne; j++){
                if(this.grille[i][j] == 1){
                    res += "■";
                }
                else {
                    res += "□";
                }
                res += " ";
            }
            res += "\n";
        }
        return res;
    }

    public void afficheTest(){
        for(int i=0; i<this.tailleLigne; i++){
            for(int j=0; j<this.tailleColonne; j++){
                System.out.print(this.grille[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        GameOfLife gol = new GameOfLife(5,5);
        gol.trucDeBase(0);
        System.out.print(gol.arbre.NE + "\n");

        // gol.afficheTest();
        // System.out.print(gol.arbre + "\n");

        // int[] t = gol.grille[2];
        // for(int i=0; i<gol.tailleLigne; i++){
        //     System.out.print(t[i]);
        // }
    }

    

}

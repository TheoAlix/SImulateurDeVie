package life;
import java.util.Arrays;

public class QuadTree{
    // Integer[] val;
    // QuadTree fils1, fils2, fils3, fils4;
    // boolean estFeuille;

    // public QuadTree(Integer[] val, QuadTree fils1, QuadTree fils2, QuadTree fils3, QuadTree fils4){
    //     this.val = val;
    //     this.fils1 = fils1;
    //     this.fils2 = fils2;
    //     this.fils3 = fils3;
    //     this.fils4 = fils4;
    //     this.estFeuille = false;
    // }

    // public QuadTree(){
    //     this.val = null;
    //     this.fils1 = null;
    //     this.fils2 = null;
    //     this.fils3 = null;
    //     this.fils4 = null;
    //     this.estFeuille = true;
    // }

    // public QuadTree(Integer[] val){
    //     this.val = val;
    //     this.fils1 = null;
    //     this.fils2 = null;
    //     this.fils3 = null;
    //     this.fils4 = null;
    //     this.estFeuille = true;
    // }

    // public void ajouteQuadTree(Integer val1,Integer val2, Integer val3, Integer val4){
    //     this.fils1 = new QuadTree(val1);
    //     this.fils2 = new QuadTree(val2);
    //     this.fils3 = new QuadTree(val3);
    //     this.fils4 = new QuadTree(val4);
    // }

    // public void afficheQuad(){
    //     if (this.estFeuille == true){
    //         System.out.println(Arrays.deepToString(this.val) + "  ");
    //     }
    //     else{
    //         System.out.println(Arrays.deepToString(this.val) + "  ");
    //         this.fils1.afficheQuad();
    //         this.fils2.afficheQuad();
    //         this.fils3.afficheQuad();
    //         this.fils4.afficheQuad();
    //     }
    // }

    // public static void main(String args[]){

    //     Integer[] nb1 = {0,0,0};//,{1,1,1},{2,2,2}};
    //     Integer[] nb2 = {3,3,3};//,{4,4,4},{5,5,5}};
    //     Integer[] nb3 = {0,0,0};//,{7,7,7},{8,8,8}};
    //     Integer[] nb4 = {9,9,9};//,{10,10,10},{11,11,11}};

    //     QuadTree n1 = new QuadTree(nb1);
    //     QuadTree n2 = new QuadTree(nb2);
    //     QuadTree n3 = new QuadTree(nb3);
    //     QuadTree n4 = new QuadTree(nb4);

    //     // QuadTree n111 = new QuadTree(1222);
    //     // QuadTree n222 = new QuadTree(111);
    //     // QuadTree n333 = new QuadTree(1555);
    //     // QuadTree n444 = new QuadTree(555);

    //     // QuadTree n1111 = new QuadTree(12222);
    //     // QuadTree n2222 = new QuadTree(1111);
    //     // QuadTree n3333 = new QuadTree(15555);
    //     // QuadTree n4444 = new QuadTree(5555);

    //     // QuadTree n11111 = new QuadTree(122222);
    //     // QuadTree n22222 = new QuadTree(11111);
    //     // QuadTree n33333 = new QuadTree(155555);
    //     // QuadTree n44444 = new QuadTree(55555);

    //     // QuadTree n11 = new QuadTree(122,n1,n2,n3,n4);
    //     // QuadTree n22 = new QuadTree(11,n111,n222,n333,n444);
    //     // QuadTree n33 = new QuadTree(155,n1111,n2222,n3333,n4444);
    //     // QuadTree n44 = new QuadTree(55,n11111,n22222,n33333,n44444);

    //     QuadTree q = new QuadTree();
    //     q.fils1 = n1;
    //     q.fils2 = n2;
    //     q.fils3 = n3;
    //     q.fils4 = n4;
    //     q.estFeuille = false;
    //     q.afficheQuad();
    // }

}
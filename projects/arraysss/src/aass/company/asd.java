package aass.company;

public class asd {
    static int n=10;
    void pokemon(bubble p){
        p.input();
        p.bubble_sort();
    }
    void pokemon(floyd g){
        g.pattern();
    }
    public static void main(String[] args){
        asd obj = new asd();
        asd obj2 = new asd();
        bubble b = new bubble(n);
        floyd f = new floyd();
        obj.pokemon(b);
        obj2.pokemon(f);
    }
}

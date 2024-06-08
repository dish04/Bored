package practice;

import java.util.Scanner;

class Fruitjuice {

        int product_code;
        String flavour;
        String pack_type;
        int pack_size;
        int product_price;

    Fruitjuice()
    {
        product_code =0;
        flavour ="";
        pack_type="";
        pack_size=0;
        product_price=0;

    }
     void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter prod");
        product_code= sc.nextInt();
        flavour=sc.next();
        pack_type=sc.next();
        product_price=sc.nextInt();
    }
    void discount()
    {
        product_price-=0.1*product_price;
    }
    void display()
    {
        System.out.println("Size = "+pack_size+"\n Code = "+product_code+"\n Flavour = "+flavour+"\n Type = "+pack_type+"\n PRICE ="+product_price);
    }
    public static void main(String[] args)
    {
        Fruitjuice obj = new Fruitjuice();
        obj.input();
        obj.discount();
        obj.display();
    }
}

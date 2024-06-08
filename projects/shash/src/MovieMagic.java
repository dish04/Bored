import java.util.Scanner;

public class MovieMagic {
    Scanner sc=new Scanner(System.in);
    int year;
    String title;
    float rating;
    MovieMagic(){
        year=0;
        title="";
        rating=0;
    }
    void accept(){
        System.out.println("Enter title");
        title=sc.next();
        System.out.println("Enter year");
        year=sc.nextInt();
        System.out.println("Enter rating");
        rating=sc.nextFloat();
    }
    void display(){
        if(rating<=2.0){
            System.out.println("Flop");
        }
        if(rating>2.0&&rating<=3.4){
            System.out.println("Semi-hit");
        }
        if(rating>3.5&&rating<=4.5){
            System.out.println("Hit");
        }
        if(rating>4.6&&rating<=5.0){
            System.out.println("Super Hit");
        }
    }

    public static void main(String[] args) {
        MovieMagic obj = new MovieMagic();
        obj.accept();
        obj.display();
    }
}

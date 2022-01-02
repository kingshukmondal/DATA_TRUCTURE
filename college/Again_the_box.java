package college;
class Box
{
    public Box(int height, int weight, int depth) {
        this.height = height;
        this.weight = weight;
        this.depth = depth;
    }
    int height,weight,depth;
    int volume()
    {
        int vol=height*weight*depth;
        System.out.println(vol);
        return vol;
    }
}

class Boxweight extends Box
{
    public Boxweight(int height, int width, int depth, int weight) {
        super(height,width,depth);
        this.weight = weight;
    }
    int weight;

    void show()
    {
        super.volume();
        System.out.println("weight ::"+weight);
    }
}

class Boxshipment extends Boxweight
{
    public Boxshipment(int height, int width, int depth, int weight,int price) {
        super(height, width, depth, weight);
        this.price=price;
    }
    int price;
    void show()
    {
        super.show();
        System.out.println(price);
    }

}
public class Again_the_box {

    public static void main(String[] args) {

        new Boxshipment(10,20,20,20,20).show();
    }
}

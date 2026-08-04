public class Box {
    int length;
    int width;
    int height;
    Box(int length , int width , int height)
    {
               this.length = length;
               this.width =width;
               this.height = height;
    }
    double volume()
    {
        return length*width*height;
    }
    
}
class sdemo
{
   public static void main(String[] args) {
    Box o = new Box(2,3,4);
    System.out.println(o.volume());
   }
}

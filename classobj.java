
class Box{
         private int length,breadth,height;
         public  void setDimension(int l,int b,int h)
         {
            length=l;
            breadth=b;
            height=h;
         }
         public static void showDimension()
         {
            // System.out.println("L="+length +" " +"B=" +breadth ) ;
            System.out.println("hello");
            
         }

}




public class classobj {
    public static void main(String[] args)
    {
        //  System.out.println("hello");
        Box smallbox= new Box();
        smallbox.setDimension(10, 20, 30);
        // smallbox.showDimension();
        Box.showDimension();  // static function can be called by class name 
         
    }
}

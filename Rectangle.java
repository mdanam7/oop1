public class Rectangle {
    private int height;
    private int width;
    public int getHeight(){
        return height;
    }
    public void setHeight(int h){
        height=h;
    }
    public int getWidth(){
        return width;
    }
    public void setWidth(int w){
        width=w;
    }
    public Rectangle(){

    }
    public Rectangle(int h,int w)
    {
        height=h;
        width=w;
    }
    public int area(){
        return height*width;
    }
    public int area(int h, int w){
        return h*w;
    }
    public void increaseHeight(){
        height++;
    }
    public void increaseWidth(int amount){
       width+=amount;
    }
    //copy constructor
    public Rectangle(Rectangle r) {
        height = r.getHeight();
        width = r.getWidth();
    }
//use of toString
        public String toString(){
            return "Width"+width+" Height"+height;
        }


}
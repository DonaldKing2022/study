class Rectangle{
    double width;
    double height;
    double computCircum(){
        return 2*(width+height);
    }
    double computArea(){
        return width*height;
    }
    public static void main(String[] args){
        int w=30;
        int h=40;
        Rectangle z=new Rectangle();
        z.width=w;
        z.height=h;
        System.out.println(z.computCircum());
        System.out.println(z.computArea());

    }
}
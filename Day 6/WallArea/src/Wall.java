public class Wall {
    private double width;
    private double height;
    public Wall(){
        System.out.println("Empty Constructor called");
    }
    public Wall(double width, double height){
        this.width=width;
        this.height=height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width<0?0 : width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return width*height;
    }
}

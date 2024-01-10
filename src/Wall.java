public class Wall {
    double width;
    double height;

    public Wall(double width,double height){
        this.width= width;
        this.height = height;
    }

    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }
    public double setWidth(double width2){
        if(width2 > 0){
            this.width = width2;
        }else{
            this.width = 0;
        }
        return this.width;
    }

    public double setHeight(double height2){
        if(height2 > 0){
            this.height = height2;
        }else{
            this.height = 0;
        }
        return this.height;
    }
    public double getArea(){
        return this.width * this.height;
    }
}

class Circle {
    private double radius;
    private String color;

    public Circle(){
        this.radius = 1.0;
        this.color = "red";
    }
    public Circle(double r, String c){
        this.radius = r;
        this.color = c;
    }

    public String getColor(){
        return this.color;
    }
    public void setColor(String c){
        this.color = c;
    }

    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double r){
        this.radius = r;
    }

    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }
}
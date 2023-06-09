class circle{
    private float radius;
    private float area;
    private float perimeter;

    public void setRadius(float r){
        radius = r;
    }
    
    public void setArea(float a){
        if(a == 22*radius*radius/7){
            area = a;
        }
        else{
            System.out.println("WARNING : Wrong area as per radius.");
        }
    }

    public void setPerimeter(float p){
        if(p == 22*2*radius/7){
            perimeter = p;
        }
        else{
            System.out.println("WARNING : Worng perimeter as per radius.");
        }
    }
    public float getArea(){
        return area;
    }
    public float getPerimeter(){
        return perimeter;
    }
    public float getRadius(){
        return radius;
    }
}
public class circle_area{
    public static void main(String[] args) {
        circle obj = new circle();
        obj.setRadius(9.0f);
        obj.setArea(254.571428571429f);
        obj.setPerimeter(56.5714285714286f);
        System.out.println(obj.getRadius());
        System.out.println(obj.getArea());
        System.out.println(obj.getPerimeter());
    }
}

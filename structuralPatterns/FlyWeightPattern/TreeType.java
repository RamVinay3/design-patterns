package structuralPatterns.FlyWeightPattern;

public class TreeType {

    private String color;
    private String type;
    private String texture;

    public TreeType(String color,String type,String texture){
        this.color=color;
        this.texture=texture;
        this.type=texture;

    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public String getTexture() {
        return texture;
    }

    public void draw(double x,double y){
         System.out.println("Drawing " + type + " tree at (" + x + ", " + y + ")"+" having "+color+" leaves");
    }

    
}

package structuralPatterns.FlyWeightPattern;

public class Tree {
    private double x,y;
    TreeType treeType;

    public Tree(double x,double y,String texture,String color,String type){

        this.x=x;
        this.y=y;
        this.treeType=TreeTypeFactory.getTreeType(texture, color, type);

    }

    public void draw(){
        treeType.draw(x, y);

    }

    
    
}

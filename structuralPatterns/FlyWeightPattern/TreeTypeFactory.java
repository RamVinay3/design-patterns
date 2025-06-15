package structuralPatterns.FlyWeightPattern;

import java.util.HashMap;

public class TreeTypeFactory {
    public static HashMap<String,TreeType>treeType=new HashMap<>();

    public static TreeType getTreeType(String texture,String color,String type){

        String key=texture +"-"+color+"-"+type;
        if(treeType.get(key) == null){
            treeType.put(key,new TreeType(color, type, texture));

        }
        return treeType.get(key);

    }
    
}

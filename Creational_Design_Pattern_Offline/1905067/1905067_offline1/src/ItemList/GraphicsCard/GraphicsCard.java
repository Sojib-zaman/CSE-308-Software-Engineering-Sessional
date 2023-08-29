package ItemList.GraphicsCard;

import ItemList.PC_components;

public abstract class GraphicsCard implements PC_components {
    String type = "Added Component" ;
    public String getType()
    {
        return type;
    }
}

import java.util.LinkedList;

public interface PC_Builder {

    public void setProcessor() ;
    public void setBasePrice() ;
    public void setCPU() ;
    public void setMotherboard() ;
    public void setHDD();
    public void setCooler();
    public void setRam(LinkedList<String> ram);
    public void setGraphicsCard(LinkedList<String> graphicsCard);
    public void setDrive() ;
    public PC_Product getfinalproduct() ;
}

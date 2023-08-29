package Observer;

public interface Subject {
    public void register(Subcr_Observer s) ;
    public void remove(Subcr_Observer s) ;
    public void notifyobs() ;
}

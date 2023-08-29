package UsingObs;

public interface User {
    public void OPERATIONAL_to_PARTIALLYDOWN();
    public void OPERATIONAL_to_FULLDOWN();
    public void PARTIALLYDOWN_to_OPERATIONAL();
    public void PARTIALLYDOWN_to_FULLDOWN();
    public void FULLDOWN_to_OPERATIONAL();
    public void FULLDOWN_to_PARTIALLYDOWN();



}

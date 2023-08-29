package problem_1;

public class ImposterAdaptsToCrewmate implements IntCrewmate{

    Imposter imposter ;
    public ImposterAdaptsToCrewmate( Imposter imposter)
    {
        this.imposter =  imposter ;
    }
    @Override
    public void electrical() {
        imposter.fake_electrical();
    }

    @Override
    public void trash() {
        imposter.fake_trash();
    }

    @Override
    public void admin_card() {
        imposter.fake_admincard();
    }

    @Override
    public void medscan() {
        imposter.fake_scan();
    }
}

package lo_inheritance.monsters;

public class Lucky extends Monster
{
    private String benefit;

    public Lucky(String sName, int nScare, int nSpeed, String sBenefit)
    {
        super(sName,nSpeed, nScare);
        this.benefit = sBenefit;
    }

    public Lucky(String sName, int nScare, int nSpeed)
    {
        this(sName, nScare,nSpeed, "None");
    }

    @Override
    public boolean isDeadly()
    {
        return false;
    }

    @Override
    public String consumes()
    {
        return "Ale";
    }

    public String getBenefit()
    {
        return benefit;
    }

    public void setBenefit(String benefit)
    {
        this.benefit = benefit;
    }

    @Override
    public String toString()
    {
        return String.format("Lucky: %s  Benefit: %s", super.toString(), this.benefit);
    }




}

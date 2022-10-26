package methodoverriding24;

public class AXIS extends Bank {
    @Override
    public int getRateOfInterest() {
        return 9;
    }

    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        System.out.println("SBI rate of interest:"+s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest:"+i.getRateOfInterest());
        System.out.println("AXIS Rate Of INterest:"+a.getRateOfInterest());


    }
}

import java.util.Scanner;
public class Inchiriere {

    private String Contract;
    private int Ore;
    private int Minute;
    private int pretTotal;

    public static final int pretPerOra() {
        int pretOra = 40;
        return pretOra;
    }

    public static final int pretPerMinut() {
        int pretMinut = 1;
        return pretMinut;
    }

    public Inchiriere(String nrContract, int nrOre, int nrMinute) {
        Contract = nrContract;
        Ore = nrOre;
        Minute = nrMinute;
    }

    public void setContract(String a) {
        a = Contract;
    }

    public String getContract() {
        return Contract;
    }

    public void setMinute(int b) {
        b = Minute;
    }

    public int getMinute() {
        return Minute;
    }

    public void setNumarOreInchiriere(int c) {
        c = Ore;
    }

    public int getNumarOreInchiriere() {
        return Ore;
    }
    public int getPretTotal() {
        int numarulDeOre = Minute / 60;
        int nrMinutee = Minute % 60;
        pretTotal = Ore * pretPerOra() + numarulDeOre * pretPerOra() + nrMinutee * pretPerMinut();
        return pretTotal;
    }
}

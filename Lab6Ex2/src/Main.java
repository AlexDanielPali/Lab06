import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Inchiriere achizitie1 =  new Inchiriere("Inchiriere",2, 100);
        Inchiriere achizitie2 =  new Inchiriere(numereContracte(), numereOre(), numereMinute());
        achizitie1 = getData(achizitie1);
        achizitie2 = getData(achizitie2);
        System.out.println("Info achizitie1: ");
        System.out.print("\nNumarul contractului: " + achizitie1.getContract() + "\nNumarul orelor: " + achizitie1.getNumarOreInchiriere() +
                "\nNumarul minutelor: " + achizitie1.getMinute() + "\nPret total: " + achizitie1.getPretTotal());

        System.out.println("\n\nInfo achizitie1: ");
        System.out.print("\nNumarul contractului: " + achizitie2.getContract() + "\nNumarul orelor: " + achizitie2.getNumarOreInchiriere() +
                "\nNumarul minutelor: " + achizitie2.getMinute() + "\nPret total: " + achizitie2.getPretTotal());
    }
    public static Inchiriere getData(Inchiriere detalii)
    {
        String nrContract = "";
        int nrOre = 0;
        int nrMinute= 0;
        detalii.setContract(nrContract);
        detalii.setNumarOreInchiriere(nrOre);
        detalii.setMinute(nrMinute);
        detalii.getPretTotal();
        return detalii;
    }

    public static int numereMinute() {
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Introdu numarul de minute pentru achizitia numarului 2  >>> ");
        return inputDevice.nextInt();
    }

    public static int numereOre() {
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Introdu numarul de ore pentru achizitia numarului 2  >>> ");
        return inputDevice.nextInt();
    }

    public static String numereContracte() {
        Scanner numarCtr = new Scanner(System.in);
        System.out.println("Introdu numarul contractului pentru achizitia numarulului 2 >>> ");
        return numarCtr.nextLine();
    }
}
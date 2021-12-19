import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        Laiteosa letsBuildAComputer = new Emolevy();
        letsBuildAComputer.addToList(new Prosessori());
        letsBuildAComputer.addToList(new Muistipiiri());

        letsBuildAComputer.getNimi();
        System.out.println(decimalFormat.format(letsBuildAComputer.getHinta()));

        Laiteosa letsBuildAnotherComputer = new Kotelo();
        letsBuildAnotherComputer.addToList(new Naytonohjain());
        letsBuildAnotherComputer.addToList(new Verkkokortti());

        letsBuildAnotherComputer.getNimi();
        System.out.println(decimalFormat.format(letsBuildAnotherComputer.getHinta()));
    }
}

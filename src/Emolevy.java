import java.util.ArrayList;

public class Emolevy  implements Laiteosa {

    String nimi = "emolevy";
    float hinta = 499;

    private ArrayList<Laiteosa> laiteosaList = new ArrayList<>();

    public Emolevy(){

    }

    @Override
    public String getNimi() {
        System.out.println("laite koostuu seuraavista osista: \n" + this.nimi);
        for (Laiteosa laiteosa : laiteosaList) {
            System.out.println(laiteosa.getNimi());
        }
        return "";
    }

    @Override
    public float getHinta() {
        float sum = this.hinta;
        for (Laiteosa laiteosa : laiteosaList) {
            sum += laiteosa.getHinta();
        }
        return sum;
    }

    public void addToList(Laiteosa laiteosa) {
        this.laiteosaList.add(laiteosa);
    }

}

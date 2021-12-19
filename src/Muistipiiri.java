public class Muistipiiri implements Laiteosa {

    @Override
    public String getNimi() {
        return "muistipiiri";
    }

    @Override
    public float getHinta() {
        return 120;
    }

    @Override
    public void addToList(Laiteosa o) {
        System.out.println(this.getNimi()+" isn't meant to handle that kind of operation" +
                "so we can't add "+o.getNimi()+" anywhere...");
    }
}

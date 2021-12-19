public class Verkkokortti implements Laiteosa {

    @Override
    public String getNimi() {
        return "verkkokortti";
    }

    @Override
    public float getHinta() {
        return 325.7F;
    }

    @Override
    public void addToList(Laiteosa o) {
        System.out.println(this.getNimi()+" isn't meant to handle that kind of operation" +
                "so we can't add "+o.getNimi()+" anywhere...");
    }
}

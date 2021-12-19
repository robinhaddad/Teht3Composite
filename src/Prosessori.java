public class Prosessori implements Laiteosa {

    @Override
    public String getNimi() {
        return "prosessori";
    }

    @Override
    public float getHinta() {
        return 250.5F;
    }

    @Override
    public void addToList(Laiteosa o) {
        System.out.println(this.getNimi()+" isn't meant to handle that kind of operation" +
                "so we can't add "+o.getNimi()+" anywhere...");
    }
}

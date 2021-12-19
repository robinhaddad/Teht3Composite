public class Naytonohjain implements Laiteosa {

    @Override
    public String getNimi() {
        return "näytönohjain";
    }

    @Override
    public float getHinta() {
        return 427.9F;
    }

    @Override
    public void addToList(Laiteosa o) {
        System.out.println(this.getNimi()+" isn't meant to handle that kind of operation" +
                "so we can't add "+o.getNimi()+" anywhere...");
    }
}

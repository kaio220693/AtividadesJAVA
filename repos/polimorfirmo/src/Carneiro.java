public class Carneiro extends Animal{
    public Carneiro(){
        this.nome = "shaun";
        this.numeroPatas = 4;
    }

    @Override
    public void som() {
        System.out.println("BÈRÈRÈ");
    }
}

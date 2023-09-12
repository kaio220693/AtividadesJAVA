public class Zoo {
    public static void main(String[] args) {
        Vaca mimosa = new Vaca();
        Gato bichano = new Gato();
        Carneiro shaun = new Carneiro();

        Animal bichos [] = {mimosa, bichano, shaun};

        for(Animal animal : bichos){
            System.out.println(animal.nome + " È da classe " + animal.getClass().getName() +
                    " tem " + animal.numeroPatas + " patas e faz ");
            animal.som();
            System.out.println("=================================================================");
        }
    }
}

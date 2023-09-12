public class TesteAula03 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("pong", 4321,5);
        Pessoa pessoa2 = new Pessoa("kaio",1234);
        Pessoa pessoa3 = new Pessoa("carlos", 9874);

        aluno1.quemSouEu();
        pessoa2.falarNome();
    }
}

public class Digitos {
    private int digito;

    public void setDigito(int novoDigito) {
        digito = novoDigito;
    }

    public int getDigitos() {
        for (int i = 0; i < digito; i++) {
            System.out.print(digito + " ");
        }
        return digito;
    }
}
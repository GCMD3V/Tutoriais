public class RepeticaoFOR {
    public static void main(String[] args) {
        // for(<variavelDeContagem>;<boleanoDeContagem>;<incremento>) { <codigo aqui> }

        // for (int i = 0; i < 10; i++) {
        //     System.out.println(i);
        // }

        int boisNoPasto = 99;
        int contagem = 0;

        // for (int i = 0; boisNoPasto >= 1; i++) {
        //     boisNoPasto--;
        //     contagem++;
        // }

        // System.out.println(contagem);

        for (;boisNoPasto >= 1;) {
            boisNoPasto--;
            contagem++;
        }

        System.out.println(contagem);
    }
}

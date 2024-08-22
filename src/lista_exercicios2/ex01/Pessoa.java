package lista_exercicios2.ex01;

public class Pessoa {
    private String nome;
    private String profissao;
    private int ano_nascimento;

    public void idadePessoa(int ano_nascimento, int ano_atual){
        int idade = ano_atual - ano_nascimento;
        int cont  = 0;
        for(int i = ano_nascimento; i <= ano_atual; i++ ){
            if ( i % 4 == 0) {
                // Se o ano é divisível por 100, ele deve ser divisível por 400 também
                if (i % 100 == 0) {
                    if (i % 400 == 0){
                        cont ++;
                    }
                } else {
                    cont ++;
                }
            } else {
                cont = cont;
            }
        }
        System.out.println("Idade:" + idade +"\nNumero de anos bissexto vivdos:" + cont);

    }

}

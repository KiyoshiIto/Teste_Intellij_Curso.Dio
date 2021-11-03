package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {

        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro1 = new Livro("O andar do Bebado",300);
        System.out.println(livro1);
/*        int a = 1;
        int b = 5;

        System.out.println("Hello Word!" + (a+b));*/



    }
}
    class Livro{
        private String nome;
        private Integer NumPag;

        public Livro(String nome, Integer numPag) {
            this.nome = nome;
            NumPag = numPag;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Integer getNumPag() {
            return NumPag;
        }

        public void setNumPag(Integer numPag) {
            NumPag = numPag;
        }

        @Override
        public String toString() {
            return "Livro{" +
                    "nome='" + nome + '\'' +
                    ", NumPag=" + NumPag +
                    '}';
        }
    }
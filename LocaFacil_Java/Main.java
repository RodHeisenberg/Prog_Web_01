// Exemplo didatico de Programacao Orientada a Objetos
// LocaFacil - Professor Rodrigo Moreira
// Todos os valores e personagens sao ficticios.

class Cliente {
    String nome;

    Cliente(String nome) {
        this.nome = nome;
    }
}

class Equipamento {
    String codigo;
    String descricao;
    double valorDiaria;
    boolean disponivel;

    Equipamento(String codigo, String descricao, double valorDiaria) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valorDiaria = valorDiaria;
        this.disponivel = true;
    }

    boolean alugar() {
        if (!disponivel) {
            return false;
        }
        disponivel = false;
        return true;
    }

    void devolver() {
        disponivel = true;
    }
}

class Locacao {
    Cliente cliente;
    Equipamento equipamento;
    int dias;

    Locacao(Cliente cliente, Equipamento equipamento, int dias) {
        this.cliente = cliente;
        this.equipamento = equipamento;
        this.dias = dias;
    }

    double calcularValor() {
        return equipamento.valorDiaria * dias;
    }
}

public class Main {
    public static void main(String[] args) {
        // 1. Criando a cliente
        Cliente ana = new Cliente("Ana Souza");

        // 2. Criando equipamentos a partir da mesma classe
        Equipamento projetor = new Equipamento(
            "EQ-101", "Projetor LED", 80.0
        );
        Equipamento notebook = new Equipamento(
            "EQ-102", "Notebook Dell", 120.0
        );

        // 3. Criando a locacao de tres dias
        Locacao locacao = new Locacao(ana, projetor, 3);

        // 4. Exibindo as informacoes da locacao
        System.out.println("Cliente: " + ana.nome);
        System.out.println("Equipamento: " + projetor.descricao);
        System.out.printf("Diaria: R$ %.2f%n", projetor.valorDiaria);
        System.out.println("Dias: " + locacao.dias);

        // 5. Calculando o valor
        System.out.printf("Valor previsto: R$ %.2f%n", locacao.calcularValor());

        // 6. Alterando o estado do equipamento com o metodo alugar()
        projetor.alugar();
        System.out.println(
            "Status apos alugar: " +
            (projetor.disponivel ? "disponivel" : "alugado")
        );

        // 7. Devolvendo o equipamento
        projetor.devolver();
        System.out.println(
            "Status apos devolver: " +
            (projetor.disponivel ? "disponivel" : "alugado")
        );

        // Desafio para estudantes:
        // Troque projetor por notebook na criacao da locacao.
        // Modifique o valor da diaria e a quantidade de dias.
        // Execute novamente para comparar o resultado.
    }
}

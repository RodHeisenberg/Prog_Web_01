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
        if (!disponivel) return false;
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
        Cliente ana = new Cliente("Ana Souza");
        Equipamento projetor = new Equipamento("EQ-101", "Projetor LED", 80.0);
        Equipamento notebook = new Equipamento("EQ-102", "Notebook Dell", 120.0);
        Locacao locacao = new Locacao(ana, projetor, 3);

        System.out.println("Cliente: " + ana.nome);
        System.out.println("Equipamento: " + projetor.descricao);
        System.out.printf("Diária: R$ %.2f%n", projetor.valorDiaria);
        System.out.println("Dias: " + locacao.dias);
        System.out.printf("Valor previsto: R$ %.2f%n", locacao.calcularValor());
        projetor.alugar();
        System.out.println("Status após alugar: " + (projetor.disponivel ? "disponível" : "alugado"));
        projetor.devolver();
        System.out.println("Status após devolver: " + (projetor.disponivel ? "disponível" : "alugado"));
    }
}

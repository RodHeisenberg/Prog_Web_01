# LocaFácil | Exemplo de orientação a objetos em Java

Material didático de autoria do **Professor Rodrigo Moreira**.

Este projeto apresenta os conceitos iniciais de **classes, objetos, atributos, métodos e relacionamento entre objetos**, com um cenário fictício de locação de equipamentos.

## Como executar

1. Acesse [OneCompiler Java](https://onecompiler.org/java).
2. Abra `Main.java` neste repositório, copie o conteúdo e cole no editor do OneCompiler.
3. Clique em **Run**.

Se preferir executar no computador com Java JDK instalado:

```bash
javac Main.java
java Main
```

## O que observar

- `Cliente`, `Equipamento` e `Locacao` são classes.
- `ana`, `projetor` e `notebook` são referências a objetos.
- Atributos guardam informações, como `valorDiaria` e `disponivel`.
- Métodos executam comportamentos, como `alugar()`, `devolver()` e `calcularValor()`.

## Prática proposta

Altere no método `main`:

- O valor da diária do projetor de `80.0` para `90.0`.
- A quantidade de dias da locação de `3` para `4`.
- Execute novamente e verifique o total: **R$ 360,00**.
- Como desafio extra, use o objeto `notebook` em vez do `projetor`.

> Uso educacional. Os nomes, equipamentos e valores são fictícios. Para operações financeiras reais, prefira tipos apropriados para valores decimais, como `BigDecimal`.

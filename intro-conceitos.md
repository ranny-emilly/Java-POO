# Introdução à Programação Orientada a Objetos (POO) em Java

## Classe

Uma **classe** é um molde (ou modelo) usado para criar objetos.

Ela define:

- **Atributos** → características (dados)
- **Métodos** → comportamentos (ações)

Exemplo:

```java
class Conta {
    double saldo;
}
```

Neste caso, Conta é apenas uma definição.
Nenhum objeto ainda foi criado.

## Objeto

Um **objeto** é uma instância de uma classe criada na memória.

Criamos objetos com a palavra-chave new.

```java
Conta c1 = new Conta();
```

Representação na memória:

c1 ----> Conta
          saldo = 0
## Atributos

**Atributos** são as propriedades ou dados que um objeto possui.

Exemplo:
```java
class Conta {
    double saldo;
    int numero;
}
```

Cada objeto terá seus próprios valores:
```java
Conta A
saldo = 500
numero = 1

Conta B
saldo = 1000
numero = 2
```

## Métodos

**Métodos** são funções definidas dentro de uma classe que descrevem o comportamento dos objetos.

Exemplo:

```java
class Conta {

    double saldo;

    void deposita(double valor) {
        saldo += valor;
    }

}
```

Uso:

```java
Conta c1 = new Conta();
c1.deposita(100);
```

### Método com retorno

Um método também pode **retornar um valor***.

Exemplo: verificar se uma transferência foi realizada com sucesso.

```java
boolean transfere(double valor, Conta destino) {

    if (this.saldo >= valor) {
        this.saldo -= valor;
        destino.saldo += valor;
        return true;
    }

    return false;
}
```

Uso:

```java
boolean sucesso = c1.transfere(100, c2);
```

## Referências de objetos

Em Java, variáveis de objetos guardam **referências para objetos na memória**, não os objetos diretamente.

Exemplo:

```java
Conta c1 = new Conta();
Conta c2 = c1;
```

Representação:

c1 ---- > Conta
       
c2 ---- > Conta

Ambas as variáveis apontam para o mesmo objeto.

Comparação de objetos

O operador == compara referências, ou seja, verifica se duas variáveis apontam para o mesmo objeto na memória.

Exemplo:
```java
Conta c1 = new Conta();
Conta c2 = new Conta();

System.out.println(c1 == c2);
```
Resultado:

false

Porque são objetos diferentes.

Exemplo onde retorna true:
```java
Conta c1 = new Conta();
Conta c2 = c1;

System.out.println(c1 == c2);
```

Resultado:

true
Analogia com C

Classe em Java pode ser comparada a uma struct em C:
```c
struct Conta {
    double saldo;
};
```

Porém, em Java, variáveis de objetos funcionam de forma semelhante a ponteiros, pois armazenam referências para objetos na memória.

Resumo conceitual
Conceito	Descrição
Classe	Molde que define atributos e métodos
Objeto	Instância criada a partir da classe
Atributo	Propriedade do objeto
Método	Função que define comportamento
new	Cria um objeto na memória
==	Compara referências de objetos
Conexão conceitual (Matemática)

Podemos pensar em termos de conjuntos:

Classe → conjunto de objetos possíveis

Objeto → elemento do conjunto

Exemplo:

Conta = {todas as contas possíveis}

c1 ∈ Conta

---

# LiGeSem

Linguagem que gerência as diciplinas, de Bacharelado em Ciência da Computação, que você está inscrito em um perfil.

Aluno: Ruan Crysthian Lima Ferraz - RA: 790866

## Dependências
OpenJDK >= 17.0.7

Antlr4

Maven >= 3.6.3

## Build

Gerar o *.jar*:

```
mvn package
```

Será gerado o seguinte arquivo na pasta target: ```ligesem-1.0-SNAPSHOT.jar```

Para executá-lo será preciso de duas depêndecias:

1. Arquivo de entrada

`EXEMPLO`

```
nome: "Ruan"
universidade: "UFSCar"
perfil: 7
data: 27/08/2023

DISCIPLINA
DEVOPS, "Auri", 6, "Optativa de linha";
END_DISCIPLINA

DISCIPLINA
CONSTRUCAO DE COMPILADORES, "Lucredio", 6, "Obrigatória";
END_DISCIPLINA

DISCIPLINA
APRENDIZADO DE MAQUINA 1, "Murilo Naldi", 6, "Optativa de Linha";
END_DISCIPLINA

DISCIPLINA
METODOLOGIA CIENTIFICA, "Heloisa", 6, "Obrigatória";
END_DISCIPLINA

DISCIPLINA
REDES, "Paulo Matias", 6, "Obrigatória";
END_DISCIPLINA
```

2. Arquivo de saída com extensão `.html`

`EXEMPLO`

<img src="./casos-de-teste/Screenshot%20from%202023-08-27%2014-47-06.png">


### Como executar

```
java -jar "/home/ruan/Ufscar/ligesem/ligesem/target/ligesem-1.0-SNAPSHOT-jar-with-dependencies.jar" <entrada> <saida>
```


```
java -jar "/home/ruan/Ufscar/ligesem/ligesem/target/ligesem-1.0-SNAPSHOT-jar-with-dependencies.jar" /home/ruan/Ufscar/ligesem/casos-de-teste/teste1.txt teste.html
```

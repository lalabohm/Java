# DataSet Project

## Descrição

Este projeto Java implementa uma estrutura simples de dados chamada `DataSet`, que pode ser usada para agregar e manipular objetos que implementam a interface `Measurable`. O objetivo é fornecer uma maneira genérica de armazenar, somar e encontrar o máximo de um conjunto de itens que possuem uma medida específica.

## Estrutura do Projeto

O projeto é composto pelos seguintes componentes principais:

- **Interface `Measurable`**: Define um contrato para qualquer objeto que tenha uma medida. Qualquer classe que implemente esta interface deve fornecer a implementação do método `getMeasure()`.

- **Classe `Coin`**: Uma implementação da interface `Measurable`, representando uma moeda com um valor específico. O valor da moeda é retornado pelo método `getMeasure()`.

- **Classe `DataSet`**: Armazena uma coleção de objetos `Measurable`, permitindo calcular a soma total das medidas, bem como determinar o item com a maior medida.

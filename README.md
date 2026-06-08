# Bertoti 💻
Repositório destinado às atividades realizadas durante as aulas de Engenharia de Software III ministradas pelo professor Giuliano Bertoti.

## 📝 Descrição
O principal objetivo da matéria é compreender e aprender a aplicar padrões de projeto no código, para otimizar a performance e reduzir possíveis erros. Padrões estudados:

- **Observer:** Sistema de alerta
- **Strategy:** Separação dos métodos em sua própria classe

## ✅ Atividades realizadas
Para cada padrão, criei dois códigos em Java dentro de um mesmo cenário — um utilizando o padrão e outro sem utilizá-lo. Dessa forma, foi possível analisar as diferenças entre cada abordagem e concluir as vantagens do uso de cada padrão.

### 🔔 Padrão Observer
**Cenário:** Sistema de notificações para placar de jogo

Vantagens do uso:
- Baixo acoplamento entre o objeto observado e seus observadores, facilitando manutenção e extensão do código
- Novos observadores podem ser adicionados sem modificar a classe principal
- As notificações ocorrem automaticamente sempre que há uma mudança de estado, eliminando a necessidade de verificações manuais
- Facilita a reutilização dos observadores em outros contextos

### 🧩 Padrão Strategy
**Cenário:** Sistema de desconto que aplica diferentes cupons a determinada compra

Vantagens do uso:
- Elimina o uso excessivo de condicionais (`if/else` ou `switch`) para selecionar comportamentos
- Cada estratégia fica isolada em sua própria classe, tornando o código mais organizado e legível
- Novas estratégias podem ser adicionadas sem alterar o código existente, seguindo o princípio Open/Closed
- Facilita a realização de testes unitários, pois cada estratégia pode ser testada de forma independente

## 📁 Estrutura de pastas
```
bertoti
│
├── observer
│   ├── antipadrao
│   └── padrao
│
└── strategy
    ├── antipadrao
    └── padrao
```

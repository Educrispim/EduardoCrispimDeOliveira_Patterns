# Atividade: Abstract Factory

## Contexto
Você está desenvolvendo uma aplicação de UI que suporta diferentes temas (Claro e Escuro). Cada tema possui componentes relacionados (Botão, Caixa de Texto, Checkbox) que devem ser visualmente consistentes entre si.

## Instruções

### Parte 1: Criar as Interfaces dos Componentes
1. Crie interfaces para cada tipo de componente:
   - `Button` com método `render(): void`
   - `TextField` com método `render(): void`
   - `Checkbox` com método `render(): void`

### Parte 2: Implementar Componentes Concretos
1. Para o **tema Claro**, crie:
   - `LightButton`, `LightTextField`, `LightCheckbox`
   - Cada um deve imprimir sua renderização com estilo claro

2. Para o **tema Escuro**, crie:
   - `DarkButton`, `DarkTextField`, `DarkCheckbox`
   - Cada um deve imprimir sua renderização com estilo escuro

### Parte 3: Implementar as Abstract Factories
1. Crie uma interface `UIComponentFactory` com métodos:
   - `createButton(): Button`
   - `createTextField(): TextField`
   - `createCheckbox(): Checkbox`

2. Implemente duas factories concretas:
   - `LightThemeFactory`
   - `DarkThemeFactory`

### Parte 4: Utilizar o Pattern
1. Crie uma classe `Application` que recebe uma factory
2. Implemente um método que cria todos os componentes usando a factory
3. Demonstre a criação de uma interface completa com tema claro e depois com tema escuro

## Requisitos
- Manter consistência entre componentes do mesmo tema
- Ser fácil adicionar novos temas sem modificar código existente
- Usar polimorfismo para trabalhar com diferentes temas

## Exemplo de Saída Esperada
```
=== Tema Claro ===
Renderizando Botão com fundo branco
Renderizando Caixa de Texto com borda cinza clara
Renderizando Checkbox com tema claro

=== Tema Escuro ===
Renderizando Botão com fundo cinza escuro
Renderizando Caixa de Texto com borda cinza escura
Renderizando Checkbox com tema escuro
```
## Fase 1
Criar uma SPA usando ClojureScript e re-frame contendo 3 componentes: 1 contador, 1 botão reset, e 1 botão de increment
1. **Configuração Inicial**:  
   - Criando o projeto:  
     ```bash
     npx create-cljs-project buzzlabs-contador
     ```
   - Adicionando as dependências em `shadow-cljs.edn`:  
     ```clojure
     :dependencies [[reagent "1.3.0"]
                    [re-frame "1.4.3"]
                    [binaryage/devtools "1.0.7"]
                    [day8.re-frame/re-frame-10x "1.10.0"]]]
     ```
   - Iniciando o server:  
     ```bash
     npx shadow-cljs watch app
     ```

2. **[Título do próximo passo]**  
   - [Descrição ou comandos]
## Fase 2
Backend 3 endpoints, get Counter (0), inc(), reset()

## Fase 3
Persistir o contador no datomic

## Opcional: 
ClojureSpec para validação de Dados

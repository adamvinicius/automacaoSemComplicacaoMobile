#language:pt

Funcionalidade: Pagamento

  Contexto:
    Dado que esteja na página de login
    Quando for realizado login com os seguintes dados
      | email | teste@chronosacademy.com.br |
      | senha | 123456                      |
    Entao valido que exibe a tela produtos

  @CompraCurso
  Cenario: Realizar compra de curso
    Quando seleciono o pacote de cursos
    E clico em ir para pagamento
    E seleciono a opcao cartao de credito
    E realizo a compra com os seguintes dados
      | numeroCartao | 5123836746866019 |
      | vencimento   | 11/2024          |
      | cvv          | 177              |
      | nomeTitular  | Chronos          |
      | cpfTitular   | 53388925020      |
    Entao valido que foi exibido a mensagem "Pagamento Realizado!"

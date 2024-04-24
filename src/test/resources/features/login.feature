#language:pt

Funcionalidade: Login

  Cenario: Realizar login válido
    Dado que esteja na página de login
    Quando for realizado login com os seguintes dados
      | email | teste@chronosacademy.com.br |
      | senha | 123456                      |
    Entao valido que exibe a tela produtos

  Esquema do Cenario: Realizar login <cenario>
    Dado que esteja na página de login
    Quando for realizado login com os seguintes dados
      | email | <email> |
      | senha | <senha> |
    Entao valido que no campo erro email exibe a mensagem "<msg>"
    Exemplos:
      | cenario             | email   | senha  | msg                             |
      | com email inválido  | teste   | 123456 | O email não é válido.           |
      | com email em branco | [blank] | 123456 | O campo de email é obrigatório. |


  Esquema do Cenario: Realizar login <cenario>
    Dado que esteja na página de login
    Quando for realizado login com os seguintes dados
      | email | <email> |
      | senha | <senha> |
    Entao valido que no campo erro senha exibe a mensagem "<msg>"

    Exemplos:
      | cenario             | email                       | senha   | msg                                      |
      | com senha inválida  | teste@chronosacademy.com.br | 123     | A senha deve ter no mínimo 6 caracteres. |
      | com senha em branco | teste@chronosacademy.com.br | [blank] | O campo de senha é obrigatório.          |

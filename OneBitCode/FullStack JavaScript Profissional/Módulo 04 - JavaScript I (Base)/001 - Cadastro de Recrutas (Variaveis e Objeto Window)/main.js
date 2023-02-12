let nome, sobrenome, areaEstudo, anoNascimento

nome = window.prompt("Insira o seu nome:")
sobrenome = window.prompt("Insira o seu sobrenome:")
areaEstudo = window.prompt("Qual sua área de estudo?")
anoNascimento = window.prompt("Qual seu ano de nascimento?")

window.alert(
  "Nome Completo: " + nome + " " + sobrenome +
  "\nCampo de Estudo: " + areaEstudo +
  "\nIdade: " + (2022 - anoNascimento)
)
let ranking = calculaRanking(54, 11)
let nivel = " "

function calculaRanking(vitorias, derrotas){
    let calculo = vitorias - derrotas
    return calculo
}
if(ranking <= 10)
    nivel = "Ferro"
if(ranking >= 11 && ranking <= 20)
    nivel = "Bronze"
if(ranking >= 21 && ranking <= 50)
    nivel = "Prata"
if(ranking >= 51 && ranking <= 80)
    nivel = "Ouro"
if(ranking >= 81 && ranking <= 90)
    nivel = "Diamante"
if(ranking >= 91 && ranking <= 100)
    nivel = "Lendário"
if(ranking >= 101)
    nivel = "Radiante"

console.log("O herói tem o saldo de " + ranking + " está no nível de " + nivel)



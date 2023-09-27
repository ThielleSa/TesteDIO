let rankeadas = calculaRanking(24, 3)
let nivel = " "

function calculaRanking(vitorias, derrotas){
    let calculo = vitorias - derrotas
    return calculo
}
if(rankeadas <= 10)
    nivel = "Ferro"
if(rankeadas >= 11 && rankeadas <= 20)
    nivel = "Bronze"
if(rankeadas >= 21 && rankeadas <= 50)
    nivel = "Prata"
if(rankeadas >= 51 && rankeadas <= 80)
    nivel = "Ouro"
if(rankeadas >= 81 && rankeadas <= 90)
    nivel = "Diamante"
if(rankeadas >= 91 && rankeadas <= 100)
    nivel = "Lendário"
if(rankeadas >= 101)
    nivel = "Radiante"

console.log("O herói tem o saldo de " + rankeadas + " está no nível de " + nivel)



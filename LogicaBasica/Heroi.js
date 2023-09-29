class Heroi{
    constructor(nome, idade, tipo){
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }
    atacar(){
        this.definirAtaque();
        console.log(`O ${this.tipo} atacou usando ${ataque}`)
    }
    definirAtaque(){
        globalThis.ataque = "";
        if(this.tipo === "mago"){
            ataque = "magia";
        }else if(this.tipo === "guerreiro"){
            ataque = "espada";
        }else if(this.tipo === "monge"){
            ataque = "artes marciais";
        }else if(this.tipo === "ninja"){
            ataque = "suriken";
        }
    }
}
let personagem1 = new Heroi("Maria", 20, "guerreiro");
let personagem2 = new Heroi("João", 18, "mago");
personagem1.atacar();
personagem2.atacar();


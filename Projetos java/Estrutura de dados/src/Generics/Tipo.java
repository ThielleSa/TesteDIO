package Generics;
//Evita casting excessivo, códigos redundantes, erros na fase de compilação
/* T -> identifica o tipo (type), K -> é a chave (key), V -> é o valor (value), E -> é o elemento 
(element) e ? -> quando é genérico */

public class Tipo<T>{
    private T t;

    public void set(T t){
        this.t = t;
    }
    public T get(){
        return t;
    }
    
}

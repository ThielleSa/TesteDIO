package com.example;

public class Conexao {
    public static void main(String[] args) {
        try{
           Class.forName("com.postgresql.jdbc.Driver");
        }catch(ClassNotFoundException e){
            System.out.println("Drive não localizado");
        }

    }
}
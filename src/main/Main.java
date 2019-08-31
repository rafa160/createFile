package main;

import main.Usuario;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int resposta = 1;
        String idade;
        String nome;
        String endereco;
        String cont;

        Scanner ler = new Scanner(System.in);
        Usuario user = new Usuario();

        while(resposta == 1){
            System.out.println("Informe seu nome");
            nome = ler.nextLine();
            System.out.println("Infome sua idade");
            idade = ler.nextLine();
            System.out.println("Qual seu endereco");
            endereco = ler.nextLine();

            user.setNome(nome);
            user.setIdade(idade);
            user.setEndereco(endereco);

            escrever(user);

            System.out.println("Deseja atualizar o Usuario? [Sim] - 1  [Nao] - 0");
            resposta = ler.nextInt();

        }


    }
    private static void escrever(Usuario user) {
        File dir = new File("/home/rafa160/Downloads/pastaArquivo");
        File arq = new File(dir, "User.txt");

        try {

            arq.createNewFile();

            FileWriter fileWriter = new FileWriter(arq, false);

            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.println("|------------------------------------|");
            printWriter.println("|Nome: " + user.getNome());
            printWriter.println("|Idade: " + user.getIdade() + " anos");
            printWriter.println("|Endereco: " + user.getEndereco());
            printWriter.println("|------------------------------------|");

            printWriter.flush();

            printWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileReader fileReader = new FileReader(arq);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linha = "";

            List result = new ArrayList();

            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
                if (linha != null && !linha.isEmpty()) {
                    result.add(linha);
                }
            }
            fileReader.close();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

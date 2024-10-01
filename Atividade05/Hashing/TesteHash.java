package hashing;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class TesteHash {

   public static void main(String args []) throws NoSuchAlgorithmException,
   UnsupportedEncodingException {
	   
	   Scanner entrada = new Scanner(System.in);
	   System.out.println("Digite seu nome: ");
	   String nome = entrada.nextLine();

       MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
       byte messageDigest[] = algorithm.digest(nome.getBytes("UTF-8"));

       StringBuilder hexString = new StringBuilder();
       for (byte b : messageDigest) {
         hexString.append(String.format("%02X", 0xFF & b));
       }
       String nomehex = hexString.toString();
       
       System.out.println(">>> Cifrando seu nome com algoritmo Hash SHA-256");
       System.out.println("Seu nome em String: " + nome);
       System.out.println("Seu nome cifrado com algoritmo Hash SHA-256: " + nomehex);
   }

}
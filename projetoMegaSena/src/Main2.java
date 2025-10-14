import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main2 {
    public static void main(String[] args) throws InterruptedException {
        Random rand = new Random();

        List<Integer> listaNumerosMega = new ArrayList<>();
        List<Integer> listaNumerosPalpite = new ArrayList<>();

        for (Integer i = 0; i < 6; i++) {
            listaNumerosMega.add(i);
            listaNumerosPalpite.add(i);
        }

        Collections.sort(listaNumerosMega);
        Collections.sort(listaNumerosPalpite);

        if(listaNumerosPalpite.equals(listaNumerosMega)) {
            System.out.println("As listas possuem elementos iguais");
            System.out.println(listaNumerosMega);
            System.out.println(listaNumerosPalpite);
        } else {
            System.out.println("As listas possuem elementos diferentes");
        }



    }
}
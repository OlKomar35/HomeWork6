package com.komar;

import java.util.Scanner;

public class InputData {

    public Order inputFromConsole() {
        String clientName = prompt("Client name: ");
        String product = prompt("Product: ");
        int qnt = Integer.parseInt(prompt("Quantity: "));
        int price = Integer.parseInt(prompt("Price: "));
        return new Order(clientName, product, qnt, price);
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    public Order inputFromWebsite(){
        //  при необходимости добавим логику для добавления из вебсайта
        return new Order("client", "product",6,1047);
    }

    public Order inputFromDesktopApp(){
        //  при необходимости добавим логику для добавления из приложения
        return new Order("client2", "product2",100,147);
    }
}

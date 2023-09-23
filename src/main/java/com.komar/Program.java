package com.komar;

public class Program {
    public static void main(String[] args) {
        System.out.println("Введите заказ:");

        InputData inputData = new InputData();
        Order order = inputData.inputFromConsole();
        SaveData saveData = new SaveData();
        saveData.saveToJson(order);
    }
}

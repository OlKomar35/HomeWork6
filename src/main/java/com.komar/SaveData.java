package com.komar;

import java.io.FileWriter;
import java.io.IOException;

public class SaveData {

    public void saveToJson(Order order){
        String fileName = "order.json";
        try(FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+order.getClientName()+"\",\n");
            writer.write("\"product\":\""+order.getProduct()+"\",\n");
            writer.write("\"qnt\":\""+order.getQnt()+"\",\n");
            writer.write("\"price\":\""+order.getPrice()+"\" \n");
            writer.write("}\n");
            writer.flush();
            System.out.println("Файл order.json удачно сохранен");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    // при необходимости можно добавить логику для сохранения файлов в другом формате или в БД
}

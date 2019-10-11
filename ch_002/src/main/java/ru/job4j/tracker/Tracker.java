package ru.job4j.tracker;

import java.util.Random;

public class Tracker {
    //массив для хранения заявок
    private final Item[] items = new Item[100];

    //указатель ячейки для новой заявки
    private int position = 0;

    //добавление новой зявки
    public Item add(Item item){
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    //удаление заявки
    public void  delete(String id) {
        for (int index = 0; index < this.position; index++) {
            if (this.items[index].getId().equals(id)) {
                System.arraycopy(items, index + 1, items, index, items.length -1- index);
                position--;
            }
        }
    }

    //перезапись заявки
    public void replace(String id, Item item){
        for (int index = 0; index < this.position; index++){
            if(this.items[index].getId().equals(id)){
                item.setId(id);
                this.items[index] = item;
            }
        }
    }

    //получение всех заявок
    public Item[] findAll(){
        Item[] result = new Item[this.position];
        for(int index = 0; index != this.position; index++){
            result[index] = this.items[index];
        }
        return result;
    }

    //получение списка по имени
    public Item[] findByName(String key){
        int number = 0;
        Item[] result = new Item[this.position];
        for (int index = 0;index != this.position; index++){
            if (this.items[index].getName().equals(key)){
                result[number++] = this.items[index];
            }
        }
        Item[] finish = new Item[number];
        System.arraycopy(result,0,finish,0,number);
        return finish;
    }


    //поиск по id
    public Item findById(String id) {
        Item item = null;
        for (int index = 0; index != this.position; index++) {
            if (this.items[index].getId().equals(id)) {
                item = this.items[index];
            }
        }
        return item;
    }

    private String generateId(){
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package foodstoragealgorithmca1;

import java.time.LocalDate;
import java.time.LocalDateTime;
/**
 *
 * @author ander
 */
public class FoodStorage {

   static class FoodItem {
    private String name;
    private double weight;
    private LocalDate bestBefore;
    private LocalDateTime storageDate;
    
    public FoodItem(String itemName, double itemWeight, LocalDate itemBestBefore, LocalDateTime itemStorageDate) {
    name = itemName;
    weight = itemWeight;
    bestBefore = itemBestBefore;
    storageDate = itemStorageDate;
    }
    }
    
   static class FoodStack {
        //Stack
    private FoodItem[] arr;
    private int top;
    private int capacity;
    
   public FoodStack(int size) {
    arr = new FoodItem[size];
    capacity = size;
    top = -1;
    }
   
   public void add(FoodItem item) {
    if (top == capacity - 1) {
        System.out.println("Storage is full.");
        return;
    }
    
    arr[++top] = item;
    System.out.println(item.name + " added to storage.");
    }
   
   public FoodItem remove() {
    if (top == -1) {
        System.out.println("Storage is empty.");
        return null;
    }

    return arr[top--];
    }
    
   public FoodItem peek() {
    if (top == -1) {
        System.out.println("Storage is empty.");
        return null;
    }

    return arr[top];
    }
   
   public void display() {
    if (top == -1) {
        System.out.println("Storage is empty.");
        return;
    }

    System.out.println("Food items in storage:");
    for (int i = 0; i <= top; i++) {
    System.out.println("== " + arr[i].name + " ==");
    }
    }
   
   public void search(String itemName) {
    if (top == -1) {
        System.out.println("Storage is empty.");
        return;
    }

    for (int i = 0; i <= top; i++) {
        if (arr[i].name.equalsIgnoreCase(itemName)) {
            System.out.println("Item found: " + arr[i].name);
            return;
        }
    }
    
    System.out.println("Item not found.");
    }
    public boolean isEmpty() {
    return top == -1;
    }
    public boolean isFull() {
    return top == capacity - 1;
    }
    }
    
    
    public static void main(String[] args) {
      
    }
    
}

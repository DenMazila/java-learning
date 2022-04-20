package com.github.denmazila.java_learning.stack4;

public class MyStack {
    private final char[] state;
    private int size = 0;

    public MyStack(int maxSize) {
        state = new char[maxSize];
    }

    /**
     * Добавляет элемент в голову стека
     *
     * @param element новый элемент для добавления
     */
    public void push(char element) {
        state[size] = element;
        size = size + 1;
    }

    /**
     * Берет элемент из головы,
     * удаляет его из стека и возвращает из функции
     *
     * @return последний добавленный элемент
     */
    public char pop() {
        if (size == 0) {
            throw new RuntimeException("Нельзя достать элемент из пустого стека");
        }

        char element = state[size - 1];
        size = size - 1;
        return element;
    }

    public char peek() {
        return state[size - 1];
    }

    public boolean empty() {
        return size == 0;
    }

    public int size(){
        return size;
    }
}

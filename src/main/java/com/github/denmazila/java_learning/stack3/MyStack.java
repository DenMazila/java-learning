package com.github.denmazila.java_learning.stack3;

public class MyStack {
    private char[] state;
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
    public int pop() {
        if (size == 0) {
            throw new RuntimeException("Нельзя достать элемент из пустого стека");
        }

        char element = state[size - 1];
        size = size - 1;
        return element;
    }

}

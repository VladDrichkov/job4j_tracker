package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] result = new Item[size];
        int sizeOfResult = 0;
        for (int i = 0; i < size; i++) {
            Item tempItem = items[i];
            if (key.equals(tempItem.getName())) {
                result[sizeOfResult] = tempItem;
                sizeOfResult++;
            }
        }
        result = Arrays.copyOf(result, sizeOfResult);
        return result;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    private int indexOf(int id) {
        int result = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                result = index;
                break;
            }
        }
        return result;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean result = index != -1;
        if (!result) {
            return false;
        }
        item.setId(id);
        items[index] = item;
        return result;
    }

    public void delete(int id) {
        int index = indexOf(id);
        boolean result = index != -1;
        if (!result) {
            return;
        }
        int start = index + 1;
        int distPos = index;
        int length = size - index - 1;
        System.arraycopy(items, start, items, distPos, length);
        items[size - 1] = null;
        size--;
    }
}

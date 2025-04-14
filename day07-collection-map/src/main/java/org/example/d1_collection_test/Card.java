package org.example.d1_collection_test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Card {
    private String number;
    private String color;
    private int size;

    @Override
    public String toString() {
        return number+color;
    }
}

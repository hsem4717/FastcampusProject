package org.example.calculate;

public class PositiveNumber {
    private final int value;

    public PositiveNumber(int value) {
        validate(value);
        this.value = value;
    }

    private void validate(int value) {
        if(value <= 0){
            throw new IllegalArgumentException("양수만 허용에여");
        }
    }
    public int toInt(){
        return value;
    }
}

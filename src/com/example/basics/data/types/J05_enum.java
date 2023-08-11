package com.example.basics.data.types;

import java.io.IOException;

public class J05_enum {
    enum Shirtsize { S, M, L, XL };
    // Enums, pozwala na wskazanie zmiennej jakie wiarianty wartości może przyjąć
    public static void main(String[] args) throws IOException {
        Shirtsize buyShirtsize = Shirtsize.M;
        buyShirtsize = Shirtsize.L;
    }
}
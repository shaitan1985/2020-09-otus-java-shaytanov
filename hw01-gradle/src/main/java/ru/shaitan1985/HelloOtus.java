package ru.shaitan1985;

import com.google.common.collect.Lists;

import java.util.List;

public class HelloOtus {
    public static void main(String[] args) {

        List<String> names = Lists.newArrayList("Ivan", "Petr", "Irina", "Ksenia");
        names
                .stream()
                .forEach(name -> System.out.println(name));

    }

}

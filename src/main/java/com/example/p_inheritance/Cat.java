package com.example.p_inheritance;

public class Cat extends Animal{

    public Cat(String name) {
        super("Cat");
        this.name = name;
    }
    String name;
    @Override
    public void sound () {
        System.out.println("Meow");
    }

    public void actions () {
        System.out.println("It is cat " + name + " and it like to play with ball");
    }
}

/*
    Ключове слово @Override в Java вказує компілятору,
    що метод, який відмічений цією аннотацією, перевизначається
    (переоприділяється) з методу у батьківському класі.
    Це означає, що в похідному класі ви створюєте нову
    реалізацію методу з такою ж назвою, як і метод у його
    батьківському класі, та ця нова реалізація замінює реалізацію
    у батьківському класі.
*/
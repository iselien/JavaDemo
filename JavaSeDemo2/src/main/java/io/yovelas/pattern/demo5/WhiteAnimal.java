package io.yovelas.pattern.demo5;

public class WhiteAnimal implements AnimalFactory{
    @Override
    public Dog createDog() {
        return null;
    }

    @Override
    public Cat createCat() {
        return null;
    }
}

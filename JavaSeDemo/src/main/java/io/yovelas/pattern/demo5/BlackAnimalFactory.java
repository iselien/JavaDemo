package io.yovelas.pattern.demo5;

public class BlackAnimalFactory implements AnimalFactory{
    @Override
    public Dog createDog() {
        return new BlackDog();
    }

    @Override
    public Cat createCat() {
        return new BlackCat();
    }
}

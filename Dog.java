class GoodDog {
    // Stat
    private int size;

    // Behaviors
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }

    public void bark() {
        if (size > 60) System.out.println("Woof, Woof!!");
        else if (size > 14) System.out.println("Ruff, Ruff!!");
        else System.out.println("Yip!, Yip!");
    }
}

class Dog {
    public static void main(String[] args) {
        GoodDog dog1 = new GoodDog();
        dog1.setSize(70);

        GoodDog dog2 = new GoodDog();
        dog2.setSize(25);

        GoodDog dog3 = new GoodDog();

        System.out.println("Dog1 size : " + dog1.getSize());
        System.out.println("Dog2 size : " + dog2.getSize());
        System.out.println("Dog3 size : " + dog3.getSize());

        dog1.bark();
        dog2.bark();
        dog3.bark();
    }
}
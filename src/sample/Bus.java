package sample;

public class Bus extends Car {
    int price ;
    
    @Override
    public void stepOnAccel(){
        speed += 10;
        System.out.println("スピードは" + speed + "です");

        price += 30;
        System.out.println("料金は" + price + "円です");
    }
}

package sample;

public class InatantiateCar {
    public static void main(String[] args) {
        Car estima = new Car();

        // estima.speed = 30;　今までこの書き方だったけど正しくない　下みたいにsetterのメソッドでset
        estima.setSpeed(30);

        estima.setName("エスティマ");

        //System.out.println("スピードは" + estima.getSpeed());これもダメ　getterのメソッドでget
        System.out.println("スピードは" + estima.getSpeed() +"です");
        System.out.println("車名は" + estima.getName() +"です");
    }
}

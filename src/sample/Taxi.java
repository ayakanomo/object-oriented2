package sample;

    public class Taxi extends Car{
        int price;

        void payment(){
            System.out.println("料金を" + price + "円払いました");
            price = 0;
        }

        @Override
        public void stepOnAccel(){
            // speed += 10;
            // System.out.println("スピードが" + speed + "km/hに増えました");
            super.stepOnAccel();  //上の2行書いてもいいけど、Carと同じだから、super.でいける

            price += 90;
            System.out.println("料金が" + price + "円に増えました");
        }
    }  


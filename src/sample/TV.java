package sample;

public class TV {
    private int channel;

    public void changeChannel(int channel){
        if( channel <=0 || channel >=13){
            System.out.println("チャンネルは1～12までの間で設定してください");
            return;
        }

        this.channel = channel;
        System.out.println( this.channel + "チャンネルに切り替わりました");
    }
}

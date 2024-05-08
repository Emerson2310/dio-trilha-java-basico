public class Usuario {
    
    public static void main(String[] args) {
        
        SmartTV tv = new SmartTV();

        tv.ligarTv();
        tv.aumentarCanal();
        tv.mudarCanal(15);
        tv.aumentarVolume();
        tv.aumentarCanal();

        System.out.println("A Tv está ligada ? " + tv.ligada);
        System.out.println("Canal atual: " + tv.canal);
        System.out.println("Volume: "+tv.volume);
    }
}

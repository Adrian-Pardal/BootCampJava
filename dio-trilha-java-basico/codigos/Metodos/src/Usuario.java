public class Usuario {
    
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada    : " + smartTv.ligada);
        System.out.println("Volume Atual : " + smartTv.volumeTV);
        System.out.println("Canal Atual  : " + smartTv.canalTV);

        smartTv.ligar();
        smartTv.desligar();
        System.out.println("\n");
        System.out.println("Novo Status -> TV ligada    : " + smartTv.ligada);
        smartTv.ligar();
        System.out.println("Novo Status -> TV ligada    : " + smartTv.ligada);
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Atual : " + smartTv.volumeTV);
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        System.out.println("Volume Atual : " + smartTv.volumeTV);

        smartTv.mudarCanal(18);
        System.out.println("Canal Atual  : " + smartTv.canalTV);
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        System.out.println("Canal Atual  : " + smartTv.canalTV);
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        System.out.println("Canal Atual  : " + smartTv.canalTV);
        smartTv.mudarCanal(502);
        System.out.println("Canal Atual  : " + smartTv.canalTV);
    }
}

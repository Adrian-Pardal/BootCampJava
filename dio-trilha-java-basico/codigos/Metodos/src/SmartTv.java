

public class SmartTv {
    boolean ligada = false;
    int canalTV = 1;
    int volumeTV = 25;

    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }

    public void aumentarVolume(){
        volumeTV++;
    }
    public void diminuirVolume(){
        volumeTV--;
    }

    public void aumentarCanal(){
        canalTV++;
    }
    public void diminuirCanal(){
        canalTV--;
    }
    public void mudarCanal(int novoCanal){
        canalTV = novoCanal;
        
    }
}

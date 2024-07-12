public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25; 

    public void mudarCanal(int novoCanal){
        canal = novoCanal;

}
    //Método mudar canal
    public void aumentarCanal(){
        canal++;

    }
    public void diminuirCanal(){
        canal--;

    }

    //Método aumentar e diminuir volume
    public void aumentarVolume(){
        System.out.println("Aumentando o volume para: " + volume);
        //volume = volume + 1;
        volume++;
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }
    
}
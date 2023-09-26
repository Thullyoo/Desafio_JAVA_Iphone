package Entidade;


import Interface.AparelhoTelefonico;
import Interface.NavegadorInternet;
import Interface.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
    
    public Boolean musicaPausadaOuParada;
    public Boolean celularLigado;
    public Boolean emLigacao;
    public int paginasAbertas;

    public Iphone(){
        this.musicaPausadaOuParada = true;
        this.celularLigado = false;
        this.emLigacao = false;
        this.paginasAbertas = 0;
    }

    @Override
    public void tocarMusica() {
       if(celularLigado == true){
        if(musicaPausadaOuParada == true){
            System.out.println("Tocando Música");
            musicaPausadaOuParada = false;
        }else{
            System.out.println("Já está tocando Música");
        }
       } else{
        System.out.println("Iphone Desligado");
    }
    }

    @Override
    public void pausarMusica() {
        if(celularLigado == true){
            if(musicaPausadaOuParada == false){
                System.out.println("Música Pausada"); 
                musicaPausadaOuParada = true;   
            }else{
                System.out.println("Música ja está pausada");
            }
       } else{
        System.out.println("Iphone Desligado");
    }
    }

    @Override
    public void trocarMusica() {
        if(celularLigado == true){
            System.out.println("Trocando de Música");
       } else{
        System.out.println("IphoneDesligado");
    }   
    }

    @Override
    public void novaPagina() {
        if(celularLigado == true){
            System.out.println("Abrindo nova página");
            paginasAbertas += 1;
       } else{
        System.out.println("Iphone Desligado");
    }   

    }

    @Override
    public void fecharPagina() {
        if(celularLigado == true){
            if(paginasAbertas > 0){
                System.out.println("Fechando página");
                paginasAbertas -= 1;
            } else{
                System.out.println("Não tem páginas abertas");
            }
       } else{
        System.out.println("Iphone Desligado");
    }
    }

    @Override
    public void ligarNumero(String telefone) {
        if(celularLigado == true){
            if(emLigacao == false){
                System.out.println("Ligando para " + telefone);
                emLigacao = true;
            } else {
                System.out.println("Já está em ligação");
            }
       } else{
        System.out.println("Iphone Desligado");
    }
    }

    @Override
    public void desligarLigacao() {
        if(celularLigado == true){
            if(emLigacao == true){
                System.out.println("Desligando ligação");
                emLigacao = false;
            }else{
                System.out.println("Não está em ligação");
            }
       } else{
        System.out.println("Iphone Desligado");
    }  
    }

    @Override
    public void ligarCelular() {
        if(celularLigado == true){
            System.out.println("Iphone já está ligado");
       } else{
        System.out.println("Ligando Iphone");
        celularLigado = true;
    }
    }

    @Override
    public void desligarCelular() {
        if(celularLigado == true){
            System.out.println("Desligando Iphone");
            celularLigado = false;
       } else{
        System.out.println("Iphone já desligado");

    }
    }
    
    
}

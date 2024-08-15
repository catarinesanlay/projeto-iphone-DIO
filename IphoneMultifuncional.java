package Equipamentos.Multifuncional;

import Equipamentos.Internet.NavegadorInternet;
import Equipamentos.Ligação.AparelhoTelefonico;
import Equipamentos.Musica.ReprodutorMusical;

public class IphoneMultifuncional implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusical {
    public void exibirPagina() {
        System.out.println("EXIBINDO PÁGINA");
    }
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA");
    }
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA");
    }
    public void ligar() {
        System.out.println("LIGANDO");
    }
    public void atender() {
        System.out.println("ATENDENDO");
    }
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");
    }
    public void tocar() {
        System.out.println("TOCANDO");
    }
    public void pausar() {
        System.out.println("PAUSANDO");
    }
    public void selecionarMusica() {
        System.out.println("SELECIONANDO MÚSICA");
    }
    

}

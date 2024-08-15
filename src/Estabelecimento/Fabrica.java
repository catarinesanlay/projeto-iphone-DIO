package Estabelecimento;

import Equipamentos.Internet.NavegadorInternet;
import Equipamentos.Internet.Safari;
import Equipamentos.Ligação.AparelhoTelefonico;
import Equipamentos.Multifuncional.IphoneMultifuncional;
import Equipamentos.Musica.ReprodutorMusical;

public class Fabrica {
    public static void main(String[] args) {
        IphoneMultifuncional em = new IphoneMultifuncional();
        NavegadorInternet navegadorInternet = em;
        AparelhoTelefonico aparelhoTelefonico = em;
        ReprodutorMusical reprodutorMusical = em;

        navegadorInternet.exibirPagina();
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();

        aparelhoTelefonico.ligar();
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();

        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
        reprodutorMusical.selecionarMusica();
    }
}

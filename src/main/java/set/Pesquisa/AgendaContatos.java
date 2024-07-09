package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributo
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }
    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
            for(Contato c : contatoSet) {
                if(c.getNome().startsWith(nome)) {
                    contatosPorNome.add(c);
            }
        }
        return  contatosPorNome;
    }
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
            for (Contato c : contatoSet) {
                if (c.getNome().equalsIgnoreCase(nome)) {
                    c.setNumero(novoNumero);
                    contatoAtualizado = c;
                    break;
            }
        }
        return contatoAtualizado;
    }
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Douglas", 123456);
        agendaContatos.adicionarContato("Douglas", 5665);
        agendaContatos.adicionarContato("Douglas Lucio", 1111111);
        agendaContatos.adicionarContato("Douglas DIO", 654987);
        agendaContatos.adicionarContato("Isabela Lucio", 1111111);


        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Douglas"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Isabela Lucio", 5555555));
        agendaContatos.exibirContatos();
    }
}

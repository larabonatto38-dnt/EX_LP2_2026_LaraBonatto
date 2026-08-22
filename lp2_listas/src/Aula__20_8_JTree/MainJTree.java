package Aula__20_8_JTree;
import javax.swing.tree.DefaultMutableTreeNode;

// JTree - Lara e Marcelo

public class MainJTree {

    public static void main(String[] args) {
        JanelaArvore janela = new JanelaArvore("Universidade Federal");

        DefaultMutableTreeNode exatas = janela.adicionarCategoria("Ciências Exatas");
        DefaultMutableTreeNode humanas = janela.adicionarCategoria("Ciências Humanas");
        DefaultMutableTreeNode saude = janela.adicionarCategoria("Ciências da Saúde");

        janela.adicionarItem(exatas, "Ciência da Computação");
        janela.adicionarItem(exatas, "Engenharia Civil");
        janela.adicionarItem(exatas, "Matemática");

        janela.adicionarItem(humanas, "Direito");
        janela.adicionarItem(humanas, "História");
        janela.adicionarItem(humanas, "Psicologia");

        janela.adicionarItem(saude, "Medicina");
        janela.adicionarItem(saude, "Enfermagem");

        janela.exibir();
    }
}
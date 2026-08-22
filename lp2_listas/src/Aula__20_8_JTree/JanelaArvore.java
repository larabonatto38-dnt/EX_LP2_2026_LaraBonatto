package Aula__20_8_JTree;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class JanelaArvore {

    // Atributos privados (Composição ao invés de Herança)
    private JFrame janela;
    private DefaultMutableTreeNode raiz;
    private JTree arvore;

    public JanelaArvore(String tituloRaiz) {

        janela = new JFrame("Exemplo de JTree");
        janela.setSize(400, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        raiz = new DefaultMutableTreeNode(tituloRaiz);
        arvore = new JTree(raiz);

        janela.add(new JScrollPane(arvore));
    }

    public DefaultMutableTreeNode adicionarCategoria(String nome) {
        DefaultMutableTreeNode novaCategoria = new DefaultMutableTreeNode(nome);
        raiz.add(novaCategoria);
        return novaCategoria;
    }

    public void adicionarItem(DefaultMutableTreeNode categoria, String nomeItem) {
        DefaultMutableTreeNode novoItem = new DefaultMutableTreeNode(nomeItem);
        categoria.add(novoItem);
    }

    public void exibir() {
        janela.setVisible(true);
    }
}
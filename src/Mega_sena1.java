
import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Mega_sena1 extends JFrame {

	private static final long serialVersionUID = 1L;
	
	JLabel titulo, jogo = new JLabel();
	JButton jogada, exit;

	public Mega_sena1() {
		super("Meganasena");
		Container tela = getContentPane();
		getContentPane().setLayout(new GridBagLayout());
		titulo = new JLabel("Megasena: ");
		jogada = new JButton(" jogar");
		exit = new JButton("sair");
		jogada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1, n2, n3, n4, n5, n6;
				n1 = (int) (Math.random() * 60);
				n2 = (int) (Math.random() * 60);
				n3 = (int) (Math.random() * 60);
				n4 = (int) (Math.random() * 60);
				n5 = (int) (Math.random() * 60);
				n6 = (int) (Math.random() * 60);
				String jogo = n1 + "-" + n2 + "-" + n3 + "-" + n4 + "-" + n5 + "-" + n6;
				Mega_sena1.this.jogo.setText(jogo);
				System.out.println(jogo);
			}
		});
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int escolha;
				Object[] botoes = { "sim", "não", "Cancelar" };
				escolha = JOptionPane.showOptionDialog(null, "Deseja fechar este aplicativo?", "Fechar o aplicativo",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, botoes, botoes[0]);
				if (escolha == JOptionPane.YES_OPTION)
					System.exit(0);
			}
		});
		tela.add(titulo);
		tela.add(jogo);
		tela.add(jogada);
		tela.add(exit);
		setVisible(true);
		setLocationRelativeTo(null);
		setSize(350, 100);
		// setResizable(false);
	}

	public static void main(String[] args) {
		Mega_sena1 app = new Mega_sena1();
		app.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
package threads.Fila.jDialogThreads;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaFilaThread extends JDialog {
	
	private static final long serialVersionUID = 1L;

	private JPanel jPanel = new JPanel(new GridBagLayout());/*Painel de componentes*/
	
	private JLabel descricaoHora = new JLabel("Nome");
	private JTextField mostrarTempo = new JTextField();
	
	private JLabel descricaoHora2 = new JLabel("E-mail");
	private JTextField mostrarTempo2 = new JTextField();
	
	private JButton jButton = new JButton("Gerar Lote");
	private JButton jButton2 = new JButton("Stop");
	
	private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();
	
	public TelaFilaThread() {/*Executa o que tiver dentro no momento da abertura ou execução*/
		setTitle("Minha tela de FILA/PILHA com Thread");
		setSize(new Dimension(260, 240));
		setLocationRelativeTo(null);
		setResizable(false);
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints();/*Controlado de posicionamento de componetes*/
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);
		gridBagConstraints.anchor = GridBagConstraints.WEST;
		
		descricaoHora.setPreferredSize(new Dimension(216, 25));
		jPanel.add(descricaoHora, gridBagConstraints);
		
		mostrarTempo.setPreferredSize(new Dimension(216, 25));
		gridBagConstraints.gridy ++;
		jPanel.add(mostrarTempo, gridBagConstraints);
		
		descricaoHora2.setPreferredSize(new Dimension(216, 25));
		gridBagConstraints.gridy ++;
		jPanel.add(descricaoHora2, gridBagConstraints);
		
		mostrarTempo2.setPreferredSize(new Dimension(216, 25));
		gridBagConstraints.gridy ++;
		jPanel.add(mostrarTempo2, gridBagConstraints);
		
		gridBagConstraints.gridwidth = 1;
		jButton.setPreferredSize(new Dimension(100, 25));
		gridBagConstraints.gridy ++;
		jPanel.add(jButton, gridBagConstraints);
		
		jButton2.setPreferredSize(new Dimension(100, 25));
		gridBagConstraints.gridx ++;
		jPanel.add(jButton2, gridBagConstraints);
		
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {/*Executa o clique no botão*/
				
				if(fila == null) {
					fila = new ImplementacaoFilaThread();
					fila.start();
				}

				for(int qtd =0; qtd < 1000; qtd++) {/*Simulando 1000 envios em massa*/
				
					ObjetoFilaThread filaThread = new ObjetoFilaThread();
					filaThread.setNome(mostrarTempo.getText());
					filaThread.setEmail(mostrarTempo.getText() + "-> " + qtd);
					
					//ImplementacaoFilaThread.add(filaThread);
					fila.add(filaThread);
				}
			}
		});
		
		jButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {/*Executa o clique no botão*/
				fila.stop();
				fila = null;
				
			}
		});
		
		fila.start();
		add(jPanel, BorderLayout.WEST);
		/*Sempre será o ultimo comando*/
		setVisible(true);/*Torna a tela visil para o usuário*/
	}
	
}

package app.view;

import static java.lang.Thread.sleep;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import app.model.Philosopher;
import app.service.Principal;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Process extends JFrame {

	private static final long serialVersionUID = 1L;

	private JButton jButton1;
	private JButton jButton_Finalizar;
	private JButton jButton_Iniciar;
	private JLabel jLabel10;
	private JLabel jLabel11;
	private JLabel jLabel12;
	private JLabel jLabel13;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel6;
	private JLabel jLabel7;
	private JLabel jLabel8;
	private JLabel jLabel9;
	private JLabel jLabel_Filo01;
	private JLabel jLabel_Filo02;
	private JLabel jLabel_Filo03;
	private JLabel jLabel_Filo04;
	private JLabel jLabel_Filo05;
	private JLabel jLabel_Ten01;
	private JLabel jLabel_Ten02;
	private JLabel jLabel_Ten03;
	private JLabel jLabel_Ten04;
	private JLabel jLabel_Ten05;
	private JLabel jLabel_est01;
	private JLabel jLabel_est02;
	private JLabel jLabel_est03;
	private JLabel jLabel_est04;
	private JLabel jLabel_est05;
	private JLabel jLabel_est06;
	private JPanel jPanel1;
	private JPanel jPanel2;
	private JPanel jPanel3;
	private JPanel jPanel5;
	private JPanel jPanel6;
	private JPanel jPanel7;
	private JPanel jPanel8;
	private JTextField jTextField_Cont01;
	private JTextField jTextField_Cont02;
	private JTextField jTextField_Cont03;
	private JTextField jTextField_Cont04;
	private JTextField jTextField_Cont05;

	public Process() {

		this.setTitle("La Cena de los Filósofos");
		this.setSize(1000, 620);
		this.setLocationRelativeTo(null); // para centrar la pantalla en la ventana
		Image icono = Toolkit.getDefaultToolkit().getImage("images/logo.png");
		this.setIconImage(icono);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

		initComponents();

		// Botón Finalizar:
		this.jButton_Finalizar.setEnabled(false);

		// Contadores de Comida:
		this.jTextField_Cont01.setText(" 0");
		this.jTextField_Cont02.setText(" 0");
		this.jTextField_Cont03.setText(" 0");
		this.jTextField_Cont04.setText(" 0");
		this.jTextField_Cont05.setText(" 0");

		// Filósofos Configuración inicial:
		this.jLabel_Filo01.setOpaque(true);
		this.jLabel_Filo01.setBackground(Color.WHITE);
		this.jLabel_Filo02.setOpaque(true);
		this.jLabel_Filo02.setBackground(Color.WHITE);
		this.jLabel_Filo03.setOpaque(true);
		this.jLabel_Filo03.setBackground(Color.WHITE);
		this.jLabel_Filo04.setOpaque(true);
		this.jLabel_Filo04.setBackground(Color.WHITE);
		this.jLabel_Filo05.setOpaque(true);
		this.jLabel_Filo05.setBackground(Color.WHITE);

		// Tenedores Configuración inicial:
		this.jLabel_Ten01.setText("  1  ");
		this.jLabel_Ten01.setOpaque(true);
		this.jLabel_Ten01.setBackground(Color.LIGHT_GRAY);
		this.jLabel_Ten01.setForeground(Color.WHITE);

		this.jLabel_Ten02.setText("  2  ");
		this.jLabel_Ten02.setOpaque(true);
		this.jLabel_Ten02.setBackground(Color.LIGHT_GRAY);
		this.jLabel_Ten02.setForeground(Color.WHITE);

		this.jLabel_Ten03.setText("  3  ");
		this.jLabel_Ten03.setOpaque(true);
		this.jLabel_Ten03.setBackground(Color.LIGHT_GRAY);
		this.jLabel_Ten03.setForeground(Color.WHITE);

		this.jLabel_Ten04.setText("  4  ");
		this.jLabel_Ten04.setOpaque(true);
		this.jLabel_Ten04.setBackground(Color.LIGHT_GRAY);
		this.jLabel_Ten04.setForeground(Color.WHITE);

		this.jLabel_Ten05.setText("  5  ");
		this.jLabel_Ten05.setOpaque(true);
		this.jLabel_Ten05.setBackground(Color.LIGHT_GRAY);
		this.jLabel_Ten05.setForeground(Color.WHITE);

		// Leyenda de colores:
		this.jLabel_est01.setText("    ");
		this.jLabel_est01.setOpaque(true);
		this.jLabel_est01.setBackground(Color.PINK);

		this.jLabel_est02.setText("    ");
		this.jLabel_est02.setOpaque(true);
		this.jLabel_est02.setBackground(Color.CYAN);

		this.jLabel_est03.setText("    ");
		this.jLabel_est03.setOpaque(true);
		this.jLabel_est03.setBackground(Color.ORANGE);

		this.jLabel_est04.setText("    ");
		this.jLabel_est04.setOpaque(true);
		this.jLabel_est04.setBackground(Color.WHITE);

		this.jLabel_est05.setText("    ");
		this.jLabel_est05.setOpaque(true);
		this.jLabel_est05.setBackground(Color.BLUE);

		this.jLabel_est06.setText("    ");
		this.jLabel_est06.setOpaque(true);
		this.jLabel_est06.setBackground(Color.LIGHT_GRAY);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */

	private void initComponents() {

		jPanel1 = new JPanel();
		jPanel2 = new JPanel();
		jLabel_Filo01 = new JLabel();
		jLabel_Filo02 = new JLabel();
		jLabel_Filo03 = new JLabel();
		jLabel_Filo04 = new JLabel();
		jLabel_Filo05 = new JLabel();
		jPanel5 = new JPanel();
		jPanel6 = new JPanel();
		jLabel_est01 = new JLabel();
		jLabel_est02 = new JLabel();
		jLabel_est03 = new JLabel();
		jLabel_est05 = new JLabel();
		jLabel_est06 = new JLabel();
		jLabel_est04 = new JLabel();
		jPanel7 = new JPanel();
		jLabel6 = new JLabel();
		jLabel7 = new JLabel();
		jLabel8 = new JLabel();
		jLabel9 = new JLabel();
		jLabel10 = new JLabel();
		jLabel12 = new JLabel();
		jLabel11 = new JLabel();
		jLabel_Ten01 = new JLabel();
		jLabel_Ten02 = new JLabel();
		jLabel_Ten03 = new JLabel();
		jLabel_Ten04 = new JLabel();
		jLabel_Ten05 = new JLabel();

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		jPanel2.setBorder(BorderFactory.createTitledBorder(" La Cena de los Filósofos "));

		jLabel_Filo01.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel_Filo01.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel_Filo01.setText("Filósofo 01");

		jLabel_Filo02.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel_Filo02.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel_Filo02.setText("Filósofo 02");

		jLabel_Filo03.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel_Filo03.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel_Filo03.setText("Filósofo 03");

		jLabel_Filo04.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel_Filo04.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel_Filo04.setText("Filósofo 04");

		jLabel_Filo05.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel_Filo05.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel_Filo05.setText("Filósofo 05");

		jLabel_est01.setText("jLabel1");

		jLabel_est02.setText("jLabel1");

		jLabel_est03.setText("jLabel1");

		jLabel_est05.setText("jLabel1");

		jLabel_est06.setText("jLabel1");

		jLabel_est04.setText("jLabel1");

		GroupLayout jPanel6Layout = new GroupLayout(jPanel6);
		jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel6Layout.createSequentialGroup().addGap(10)
						.addGroup(jPanel6Layout.createParallelGroup(Alignment.TRAILING).addComponent(jLabel_est05)
								.addComponent(jLabel_est06))
						.addContainerGap())
				.addGroup(Alignment.LEADING,
						jPanel6Layout.createSequentialGroup().addContainerGap().addComponent(jLabel_est04)
								.addContainerGap(12, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING,
						jPanel6Layout.createSequentialGroup().addContainerGap().addComponent(jLabel_est03)
								.addContainerGap(12, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING,
						jPanel6Layout.createSequentialGroup().addContainerGap().addComponent(jLabel_est01)
								.addContainerGap(12, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, jPanel6Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel_est02).addContainerGap(12, Short.MAX_VALUE)));
		jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel6Layout.createSequentialGroup().addGap(18).addComponent(jLabel_est01).addGap(17)
						.addComponent(jLabel_est02).addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(jLabel_est03).addGap(13).addComponent(jLabel_est04)
						.addPreferredGap(ComponentPlacement.RELATED, 28, Short.MAX_VALUE).addComponent(jLabel_est05)
						.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(jLabel_est06).addGap(9)));
		jPanel6.setLayout(jPanel6Layout);

		jLabel6.setText("Filósofo entra a comer");

		jLabel7.setText("Filósofo tiene un tenedor");

		jLabel8.setText("Filósofo está comiendo");

		jLabel9.setText("Tenedor ocupado");

		jLabel10.setText("Tenedor libre");

		jLabel12.setText("Filósofo está pensando");

		GroupLayout jPanel7Layout = new GroupLayout(jPanel7);
		jPanel7Layout.setHorizontalGroup(jPanel7Layout.createParallelGroup(Alignment.LEADING).addGroup(
				Alignment.TRAILING,
				jPanel7Layout.createSequentialGroup().addGroup(jPanel7Layout.createParallelGroup(Alignment.TRAILING)
						.addComponent(jLabel12, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
						.addComponent(jLabel6, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
						.addComponent(jLabel7, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
						.addComponent(jLabel8, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
						.addComponent(jLabel9, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
						.addComponent(jLabel10, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
						.addContainerGap()));
		jPanel7Layout.setVerticalGroup(jPanel7Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel7Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jLabel12).addGap(27)
						.addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)));
		jPanel7.setLayout(jPanel7Layout);

		jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel11.setText("Código de colores:");

		GroupLayout jPanel5Layout = new GroupLayout(jPanel5);
		jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel5Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel11, GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE).addContainerGap())
				.addGroup(jPanel5Layout.createSequentialGroup()
						.addComponent(jPanel6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(jPanel7, GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE).addGap(20)));
		jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel5Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel11, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(jPanel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(jPanel6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addGap(8)));
		jPanel5.setLayout(jPanel5Layout);

		jLabel_Ten01.setText("jLabel1");

		jLabel_Ten02.setText("jLabel2");

		jLabel_Ten03.setText("jLabel3");

		jLabel_Ten04.setText("jLabel4");

		jLabel_Ten05.setText("jLabel5");

		ImageIcon imageIcon = new ImageIcon(new ImageIcon("images/table.png").getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT));
		JLabel roundTable = new JLabel();
		roundTable.setIcon(imageIcon);
		jPanel3 = new JPanel();
		jButton_Iniciar = new JButton();
		jButton_Finalizar = new JButton();
		jButton1 = new JButton();

		jPanel3.setBorder(BorderFactory.createTitledBorder(" Controles "));

		jButton_Iniciar.setText("Iniciar");
		jButton_Iniciar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonStartActionPerformed(evt);
			}
		});

		jButton_Finalizar.setText("Pausar");
		jButton_Finalizar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonFinishActionPerformed(evt);
			}
		});

		jButton1.setText("Salir");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonExitActionPerformed(evt);
			}
		});

		GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(jButton_Iniciar, GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
								.addComponent(jButton_Finalizar, GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
								.addComponent(jButton1, GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
						.addContainerGap()));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout
				.createSequentialGroup().addContainerGap()
				.addComponent(jButton_Iniciar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(jButton_Finalizar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(jButton1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGap(32)));
		jPanel3.setLayout(jPanel3Layout);
		// roundTable.setIcon(imageIcon);

		GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout
				.createSequentialGroup().addGap(103)
				.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout
						.createSequentialGroup()
						.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
								.addComponent(jLabel_Filo05, GroupLayout.PREFERRED_SIZE, 112,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel_Filo04, GroupLayout.PREFERRED_SIZE, 112,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel_Ten04))
						.addPreferredGap(ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
						.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(jPanel2Layout.createSequentialGroup().addComponent(roundTable)
										.addPreferredGap(ComponentPlacement.UNRELATED))
								.addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel_Ten03).addGap(123)))
						.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(jLabel_Filo03, GroupLayout.PREFERRED_SIZE, 112,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel_Ten02).addComponent(jLabel_Filo02, GroupLayout.PREFERRED_SIZE, 112,
										GroupLayout.PREFERRED_SIZE)))
						.addGroup(jPanel2Layout.createSequentialGroup().addGap(146).addComponent(jLabel_Ten05)
								.addGap(33)
								.addComponent(jLabel_Filo01, GroupLayout.PREFERRED_SIZE, 112,
										GroupLayout.PREFERRED_SIZE)
								.addGap(32).addComponent(jLabel_Ten01).addGap(139)))
				.addGap(104)
				.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE))
				.addGap(7)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel2Layout.createSequentialGroup()
						.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
								.addGroup(jPanel2Layout.createSequentialGroup().addGap(30)
										.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
												.addComponent(jLabel_Ten01)
												.addComponent(jLabel_Filo01, GroupLayout.PREFERRED_SIZE, 39,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel_Ten05))
										.addGap(18)
										.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING, false)
												.addComponent(roundTable)
												.addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout
														.createParallelGroup(Alignment.LEADING)
														.addComponent(jLabel_Filo02, GroupLayout.PREFERRED_SIZE, 39,
																GroupLayout.PREFERRED_SIZE)
														.addGroup(jPanel2Layout.createSequentialGroup().addGap(7)
																.addComponent(jLabel_Filo05, GroupLayout.PREFERRED_SIZE,
																		39, GroupLayout.PREFERRED_SIZE)))
														.addGap(57)
														.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
																.addComponent(jLabel_Ten02).addComponent(jLabel_Ten04))
														.addGap(92)))
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
												.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
														.addComponent(jLabel_Filo04, GroupLayout.PREFERRED_SIZE, 39,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel_Filo03, GroupLayout.PREFERRED_SIZE, 39,
																GroupLayout.PREFERRED_SIZE))
												.addComponent(jLabel_Ten03)))
								.addGroup(jPanel2Layout.createSequentialGroup()
										.addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, 255,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18).addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, 141,
												GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(21, Short.MAX_VALUE)));
		jPanel2.setLayout(jPanel2Layout);
		jPanel8 = new JPanel();
		jLabel2 = new JLabel();
		jTextField_Cont01 = new JTextField();
		jLabel3 = new JLabel();
		jTextField_Cont02 = new JTextField();
		jTextField_Cont03 = new JTextField();
		jLabel4 = new JLabel();
		jLabel5 = new JLabel();
		jTextField_Cont04 = new JTextField();
		jTextField_Cont05 = new JTextField();
		jLabel13 = new JLabel();

		jLabel2.setText("Filósofo 1:");

		jTextField_Cont01.setText("jTextField1");

		jLabel3.setText("Filósofo 2:");

		jTextField_Cont02.setText("jTextField1");

		jLabel4.setText("Filósofo 3:");

		jTextField_Cont03.setText("jTextField1");

		jLabel5.setText("Filósofo 4:");

		jTextField_Cont04.setText("jTextField1");

		jLabel13.setText("Filósofo 5:");

		jTextField_Cont05.setText("jTextField1");

		jPanel8.setBorder(BorderFactory.createTitledBorder(" Cuántas veces han comido: "));

		GroupLayout jPanel8Layout = new GroupLayout(jPanel8);
		jPanel8Layout.setHorizontalGroup(jPanel8Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel8Layout.createSequentialGroup().addContainerGap().addComponent(jLabel2)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(jTextField_Cont01, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(jLabel3).addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(jTextField_Cont02, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(jLabel4).addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(jTextField_Cont03, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(jLabel5).addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(jTextField_Cont04, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(jLabel13).addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(jTextField_Cont05, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGap(227)));
		jPanel8Layout.setVerticalGroup(jPanel8Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING,
				jPanel8Layout.createSequentialGroup().addContainerGap(43, Short.MAX_VALUE)
						.addGroup(jPanel8Layout.createParallelGroup(Alignment.TRAILING)
								.addGroup(jPanel8Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel2)
										.addComponent(jTextField_Cont01, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel8Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel3)
										.addComponent(jTextField_Cont02, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel4)
										.addComponent(jTextField_Cont03, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel5)
										.addComponent(jTextField_Cont04, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel13).addComponent(jTextField_Cont05,
												GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)))
						.addGap(126)));
		jPanel8.setLayout(jPanel8Layout);

		GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(
				jPanel1Layout.createParallelGroup(Alignment.TRAILING).addGroup(Alignment.LEADING, jPanel1Layout
						.createSequentialGroup().addGroup(jPanel1Layout
								.createParallelGroup(Alignment.TRAILING, false).addGroup(Alignment.LEADING,
										jPanel1Layout.createSequentialGroup().addGap(16).addComponent(jPanel8,
												GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(Alignment.LEADING,
										jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jPanel2,
												GroupLayout.PREFERRED_SIZE, 945, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(35, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE).addGap(18)
						.addComponent(jPanel8, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE).addGap(18)));
		jPanel1.setLayout(jPanel1Layout);

		GroupLayout layout = new GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 968, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(40, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 558, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(254, Short.MAX_VALUE)));
		getContentPane().setLayout(layout);

		pack();
	}

	/**
	 * Dispara la ejecución del programa
	 * 
	 * @param evt Recibe el evento de hacer click sobre el botón
	 */

	private void jButtonStartActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton_IniciarActionPerformed
		Philosopher.finished = false; // Para poder pausar o reiniciar.

		// Clase que contiene todos los objetos de la interface y que sera pasada por
		// parámetro a la clase principal
		Control control = new Control(jLabel_Filo01, jLabel_Filo02, jLabel_Filo03, jLabel_Filo04, jLabel_Filo05,
				jLabel_Ten01, jLabel_Ten02, jLabel_Ten03, jLabel_Ten04, jLabel_Ten05, jTextField_Cont01,
				jTextField_Cont02, jTextField_Cont03, jTextField_Cont04, jTextField_Cont05);

		// Clase Principal con la lógica del programa:
		// Recibe por parámetro la clase Clase10Control que contiene todos los elemntos
		// de la interface
		@SuppressWarnings("unused")
		Principal principal = new Principal(control);

		this.jButton_Finalizar.setEnabled(true);
		this.jButton_Iniciar.setEnabled(false);

	}

	/**
	 * Dispara la pausa de la ejecución
	 * 
	 * @param evt Recibe el evento de hacer click sobre el botón
	 */

	private void jButtonFinishActionPerformed(java.awt.event.ActionEvent evt) {
		Philosopher.finished = true;
		try {
			sleep(3000);
		} catch (InterruptedException ex) {
			System.out.println("Error. Descripción: " + ex.toString());
		}
		this.jButton_Iniciar.setEnabled(true);
		this.jButton_Finalizar.setEnabled(false);
	}

	private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {
		System.exit(0);
	}
}

package gui;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;
import javax.swing.JTabbedPane;
import java.awt.Toolkit;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;


@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;	
	private JTextField txt_LU;
	private JTextField txt_Nombre;
	private JTextField txt_Apellido;
	private JTextField txt_Mail;
	private JTextField txt_Git;
	private JTextField txt_Fecha;
	
	public SimplePresentationScreen(Student studentData) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SimplePresentationScreen.class.getResource("/images/tdp.png")));
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentaci\u00F3n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(680, 284));
		setContentPane(contentPane);
		
		init();
	}
	
	private void init() {
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBorder(null);
		tabInformation = new JPanel();
		tabInformation.setPreferredSize(new Dimension(425, 250));
		tabbedPane.addTab("Información del alumno", null, tabInformation, "Muestra la información declarada por el alumno");
		
		JLabel Label_Nombre = new JLabel("Nombre");
		Label_Nombre.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel Label_LU = new JLabel("LU");
		Label_LU.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel Label_Apellido = new JLabel("Apellido");
		Label_Apellido.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel Label_Email = new JLabel("E-mail");
		Label_Email.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel Label_Git = new JLabel("Github URL");
		Label_Git.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		txt_LU = new JTextField();
		txt_LU.setColumns(10);
		txt_LU.setText(String.valueOf(studentData.getId()));
		
		txt_Apellido = new JTextField();
		txt_Apellido.setColumns(10);
		txt_Apellido.setText(studentData.getLastName());
		
		txt_Mail = new JTextField();
		txt_Mail.setColumns(10);
		txt_Mail.setText(studentData.getMail());
		
		txt_Git = new JTextField();
		txt_Git.setColumns(10);
		txt_Git.setText(studentData.getGithubURL());
		
		txt_Nombre = new JTextField();
		txt_Nombre.setColumns(10);
		txt_Nombre.setText(studentData.getFirstName());
		
		GroupLayout gl_tabInformation = new GroupLayout(tabInformation);
		gl_tabInformation.setHorizontalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addGap(10)
							.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING, false)
								.addComponent(Label_Git, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(Label_Email, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(Label_LU, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(18))
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addContainerGap()
							.addComponent(Label_Nombre, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addContainerGap()
							.addComponent(Label_Apellido, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addComponent(txt_Mail, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
						.addComponent(txt_LU, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
						.addComponent(txt_Git, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
						.addComponent(txt_Apellido, GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
						.addComponent(txt_Nombre, GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_tabInformation.setVerticalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(Label_LU)
						.addComponent(txt_LU, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(Label_Apellido)
						.addComponent(txt_Apellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(13)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(Label_Nombre)
						.addComponent(txt_Nombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(16)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(Label_Email)
						.addComponent(txt_Mail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(Label_Git)
						.addComponent(txt_Git, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(37, Short.MAX_VALUE))
		);
		tabInformation.setLayout(gl_tabInformation);

        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy");	
        DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		JLabel lbl_Imagen = new JLabel("");
		lbl_Imagen.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon image = new ImageIcon(SimplePresentationScreen.class.getResource("/images/foto.jpg"));
		Icon icon = new ImageIcon(image.getImage().getScaledInstance(225, 225,Image.SCALE_DEFAULT));
		lbl_Imagen.setIcon(icon);
		
		txt_Fecha = new JTextField();
		txt_Fecha.setFont(new Font("Tahoma", Font.BOLD, 11));
		txt_Fecha.setEditable(false);
		txt_Fecha.setColumns(10);
		txt_Fecha.setText("Esta ventana fue generada el "+date.format(LocalDateTime.now())+" a las "+time.format(LocalDateTime.now()));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txt_Fecha, GroupLayout.PREFERRED_SIZE, 422, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(lbl_Imagen, GroupLayout.PREFERRED_SIZE, 206, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lbl_Imagen, GroupLayout.PREFERRED_SIZE, 213, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txt_Fecha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(22))
		);
		contentPane.setLayout(gl_contentPane);
					
	}
}

package imagenFondo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;

public class Principal extends JFrame {
	private JPanel contentPane;
	private JButton btnColocarImagen;
    private JFrame aux;
    private JButton btnQuitarImagen;
    private ImagenFondo pnImagen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		aux=this;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(602, 487);
		setLocationRelativeTo(null);
		//setResizable(false);
		setTitle("Los del Sombrero Blanco");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{581, 0};
		gbl_contentPane.rowHeights = new int[]{344, 25, 25, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		pnImagen = new ImagenFondo("");
		pnImagen.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnImagen.setLayout(null);
		GridBagConstraints gbc_pnImagen = new GridBagConstraints();
		gbc_pnImagen.insets = new Insets(0, 0, 5, 0);
		gbc_pnImagen.fill = GridBagConstraints.BOTH;
		gbc_pnImagen.gridx = 0;
		gbc_pnImagen.gridy = 0;
		contentPane.add(pnImagen, gbc_pnImagen);
		
		btnColocarImagen = new JButton("Colocar Imagen");
		GridBagConstraints gbc_btnColocarImagen = new GridBagConstraints();
		gbc_btnColocarImagen.weighty = 0.5;
		gbc_btnColocarImagen.weightx = 0.5;
		gbc_btnColocarImagen.insets = new Insets(0, 0, 5, 0);
		gbc_btnColocarImagen.gridx = 0;
		gbc_btnColocarImagen.gridy = 1;
		contentPane.add(btnColocarImagen, gbc_btnColocarImagen);
		
		btnQuitarImagen = new JButton("Quitar Imagen");
		GridBagConstraints gbc_btnQuitarImagen = new GridBagConstraints();
		gbc_btnQuitarImagen.weighty = 0.5;
		gbc_btnQuitarImagen.weightx = 0.5;
		gbc_btnQuitarImagen.gridx = 0;
		gbc_btnQuitarImagen.gridy = 2;
		contentPane.add(btnQuitarImagen, gbc_btnQuitarImagen);
		
		init();
	}
	
	public void init() {
		btnColocarImagen.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc=new JFileChooser(System.getProperty("user.dir"));
				FileNameExtensionFilter filtro=new FileNameExtensionFilter("JPG & JPEG,PNG,GIF","jpg","jpeg","png","gif" );
				fc.setFileFilter(filtro);
				if(fc.showOpenDialog(aux) == JFileChooser.APPROVE_OPTION) {
					pnImagen.setImagen(fc.getSelectedFile().getAbsolutePath());
				}
			}
		});
		
		btnQuitarImagen.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				pnImagen.setImagen("");
			}
		});
		
	}
	
	
	
}

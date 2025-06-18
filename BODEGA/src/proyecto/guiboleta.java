package proyecto;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.Arreglo_Cliente;
import Clases.Boleta;
import Clases.Cliente;
import Clases.Detalle_Boleta;
import Clases.Producto;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import java.awt.TextArea;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import javax.swing.JTextField;
import javax.swing.Box;
import java.awt.Panel;
import javax.swing.JTextArea;


public class guiboleta extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblNewLabel;
	private JLabel lblBoletaDeVenta;
	private JTextField txtid;
	private JLabel lblNewLabel_1;
	private JTextField txtfecha;
	private JLabel lblNewLabel_2;
	private JTextField txtdni;
	private JLabel lblNewLabel_3;
	private Panel panel;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JTextArea txtS_1;


	public guiboleta(JFrame parent, Boleta boleta) {
		setModal(true);
		setTitle("BOLETA DE VENTA");
		setBounds(100, 100, 434, 463);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			txtfecha = new JTextField(boleta.getFechaEmision().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
			txtfecha.setEditable(false);
			txtfecha.setBounds(116, 101, 112, 20);
			contentPanel.add(txtfecha);
			LocalDateTime now=LocalDateTime.now();
			DateTimeFormatter actual = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
			String horaactual=now.format(actual);
			txtfecha.setText(" "+horaactual);
			txtfecha.setColumns(10);
		}
		{
			lblNewLabel_2 = new JLabel("Fecha de Emisión:");
			lblNewLabel_2.setBounds(10, 103, 112, 14);
			contentPanel.add(lblNewLabel_2); 
		}
		{
			;
			String idCliente = boleta.getIdCliente();
			Cliente cliente = null;
			for (Cliente c : Arreglo_Cliente.listar_cliente()) {
				if (c.getIdCliente().equals(idCliente)) {
					cliente = c;
					break;
				}
			}
			if (cliente != null) {
				txtdni = new JTextField();
				txtdni.setEditable(false);
				txtdni.setBounds(36, 125, 86, 20);
				contentPanel.add(txtdni);
				txtdni.setColumns(10);

		}
		txtS = new JTextArea();
		txtS.setEditable(false);
		scrollPane = new JScrollPane(txtS);
		scrollPane.setBounds(10, 170, 400, 200);
		contentPanel.add(scrollPane);
		StringBuilder sb = new StringBuilder();
		for (Detalle_Boleta det : boleta.getDetalle()) {
		    Producto p = det.getProducto(); // CORRECTO: accedes al producto del detalle
		    sb.append("Producto: ").append(p.getNombreProducto()).append("\n");
		    sb.append("Cantidad: ").append(det.getCantidadComprada()).append("\n");
		    sb.append("Precio Unitario: ").append(p.getPrecio()).append("\n");
		    sb.append("Subtotal: ").append(det.getSubtotal()).append("\n\n");
		}
		sb.append("TOTAL: ").append(boleta.getTotal());
		txtS.setText(sb.toString());
		{
			lblNewLabel_3 = new JLabel("DNI:");
			lblNewLabel_3.setBounds(10, 128, 46, 14);
			contentPanel.add(lblNewLabel_3);
		}
			txtS_1 = new JTextArea();
			txtS_1.setEditable(false);
			scrollPane = new JScrollPane(txtS_1);
			scrollPane.setBounds(10, 170, 400, 200);
			contentPanel.add(scrollPane);
		{
			panel = new Panel();
			panel.setBounds(131, 10, 172, 73);
			contentPanel.add(panel);
			{
				lblNewLabel = new JLabel("BODEGA TECPROO");
				panel.add(lblNewLabel);
				lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
			}
			{
				lblBoletaDeVenta = new JLabel("BOLETA DE VENTA");
				panel.add(lblBoletaDeVenta);
				lblBoletaDeVenta.setFont(new Font("Times New Roman", Font.BOLD, 15));
			}
			{
				lblNewLabel_1 = new JLabel("001-");
				panel.add(lblNewLabel_1);
				lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
			}
			{
				txtid = new JTextField(String.valueOf(boleta.getIdBoleta()));
				panel.add(txtid);
				Random random = new Random();
		        int numeroAleatorio = random.nextInt(900) + 100;
		        txtid.setText(""+numeroAleatorio);
				txtid.setEditable(false);
				txtid.setColumns(10);
			}
		}
	}
}
}


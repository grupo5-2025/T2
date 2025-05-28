package proyecto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.Arreglo_Cliente;
import Clases.Arreglo_Producto;
import Clases.Arreglo_Proveedor;
import Clases.Boleta;
import Clases.Cliente;
import Clases.Detalle_Boleta;
import Clases.Producto;
import Clases.Proveedor;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.text.BreakIterator;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class interfaz extends JFrame implements ActionListener, ItemListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField txtcode;
	private JLabel lblNewLabel_1_1;
	private JTextField txtcant;
	private JLabel lblNewLabel_2;
	private JTextField txtprodu;
	private JLabel lblNewLabel_2_1;
	private JTextField txtdni;
	private JLabel lblNewLabel_2_1_1;
	private JLabel lblNewLabel_2_1_1_1;
	private JTextField txtsotckact;
	private JTextField txtstockrest;
	private JLabel lblNewLabel_2_1_1_2;
	private JLabel lblNewLabel_2_1_1_1_1;
	private JTextField txtpreciounitario;
	private JTextField txttotal;
	private JLabel lblNewLabel_2_2;
	private JTextField txtprovee;
	private JScrollPane scrollPane;
	private JButton btnIngresarDatos;
	private JButton btnGenerarBolelta;
	private JButton btnRegistrar;
	private JTextField txtCodconsul;
	private JTextArea txtSconsulta;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfaz frame = new interfaz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private Arreglo_Proveedor proveedores = new Arreglo_Proveedor();	
	private Arreglo_Producto productos = new Arreglo_Producto();
	public interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1168, 573);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.setBounds(10, 10, 1134, 516);
			contentPane.add(tabbedPane);
			{
				panel = new JPanel();
				tabbedPane.addTab("Ventas", null, panel, null);
				panel.setLayout(null);
				{
					lblNewLabel = new JLabel("BODEGA TECPROO");
					lblNewLabel.setBounds(459, 23, 165, 45);
					lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
					panel.add(lblNewLabel);
				}
				{
					lblNewLabel_1 = new JLabel("Código de producto:");
					lblNewLabel_1.setBounds(10, 79, 165, 24);
					lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
					panel.add(lblNewLabel_1);
				}
				{
					txtcode = new JTextField();
					txtcode.setBounds(141, 83, 134, 19);
					txtcode.setColumns(10);
					panel.add(txtcode);
				}
				{
					lblNewLabel_1_1 = new JLabel("Cantidad a adquirir:");
					lblNewLabel_1_1.setBounds(359, 78, 165, 24);
					lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
					panel.add(lblNewLabel_1_1);
				}
				{
					txtcant = new JTextField();
					txtcant.setBounds(492, 83, 112, 19);
					txtcant.setColumns(10);
					panel.add(txtcant);
				}
				{
					lblNewLabel_2 = new JLabel("Producto");
					lblNewLabel_2.setBounds(645, 142, 73, 24);
					panel.add(lblNewLabel_2);
				}
				{
					txtprodu = new JTextField();
					txtprodu.setBounds(728, 145, 156, 19);
					txtprodu.setEditable(false);
					txtprodu.setColumns(10);
					panel.add(txtprodu);
				}
				{
					lblNewLabel_2_1 = new JLabel("Ingresar DNI:");
					lblNewLabel_2_1.setBounds(914, 142, 91, 24);
					panel.add(lblNewLabel_2_1);
				}
				{
					txtdni = new JTextField();
					txtdni.setBounds(1015, 145, 96, 19);
					txtdni.setColumns(10);
					panel.add(txtdni);
				}
				{
					lblNewLabel_2_1_1 = new JLabel("Stock actual:");
					lblNewLabel_2_1_1.setBounds(645, 189, 91, 24);
					panel.add(lblNewLabel_2_1_1);
				}
				{
					lblNewLabel_2_1_1_1 = new JLabel("Stock restante:");
					lblNewLabel_2_1_1_1.setBounds(914, 189, 91, 24);
					panel.add(lblNewLabel_2_1_1_1);
				}
				{
					txtsotckact = new JTextField();
					txtsotckact.setBounds(729, 192, 96, 19);
					txtsotckact.setEditable(false);
					txtsotckact.setColumns(10);
					panel.add(txtsotckact);
				}
				{
					txtstockrest = new JTextField();
					txtstockrest.setBounds(1015, 192, 96, 19);
					txtstockrest.setEditable(false);
					txtstockrest.setColumns(10);
					panel.add(txtstockrest);
				}
				{
					lblNewLabel_2_1_1_2 = new JLabel("Precio unitario:");
					lblNewLabel_2_1_1_2.setBounds(645, 250, 134, 24);
					panel.add(lblNewLabel_2_1_1_2);
				}
				{
					lblNewLabel_2_1_1_1_1 = new JLabel("Precio total:");
					lblNewLabel_2_1_1_1_1.setBounds(914, 250, 91, 24);
					panel.add(lblNewLabel_2_1_1_1_1);
				}
				{
					txtpreciounitario = new JTextField();
					txtpreciounitario.setBounds(729, 253, 96, 19);
					txtpreciounitario.setEditable(false);
					txtpreciounitario.setColumns(10);
					panel.add(txtpreciounitario);
				}
				{
					txttotal = new JTextField();
					txttotal.setBounds(1015, 253, 96, 19);
					txttotal.setEditable(false);
					txttotal.setColumns(10);
					panel.add(txttotal);
				}
				{
					lblNewLabel_2_2 = new JLabel("Proveedor:");
					lblNewLabel_2_2.setBounds(645, 304, 73, 24);
					panel.add(lblNewLabel_2_2);
				}
				{
					txtprovee = new JTextField();
					txtprovee.setBounds(728, 307, 156, 19);
					txtprovee.setEditable(false);
					txtprovee.setColumns(10);
					panel.add(txtprovee);
				}
				{
					scrollPane = new JScrollPane();
					scrollPane.setBounds(10, 119, 584, 315);
					panel.add(scrollPane);
					{
						txtdatos = new JTextArea();
						txtdatos.setEditable(false);
						scrollPane.setViewportView(txtdatos);
					}
				}
				{
					btnIngresarDatos = new JButton("Ingresar datos");
					btnIngresarDatos.setBounds(971, 295, 140, 33);
					btnIngresarDatos.addActionListener(this);
					panel.add(btnIngresarDatos);
				}
				{
					btnGenerarBolelta = new JButton("Generar boleta");
					btnGenerarBolelta.setBounds(645, 401, 140, 33);
					btnGenerarBolelta.addActionListener(this);
					panel.add(btnGenerarBolelta);
				}
				{
					btnRegistrar = new JButton("Registrar");  
					btnRegistrar.setBounds(728, 76, 140, 33);
					btnRegistrar.addActionListener(this);
					panel.add(btnRegistrar);
				}
				{
					btnRegistrarNuevoStock = new JButton("Registrar nuevo stock");
					btnRegistrarNuevoStock.setBounds(888, 401, 195, 33);
					btnRegistrarNuevoStock.addActionListener(this);
					panel.add(btnRegistrarNuevoStock);
				}
				{
					scrollPane_3 = new JScrollPane();
					scrollPane_3.setBounds(411, 13, 0, 0);
					panel.add(scrollPane_3);
					{
						txtleer = new JTextArea();
						txtleer.setEditable(false);
						scrollPane_3.setViewportView(txtleer);
					}
				}
			}
			{
				panel_1 = new JPanel();
				tabbedPane.addTab("Consulta ", null, panel_1, null);
				panel_1.setLayout(null);
				
				JLabel lblNewLabel_3 = new JLabel("Ingresar código: ");
				lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblNewLabel_3.setBounds(320, 18, 230, 30);
				panel_1.add(lblNewLabel_3);
				
				txtCodconsul = new JTextField();
				txtCodconsul.setBounds(516, 26, 96, 19);
				panel_1.add(txtCodconsul);
				txtCodconsul.setColumns(10);
				
				JScrollPane scrollPane_1 = new JScrollPane();
				scrollPane_1.setBounds(27, 75, 1064, 351);
				panel_1.add(scrollPane_1);
				{
					txtSconsulta = new JTextArea();
					txtSconsulta.setEditable(false);
					scrollPane_1.setViewportView(txtSconsulta);
				}
				{
					lblNewLabel_11 = new JLabel("Consultar:");
					lblNewLabel_11.setBounds(27, 35, 101, 13);
					panel_1.add(lblNewLabel_11);
				}
				{
					cbtipoConsulta = new JComboBox();
					cbtipoConsulta.setModel(new DefaultComboBoxModel(new String[] {"Producto", "Proveedor"}));
					cbtipoConsulta.setBounds(122, 31, 115, 21);
					panel_1.add(cbtipoConsulta);
				}
				{
					btnConsultar = new JButton("Consultar");
					btnConsultar.addActionListener(this);
					btnConsultar.setBounds(683, 25, 85, 21);
					panel_1.add(btnConsultar);
				}
			}
			{
				panel_2 = new JPanel();
				tabbedPane.addTab("Registrar", null, panel_2, null);
				panel_2.setLayout(null);
				{
					lblNewLabel_4 = new JLabel("Registrar nuevo: ");
					lblNewLabel_4.setBounds(10, 14, 101, 13);
					panel_2.add(lblNewLabel_4);
				}
				{
					cbregistrar_nuevo = new JComboBox();
					cbregistrar_nuevo.addItemListener(this);
					cbregistrar_nuevo.setModel(new DefaultComboBoxModel(new String[] {"Producto", "Proveedor"}));
					cbregistrar_nuevo.setBounds(153, 10, 115, 21);
					panel_2.add(cbregistrar_nuevo);
				}
				{
					lblNewLabel_5 = new JLabel("ID producto");
					lblNewLabel_5.setBounds(24, 48, 161, 13);
					panel_2.add(lblNewLabel_5);
				}
				{
					txtregistrar_id_produ = new JTextField();
					txtregistrar_id_produ.setBounds(10, 71, 96, 19);
					panel_2.add(txtregistrar_id_produ);
					txtregistrar_id_produ.setColumns(10);
				}
				{
					lblNewLabel_6 = new JLabel("Nombre producto");
					lblNewLabel_6.setBounds(195, 48, 161, 13);
					panel_2.add(lblNewLabel_6);
				}
				{
					txtregis_nombre_produ = new JTextField();
					txtregis_nombre_produ.setColumns(10);
					txtregis_nombre_produ.setBounds(176, 71, 130, 19);
					panel_2.add(txtregis_nombre_produ);
				}
				{
					lblNewLabel_7 = new JLabel("Precio producto");
					lblNewLabel_7.setBounds(390, 48, 161, 13);
					panel_2.add(lblNewLabel_7);
				}
				{
					txtregis_precio = new JTextField();
					txtregis_precio.setColumns(10);
					txtregis_precio.setBounds(390, 71, 96, 19);
					panel_2.add(txtregis_precio);
				}
				{
					lblNewLabel_8 = new JLabel("ID proveedor");
					lblNewLabel_8.setBounds(584, 48, 161, 13);
					panel_2.add(lblNewLabel_8);
				}
				{
					txtregis_provee = new JTextField();
					txtregis_provee.setColumns(10);
					txtregis_provee.setBounds(570, 71, 96, 19);
					panel_2.add(txtregis_provee);
				}
				{
					lblNewLabel_9 = new JLabel("Nombre proveedor");
					lblNewLabel_9.setBounds(750, 48, 161, 13);
					panel_2.add(lblNewLabel_9);
				}
				{
					txtregis_nombreprovee = new JTextField();
					txtregis_nombreprovee.setEditable(false);
					txtregis_nombreprovee.setColumns(10);
					txtregis_nombreprovee.setBounds(736, 71, 130, 19);
					panel_2.add(txtregis_nombreprovee);
				}
				{
					lblNewLabel_10 = new JLabel("Ruc proveedor");
					lblNewLabel_10.setBounds(935, 48, 161, 13);
					panel_2.add(lblNewLabel_10);
				}
				{
					txtregist_ruc = new JTextField();
					txtregist_ruc.setEditable(false);
					txtregist_ruc.setColumns(10);
					txtregist_ruc.setBounds(921, 71, 107, 19);
					panel_2.add(txtregist_ruc);
				}
				{
					btnNewButton_1 = new JButton("Ingresar datos");
					btnNewButton_1.addActionListener(this);
					btnNewButton_1.setBounds(10, 100, 130, 21);
					panel_2.add(btnNewButton_1);
				}
				{
					scrollPane_2 = new JScrollPane();
					scrollPane_2.setBounds(10, 137, 1109, 250);
					panel_2.add(scrollPane_2);
					{
						txtSnuevo = new JTextArea();
						txtSnuevo.setEditable(false);
						scrollPane_2.setViewportView(txtSnuevo);
					}
				}
				{
					btnNewButton_2 = new JButton("Registrar");
					btnNewButton_2.addActionListener(this);
					btnNewButton_2.setBounds(952, 421, 125, 42);
					panel_2.add(btnNewButton_2);
				}
			}
		}
	}
	public int readcode() {
		return Integer.parseInt(txtcode.getText());
	}
	public int cant() {
		return Integer.parseInt(txtcant.getText());
	}
	private JTextArea txtdatos;
	private JPanel panel_2;
	private JButton btnRegistrarNuevoStock;
	private JLabel lblNewLabel_4;
	private JComboBox cbregistrar_nuevo;
	private JLabel lblNewLabel_5;
	private JTextField txtregistrar_id_produ;
	private JLabel lblNewLabel_6;
	private JTextField txtregis_nombre_produ;
	private JLabel lblNewLabel_7;
	private JTextField txtregis_precio;
	private JLabel lblNewLabel_8;
	private JTextField txtregis_provee;
	private JLabel lblNewLabel_9;
	private JTextField txtregis_nombreprovee;
	private JLabel lblNewLabel_10;
	private JTextField txtregist_ruc;
	private JButton btnNewButton_1;
	private JScrollPane scrollPane_2;
	private JTextArea txtSnuevo;
	private JButton btnNewButton_2;
	private JLabel lblNewLabel_11;
	private JComboBox cbtipoConsulta;
	private JButton btnConsultar;
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_2) {
			do_btnNewButton_2_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton_1) {
			do_btnNewButton_1_actionPerformed(e);
		}
		if (e.getSource() == btnConsultar) {
			do_btnConsultar_actionPerformed(e);
		}
		if (e.getSource() == btnRegistrarNuevoStock) {
			do_btnRegistrarNuevoStock_actionPerformed(e);
		}
		if (e.getSource() == btnIngresarDatos) {
			do_btnIngresarDatos_actionPerformed(e);
		}
		if (e.getSource() == btnRegistrar) {
			do_btnRegistrar_actionPerformed(e);
		}
		if (e.getSource() == btnGenerarBolelta) {
			do_btnGenerarBolelta_actionPerformed(e);
		}
	}
	private List<Boleta> listaBoletas = new ArrayList<>();
	private List<Cliente> listaClientes = new ArrayList<>();
	Boleta boletaActual;
	List<Detalle_Boleta> detallesActuales = new ArrayList<>();

	protected void do_btnGenerarBolelta_actionPerformed(ActionEvent e) {
	    if(txtdatos.getText().isBlank()) {
	        JOptionPane.showMessageDialog(this, "Ingrese datos, por favor");
	    } else {
	    	int dni = Integer.parseInt(txtdni.getText());
	    	Arreglo_Cliente client=new Arreglo_Cliente();
	    	Cliente clienteEncontrado = client.buscarPorDni(dni);
	    	Cliente cliente = new Cliente(listaBoletas.size() + 1, dni, clienteEncontrado.getNombre(), new ArrayList<>());
            List<Detalle_Boleta> detalles = new ArrayList<>();
            Producto producto = productos.buscar(readcode()); // 
            int cantidad = Integer.parseInt(txtcant.getText());
            double subtotal = cantidad * producto.getPrecio();
            double total=0;
            for (Detalle_Boleta d : detallesActuales) {
                total += d.getSubtotal();
            }
            Boleta boleta = new Boleta(
                    new Random().nextInt(900) + 100,
                    LocalDateTime.now(),
                    total,
                    cliente,
                    detallesActuales
                );

                Detalle_Boleta detalle = new Detalle_Boleta(cantidad, subtotal, producto, boleta);
                detalles.add(detalle);
                boleta.setDetalle(detalles);

                listaBoletas.add(boleta);
	    	guiboleta dialogo = new guiboleta(this, boleta);
	        dialogo.setVisible(true);
	    }
	}
	protected void do_btnRegistrar_actionPerformed(ActionEvent e) {
		
		if(txtcode.getText().isBlank()||txtcant.getText().isBlank()) 
		{
		JOptionPane.showMessageDialog(this, "Por favor ingresar cantidad y/o código válidos");
	}else {
		Producto ess=productos.buscar(readcode());
		if(ess!=null) {
			if(ess.getStock()<cant()) {
				JOptionPane.showMessageDialog(this, "Stock actual insuficiente");
			}else {
				txtprodu.setText(""+ess.getNombreProducto());
				txtsotckact.setText(""+ess.getStock());
				txtpreciounitario.setText(""+ess.getPrecio());
				txtprovee.setText(""+ess.getProveedor().getNombreProveedor());
				txtstockrest.setText(""+(ess.getStock()-cant()));
				txttotal.setText(""+ess.getPrecio()*cant());
				Producto producto = productos.buscar(readcode());
				int cantidad = Integer.parseInt(txtcant.getText());
				double subtotal = cantidad * producto.getPrecio();

				Detalle_Boleta detalle = new Detalle_Boleta(cantidad, subtotal, producto, boletaActual);
				detallesActuales.add(detalle);
			}
		}else { 
			JOptionPane.showMessageDialog(this, "Códio erróneo o inexistente");
		}
		}
	}
	
	protected void do_btnIngresarDatos_actionPerformed(ActionEvent e) {
	    
	    if (txtprodu.getText().isBlank()) {
	        JOptionPane.showMessageDialog(this, "Por favor ingrese código de producto y cantidad a adquirir");
	    } else {
	        try {
	    		Producto ess=productos.buscar(readcode());
	            String tam = txtdni.getText();
	            if (tam.length() != 8) {
	                JOptionPane.showMessageDialog(this, "El número de DNI debe contener 8 dígitos");
	                return;
	            }
	            int dni = Integer.parseInt(txtdni.getText());
	            int cantidadAdquirida = cant();
	            int stockActual = ess.getStock();
	            if (cantidadAdquirida > stockActual) {
	                JOptionPane.showMessageDialog(this, "Cantidad adquirida excede el stock disponible");
	                return;
	            }
	            int nuevoStock = stockActual - cantidadAdquirida;
	            ess.setStock(nuevoStock);

	            imprimir(" Código de producto: " + ess.getIdproducto() + "\n");
	            imprimir("Producto: " + ess.getNombreProducto() + "\n");
	            leer("Producto: " + ess.getNombreProducto() + "\t");
	            imprimir("Cantidad adquirida: " + cantidadAdquirida + "\n");
	            leer("Cantidad adquirida: " + cantidadAdquirida + "\n");
	            imprimir("DNI: " + txtdni.getText() + "\n");
	            imprimir("Stock antes: " + stockActual + "\n");
	            imprimir("Stock restante: " + nuevoStock + "\n");
	            imprimir("Proveedor: " + ess.getProveedor().getNombreProveedor()+ "\n");
	            imprimir("Precio unitario: " + ess.getPrecio() + "\n");
	            leer("Precio unitario: " + ess.getPrecio() + "\t");
	            imprimir("Total a pagar: " + txttotal.getText() + "\n");
	            leer("Precio Total: " + txttotal.getText() + "\n");
	            imprimir();
	            guardarHistorial(
	                "Código de producto: " + ess.getIdproducto() +
	                ", Producto: " + ess.getNombreProducto() +
	                ", Cantidad adquirida: " + cantidadAdquirida +
	                ", DNI: " + dni +
	                ", Stock antes: " + stockActual +
	                ", Stock restante: " + nuevoStock +
	                ", Proveedor: " + ess.getProveedor() +
	                ", Precio unitario: " + ess.getPrecio() +
	                ", Total a pagar: " + txttotal.getText()

	            );

	        } catch (Exception fd) {
	            JOptionPane.showMessageDialog(this, "Ingresó DNI incorrecto");
	        }
	    }
	}

	private void guardarHistorial(String texto) {
	    try (BufferedWriter bw = new BufferedWriter(new FileWriter("historial_stock.txt", true))) {
	        bw.write(texto);
	        bw.newLine();
	    } catch (IOException ex) {
	        JOptionPane.showMessageDialog(this, "Error al guardar historial: " + ex.getMessage());
	    }
	}
	public void imprimir() {
		txtdatos.append("=====================\n");
	}
	public void imprimir(String g) {
		txtdatos.append(g);
	}
	public void leer(String l) {
		txtleer.append(l);
	}
	protected void do_btnRegistrarNuevoStock_actionPerformed(ActionEvent e) {
		guia_remisión bol=new guia_remisión();
		bol.setVisible(true);
	}
	protected void do_btnConsultar_actionPerformed(ActionEvent e) {
		int tipo = cbtipoConsulta.getSelectedIndex();
		int codigo = Integer.parseInt(txtCodconsul.getText());

		switch (tipo) {
		    case 0: { 
		        Producto p = productos.buscar(codigo);
		        if (p != null) {
		            txtSconsulta.setText("");
		            txtSconsulta.append("Id producto\tProducto\tPrecio\tStock\tProveedor\n");
		            txtSconsulta.append(p.getIdproducto() + "\t" + p.getNombreProducto() + "\t" +
		                                p.getPrecio() + "\t" + p.getStock() + "\t" +
		                                p.getProveedor().getNombreProveedor());
		        } else {
		            JOptionPane.showMessageDialog(this, "Producto no registrado");
		        }
		        break;
		    }
		    default: { 
		        Proveedor p = proveedores.buscar(codigo);
		        if (p != null) {
		            txtSconsulta.setText("");
		            txtSconsulta.append("Id proveedor\tProveedor\tRUC\n");
		            txtSconsulta.append(p.getIdproveedor() + "\t" + p.getNombreProveedor() + "\t" +
		                                p.getRuc());
		        } else {
		            JOptionPane.showMessageDialog(this, "Proveedor no registrado");
		        }
		        break;
		    }
		}
	}
	protected void do_btnNewButton_1_actionPerformed(ActionEvent e) {
		try {
		int index=cbregistrar_nuevo.getSelectedIndex();
		switch (index) {
		case 0: {
			int id=Integer.parseInt(txtregistrar_id_produ.getText());
			String nombre=txtregis_nombre_produ.getText();
			double precio=Double.parseDouble(txtregis_precio.getText());
			int idproveedor=Integer.parseInt(txtregis_provee.getText());
			txtSnuevo.setText("");
			txtSnuevo.append(" ID Producto \t Producto \t Precio \t ID Proveedor \n"+
			txtregistrar_id_produ.getText()+" \t "+txtregis_nombre_produ.getText()+" \t "+txtregis_precio.getText()+" \t "+txtregis_provee.getText());
			break;
		}
		default:
			txtregis_nombre_produ.setEditable(false);
			txtregistrar_id_produ.setEditable(false);
			int id=Integer.parseInt(txtregis_provee.getText());
			String nombre=txtregis_nombreprovee.getText();
			int ruc=Integer.parseInt(txtregist_ruc.getText());
			txtSnuevo.setText("");
			txtSnuevo.append(" ID Proveedor \t Proveedor \t Ruc \n"+
			txtregis_provee.getText()+" \t "+txtregis_nombreprovee.getText()+" \t "+txtregist_ruc.getText());
			break;
		}
	}catch (Exception e2) {
		JOptionPane.showMessageDialog(this, "Ingresó datos inválidos");
	}
	}
	
	private JScrollPane scrollPane_3;
	private JTextArea txtleer;
	protected void do_btnNewButton_2_actionPerformed(ActionEvent e) {
		int posicion=cbregistrar_nuevo.getSelectedIndex();
		switch (posicion) {
		case 0: {
			if (!txtSnuevo.getText().isBlank()) {
		        int id = Integer.parseInt(txtregistrar_id_produ.getText());
		        String nombre = txtregis_nombre_produ.getText();
		        double precio = Double.parseDouble(txtregis_precio.getText());
		        int idproveedor = Integer.parseInt(txtregis_provee.getText());
		        Proveedor prov = proveedores.buscar(idproveedor);
		        if (prov != null) {
		            Producto produ = new Producto(id, 0, nombre, precio, prov);
		            productos.adicionar(produ);
		            prov.agregarProducto(produ); 
		            JOptionPane.showMessageDialog(this,"Producto registrado correctamente");
		        }else {
		        	JOptionPane.showMessageDialog(this, "Proveedor no registrado");
		        }
		    }
			break;
		}
		default:
			if (!txtSnuevo.getText().isBlank()) {
				int id = Integer.parseInt(txtregis_provee.getText());
			    int ruc = Integer.parseInt(txtregist_ruc.getText());
			    String nombre = txtregis_nombreprovee.getText();
			    if (proveedores.buscar(id) != null) {
			        JOptionPane.showMessageDialog(this, "Proveedor ya registrado");
			        return;
			    }
			    Proveedor nuevo = new Proveedor(id, ruc, nombre);
			    proveedores.adicionar(nuevo);
			    JOptionPane.showMessageDialog(this, "Proveedor agregado correctamente");
		    }
		}
		 
	}
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == cbregistrar_nuevo) {
			do_cbregistrar_nuevo_itemStateChanged(e);
		}
	}
	protected void do_cbregistrar_nuevo_itemStateChanged(ItemEvent e) {
		int posicion= cbregistrar_nuevo.getSelectedIndex();
		switch (posicion) {
		case 0: {
			bloquear();
			txtregistrar_id_produ.setEditable(true);
			txtregis_nombre_produ.setEditable(true);
			txtregis_precio.setEditable(true);
			txtregis_provee.setEditable(true);
		break;
		}
		default:
			bloquear();
			txtregis_provee.setEditable(true);
			txtregis_nombreprovee.setEditable(true);
			txtregist_ruc.setEditable(true);
			
		}
	}
	void bloquear() {
		txtregis_nombre_produ.setEditable(false);
		txtregistrar_id_produ.setEditable(false);
		txtregis_precio.setEditable(false);
		txtregis_provee.setEditable(false);
		txtregis_nombreprovee.setEditable(false);
		txtregist_ruc.setEditable(false);
	}
}

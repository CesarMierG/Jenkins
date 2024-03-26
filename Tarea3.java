package interfaz;
import javax.swing.JOptionPane;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;


import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JComboBox;

import javax.swing.JTextArea;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.Font;

public class Tarea3 {

	
	private JFrame frame;
	private JTextField txtNombre;

	/**
	 *Lanzamos la aplicación.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tarea3 window = new Tarea3();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Creamos la aplicación.
	 */
	public Tarea3() {
		initialize();
	}
	

	/**
	 * Inicializamos las propiedades del frame
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setFont(new Font("Berlin Sans FB", Font.PLAIN, 12));
		frame.setBounds(100, 100, 824, 434);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	    frame.setResizable(false);
		txtNombre = new JTextField();
		txtNombre.setText("");
		txtNombre.setBounds(144, 82, 86, 20);
		frame.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
	                                                            	//iniciamos los componentes de la aplicacion
		JLabel lblTotal = new JLabel("0");
		lblTotal.setBounds(167, 339, 46, 14);
		frame.getContentPane().add(lblTotal);
		
		JLabel lblTotalcompra = new JLabel("Total Compra");
		lblTotalcompra.setBounds(144, 299, 86, 29);
		frame.getContentPane().add(lblTotalcompra);
		
	
	
		JCheckBox chkHuevos = new JCheckBox("Huevos 3$");
		chkHuevos.setBounds(36, 228, 97, 23);
		frame.getContentPane().add(chkHuevos);
		
		JCheckBox chkPatatas = new JCheckBox("Patatas 5$");
		chkPatatas.setBounds(36, 254, 97, 23);
		frame.getContentPane().add(chkPatatas);
		
		JCheckBox chkAceite = new JCheckBox("Aceite 8$");
		chkAceite.setBounds(36, 280, 102, 23);
		frame.getContentPane().add(chkAceite);
		
		JCheckBox chkCecina = new JCheckBox("Cecina 10$");
		chkCecina.setBounds(36, 306, 102, 23);
		frame.getContentPane().add(chkCecina);
		
		JLabel lblNewLabel = new JLabel("€");
		lblNewLabel.setBounds(191, 339, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(36, 85, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Lista de precios");
		lblNewLabel_2.setBounds(36, 191, 97, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Indicaciones Adicionales");
		lblNewLabel_3.setBounds(336, 85, 165, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Descuento");
		lblNewLabel_4.setBounds(581, 85, 107, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Opción de recogida");
		lblNewLabel_5.setBounds(325, 258, 124, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		final JRadioButton rdbtienda = new JRadioButton("Recogida en tienda");                  //rdbboton para que siempre este activo recogida en tienda
		rdbtienda.setSelected(true);
		rdbtienda.setBounds(335, 302, 149, 23);
		frame.getContentPane().add(rdbtienda);
		
final JLabel lblhidde = new JLabel("");
		
		lblhidde.setEnabled(false);
		lblhidde.setBounds(336, 339, 102, 14);
		frame.getContentPane().add(lblhidde);
		
		
		final JRadioButton rdbcasa = new JRadioButton("Envio a casa");
	
		rdbcasa.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				rdbtienda.setSelected(false);
			      lblhidde.setEnabled(true);
			}
			@Override
			public void focusLost(FocusEvent e) {
				rdbcasa.setSelected(true);
			}
		});
		rdbcasa.setBounds(335, 280, 109, 23);
		frame.getContentPane().add(rdbcasa);
		
		
		rdbtienda.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblhidde.setEnabled(false);
				rdbcasa.setSelected(false);
			}
			
		});
		rdbtienda.setSelected(true);
		rdbtienda.setBounds(335, 302, 149, 23);
		frame.getContentPane().add(rdbtienda);
	
		
		
		
		JButton btnIrme = new JButton("Irme sin comprar");       //accion del boton irme para que emita un mensaje de advertencia
		btnIrme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			

				  

				   int input = JOptionPane.showConfirmDialog(null, 
			                "Pulsa si estas seguro", "Salir", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
				   if(input == JOptionPane.YES_OPTION) {
		                System.exit(0);
		            if(input == JOptionPane.NO_OPTION) {
		           
		                }
		              }
			        System.out.println(input);


				    
				
				
			}
		});
		btnIrme.setBounds(645, 302, 138, 23);
		frame.getContentPane().add(btnIrme);
		
		JComboBox comboBox = new JComboBox<String>();           //añaidimos las opciones al combobox
		comboBox.setBounds(581, 110, 134, 22);
		frame.getContentPane().add(comboBox);
		comboBox.addItem("Sin descuento");
        comboBox.addItem("Con descuento");
       
		comboBox.setToolTipText("");
		
		JTextArea txtSS = new JTextArea();
		txtSS.setBounds(325, 109, 149, 125);                        // con una serie if else elegimos la opcion marcada y que la muestre en una label suma si se escoge y resta si se deselecciona 
		frame.getContentPane().add(txtSS);
		
		chkCecina.addItemListener(new ItemListener() {                  
			public void itemStateChanged(ItemEvent e) {
				rdbcasa.setVisible(true);
				if(chkHuevos.isSelected()&chkAceite.isSelected()&chkPatatas.isSelected()&chkCecina.isSelected()){
					lblTotal.setText(String.valueOf(validarHuevos()+validarAceite()+validarPatatas()+validarCecina()));
				}
				
				else
				
				if(chkHuevos.isSelected()&chkAceite.isSelected()&chkPatatas.isSelected()){
					lblTotal.setText(String.valueOf(validarHuevos()+validarAceite()+validarPatatas()));
				}
				
				else
					if(chkCecina.isSelected()&chkAceite.isSelected()&chkPatatas.isSelected()){
						lblTotal.setText(String.valueOf(validarCecina()+validarAceite()+validarPatatas()));
					}
					else
						if(chkCecina.isSelected()&chkHuevos.isSelected()&chkPatatas.isSelected()){
							lblTotal.setText(String.valueOf(validarCecina()+validarHuevos()+validarPatatas()));
						}
						else
							if(chkCecina.isSelected()&chkHuevos.isSelected()&chkAceite.isSelected()){
								lblTotal.setText(String.valueOf(validarHuevos()+validarCecina()+validarAceite()));
							}
				else
					
					
					if(chkHuevos.isSelected()&chkCecina.isSelected()){
						lblTotal.setText(String.valueOf(validarHuevos()+validarCecina()));
					}
					else
						if(chkCecina.isSelected()&chkPatatas.isSelected()){
							lblTotal.setText(String.valueOf(validarCecina()+validarPatatas()));
						}
				else
					
					
					if(chkHuevos.isSelected()&chkPatatas.isSelected()){
						lblTotal.setText(String.valueOf(validarHuevos()+validarPatatas()));
					}
				else
				
				
				if(chkHuevos.isSelected()&chkAceite.isSelected()){
					lblTotal.setText(String.valueOf(validarHuevos()+validarAceite()));
				}
				
				else
				if (chkHuevos.isSelected()){
			
					
					lblTotal.setText(String.valueOf(validarHuevos()));}
				
				else
					if(chkPatatas.isSelected()&chkAceite.isSelected()){
						lblTotal.setText(String.valueOf(validarPatatas()+validarAceite()));
					}
				
					else
						if(chkPatatas.isSelected()&chkAceite.isSelected()){
							lblTotal.setText(String.valueOf(validarPatatas()+validarAceite()));
						}
				
						else
							if(chkCecina.isSelected()&chkHuevos.isSelected()){
								lblTotal.setText(String.valueOf(validarCecina()+validarHuevos()));
							}
						
				
				
				else
				if(chkCecina.isSelected()&chkAceite.isSelected()){
					lblTotal.setText(String.valueOf(validarCecina()+validarAceite()));
				}
			
					else
						if(chkPatatas.isSelected()){
							lblTotal.setText(String.valueOf(validarPatatas()));
						
						}
						else
							if(chkAceite.isSelected()){
								lblTotal.setText(String.valueOf(validarAceite()));
							
							}
							else
								if(chkCecina.isSelected()){
									lblTotal.setText(String.valueOf(validarCecina()));
								
								}
						else 
							if (chkCecina.isSelected()==false){
							lblTotal.setText(String.valueOf(0));}
				
				}
		});
		
		chkAceite.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				rdbcasa.setVisible(true);

				if(chkHuevos.isSelected()&chkAceite.isSelected()&chkPatatas.isSelected()&chkCecina.isSelected()){
					lblTotal.setText(String.valueOf(validarHuevos()+validarAceite()+validarPatatas()+validarCecina()));
				}
				else
					
					if(chkHuevos.isSelected()&chkAceite.isSelected()&chkCecina.isSelected()){
						lblTotal.setText(String.valueOf(validarHuevos()+validarAceite()+validarCecina()));
					}
				else
				
				if(chkCecina.isSelected()&chkAceite.isSelected()&chkPatatas.isSelected()){
					lblTotal.setText(String.valueOf(validarCecina()+validarAceite()+validarPatatas()));
				}
				
				else
					if(chkCecina.isSelected()&chkPatatas.isSelected()&chkHuevos.isSelected()){
						lblTotal.setText(String.valueOf(validarCecina()+validarPatatas()+validarHuevos()));
					}
					else
						if(chkCecina.isSelected()&chkPatatas.isSelected()&chkHuevos.isSelected()){
							lblTotal.setText(String.valueOf(validarCecina()+validarPatatas()+validarHuevos()));
						}
				else
					
						
						if(chkHuevos.isSelected()&chkAceite.isSelected()&chkPatatas.isSelected()){
							lblTotal.setText(String.valueOf(validarHuevos()+validarAceite()+validarPatatas()));
						}
						else
					if(chkHuevos.isSelected()&chkCecina.isSelected()){
						lblTotal.setText(String.valueOf(validarHuevos()+validarCecina()));
					}
				else
					
					
					if(chkHuevos.isSelected()&chkPatatas.isSelected()){
						lblTotal.setText(String.valueOf(validarHuevos()+validarPatatas()));
					}
					else
						
						
						if(chkCecina.isSelected()&chkPatatas.isSelected()){
							lblTotal.setText(String.valueOf(validarCecina()+validarPatatas()));
						}
				else
				
				
				if(chkHuevos.isSelected()&chkAceite.isSelected()){
					lblTotal.setText(String.valueOf(validarHuevos()+validarAceite()));
				}
				
				else
				if (chkHuevos.isSelected()){
			
					
					lblTotal.setText(String.valueOf(validarHuevos()));}
				
				else
					if(chkPatatas.isSelected()&chkAceite.isSelected()){
						lblTotal.setText(String.valueOf(validarPatatas()+validarAceite()));
					}
				
					else
						if(chkPatatas.isSelected()&chkAceite.isSelected()){
							lblTotal.setText(String.valueOf(validarPatatas()+validarAceite()));
						}
				

						
				
				
				else
				if(chkCecina.isSelected()&chkAceite.isSelected()){
					lblTotal.setText(String.valueOf(validarCecina()+validarAceite()));
				}
			
					else
						if(chkPatatas.isSelected()){
							lblTotal.setText(String.valueOf(validarPatatas()));
						
						}
						else
							if(chkAceite.isSelected()){
								lblTotal.setText(String.valueOf(validarAceite()));
							
							}
							else
								if(chkCecina.isSelected()){
									lblTotal.setText(String.valueOf(validarCecina()));
								
								}
						else 
							if (chkAceite.isSelected()==false){
							lblTotal.setText(String.valueOf(0));}
				
				}
			
		});
		chkPatatas.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				rdbcasa.setVisible(true);
				if(chkHuevos.isSelected()&chkAceite.isSelected()&chkPatatas.isSelected()&chkCecina.isSelected()){
					lblTotal.setText(String.valueOf(validarHuevos()+validarAceite()+validarPatatas()+validarCecina()));
				}
				
				else
				
				if(chkHuevos.isSelected()&chkAceite.isSelected()&chkPatatas.isSelected()){
					lblTotal.setText(String.valueOf(validarHuevos()+validarAceite()+validarPatatas()));
				}
				
				else
					if(chkCecina.isSelected()&chkHuevos.isSelected()&chkPatatas.isSelected()){
						lblTotal.setText(String.valueOf(validarCecina()+validarHuevos()+validarPatatas()));
					}
				else
					
						
						if(chkCecina.isSelected()&chkAceite.isSelected()&chkPatatas.isSelected()){
							lblTotal.setText(String.valueOf(validarCecina()+validarAceite()+validarPatatas()));
						}
						else
						if(chkCecina.isSelected()&chkHuevos.isSelected()&chkAceite.isSelected()){
							lblTotal.setText(String.valueOf(validarCecina()+validarHuevos()+validarAceite()));
						}
						else	
					if(chkHuevos.isSelected()&chkCecina.isSelected()){
						lblTotal.setText(String.valueOf(validarHuevos()+validarCecina()));
					}
				else
					
					
					if(chkHuevos.isSelected()&chkPatatas.isSelected()){
						lblTotal.setText(String.valueOf(validarHuevos()+validarPatatas()));
					}
				else
				
				
				if(chkHuevos.isSelected()&chkAceite.isSelected()){
					lblTotal.setText(String.valueOf(validarHuevos()+validarAceite()));
				}
				else
					if(chkCecina.isSelected()&chkPatatas.isSelected()){
						lblTotal.setText(String.valueOf(validarCecina()+validarPatatas()));
					}
				else
				if (chkHuevos.isSelected()){
			
					
					lblTotal.setText(String.valueOf(validarHuevos()));}
				
				else
					if(chkPatatas.isSelected()&chkAceite.isSelected()){
						lblTotal.setText(String.valueOf(validarPatatas()+validarAceite()));
					}
				
					else
						if(chkPatatas.isSelected()&chkAceite.isSelected()){
							lblTotal.setText(String.valueOf(validarPatatas()+validarAceite()));
						}
				

						
				
				
				else
				if(chkCecina.isSelected()&chkAceite.isSelected()){
					lblTotal.setText(String.valueOf(validarCecina()+validarAceite()));
				}
			
					else
						if(chkPatatas.isSelected()){
							lblTotal.setText(String.valueOf(validarPatatas()));
						
						}
						else
							if(chkAceite.isSelected()){
								lblTotal.setText(String.valueOf(validarAceite()));
							
							}
							else
								if(chkCecina.isSelected()){
									lblTotal.setText(String.valueOf(validarCecina()));
								
								}
						else 
							if (chkPatatas.isSelected()==false){
							lblTotal.setText(String.valueOf(0));}
				
				}
			
	});
		

		chkHuevos.addItemListener(new ItemListener() {
		
		
			public void itemStateChanged(ItemEvent e) {
				rdbcasa.setVisible(true);
				if(chkHuevos.isSelected()&chkAceite.isSelected()&chkPatatas.isSelected()&chkCecina.isSelected()){
					lblTotal.setText(String.valueOf(validarHuevos()+validarAceite()+validarPatatas()+validarCecina()));
				}
				
				else
				
				if(chkHuevos.isSelected()&chkAceite.isSelected()&chkPatatas.isSelected()){
					lblTotal.setText(String.valueOf(validarHuevos()+validarAceite()+validarPatatas()));
				}

				else
				
				if(chkHuevos.isSelected()&chkAceite.isSelected()&chkCecina.isSelected()){
					lblTotal.setText(String.valueOf(validarHuevos()+validarAceite()+validarCecina()));
				}
				
				
				else
					if(chkCecina.isSelected()&chkAceite.isSelected()&chkPatatas.isSelected()){
						lblTotal.setText(String.valueOf(validarCecina()+validarAceite()+validarPatatas()));
					}
					else
						if(chkCecina.isSelected()&chkHuevos.isSelected()&chkPatatas.isSelected()){
							lblTotal.setText(String.valueOf(validarCecina()+validarHuevos()+validarPatatas()));
						}
				else
					
					
					if(chkHuevos.isSelected()&chkCecina.isSelected()){
						lblTotal.setText(String.valueOf(validarHuevos()+validarCecina()));
					}
				else
					
					
					if(chkHuevos.isSelected()&chkPatatas.isSelected()){
						lblTotal.setText(String.valueOf(validarHuevos()+validarPatatas()));
					}
				else
				
				
				if(chkHuevos.isSelected()&chkAceite.isSelected()){
					lblTotal.setText(String.valueOf(validarHuevos()+validarAceite()));
				}
				
				else
				if (chkHuevos.isSelected()){
			
					
					lblTotal.setText(String.valueOf(validarHuevos()));}
				
				else
					if(chkPatatas.isSelected()&chkAceite.isSelected()){
						lblTotal.setText(String.valueOf(validarPatatas()+validarAceite()));
					}
				
					else
						if(chkPatatas.isSelected()&chkAceite.isSelected()){
							lblTotal.setText(String.valueOf(validarPatatas()+validarAceite()));
						}
				

						
				
				
				else
				if(chkCecina.isSelected()&chkAceite.isSelected()){
					lblTotal.setText(String.valueOf(validarCecina()+validarAceite()));
				}
			
					else
						if(chkPatatas.isSelected()){
							lblTotal.setText(String.valueOf(validarPatatas()));
						
						}
						else
							if(chkAceite.isSelected()){
								lblTotal.setText(String.valueOf(validarAceite()));
							
							}
							else
								if(chkCecina.isSelected()){
									lblTotal.setText(String.valueOf(validarCecina()));
								
								}
						else 
							if (chkHuevos.isSelected()==false){
							lblTotal.setText(String.valueOf(0));}
				
				}
			
		});
		
		
		
		
		
		JButton btnLimpiar = new JButton("Limpiar Seleccion");    // boton que reinicia las opciones marcadas
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chkHuevos.setSelected(false);
				chkPatatas.setSelected(false);
				chkAceite.setSelected(false);
				chkCecina.setSelected(false);
				lblTotal.setText(String.valueOf(0));
				rdbtienda.setSelected(true);
				rdbcasa.setSelected(false);
				txtNombre.setText(null);
				txtSS.setText(null);
				comboBox.setSelectedIndex(1);
			}
		});
		btnLimpiar.setBounds(496, 302, 139, 23);
		frame.getContentPane().add(btnLimpiar);
		                                                                                     //Envento del boton comprar que escoge entre envio a casa o tienda y muestra por pantalla las opciones escogidas si para casa nos pide la direccion
		JButton btnCompra = new JButton("Comprar");
		btnCompra.addActionListener(new ActionListener() {
			String direccion;
			public void actionPerformed(ActionEvent e) {
				   if(lblhidde.isEnabled()&rdbcasa.isSelected()){
						
				  		 direccion = JOptionPane.showInputDialog("Introduce dirección de envio");
				  		
				  		}
				
				
				
				if(chkHuevos.isSelected()||chkAceite.isSelected()||chkPatatas.isSelected()||chkCecina.isSelected()) {
				
		  
				
      
      
     if(rdbtienda.isSelected()||rdbcasa.isSelected()) {
    	
    	 
    	
    			double precio,preciofinal;
    			int combo= comboBox.getSelectedIndex();
    			 
    			String Nombre=txtNombre.getText();
    			String Info=txtSS.getText();
    			String Descuento=(String) comboBox.getSelectedItem();
    			String casa;
    			String Compra;
    			String Compra1;
    			String Compra2;
    			String Compra3;
    			if(rdbtienda.isSelected()) {
    				direccion="";
    				casa=rdbtienda.getText();
    			}else {
    			casa=rdbcasa.getText();
     }
    			
    			
    			
if(chkHuevos.isSelected()) {
    				
    				Compra=chkHuevos.getText();
    			}else {
    			Compra="";
    			
     }
if(chkPatatas.isSelected()) { 
	
	Compra1=chkPatatas.getText();
}else{
	Compra1="";
}
if(chkAceite.isSelected()) 
	
{	Compra2=chkAceite.getText();

}else{
	Compra2="";
}
if(chkCecina.isSelected()) 
{
	Compra3=chkCecina.getText();
}else{
	Compra3="";
}
    			if(combo==1){
    			      
    				
    		      	  precio=Double.parseDouble(lblTotal.getText());
    		      	  preciofinal=precio*0.9;
    		      	JOptionPane.showMessageDialog(null, "Nombre:   " + Nombre +" \n" + "Descuento:   "+ Descuento + "\n" +"Indicaciones: "+Info + "\n"+"\n"+"\n"+  "Envio: "+ casa+"\n" +"Direccion:   " + direccion+"\n" +"Compra: "+"\n"+Compra+"\n"+Compra1+"\n"+Compra2+"\n"+Compra3+"\n"+"-------------"+"\n"+ "Total con descuento 10%: " + String.format("%.2f", preciofinal)+"€" );
    				
    		    	rdbtienda.setSelected(true);
    		    		chkHuevos.setSelected(false);
    		    		chkPatatas.setSelected(false);
    		    		chkAceite.setSelected(false);
    		    		chkCecina.setSelected(false);
    		    		rdbcasa.setSelected(false);
    		    		comboBox.setSelectedIndex(0);
    		        }else {
    		            preciofinal=Double.parseDouble(lblTotal.getText());
    		        
    			
    			
    		
    	 
    	 
    	 
    	 
    
		
		JOptionPane.showMessageDialog(null, "Nombre:   " + Nombre +" \n" + "Descuento:   "+ Descuento + "\n" +"Indicaciones: "+Info+   "\n"+"\n"+"\n"+ "---------------"+"\n" +"Envio: "+ casa+"\n"+"Direccion:   " + direccion+"\n"+"Compra: "+"\n"+Compra+"\n"+Compra1+"\n"+Compra2+"\n"+Compra3+"\n"+"-------------"+ "\n"+"Total: " + preciofinal+"€" );
		
	
		chkHuevos.setSelected(false);
		chkPatatas.setSelected(false);
		chkAceite.setSelected(false);
		chkCecina.setSelected(false);
		rdbtienda.setSelected(true);
		rdbcasa.setSelected(false);
		comboBox.setSelectedIndex(0);
}          }           

}else {
	
		JOptionPane.showMessageDialog(null, "No se ha seleccionado nada " );
	
}
}
		});
		btnCompra.setBounds(559, 247, 156, 36);
		frame.getContentPane().add(btnCompra);
		
		
}
	

	public int validarHuevos() {                                          //variables que asignan un valor a cada checkbox
		// TODO Auto-generated method stub
		
		int a=3;
	return a;
	}

	public int validarPatatas() {
		// TODO Auto-generated method stub
		
		int a=5;
	return a;
	}

	public int validarAceite() {
		// TODO Auto-generated method stub
		
		int a=8;
	return a;
	}

	public int validarCecina() {
		// TODO Auto-generated method stub
		
		int a=10;
	return a;
	}
	
	
	
}
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazGrafica extends JFrame implements ActionListener{
	private JLabel titulo; 																//<-- ETIQUETA TITULO REGISTRO DE ALUMNOS
	private JLabel labelCorreo, labelFecha, labelNombre;								//<-- ETIQUETAS CORREO, FECHA, NOMBRE
	private JLabel labelVerificacionCorreo; 											//<-- ETIQUETA VERIFICACION DE CORREO
	private JLabel labelVerificacionNombre; 											//<-- ETIQUETA VERIFICACION DEL NOMBRE
	private JTextField entradaTextoCorreo, entradaTextoNombre, entradaTextoNacimiento;	//<-- DEFINE UNA ENTRADA DE TEXTO
	private JButton botonRegistrar;														//<-- DEFINE UN BOTON REGISTRAR
	
	InterfazGrafica(){
		setLayout(null);
		
		//CONSTRUCCIÓN DE UNA ETIQUETA TITULO REGISTRO DE ALUMNOS
		titulo = new JLabel("Registro de Alumnos");
		titulo.setBounds(300,40,300,25);
		add(titulo);
				
		//CONSTRUCCIÓN DE LA ETIQUETA DATO CORREO ELECTRONICO
		labelCorreo = new JLabel("Correo Electronico:");
		labelCorreo.setBounds(90,90,200,25);
		add(labelCorreo);
		
		//VERIFICACION DEL CORREO ELECTRONICO
		labelVerificacionCorreo = new JLabel("");
		labelVerificacionCorreo.setBounds(450,90,200,25);
		add(labelVerificacionCorreo);
				
		//CONSTRUCCION DE LA ETIQUETA (DATO NOMBRE COMPLETO)
		labelNombre = new JLabel("Nombre Completo:");
		labelNombre.setBounds(90,140,200,25);
		add(labelNombre);
		
		//VERIFICACION DEL NOMBRE
		labelVerificacionNombre = new JLabel("");
		labelVerificacionNombre.setBounds(450,140,200,25);
		add(labelVerificacionNombre);
		
		//CONSTRUCCION DE LA ETIQUETA (DATO FECHA DE NACIMIENTO)
		labelFecha = new JLabel("Fecha de Nacimiento:");
		labelFecha.setBounds(90,190,200,25);
		add(labelFecha);
	
		/******************************************************
		 * CONSTRUCCION DE LAS ENTRADAS DE TEXTO (JTextField)
		 * ****************************************************/
					
		//CONSTRUCCIÓN DE UNA ENTRADA DE TEXTO (CORREO ELECTRONICO)
		entradaTextoCorreo = new JTextField();
		entradaTextoCorreo.setBounds(230,90,195,25);
		add(entradaTextoCorreo);
				
		//CONSTRUCCIÓN DE UNA ENTRADA DE TEXTO (NOMBRE COMPLETO)
		entradaTextoNombre = new JTextField();
		entradaTextoNombre.setBounds(230,140,195,25);
		add(entradaTextoNombre);
				
		//CONSTRUCCIÓN DE UNA ENTRADA DE TEXTO (FECHA DE NACIMIENTO)
		entradaTextoNacimiento = new JTextField();
		entradaTextoNacimiento.setBounds(230,190,195,25);
		add(entradaTextoNacimiento);
		
		//CONSTRUCCIÓN DE UN BOTON DE REGISTRO
		botonRegistrar = new JButton("Registrar");
		botonRegistrar.setBounds(90,270,130,25);
		add(botonRegistrar);	
		botonRegistrar.addActionListener(this);	
	}
	
	public void ventanaDeRegistro(){
		InterfazGrafica interfazGrafica = new InterfazGrafica();
		interfazGrafica.setBounds(0,0,700,450);  
		interfazGrafica.setVisible(true);        
		interfazGrafica.setResizable(false);     
		interfazGrafica.setLocationRelativeTo(null);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == botonRegistrar) {
			
			//INSTANCIA DE CLASE
			logicaDelPrograma registrarDatos = new logicaDelPrograma();
			
			String correo = entradaTextoCorreo.getText();//ggasubuyuj@scl.edu.gt
			String nombre = entradaTextoNombre.getText();
			
			//ACCION DE CORREO
			if(registrarDatos.comprobacionCorreo(correo)) {
				labelVerificacionCorreo.setText("true");
			}else {
				labelVerificacionCorreo.setText("null");
			}
			
			//ACCION DE NOMBRE
			if(registrarDatos.comprobacionNombre(nombre)) {
				labelVerificacionNombre.setText("true");
			}else {
				labelVerificacionNombre.setText("null");
			}
			
		}
	}
	
}

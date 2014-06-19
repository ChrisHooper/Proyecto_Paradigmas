package ordena2.eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JOptionPane;

import ordena2.gui.Interfaz;
import ordena2.modelo.Nodo;

public class ControladorEventos implements ActionListener, MouseListener, MouseMotionListener {
	
	private Interfaz interfaz;
	
	public ControladorEventos(Interfaz interfaz){
		this.interfaz=interfaz;
		
		this.interfaz.getVentanaBienvenida().getBotonTutorial().addActionListener(this);
		this.interfaz.getVentanaBienvenida().getBotonJugar().addActionListener(this);
		this.interfaz.getVentanaBienvenida().getBotonInfo().addActionListener(this);
		this.interfaz.getVentanaBienvenida().getBotonAcerca().addActionListener(this);
		this.interfaz.getVentanaAcerca().getBotonAceptar().addActionListener(this);
		this.interfaz.getVentanaInformacion().getBotonAceptar().addActionListener(this);
		this.interfaz.getVentanaJuego().getPanelControl().getBotonVolver().addActionListener(this);
		
		this.interfaz.getVentanaJuego().getPanelCentro().getOrdena2ToolBar().getBotonNodo().addMouseListener(this);
		this.interfaz.getVentanaJuego().getPanelCentro().getOrdena2ToolBar().getBotonNodo().addMouseMotionListener(this);
		
		this.interfaz.getVentanaJuego().getPanelCentro().getPanelDibujo().addMouseListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource()==interfaz.getVentanaBienvenida().getBotonTutorial()){
			JOptionPane.showMessageDialog(null, "En Construcción");
		}
		if (evento.getSource()==interfaz.getVentanaBienvenida().getBotonJugar()){
			interfaz.getVentanaBienvenida().setVisible(false);
			interfaz.getVentanaJuego().setVisible(true);
		}
		if (evento.getSource()==interfaz.getVentanaBienvenida().getBotonInfo()){
			interfaz.getVentanaBienvenida().setVisible(false);
			interfaz.getVentanaInformacion().setVisible(true);
		}
		if (evento.getSource()==interfaz.getVentanaBienvenida().getBotonAcerca()){
			interfaz.getVentanaBienvenida().setVisible(false);
			interfaz.getVentanaAcerca().setVisible(true);
		}
		if (evento.getSource()==interfaz.getVentanaAcerca().getBotonAceptar()){
			interfaz.getVentanaAcerca().setVisible(false);
			interfaz.getVentanaBienvenida().setVisible(true);
		}
		if (evento.getSource()==interfaz.getVentanaInformacion().getBotonAceptar()){
			interfaz.getVentanaInformacion().setVisible(false);
			interfaz.getVentanaBienvenida().setVisible(true);
		}
		if (evento.getSource()==interfaz.getVentanaJuego().getPanelControl().getBotonVolver()){
			interfaz.getVentanaJuego().setVisible(false);
			interfaz.getVentanaBienvenida().setVisible(true);
		}
	}
	@Override
	public void mouseClicked(MouseEvent evento) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent evento) {
		if (evento.getSource()==interfaz.getVentanaJuego().getPanelCentro().getPanelDibujo()){
			interfaz.getVentanaJuego().getPanelCentro().getPanelDibujo().setMouseEntered(interfaz.getVentanaJuego().getPanelCentro().getPanelDibujo().MOUSEIN);
			System.out.println("1");
		}
	}
	@Override
	public void mouseExited(MouseEvent evento) {
		if (evento.getSource()==interfaz.getVentanaJuego().getPanelCentro().getPanelDibujo()){
			interfaz.getVentanaJuego().getPanelCentro().getPanelDibujo().setMouseEntered(interfaz.getVentanaJuego().getPanelCentro().getPanelDibujo().MOUSEOUT);
			System.out.println("0");
		}
		
	}
	@Override
	public void mousePressed(MouseEvent evento) {
	}
	
	
	
	//mousemotion
	@Override
	public void mouseReleased(MouseEvent evento) {
		if (evento.getSource()==interfaz.getVentanaJuego().getPanelCentro().getOrdena2ToolBar().getBotonNodo()){
			if(interfaz.getVentanaJuego().getPanelCentro().getPanelDibujo().getMouseEntered()==1){
				interfaz.getVentanaJuego().getPanelCentro().getPanelDibujo().addDibujable(interfaz.getVentanaJuego().getPanelCentro().getDibujoTemporal());
				interfaz.getVentanaJuego().getPanelCentro().setDibujoTemporal(null);
				interfaz.getVentanaJuego().getPanelCentro().getPanelDibujo().repaint();
			}
			else{
				
			}
		}
		
	}
	
	@Override
	public void mouseDragged(MouseEvent evento) {
		if (evento.getSource()==interfaz.getVentanaJuego().getPanelCentro().getOrdena2ToolBar().getBotonNodo()){
			Nodo nodoTemporal = new Nodo(evento.getPoint());
			this.interfaz.getVentanaJuego().getPanelCentro().setDibujoTemporal(nodoTemporal);
			this.interfaz.getVentanaJuego().getPanelCentro().repaint();
		}
	}
	
	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
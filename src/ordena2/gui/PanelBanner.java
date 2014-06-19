package ordena2.gui;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class PanelBanner extends JPanel {
	public PanelBanner() {
		setLayout(new FlowLayout(0, 0, 0));
		JLabel imagenFondo = new JLabel(new ImageIcon(this.getClass()
				.getResource("/img/banner.png")));
		add(imagenFondo);
	}
}

package eyeglassesgui;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyledDocument;

import eyeglassesmain.EyeglassesMain;

@SuppressWarnings("serial")
public class TextOutputArea extends Box{
	private JTextPane outputArea = null;
	private JScrollPane scrollPane = null;
	private StyledDocument doc = null;

	public TextOutputArea() {
		super(BoxLayout.X_AXIS);
		outputArea = new JTextPane();
		outputArea.setEditable(false);
		
		scrollPane = new JScrollPane(outputArea);
		
		scrollPane.setPreferredSize(new Dimension(1000, 400));
		
		doc = outputArea.getStyledDocument();

		add(scrollPane);
	}
	
	public StyledDocument getStyledDoc(){
		return doc;
	}

	public void write(Object o, Style style) {
		try {
			doc.insertString(doc.getLength(), o.toString(), style);
		} catch (BadLocationException e) {
			EyeglassesMain.log("bad loc", true);
		}
	}
	
	public void write(Object o) {
		write(o, null);
	}
	
	public void clear(){
		outputArea.setText("");
	}
}

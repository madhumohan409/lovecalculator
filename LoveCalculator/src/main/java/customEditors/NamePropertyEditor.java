package customEditors;

import java.beans.PropertyEditorSupport;

public class NamePropertyEditor extends PropertyEditorSupport {
	public void setAsText(String text) throws IllegalArgumentException{
		String convertedNameEditor= text.toUpperCase();
		setValue(convertedNameEditor);
	}

}

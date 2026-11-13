package T5_AnonymousInnerClass;

interface ClickListener {
	void onClick();
}
class Button {
	private String label;
	public Button(String label) {
		this.label = label;
	}
	public void click() {
		System.out.println("Clicking button '" + label + "'");
	}
	public void setOnClickListener(ClickListener listener) {
		listener = new ClickListener() {
			public void onClick() {
				System.out.println("Button '" + label + "' was clicked!");
			}
		};
	}
}
public class P1_Button {
	public static void main(String[] args) {
	Button submitButton = new Button("Submit");
	submitButton.setOnClickListener(new ClickListener() {
	public void onClick() {
	System.out.println("Submit button clicked!");
	}
	});
	submitButton.click();
	}
}



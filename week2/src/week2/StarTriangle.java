package week2;

public class StarTriangle {
	public String triangle = "";

	public StarTriangle() {

	}

	public String draw(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				this.triangle += "[*]";
			}
			this.triangle += '\n';
		}
		return triangle;
	}

	public String toString() {
		return this.triangle;
	}

}

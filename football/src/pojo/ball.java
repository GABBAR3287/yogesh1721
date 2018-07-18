package pojo;

public class ball {
	//declaration of the variables
		private Integer bSize;
		private Integer bPressure;
		private String bColor;
		
		
		//default constructor
		public ball() {
			bSize = 0;
			bPressure = 0;
			bColor = "";
		}
		
		//constructor with parameters
		public ball(Integer bSize, Integer bPressure, String bColor) {
			this.bSize = bSize;
			this.bPressure = bPressure;
			this.bColor = bColor;
		}
		
		//getter and setter for ballSize
		public Integer getbSize() {
			return bSize;
		}
		public void setbSize(Integer bSize) {
			this.bSize = bSize;
		}
		
		//getter and setter for ballPressure
		public Integer getbPressure() {
			return bPressure;
		}
		public void setbPressure(Integer bPressure) {
			this.bPressure = bPressure;
		}
		
		//getter and setter for ballColor
		public String getbColor() {
			return bColor;
		}
		public void setbColor(String bColor) {
			this.bColor = bColor;
		}
}























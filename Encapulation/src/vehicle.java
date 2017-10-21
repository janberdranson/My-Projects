package edu.bcas.Encapsulation;

public class vehicle {
	 private String vehicleNumber;
	 private String modelName;
	 private String color;
	 private String capacity;
	 private String maufacturingYear;
	 private String place;
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public String getMaufacturingYear() {
		return maufacturingYear;
	}
	public void setMaufacturingYear(String maufacturingYear) {
		this.maufacturingYear = maufacturingYear;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("vehicle [vehicleNumber=");
		builder.append(vehicleNumber);
		builder.append(", modelName=");
		builder.append(modelName);
		builder.append(", color=");
		builder.append(color);
		builder.append(", capacity=");
		builder.append(capacity);
		builder.append(", maufacturingYear=");
		builder.append(maufacturingYear);
		builder.append(", place=");
		builder.append(place);
		builder.append("]");
		return builder.toString();
	}
	
	}
	

	
	
	

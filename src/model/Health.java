package model;

import java.io.Serializable;

public class Health implements Serializable {
	private double height, weight, bmi;
	private String bodyType;


	/**
	 * heightを取得します。
	 * @return height
	 */
	public double getHeight() {
	    return height;
	}
	/**
	 * heightを設定します。
	 * @param height height
	 */
	public void setHeight(double height) {
	    this.height = height;
	}
	/**
	 * weightを取得します。
	 * @return weight
	 */
	public double getWeight() {
	    return weight;
	}
	/**
	 * weightを設定します。
	 * @param weight weight
	 */
	public void setWeight(double weight) {
	    this.weight = weight;
	}
	/**
	 * bmiを取得します。
	 * @return bmi
	 */
	public double getBmi() {
	    return bmi;
	}
	/**
	 * bmiを設定します。
	 * @param bmi bmi
	 */
	public void setBmi(double bmi) {
	    this.bmi = bmi;
	}
	/**
	 * bodytypeを取得します。
	 * @return bodyType
	 */
	public String getBodyType() {
	    return bodyType;
	}
	/**
	 * bodyTypeを設定します。
	 * @param bodyType bodytype
	 */
	public void setBodytype(String bodyType) {
	    this.bodyType = bodyType;
	}
}

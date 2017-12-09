package me.aungkooo.colorpalette.model;


public class Color
{
    private int rectangleColor, txtColor, colorDensity, colorName;

    public Color() {}

    public Color(int rectangleColor, int colorName) {
        this.rectangleColor = rectangleColor;
        this.colorName = colorName;
    }

    public Color(int rectangleColor, int txtColor, int colorDensity)
    {
        this.rectangleColor = rectangleColor;
        this.txtColor = txtColor;
        this.colorDensity = colorDensity;
    }

    public int getRectangleColor() {
        return rectangleColor;
    }

    public void setRectangleColor(int rectangleColor) {
        this.rectangleColor = rectangleColor;
    }

    public int getTxtColor() {
        return txtColor;
    }

    public void setTxtColor(int txtColor) {
        this.txtColor = txtColor;
    }

    public int getColorDensity() {
        return colorDensity;
    }

    public void setColorDensity(int colorDensity) {
        this.colorDensity = colorDensity;
    }

    public int getColorName() {
        return colorName;
    }

    public void setColorName(int colorName) {
        this.colorName = colorName;
    }
}

package J04002;


public class Rectange {
    private Double width,height;
    private String color;

    public Rectange() {
        this.width=1d;
        this.height=1d;
    }

    public Rectange(Double width, Double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double findArea() {
        return width*height;
    }

    public double findPerimeter() {
        return 2 * (width + height);
    }
    public String convert(String color) {
        String res = color.toLowerCase();
        char[] arr = res.toCharArray();
        arr[0] = Character.toUpperCase(arr[0]);
        color = String.valueOf(arr);
        return color;
    }

    @Override
    public String toString() {
        return (int) findPerimeter() + " " + (int) findArea() + " " + convert(color);
    }
}

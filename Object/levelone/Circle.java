package Object;



class Circle {
    double radius;

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public void displayDetails() {
        System.out.println("Radius of Circle: " + radius);
        System.out.println("Area of Circle: " + calculateArea());
        System.out.println("Circumference of Circle: " + calculateCircumference());
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius = 7.0;
        c.displayDetails();
    }
}


package Lambda;

import java.util.*;


public class Lambda {

    // ---------- 1. Smart Home Lighting Automation ----------
    @FunctionalInterface
    interface LightAction {
        void execute();
    }

    // ---------- 2. Product class for E-Commerce Sorting ----------
    static class Product {
        String name;
        double price;
        double rating;
        double discount;

        public Product(String name, double price, double rating, double discount) {
            this.name = name;
            this.price = price;
            this.rating = rating;
            this.discount = discount;
        }

        @Override
        public String toString() {
            return name + " | Price: " + price + " | Rating: " + rating + " | Discount: " + discount + "%";
        }
    }

    // ---------- 3. Alert class for Notification Filtering ----------
    static class Alert {
        String type;
        boolean urgent;

        Alert(String type, boolean urgent) {
            this.type = type;
            this.urgent = urgent;
        }

        @Override
        public String toString() {
            return type + (urgent ? " (URGENT)" : "");
        }
    }

    public static void main(String[] args) {

        // ----------------------------------------------------------
        // 1. SMART HOME LIGHTING AUTOMATION
        // ----------------------------------------------------------
        System.out.println("\n=== Smart Home Lighting Automation ===");

        LightAction motionTrigger = () ->
                System.out.println("Motion Detected → Lights ON at 80% brightness");

        LightAction nightMode = () ->
                System.out.println("Night Mode → Lights dimmed to 20%");

        LightAction voiceCommand = () ->
                System.out.println("Voice Command → Relaxation mode activated");

        motionTrigger.execute();
        nightMode.execute();
        voiceCommand.execute();

        // ----------------------------------------------------------
        // 2. CUSTOM SORTING IN E-COMMERCE
        // ----------------------------------------------------------
        System.out.println("\n=== Product Sorting in E-Commerce ===");

        List<Product> products = Arrays.asList(
                new Product("Phone", 900, 4.7, 10),
                new Product("Laptop", 1200, 4.5, 15),
                new Product("Tablet", 400, 4.1, 5)
        );

        System.out.println("\nSort by Price (Low → High):");
        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        products.forEach(System.out::println);

        System.out.println("\nSort by Rating (High → Low):");
        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
        products.forEach(System.out::println);

        System.out.println("\nSort by Discount (High → Low):");
        products.sort((p1, p2) -> Double.compare(p2.discount, p1.discount));
        products.forEach(System.out::println);

        // ----------------------------------------------------------
        // 3. NOTIFICATION FILTERING
        // ----------------------------------------------------------
        System.out.println("\n=== Notification Filtering ===");

        List<Alert> alerts = Arrays.asList(
                new Alert("Medication", true),
                new Alert("Appointment", false),
                new Alert("Billing", false),
                new Alert("Emergency", true)
        );

        Predicate<Alert> urgentFilter = a -> a.urgent;

        System.out.println("\nUrgent Alerts Only:");
        alerts.stream()
                .filter(urgentFilter)
                .forEach(System.out::println);
    }
}

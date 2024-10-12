package com.bptn.course._07_this_keyword;

class OuterClass {
    private String outerField = "Outer Class Field";

    class InnerClass {
        private String innerField = "Inner Class Field";

        public void displayFields() {
            System.out.println("Inner Field: " + this.innerField);  // Refers to InnerClass' field
            System.out.println("Outer Field: " + OuterClass.this.outerField);  // Refers to OuterClass' field
        }
    }
}

public class ThisDemoFive {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.displayFields();  
        // Output: 
        // Inner Field: Inner Class Field
        // Outer Field: Outer Class Field
    }
}

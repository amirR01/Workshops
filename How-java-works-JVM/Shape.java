public class Shape {
    String shapeName;
    int shapeArea;
    int shapePerimeter;
    Shape shape1;
    public Shape(String shapeName, int shapeArea, int shapePerimeter){
        this.shapeName = shapeName;
        this.shapeArea = shapeArea;
        this.shapePerimeter = shapePerimeter;
    }
    public static void main(String[] args) {
        int radius = 5;
        int shapeArea = 3.14 * radius * radius;
        int shapePerimeter = 2 * 3.14 * radius;
        Shape shape = new Shape("Circle", shapeArea, shapePerimeter);

        String str1 = "m"
        String str2 = "m"

        str1 == str2 -> False
        str1.equals(str2) -> True

        shape.ComputeArea();
    }
    public void ComputeArea(){
        System.out.println("Area of the shape is: " + this.shapeArea);
    }
    public void ComputePerimeter(){
        System.out.println("Perimeter of the shape is: " + shapePerimeter);
    }
}

// draw the stack for main method
// #####################################################
// #   variable   #   value   #   type   #   scope   #
// #####################################################
// #   radius     #     5     #   int    #   main    #
// #   shapeArea  #   78.5    #   int    #   main    #
// #   shapePerimeter # 31.4  #   int    #   main    #
// #   shape      #   0x123   #   Shape  #   main    #
// #####################################################

// draw the stack for ComputeArea method
// #####################################################
// #   variable   #   value   #   type   #   scope   #
// #####################################################
// #   this       #   0x123   #   Shape  #   ComputeArea    #
// #####################################################

// draw the heap
// object at address 0x123
// object header
// ################################################################
// #   class     #   lock        #   hashcode    # GC flags
// ################################################################
// #   Shape   #   Unlocked    #     0x123      #   0x0000     
// object itself
// ################################################################
// #   shapeName    #   shapeArea    #   shapePerimeter    #
// ################################################################
// #   Circle       #     78.5       #       31.4          #
// ################################################################




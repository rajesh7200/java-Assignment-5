class Area_method_return
{
    static double circle_area(int redius)
    {
		  double area=3.14*redius*redius;
     
	 return area;
	}


static double ellipse_area(int minar_axis,int major_axis)
    {
         
	    double area=3.14*minar_axis*major_axis;
		
		return area;
	}



 static int parallelogram_area(int base,int height)
    {
        
        int area=base*height;
		
		return area;

	}


    static double rectangle_Area(int width,int height )
    {
      
        double area=width*height;
		
		return area;
   
	}



    static double sector_area(double redius,double angle)
    {
       
		double area=0.5*redius*redius*(angle/360);
		
		return area;

   	}



    static double trapezoid_area(int side_a,int side_b,int height)
    {
        
        double area=0.5*(side_a+side_b)*height;
	    return area;
   
	}



    static double triangle_area(int base,int height)
    {
       
	    double area;
        area=0.5*base*height;
		
		return area;
	}


    static int squre_area(int side)
    {
     
    	int area=side*side;
		
		return area;
   
	}





	public static void main(String [] args)
	{
		double a=circle_area(2);
	     System.out.println("The area of Circle is "+a);
			  
        double b=ellipse_area(5,10);
		System.out.println("The area of ellipse is "+b);
			
		int c=parallelogram_area(5,10);
		System.out.println("The area of Parallelogram is "+c);
		
        double d=rectangle_Area(5,10);
		System.out.println("The area of Rectangle is "+d);
		
        double e=sector_area(10.5,30.0);
		System.out.println("The area of Sector is "+e);
		
        double f=trapezoid_area(10,6,8);
		System.out.println("The area of Trapezoid is "+f);
		
        double h=triangle_area(5,10);
		System.out.println("The area of Triangle is "+h);
		
        int i=squre_area(5);
		System.out.println("The area of Squre is "+i);

		

	}

};

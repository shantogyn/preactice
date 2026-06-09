class Car{
        String make;
        String model;
        int year;
        Car() {
        make = "Unknown";
        model = "Unknown";
        year = 0;
       }
        Car(String make,String model,int year)
        {
            this.make=make;
            this.model =model;
            this.year =year;

        }
        void print() {
        System.out.println("Make  : " + make);
        System.out.println("Model : " + model);
        System.out.println("Year  : " + year);
        System.out.println();
    }
        
    }
public abstract class Car {
     protected String Engine ;
     protected String Drive_train ;
     protected String Color ;
     protected String Country;
     protected String Company;
     void print()
     {
          System.out.println("\t Company : "+Company);
          System.out.println("\t Engine : "+Engine);
          System.out.println("\t Drive Train : "+Drive_train);
          System.out.println("\t Color : "+Color);
          System.out.println("\t Country : "+Country);
     }

     public String getEngine() {
          return Engine;
     }

     public String getDrive_train() {
          return Drive_train;
     }

     public String getColor() {
          return Color;
     }

     public String getCountry() {
          return Country;
     }

     public String getCompany() {
          return Company;
     }
}

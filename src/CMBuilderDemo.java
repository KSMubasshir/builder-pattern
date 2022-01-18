public class CMBuilderDemo {
    public static void main(String[] args) {
        EmpAtCounter directorEmp = new EmpAtCounter();
        CMBuilder restXBuilder = new RestaurantX();
        directorEmp.ConstructCM(restXBuilder);

        CMeal orderedMeal;

        orderedMeal = restXBuilder.getCMeal();
        System.out.println(orderedMeal);
    }
}

public class EmpAtCounter {
    CMBuilder childrenMealBuilder;
    
    public void ConstructCM(CMBuilder builder){
        childrenMealBuilder=builder;
        childrenMealBuilder.setMainItem();
        childrenMealBuilder.setSideItem();
        childrenMealBuilder.setDrink();
        childrenMealBuilder.setToy();
    }
}

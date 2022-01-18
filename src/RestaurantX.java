public class RestaurantX implements CMBuilder{

    CMeal Order=new CMeal();
    
    @Override
    public void setMainItem() {
        Order.bag.mainMeal="HamBurger";
    }

    @Override
    public void setSideItem() {
        Order.bag.sideMeal="French Fries";
    }

    @Override
    public void setDrink() {
        Order.drink="Coke";
    }

    @Override
    public void setToy() {
        Order.bag.toy="Dinosaur";
    }

    @Override
    public CMeal getCMeal() {
        return Order;
    }
    
}

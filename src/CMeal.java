public class CMeal {
    Bag bag;
    String drink;
    
    public CMeal(){
        bag=new Bag();
        drink=new String("");
    }
    
    public void setMainMeal(String mMeal){
        bag.mainMeal=mMeal;
    }
    public void setSideMeal(String sMeal){
        bag.sideMeal=sMeal;
    }
    public void setToy(String Toy){
        bag.toy=Toy;
    }
    public void setDrink(String Drink){
        drink=Drink;
    }
    
    @Override
    public String toString(){
        return "In Bag:"+"\nMain Meal= "+bag.mainMeal+"\n"+
                "Side Meal= "+bag.sideMeal+"\n"+
                "Toy= "+bag.toy+"\n"+
                "Outside Bag:\nDrink= "+drink;
    }
    
}

package day31_Constructor;

public class Pizza {
    public char size;
    public  int numberOfCheeseToppings, numberOfPepperoniToppings;
    public int cost;

    public Pizza(char size, int numberOfCheeseToppings, int numberOfPepperoniToppings) {
        this.size = size;
        this.numberOfCheeseToppings = numberOfCheeseToppings;
        this.numberOfPepperoniToppings = numberOfPepperoniToppings;
    }

    //=========================== calculating method 1 ====================================
    public double calcCost() {
        double startingPrice = (size == 'S') ? 10 : (size == 'M') ? 12 : 14;
        double totalPrice = startingPrice + (numberOfCheeseToppings + numberOfPepperoniToppings) * 2;
        return totalPrice;
    }

    //=========================== calculating method 2 ====================================
    public void calcCost2(){
        if (size == 'S'){
            cost = 10;
        }else if (size == 'M'){
            cost = 12;
        }else {
            cost = 14;
        }
        cost += (numberOfCheeseToppings + numberOfPepperoniToppings) * 2;
        System.out.println(size + " size pizza with " + numberOfCheeseToppings + " cheese toppings, " + numberOfPepperoniToppings + " pepperoni toppings cost $" + cost);
    }



    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseToppings=" + numberOfCheeseToppings +
                ", numberOfPepperoniToppings=" + numberOfPepperoniToppings +
                ", Total Price is= $" + calcCost() +
                ", cost=" + cost +
                '}';
    }
}

public class Test {
    public static void main(String[] args) {
EliteWarrior ewar = new EliteWarrior( "Denerys", "100", 5,"Sword", "20", 15, "Dragon Veseryon");
ewar.displayInfo();
System.out.println();
ewar.attack();
ewar.defend();
ewar.useSpecialMove();
System.out.println("Power: " + ewar.calculatePower());
System.out.println();
System.out.println(ewar);}
}
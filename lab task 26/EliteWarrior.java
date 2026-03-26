public class EliteWarrior extends Warrior{
String armourLevel;
String specialSkill;
 public EliteWarrior(String name, String health, int level, String weaponType, String strength, int armorLevel, String specialSkill) {
super(name, health, level, weaponType, strength);
System.out.println("Default constrcutor of EliteWarrior class");
this.armourLevel = armourLevel;
this.specialSkill = specialSkill;}
public String getArmourLevel(){
return armourLevel;}
public String getSpecialSkill(){
return specialSkill;}
 @Override
public void displayInfo() {
super.displayInfo(); 
System.out.println("Armor Level: " + armourLevel);
System.out.println("Special Skill: " + specialSkill);}
@Override
public void defend() {
System.out.println("armor level used " + armourLevel + " to defend");}
@Override
public String calculatePower() {
return super.calculatePower() + armourLevel;}
public void useSpecialMove() {
System.out.println("Using special move: " + specialSkill);}
public String toString(){
return "Armour Level:" + armourLevel + ", Special Skill: "+ specialSkill;}
}
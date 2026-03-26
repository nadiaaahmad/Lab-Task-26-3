public class Warrior extends GameCharecter{
String weaponType;
String strength;
Warrior(String name, String health, int level, String weaponType, String strength){
super( name, health, level);
System.out.println("Default constrcutor of Warrior class");
this.weaponType = weaponType;
this.strength = strength;}
public String getWeaponType(){
return weaponType;}
public String getStrength(){
return strength;}
@Override
public void displayInfo() {
super.displayInfo();
System.out.println("Weapon Type: " + weaponType);
System.out.println("Strength: " + strength);}
@Override
public void attack() {
System.out.println("Warrior attacks with " + weaponType + "!");}
@Override
public String calculatePower() {
return super.calculatePower() + strength;}
public String toString(){
return "Weapon Type:" + weaponType + ", Strength: "+ strength;}
}
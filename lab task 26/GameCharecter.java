public class GameCharecter{
String name;
String health;
int level;
GameCharecter(String name, String health, int level){
this.name = name;
this.health = health;
this.level = level;}
public String getName(){
return name;}
public String getHealth(){
return health;}
public int getLevel(){
return level;}
public void setName(String name){
this.name = name;}
public void setLevel(int level){
this.level = level;}
public void displayInfo(){
System.out.println("Name: " + name);
System.out.println("Health: " + health);
System.out.println("Level: " + level);}
 public void attack() {
System.out.println(name + " attacks");}
public void defend() {
System.out.println(name + " defends");}
public String calculatePower() {
return health;}
@Override
public String toString(){
return String.format("Name: %s\nHealth: %s\nLevel: %d", name, health, level);
}
}
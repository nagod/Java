/*
Task : Count Sheeps || Sheep == True 
 Sheep_Array = {true, false, true .....}
*/

public class Counter {
  public int countSheeps(Boolean[] arrayOfSheeps) {
    // TODO May the force be with you
    
    int sheepCounter = 0;
    for(Boolean sheep : arrayOfSheeps){
      if(sheep && sheep != null){
        sheepCounter +=1;
      }
    }
    return sheepCounter;
  }
}

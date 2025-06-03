import java.util.ArrayList;
public class StepTracker{
 /* to be implemented here */
 private int minSteps, totalSteps;
 private int totalDays, actDays;
 public StepTracker(int goal){
  minSteps = goal;
  totalSteps = 0;
  totalDays = 0;
  actDays = 0;
 }
 public void addDailySteps(int steps){
  totalSteps+=steps;
  if(steps > minSteps)
   activeDays++;
 }
 public int activeDays(){
  return activeDays;
 }
 public double averageSteps(){
  return totalSteps/activeDays;
 }
} 

// NxtDemo.java

import ch.aplu.nxt.*;


public class NXTRoboController
{
  public NXTRoboController()
  {
    // Ask for the name, create robot and connect
    NxtRobot robot = new NxtRobot();

    // Create two motors
    Motor motA = new Motor(MotorPort.A);
    Motor motB = new Motor(MotorPort.B);

    // Assemble motors into robot
    robot.addPart(motA);
    robot.addPart(motB);
  }
  public void moveForward() {
      motA.forward();
      motB.forward();
  }
    public void moveBackward() {
        motA.backward();
        motB.backward();
    }
    public void turnClocwise() {
        motA.forward();
        
    }
    public void turnCounterClockwise() {
          motB.forward();
    }
    
}
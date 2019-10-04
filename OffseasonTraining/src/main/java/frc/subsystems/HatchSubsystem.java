/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class HatchSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  private DoubleSolenoid arm;
  private DoubleSolenoid grabber;

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    arm =  new DoubleSolenoid(0, 5, 2);
    grabber = new DoubleSolenoid(0, 4, 3);
  }
  public void grabberOpen(){
    grabber.set(Value.kForward);
  }
  public void grabberClose(){
    grabber.set(Value.kReverse);
  
  }
  public void armUp(){
    arm.set(DoubleSolenoid.Value.kForward);
  }
  public void armDown() {
    arm.set(DoubleSolenoid.Value.kReverse);
  }
}
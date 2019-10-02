/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class HatchSubsystem extends Subsystem {
  private DoubleSolenoid arm;
  private DoubleSolenoid grabber;
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public HatchSubsystem() {
    arm = new DoubleSolenoid(0, 5, 2);
    grabber = new DoubleSolenoid(0, 4, 3);
  }

  public void armForward() {
    arm.set(DoubleSolenoid.Value.kForward);
  }

  public void armBack() {
    arm.set(DoubleSolenoid.Value.kReverse);
  }

  public void grabberOpen() {
    arm.set(DoubleSolenoid.Value.kForward);
  }

  public void grabberClose() {
    arm.set(DoubleSolenoid.Value.kReverse);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}

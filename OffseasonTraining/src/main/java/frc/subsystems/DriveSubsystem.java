/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

/**
 * Add your docs here.
 */
public class DriveSubsystem extends Subsystem {
  private TalonSRX right;
  private TalonSRX left;
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  // TODO create some motor controller objects for driving

  // TODO create some methods for tank and split arcade drive, each using two inputs

  public DriveSubsystem() {
    right = new TalonSRX(3);
    left = new TalonSRX(6);
    left.setInverted(true);
  }

  public void move(double r, double l) {
    right.set(ControlMode.PercentOutput, r);
    left.set(ControlMode.PercentOutput, l);
  }

  public void tankDrive(double rAxis, double lAxis) {
    move(rAxis, lAxis);
  }

  public void arcadeDrive(double xAxis, double yAxis) {
    move((xAxis + yAxis)/2, (xAxis - yAxis)/2);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    // TODO set your command here, either tank or split arcade, cannot be both
  }
}

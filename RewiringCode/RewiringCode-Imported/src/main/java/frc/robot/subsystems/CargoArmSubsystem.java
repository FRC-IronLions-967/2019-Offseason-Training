/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.CargoArmCommand;

/**
 * Add your docs here.
 */
public class CargoArmSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  private TalonSRX leftArm;
  private TalonSRX rightArm;

  public CargoArmSubsystem() {
    leftArm = new TalonSRX(1);
    rightArm = new TalonSRX(2);

    rightArm.setInverted(true);
  }

  public void moveArm(double power) {
    leftArm.set(ControlMode.PercentOutput, power);
    rightArm.set(ControlMode.PercentOutput, power);
  }

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new CargoArmCommand());
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}

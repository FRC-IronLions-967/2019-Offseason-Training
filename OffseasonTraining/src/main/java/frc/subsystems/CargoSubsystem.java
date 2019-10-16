/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.*;
import frc.commands.cargo.MoveArm;
import frc.utils.Utils;

/**
 * Add your docs here.
 */
public class CargoSubsystem extends Subsystem {
  private TalonSRX leftArm;
  private TalonSRX rightArm;

  public CargoSubsystem() {
    leftArm = new TalonSRX(1);
    rightArm = new TalonSRX(2);
    leftArm.setInverted(true);
  }

  public void moveArm(double power) {
    leftArm.set(ControlMode.PercentOutput, power);
    rightArm.set(ControlMode.PercentOutput, power);
  }
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new MoveArmCommand());
  }
}

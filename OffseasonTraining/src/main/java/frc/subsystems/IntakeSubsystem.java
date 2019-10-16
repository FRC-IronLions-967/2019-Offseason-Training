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
import frc.commands.cargo.MoveBall;
import frc.utils.Utils;

/**
 * Add your docs here.
 */
public class IntakeSubsystem extends Subsystem {
  private VictorSPX intake;
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public IntakeSubsystem() {
    intake = new VictorSPX(0);
  }

  public void intake(double power) {
    intake.set(ControlMode.PercentOutput, power);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new MoveBall());
  }
}

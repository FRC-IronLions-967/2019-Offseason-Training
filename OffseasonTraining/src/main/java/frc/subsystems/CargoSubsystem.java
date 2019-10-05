/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.*;
import frc.commands.cargo.MoveArm;
import frc.utils.Utils;

/**
 * Add your docs here.
 */
public class CargoSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  private TalonSRX leftCargo;
  private TalonSRX rightCargo;

  public CargoSubsystem(){
    leftCargo = new TalonSRX(2);
    rightCargo = new TalonSRX(1);
    
    leftCargo.setInverted(true);
  }
  public void moveArm(double power) {
    power = Utils.Deadband(power, 0.1);
    if(power <= 0) {
      leftCargo.set(ControlMode.PercentOutput, power);
      rightCargo.set(ControlMode.PercentOutput, power);
    } else {
      leftCargo.set(ControlMode.PercentOutput, 0);
      rightCargo.set(ControlMode.PercentOutput, 0);
    }
  }
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new MoveArm());
  }
}

/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import com.ctre.phoenix.motorcontrol.can.*;
import frc.commands.*;
/**
 * Add your docs here.
 */
public class DriveSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  // TODO create some motor controller objects for driving
  private TalonSRX rightMaster;
  private TalonSRX leftMaster;
  private TalonSRX rightSlave0;
  private TalonSRX leftSlave0;
  private TalonSRX rightSlave1;
  private TalonSRX leftSlave1;
  // TODO create some methods for tank and split arcade drive, each using two inputs
  public void tankDrive(double leftYAxis, double rightYAxis) {
    
  }
  public void arcadeDrive(double yAxis, double xAxis){

  }
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    // TODO set your command here, either tank or split arcade, cannot be both
    setDefaultCommand(new TankDriveCommand());
  }
}

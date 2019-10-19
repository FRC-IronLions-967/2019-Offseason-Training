/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystem;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.*;

import edu.wpi.first.wpilibj.command.Subsystem;
/**
 * Add your docs here.
 */
public class DriveSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  private TalonSRX rightMaster;
  private TalonSRX leftMaster;
  private TalonSRX rightSlave0;
  private TalonSRX leftSlave0;
  private VictorSPX rightSlave1;
  private VictorSPX leftSlave1;

  public DriveSubsystem(){
    rightMaster = new TalonSRX(3);
    rightSlave0 = new TalonSRX(4);
    rightSlave1 = new VictorSPX(5);
    leftMaster = new TalonSRX(6);
    leftSlave0 = new TalonSRX(7);
    leftSlave1 = new VictorSPX(8);

    leftMaster.setInverted(true);
    leftSlave1.setInverted(true);
    leftSlave0.setInverted(true);

    rightSlave0.follow(rightMaster);
    rightSlave1.follow(rightMaster);
    leftSlave0.follow(leftMaster);
    leftSlave1.follow(leftMaster);
  }

  public void move(double r, double l){
    rightMaster.set(ControlMode.PercentOutput, r);
    leftMaster.set(ControlMode.PercentOutput, l);
  }

  public void arcadeDrive(double xAxis, double yAxis){
    move((xAxis + yAxis)/2, (xAxis - yAxis)/2);
  }
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new SplitArcadeCommand);
  }
}

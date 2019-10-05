/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.utils;

/**
 * Add your docs here.
 */
public class Utils {
    public static double Deadband(double input, double deadband){
        if (input >= +deadband){
            return input;
        }
        else if (input <= -deadband){
            return input;
        }
        else{
            return 0;
        }
    }
}

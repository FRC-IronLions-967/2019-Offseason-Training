/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;

/**
 * Add your docs here.
 */

 // don't worry about this class too much, it should work for you

public class IO {
    private Joystick xbox0;
    private Joystick xbox1;

    public IO() {
        xbox0 = new Joystick(0);
        xbox1 = new Joystick(1);
    }

    public Joystick getXbox0() {
        return xbox0;
    }

    public Joystick getXbox1() {
        return xbox1;
    }
}

/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.commands.grabber.*;
import frc.commands.arm.*;

/**
 * Add your docs here.
 */

 // don't worry about this class too much, it should work for you

public class IO {
    public Joystick xbox0 = new Joystick(0);
    public Joystick xbox1 = new Joystick(1);

    public IO() {
        // xbox0 = new Joystick(0);
        // xbox1 = new Joystick(1);
        JoystickButton xbox1_a = new JoystickButton(xbox1, 1);
        JoystickButton xbox1_b = new JoystickButton(xbox1, 2);
        JoystickButton xbox1_x = new JoystickButton(xbox1, 3);
        JoystickButton xbox1_y = new JoystickButton(xbox1, 4);
    
        xbox1_a.whenPressed(new ArmUp());
        xbox1_b.whenPressed(new ArmDown());
        xbox1_x.whenPressed(new GrabberOpenCommand());
        xbox1_y.whenPressed(new GrabberCloseCommand());
        
        xbox1_a.close();
        xbox1_b.close();
        xbox1_x.close();
        xbox1_y.close();
    }

    public Joystick getXbox0() {
        return xbox0;
    }

    public Joystick getXbox1() {
        return xbox1;
    }
}

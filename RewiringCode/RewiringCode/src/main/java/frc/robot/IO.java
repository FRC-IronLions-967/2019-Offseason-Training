/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.*;

/**
 * Add your docs here.
 */
public class IO {
    public Joystick xbox0;
    public Joystick xbox1;

    public IO() {
        xbox0 = new Joystick(0);
        xbox1 = new Joystick(1);

        JoystickButton xbox0_a = new JoystickButton(xbox0, 1);
        JoystickButton xbox0_b = new JoystickButton(xbox0, 1);
        JoystickButton xbox1_a = new JoystickButton(xbox1, 1);
        JoystickButton xbox1_b = new JoystickButton(xbox1, 2);
        JoystickButton xbox1_x = new JoystickButton(xbox1, 3);
        JoystickButton xbox1_y = new JoystickButton(xbox1, 4);

        // xbox0_a.whenPressed(new RearCameraCommand());
        // xbox0_b.whenPressed(new FrontCameraCommand());
        xbox1_a.whenPressed(new GrabberOpenCommand());
        xbox1_b.whenPressed(new GrabberCloseCommand());
        xbox1_x.whenPressed(new ArmForwardCommand());
        xbox1_y.whenPressed(new ArmBackCommand());

        xbox0_a.close();
        xbox0_b.close();
        xbox1_a.close();
        xbox1_b.close();
        xbox1_x.close();
        xbox1_y.close();
    }
}

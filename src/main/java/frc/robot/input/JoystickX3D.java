/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.input;

import edu.wpi.first.wpilibj.Joystick;

/**
 * Add your docs here.
 */
public final class JoystickX3D extends Joystick {

    public JoystickX3D(int port) {
        super(port);
    }

    public double getLeftTriggerValue() {
        return getRawAxis(2);
    }

    public double getLeftXValue() {
        return getRawAxis(0);
    }

    public double getLeftYValue() {
        return -getRawAxis(1);
    }

    public double getRightTriggerValue() {
        return getRawAxis(3);
    }

    public double getRightXValue() {
        return getRawAxis(4);
    }

    public double getRightYValue() {
        return -getRawAxis(5);
    }
}

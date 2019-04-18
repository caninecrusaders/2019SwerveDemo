/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.Robot;
import frc.robot.RobotMap;
import frc.robot.commands.cmdTankDriveXbox;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

/**
 * Add your docs here.
 */
public class OtherDrives extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public Spark leftMotor = new Spark(RobotMap.leftMotor);
  public Spark rightMotor = new Spark(RobotMap.rightMotor);
  // public Spark frontLeftMotor = new Spark(RobotMap.frontLeftMotor);
  // public Spark frontRightMotor = new Spark(RobotMap.frontRightMotor);
  SpeedControllerGroup leftMotors;
  SpeedControllerGroup rightMotors;
  DifferentialDrive driveControl;

  public OtherDrives() {
    leftMotor.setInverted(true);
    rightMotor.setInverted(true);
    // frontLeftMotor.setInverted(true);
    // frontRightMotor.setInverted(true);
    // leftMotors = new SpeedControllerGroup(backLeftMotor, frontLeftMotor);
    // rightMotors = new SpeedControllerGroup(backRightMotor, frontRightMotor);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new cmdTankDriveXbox());
  }

  public void tankDrive() {

    double left = Robot.oi.xboxDriver.getRawAxis(1);
    double right = Robot.oi.xboxDriver.getRawAxis(5);
    driveControl.tankDrive(left, right);
  }

  public void curvatureDrive() {
    double throttle = Robot.oi.xboxDriver.getRawAxis(1);
    double turn = Robot.oi.xboxDriver.getRawAxis(4);
    driveControl.curvatureDrive(1.0, 0, true);
  }
}
